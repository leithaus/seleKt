// -*- mode: Scala;-*- 
// Filename:    Compiler.scala 
// Authors:     lgm                                                    
// Creation:    Wed Aug 10 01:50:01 2011 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.seleKt.model.ill.compiler

import com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn._
import com.biosimilarity.seleKt.model.ill.lang.illtl.Absyn.{ Value => SynVal,_}

trait Compiler[Ctxt] {
  import com.biosimilarity.seleKt.model.ill.vm.illvm.executive.SyntaxConversion._
  import scala.collection.JavaConversions._

  /*
   * The grammar for the ILL TL is not actually context free. This is
   * because there are constraints on the linear use of
   * variables. Therefore, we must make an additional check, after
   * parsing, to determine whether the expression is actually well-formed.
   */
  def wellFormed(
    rllExpr : RLLExpr,
    vctxt : Set[FormalExpr]
  ) : Boolean

  def fstOccurs(
    lvars : List[FormalExpr],
    fml : FormalExpr
  ) : Int = {
    fml match {
      case t : Transcription => {
	lvars.indexWhere(
	  ( lfml : FormalExpr ) => {
	    lfml match {
	      case lt : Transcription => {
		lt.rllexpr_.equals( t.rllexpr_ )
	      }
	      case _ => false
	    }
	  }
	)
      }
      case a : AtomLiteral => {
	lvars.indexWhere(
	  ( lfml : FormalExpr ) => {
	    lfml match {
	      case la : AtomLiteral => {
		la.ident_.equals( a.ident_ )
	      }
	      case _ => false
	    }
	  }
	)
      }
      case _ => {
	throw new Exception( "Unexpected fml identifier type" )
      }
    }    
  }

  def compile(
    rllExpr : RLLExpr,
    machine : MACHINE,
    lvars : List[FormalExpr],
    vctxt : Set[FormalExpr],
    ctxt : Ctxt
  ) : ( MACHINE, Ctxt ) = {
    val ( tmstate, fctxt ) = 
      compile(
	rllExpr,
	asTMState( machine ),
	lvars,
	vctxt,
	ctxt
      )
    ( asMachine( tmstate ), fctxt )
  }

