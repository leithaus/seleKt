// -*- mode: Scala;-*- 
// Filename:    Transitions.scala 
// Authors:     lgm                                                    
// Creation:    Tue Aug  9 20:35:07 2011 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.seleKt.model.ill.vm.illvm.executive

import com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn._

object SyntaxConversion {
  import scala.collection.JavaConversions._
  
  // convenience
  case class TMState(
    stack : List[Either[Env,Value]],
    env : List[Value],
    code : List[Instruction],
    dump : List[Frame]
  )

  implicit def asTMState( machine : MACHINE ) : TMState = {
    TMState(
      fromStack( machine.stack_ ),
      fromEnv( machine.env_ ),
      fromILLCode( machine.illcode_ ),
      fromDump( machine.dump_ )
    )
  }

  implicit def fromStack( stack : Stack ) : List[Either[Env,Value]] = {
    stack match {
      case mstk : MSTACK => {
	mstk.listenvorval_.toList.map( fromEnvOrVal )
      }
      case _ => throw new Exception( "unexpected stack type" )
    }
  }
  implicit def asStack( eOrVs : List[Either[Env,Value]] ) : Stack = {
    val leov = new ListEnvOrVal()
    leov.addAll( eOrVs.map( asEnvOrVal ) )
    new MSTACK( leov )
  }
  implicit def fromEnv( env : Env ) : List[Value] = {
    env match {
      case e : ENVIRONMENT => {
	e.listvalue_.toList
      }
      case _ => throw new Exception( "unexpected environment type" )
    }
  }
  implicit def asEnv( vals : List[Value] ) : Env = {
    val lvs = new ListValue( )
    lvs.addAll( vals )
    new ENVIRONMENT( lvs ) 
  }  
  implicit def fromILLCode( illcode : ILLCode ) : List[Instruction] = {
    illcode match {
      case codes : CODESEQ => {
	codes.listinstruction_.toList
      }
      case _ => throw new Exception( "unexpected machine codes type" )
    }
  }
  implicit def asILLCode( code : List[Instruction] ) : ILLCode = {
    val lis = new ListInstruction( )
    lis.addAll( code )
    new CODESEQ( lis )
  }
  implicit def fromDump( dump : Dump ) : List[Frame] = {
    dump match {
      case mdmp : MDUMP => {
	mdmp.listframe_.toList
      }
      case _ => throw new Exception( "unexpected dump type" )
    }
  }
  implicit def asDump( frames : List[Frame] ) : Dump = {
    val lif = new ListFrame( )
    lif.addAll( frames )
    new MDUMP( lif )
  }
  implicit def fromStackEnv( stkEnv : STACKENV ) : List[Value] = {
    fromEnv( stkEnv.env_ )
  }
  implicit def fromStackVal( stkVal : STACKVAL ) : Value = {
    stkVal.value_
  }
  implicit def fromEnvOrVal( eOrV : EnvOrVal ) : Either[Env,Value] = {
    eOrV match {
      case stkEnv : STACKENV => Left[Env,Value]( stkEnv.env_ )
      case stkVal : STACKVAL => Right[Env,Value]( stkVal.value_ )
      case _ => throw new Exception( "unexpected stack element type" )
    }
  }
  implicit def asEnvOrVal( eOrV : Either[Env,Value] ) = {
    eOrV match {
      case Left( e ) => new STACKENV( e )
      case Right( v ) => new STACKVAL( v )
    }
  }
  implicit def fromFrame(
    frame : Frame
  ) : ( List[Either[Env,Value]], List[Value], List[Instruction] ) = {
    frame match {
      case stkFrame : STACKFRAME => {
	(
	  fromStack( stkFrame.stack_ ),
	  fromEnv( stkFrame.env_ ),
	  fromILLCode( stkFrame.illcode_ )
	)
      }
    }
  }
  implicit def asFrame(
    stack : List[Either[Env,Value]],
    env : List[Value],
    code : List[Instruction]
  ) : Frame = {
    new STACKFRAME(
      asStack( stack ),
      asEnv( env ),
      asILLCode( code )
    )
  }

  implicit def asMachine( tmstate : TMState ) : MACHINE = {
    new MACHINE( 
      tmstate.stack,
      tmstate.env,
      tmstate.code,
      tmstate.dump
    )
  }    
}

trait Transitions[Ctxt] {
  import SyntaxConversion._

  def push(
    env : List[Value],
    stack : List[Either[Env,Value]]
  ) : List[Either[Env,Value]] = {
    Left[Env,Value]( asEnv( env ) ) :: stack 
  }
  def push(
    v : Value,
    stack : List[Either[Env,Value]]
  ) : List[Either[Env,Value]] = {
    Right[Env,Value]( v ) :: stack 
  }

