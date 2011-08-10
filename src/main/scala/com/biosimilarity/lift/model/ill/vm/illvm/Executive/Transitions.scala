// -*- mode: Scala;-*- 
// Filename:    Transitions.scala 
// Authors:     lgm                                                    
// Creation:    Tue Aug  9 20:35:07 2011 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.seleKt.model.ill.vm.illvm.executive

import com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn._

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

  def reduce( machine : MACHINE, ctxt : Ctxt ) : ( Value, Ctxt ) = {
    var tmstate = asTMState( machine )
    var ktxt = ctxt 

    while( !( tmstate.code.isEmpty ) ) {
      reduceOnce( machine, ctxt ) match {
	case ( r1M, nCtxt ) => {
	  tmstate = asTMState( r1M )
	  ktxt = nCtxt
	}
      }
    }

    tmstate.stack match {
      case Right( v ) :: stkRest => ( v, ktxt )
      case _ => throw new Exception( "execution failed to produce a value" )
    }
  }
}

object NoCtxtTransitions extends Transitions[Unit] {
}