  def compile(
    rllExpr : RLLExpr,
    tmstate : TMState,
    lvars : List[FormalExpr],
    vctxt : Set[FormalExpr],
    ctxt : Ctxt
  ) : ( TMState, Ctxt ) = {
    rllExpr match {
      case ap : Application => {
	val ( opstate, opctxt ) =
	  compile( ap.rllexpr_, tmstate, lvars, vctxt, ctxt )
	val actlStateNCtxts =
	  (
	    for( actl <- ap.listrllexpr_ )
	    yield { compile( actl, tmstate, lvars, vctxt, ctxt ) }
	  );
	val actlCode =
	  ( List[Instruction]() /: actlStateNCtxts )(
	    {
	      ( acc, asc ) => {
		( acc ++ asc._1.code ++ List( new PUSH( "PUSH" ) ) )
	      }
	    }
	  );
	val code =
	  actlCode ++ opstate.code ++ List( new AP( "AP" ) )

	val nstate =
	  TMState(
	    tmstate.stack,
	    tmstate.env,
	    code ++ tmstate.code,
	    tmstate.dump
	  )
	( nstate, ctxt )
      }
      case sep : Separation => {
	val ( tstate, tctxt ) = 
	  compile(
	    sep.rllexpr_1,
	    tmstate,
	    lvars,
	    vctxt,
	    ctxt
	  )
	val ( ustate, uctxt ) = 
	  compile(
	    sep.rllexpr_2,
	    tmstate,
	    lvars,
	    vctxt,
	    ctxt
	  )
	val code = 
	  (
	    tstate.code
	    ++ ustate.code
	    ++ List( new PAIR( "PAIR" ) )
	  );
	
	val nstate =
	  TMState(
	    tmstate.stack,
	    tmstate.env,
	    code ++ tmstate.code,
	    tmstate.dump
	  )
	( nstate, ctxt )
      }
      case incl : Inclusion => {
	// TBD
	( tmstate, ctxt )
      }
      case abs : Abstraction => {	
	val ( bstate, bctxt ) =
	  compile(
	    abs.rllexpr_,
	    tmstate,
	    abs.listformalexpr_.toList ++ lvars,
	    vctxt,
	    ctxt
	  )
	val fclcode : List[Instruction] =
	  ( bstate.code ++ List( new POP( "POP" ), new RET( "RET" ) ) );
	val makefcl = new MAKEFCL( asILLCode( fclcode ) )
	val nstate =
	  TMState(
	    tmstate.stack,
	    tmstate.env,
	    makefcl :: tmstate.code,
	    tmstate.dump
	  )
	( nstate, ctxt )
      }
      case inl : InjectionLeft => {
	val ( ilstate, ilctxt ) =
	  compile( inl.rllexpr_, tmstate, lvars, vctxt, ctxt )
	val code =
	  ilstate.code ++ List( new INL( "INL" ) )
	val nstate =
	  TMState(
	    tmstate.stack,
	    tmstate.env,
	    code ++ tmstate.code,
	    tmstate.dump
	  )
	( nstate, ctxt )
      }
      case inr : InjectionRight => {
	val ( irstate, irctxt ) =
	  compile( inr.rllexpr_, tmstate, lvars, vctxt, ctxt )
	val code =
	  irstate.code ++ List( new INL( "INL" ) )
	val nstate =
	  TMState(
	    tmstate.stack,
	    tmstate.env,
	    code ++ tmstate.code,
	    tmstate.dump
	  )
	( nstate, ctxt )
      }
      case dur : Duration => {
	val ( dstate, dctxt ) =
	  compile( dur.rllexpr_, tmstate, lvars, vctxt, ctxt )
	val oclcode : List[Instruction] =
	  ( dstate.code ++ List( new RET( "RET" ) ) );
	val makeocl = new MAKEOCL( asILLCode( oclcode ) )
	val nstate =
	  TMState(
	    tmstate.stack,
	    tmstate.env,
	    makeocl :: tmstate.code,
	    tmstate.dump
	  )
	( nstate, ctxt )
      }
      case dtor : Deconstruction => {
	dtor.rllptrn_ match {
	  case unitPtn : UnitPtn => {
	    val ( tstate, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		tmstate,
		lvars,
		vctxt,
		ctxt
	      )
	    val ( ustate, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		tmstate,
		lvars,
		vctxt,
		ctxt
	      )
	    val code = 
	      (
		tstate.code
		++ List( new UNUNIT( "UNUNIT" ) )
		++ ustate.code		
	      );
	
	    val nstate =
	      TMState(
		tmstate.stack,
		tmstate.env,
		code ++ tmstate.code,
		tmstate.dump
	      )
	    ( nstate, ctxt )
	  }
	  case sepPtn : SeparationPtn => {
	    val ( tstate, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		tmstate,
		lvars,
		vctxt,
		ctxt
	      )
	    val ( ustate, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		tmstate,
		sepPtn.formalexpr_1 :: sepPtn.formalexpr_2 :: lvars,
		vctxt,
		ctxt
	      )
	    val code = 
	      (
		tstate.code
		++ List(
		  new UNPAIR( "UNPAIR" ),
		  new PUSH( "PUSH" ),
		  new PUSH( "PUSH" )
		)
		++ ustate.code		
	      );
	
	    val nstate =
	      TMState(
		tmstate.stack,
		tmstate.env,
		code ++ tmstate.code,
		tmstate.dump
	      )
	    ( nstate, ctxt )
	  }
	  case dupPtn : DuplicationPtn => {
	    val ( tstate, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		tmstate,
		lvars,
		vctxt,
		ctxt
	      )
	    val ( ustate, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		tmstate,
		dupPtn.formalexpr_1 :: dupPtn.formalexpr_2 :: lvars,
		vctxt,
		ctxt
	      )
	    val code : List[Instruction] = 
	      (
		tstate.code
		++ List[Instruction](
		  new UNPAIR( "DUP" ),
		  new PUSH( "PUSH" ),
		  new PUSH( "PUSH" )
		)
		++ ustate.code
		++ List[Instruction](
		  new POP( "POP" ),
		  new POP( "POP" )
		)
	      );
	
	    val nstate =
	      TMState(
		tmstate.stack,
		tmstate.env,
		code ++ tmstate.code,
		tmstate.dump
	      )
	    ( nstate, ctxt )
	  }
	  case inclPtn : InclusionLeft => {
	    val ( tstate, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		tmstate,
		lvars,
		vctxt,
		ctxt
	      )
	    val ( ustate, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		tmstate,
		lvars,
		vctxt,
		ctxt
	      )
	    val code = 
	      (
		tstate.code
		++ List[Instruction](
		  new FST( "FST" ),		  
		  new PUSH( "PUSH" )
		)
		++ ustate.code
		++ List[Instruction]( new POP( "POP" ) )
	      );
	
	    val nstate =
	      TMState(
		tmstate.stack,
		tmstate.env,
		code ++ tmstate.code,
		tmstate.dump
	      )
	    ( nstate, ctxt )
	  }
	  case incrPtn : InclusionRight => {
	    val ( tstate, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		tmstate,
		lvars,
		vctxt,
		ctxt
	      )
	    val ( ustate, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		tmstate,
		lvars,
		vctxt,
		ctxt
	      )
	    val code = 
	      (
		tstate.code
		++ List(
		  new FST( "SND" ),		  
		  new PUSH( "PUSH" )
		)
		++ ustate.code
		++ List( new POP( "POP" ) )
	      );
	
	    val nstate =
	      TMState(
		tmstate.stack,
		tmstate.env,
		code ++ tmstate.code,
		tmstate.dump
	      )
	    ( nstate, ctxt )
	  }
	  case extrPtn : Extraction => {
	    val ( tstate, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		tmstate,
		lvars,
		vctxt,
		ctxt
	      )
	    val ( ustate, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		tmstate,
		extrPtn.formalexpr_ :: lvars,
		vctxt,
		ctxt
	      )
	    val code = 
	      (
		tstate.code
		++ List(
		  new READ( "READ" ),		  
		  new PUSH( "PUSH" )
		)
		++ ustate.code
		++ List( new POP( "POP" ) )
	      );
	
	    val nstate =
	      TMState(
		tmstate.stack,
		tmstate.env,
		code ++ tmstate.code,
		tmstate.dump
	      )
	    ( nstate, ctxt )
	  }
	  case wcPtn : Wildcard => {	    
	    val ( ustate, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		tmstate,
		lvars,
		vctxt,
		ctxt
	      )
	    val code = ustate.code
	
	    val nstate =
	      TMState(
		tmstate.stack,
		tmstate.env,
		code ++ tmstate.code,
		tmstate.dump
	      )
	    ( nstate, ctxt )
	  }
	}
	( tmstate, ctxt )
      }
      case sel : Selection => {
	val ( tstate, tctxt ) = 
	  compile(
	    sel.rllexpr_1,
	    tmstate,
	    lvars,
	    vctxt,
	    ctxt
	  )
	val leftPtrn =
	  sel.rllleftptrn_ match {
	    case inlp : InLeft => {
	      inlp
	    }
	    case _ => throw new Exception( "unexpected left pattern" )
	  }
	val rightPtrn =
	  sel.rllrightptrn_ match {
	    case inrp : InRight => {
	      inrp
	    }
	    case _ => throw new Exception( "unexpected right pattern" )
	  }
	val ( ustate, uctxt ) = 
	  compile(
	    sel.rllexpr_2,
	    tmstate,
	    leftPtrn.formalexpr_ :: lvars,
	    vctxt,
	    ctxt
	  )
	val ( vstate, vktxt ) = 
	  compile(
	    sel.rllexpr_3,
	    tmstate,
	    rightPtrn.formalexpr_ :: lvars,
	    vctxt,
	    ctxt
	  )
	val codeL : List[Instruction] =
	  (
	    ustate.code 
	    ++ List[Instruction](
	      new POP( "POP" ),
	      new RET( "RET" )
	    )
	  );
	val codeR : List[Instruction] =
	  (
	    vstate.code 
	    ++ List[Instruction](
	      new POP( "POP" ),
	      new RET( "RET" )
	    )
	  )
	val code : List[Instruction] = 
	  (
	    tstate.code
	    ++ List[Instruction](
	      new CASE( asILLCode( codeL ), asILLCode( codeR ) )
	    )
	  );
	
	val nstate =
	  TMState(
	    tmstate.stack,
	    tmstate.env,
	    code ++ tmstate.code,
	    tmstate.dump
	  )
	( nstate, ctxt )
      }
      case mntn : Mention => {	
	val tls =
	  (
	    for( i <- 1 to fstOccurs( lvars, mntn.formalexpr_ ) )
	    yield { new TAIL( "TL" ) }
	  );
	val code =
	  (
	    List( new PUSHENV( "PUSHENV" ) )
	    ++ tls.toList
	    ++ List( new HEAD( "HD" ) )
	  );
	val nstate =
	  TMState(
	    tmstate.stack,
	    tmstate.env,
	    code ++ tmstate.code,
	    tmstate.dump
	  )
	( nstate, ctxt )
      }
      case vl : SynVal => {
	vl match {
	  case ul : UnitLiteral => {
	    val nstate =
	      TMState(
		tmstate.stack,
		tmstate.env,
		List( new UNIT( "UNIT" ) ) ++ tmstate.code,
		tmstate.dump
	      )
	    ( nstate, ctxt )
	  }
	  case sl : StringLiteral => {
	    // TBD
	    ( tmstate, ctxt )
	  }
	  case dl : DecimalLiteral => {
	    // TBD
	    ( tmstate, ctxt )
	  }
	  case il : IntegerLiteral => {
	    // TBD
	    ( tmstate, ctxt )
	  }
	}	
      }
    }
  }
}