  def reduceOnce( machine : MACHINE, ctxt : Ctxt ) : ( MACHINE, Ctxt ) = {
    val tmstate = asTMState( machine )
    tmstate.code match {
      case instr :: instructions => {
	instr match {
	  case pushEnv : PUSHENV => {
	    (
	      new MACHINE(
		push( tmstate.env, tmstate.stack ),
		tmstate.env,
		instructions,
		tmstate.dump
	      ),
	      ctxt
	    )
	  }
	  case hd : HEAD => {
	    tmstate.stack match {
	      case Left( stkEnv ) :: stkRest => {
		fromEnv( stkEnv ) match {
		  case v :: l => {
		    (
		      new MACHINE(
			push( v, tmstate.stack ),
			tmstate.env,
			instructions,
			tmstate.dump
		      ),
		      ctxt
		    )
		  }
		  case _ => {
		    throw new Exception(
		      (
			"machine execution error:"
			+ " attempting to execute HD with"
			+ " invalid environment form"
		      )
		    )
		  }
		}
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute HD with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case tl : TAIL => {
	    tmstate.stack match {
	      case Left( stkEnv ) :: stkRest => {
		fromEnv( stkEnv ) match {
		  case v :: l => {
		    (
		      new MACHINE(
			push( l, tmstate.stack ),
			tmstate.env,
			instructions,
			tmstate.dump
		      ),
		      ctxt
		    )
		  }
		  case _ => {
		    throw new Exception(
		      (
			"machine execution error:"
			+ " attempting to execute TL with"
			+ " invalid environment form"
		      )
		    )
		  }
		}
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute TL with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case ret : RET => {
	    tmstate.stack match {
	      case Right( v ) :: stkRest => {
		tmstate.dump match {
		  case frame :: frameRest => {
		    fromFrame( frame ) match {
		      case ( s, e, c ) => {
			(
			  new MACHINE(
			    push( v, s ),
			    e,
			    c,
			    frameRest
			  ),
			  ctxt
			)
		      }
		      case _ => {
			throw new Exception(
			  (
			    "machine execution error:"
			    + " attempting to execute RET with"
			    + " invalid stack form on dump"
			  )
			)
		      }
		    }
		  }
		  case _ => {
		    throw new Exception(
		      (
			"machine execution error:"
			+ " attempting to execute RET with"
			+ " invalid stack form on dump"
		      )
		    )
		  }
		}
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute RET with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case push : PUSH => {
	    tmstate.stack match {
	      case Right( v ) :: stkRest => {
		(
		  new MACHINE(
		    stkRest,
		    v :: tmstate.env,
		    instructions,
		    tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute PUSH with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case pop : POP => {
	    tmstate.env match {
	      case v :: envRest => {
		(
		  new MACHINE(
		    tmstate.stack,
		    envRest,
		    instructions,
		    tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute POP with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case makefcl : MAKEFCL => {
	    val fcl = 
	      Right[Env,Value]( new FclV( makefcl.illcode_, tmstate.env ) )
	    (
	      new MACHINE(
		fcl :: tmstate.stack,
		tmstate.env,
		instructions,
		tmstate.dump
	      ),
	      ctxt
	    )
	  }
	  case unit : UNIT => {
	    (
	      new MACHINE(
		Right[Env,Value]( new UnitV() ) :: tmstate.stack,
		tmstate.env,
		instructions,
		tmstate.dump
	      ),
	      ctxt
	    )
	  }
	  case ununit : UNUNIT => {
	    tmstate.stack match {
	      case Right( v : UnitV ) :: stkRest => {
		(
		  new MACHINE(
		    stkRest,
		    tmstate.env,
		    instructions,
		    tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute UNUNIT with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case pair : PAIR => {
	    tmstate.stack match {
	      case Right( v ) :: Right( w ) :: stkRest => {
		(
		  new MACHINE(
		    Right( new PairV( v, w ) ) :: stkRest,
		    tmstate.env,
		    instructions,
		    tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute PAIR with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case unpair : UNPAIR => {
	    tmstate.stack match {
	      case Right( vw : PairV ) :: stkRest => {
		( 
		  new MACHINE(
		    Right( vw.value_1 ) :: Right( vw.value_2 ) :: stkRest,
		    tmstate.env,
		    instructions,
		    tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute UNPAIR with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case ap : AP => {
	    tmstate.stack match {
	      case Right( fcl : FclV ) :: stkRest => {
		tmstate.env match {
		  case v :: envRest => {
		    val nframe = 
		      asFrame(
			tmstate.stack, 
			tmstate.env,
			instructions
		      )
		    (
		      new MACHINE(
			List(),
			v :: fromEnv( fcl.env_ ),
			fromILLCode( fcl.illcode_ ),
			nframe :: tmstate.dump
		      ),
		      ctxt
		    )
		  }
		  case _ => {
		    throw new Exception(
		      (
			"machine execution error:"
			+ " attempting to execute AP with"
			+ " invalid env form" 
		      )
		    )
		  }
		}		
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute AP with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case makeccl : MAKECCL => {
	    val ccl = 
	      new CclV(
		asILLCode( makeccl.illcode_1 ),
		asILLCode( makeccl.illcode_2 ),
		asEnv( tmstate.env )
	      )
	    (
	      new MACHINE(
		Right[Env,Value]( ccl ) :: tmstate.stack,
		tmstate.env,
		instructions,
		tmstate.dump
	      ),
	      ctxt
	    )
	  }
	  case fst : FST => {
	    tmstate.stack match {	      
	      case Right( ccl : CclV ) :: stkRest => {
		val nframe = 
		  asFrame(
		    tmstate.stack, 
		    tmstate.env,
		    instructions
		  )
		( 
		  new MACHINE(
		    List(),
		    fromEnv( ccl.env_ ),
		    fromILLCode( ccl.illcode_1 ),
		    nframe :: tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute FST with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case snd : SND => {
	    tmstate.stack match {	      
	      case Right( ccl : CclV ) :: stkRest => {
		val nframe = 
		  asFrame(
		    tmstate.stack, 
		    tmstate.env,
		    instructions
		  )
		( 
		  new MACHINE(
		    List(),
		    fromEnv( ccl.env_ ),
		    fromILLCode( ccl.illcode_2 ),
		    nframe :: tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute SND with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case inl : INL => {
	    tmstate.stack match {
	      case Right( v ) :: stkRest => {
		(
		  new MACHINE(
		    Right[Env,Value]( new InlV( v ) ) :: stkRest,
		    tmstate.env,
		    instructions,
		    tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute INL with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case inr : INR => {
	    tmstate.stack match {
	      case Right( v ) :: stkRest => {
		(
		  new MACHINE(
		    Right[Env,Value]( new InrV( v ) ) :: stkRest,
		    tmstate.env,
		    instructions,
		    tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute INR with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case kase : CASE => {
	    tmstate.stack match {
	      case Right( v : InlV ) :: stkRest => {
		val nframe = 
		  asFrame(
		    tmstate.stack, 
		    tmstate.env,
		    instructions
		  )
		(
		  new MACHINE(
		    List(),
		    v.value_ :: tmstate.env,
		    fromILLCode( kase.illcode_1 ),
		    nframe :: tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case Right( v : InrV ) :: stkRest => {
		val nframe = 
		  asFrame(
		    tmstate.stack, 
		    tmstate.env,
		    instructions
		  )
		(
		  new MACHINE(
		    List(),
		    v.value_ :: tmstate.env,
		    fromILLCode( kase.illcode_2 ),
		    nframe :: tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute CASE with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case makeocl : MAKEOCL => {
	    val ocl = 
	      Right[Env,Value]( new OclV( makeocl.illcode_, tmstate.env ) )
	    (
	      new MACHINE(
		ocl :: tmstate.stack,
		tmstate.env,
		instructions,
		tmstate.dump
	      ),
	      ctxt
	    )
	  }
	  case rd : READ => {
	    tmstate.stack match {	      
	      case Right( ocl : OclV ) :: stkRest => {
		val nframe = 
		  asFrame(
		    tmstate.stack, 
		    tmstate.env,
		    instructions
		  )
		( 
		  new MACHINE(
		    List(),
		    fromEnv( ocl.env_ ),
		    fromILLCode( ocl.illcode_ ),
		    nframe :: tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute SND with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	  case dup : DUP => {
	    tmstate.stack match {
	      case Right( v ) :: stkRest => {
		(
		  new MACHINE(
		    Right( v ) :: Right( v ) :: stkRest,
		    tmstate.env,
		    instructions,
		    tmstate.dump
		  ),
		  ctxt
		)
	      }
	      case _ => {
		throw new Exception(
		  (
		    "machine execution error:"
		    + " attempting to execute DUP with"
		    + " invalid stack form" 
		  )
		)
	      }
	    }
	  }
	}
      }
      case _ => ( machine, ctxt )
    }
    
  }
}
