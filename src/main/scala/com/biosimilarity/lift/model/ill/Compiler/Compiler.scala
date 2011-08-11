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
    val ( code, nctxt ) =
      compile( rllExpr, lvars, ctxt )
    val nstate = 
      TMState(
	tmstate.stack,
	tmstate.env,
	code ++ tmstate.code,
	tmstate.dump
      )
    ( nstate, nctxt )
  }

  def compile(
    rllExpr : RLLExpr,
    lvars : List[FormalExpr],
    ctxt : Ctxt
  ) : ( List[Instruction], Ctxt ) = {
    rllExpr match {
      case ap : Application => {
	val ( opcode, opctxt ) =
	  compile( ap.rllexpr_, lvars, ctxt )
	val actlStateNCtxts =
	  (
	    for( actl <- ap.listrllexpr_ )
	    yield { compile( actl, lvars, ctxt ) }
	  );
	val actlCode =
	  ( List[Instruction]() /: actlStateNCtxts )(
	    {
	      ( acc, asc ) => {
		( acc ++ asc._1 ++ List( new PUSH( "PUSH" ) ) )
	      }
	    }
	  );
	val ncode =
	  actlCode ++ opcode ++ List( new AP( "AP" ) )
	
	( ncode, ctxt )
      }
      case sep : Separation => {
	val ( tcode, tctxt ) = 
	  compile(
	    sep.rllexpr_1,
	    lvars,
	    ctxt
	  )
	val ( ucode, uctxt ) = 
	  compile(
	    sep.rllexpr_2,
	    lvars,
	    ctxt
	  )
	val ncode = 
	  (
	    tcode
	    ++ ucode
	    ++ List( new PAIR( "PAIR" ) )
	  );
		
	( ncode, ctxt )
      }
      case incl : Inclusion => {
	val ( tcode, tctxt ) = 
	  compile(
	    incl.rllexpr_1,
	    lvars,
	    ctxt
	  )
	val ( ucode, uctxt ) = 
	  compile(
	    incl.rllexpr_2,
	    lvars,
	    ctxt
	  )
	val makeccl = 
	  new MAKECCL(
	    ( tcode ++ List[Instruction]( new RET( "RET" ) ) ),
	    ( ucode ++ List[Instruction]( new RET( "RET" ) ) )
	  );
		
	( List[Instruction]( makeccl ) , ctxt )
      }
      case abs : Abstraction => {	
	val ( bcode, bctxt ) =
	  compile(
	    abs.rllexpr_,
	    abs.listformalexpr_.toList ++ lvars,
	    ctxt
	  )
	val fclcode : List[Instruction] =
	  ( bcode ++ List( new POP( "POP" ), new RET( "RET" ) ) );
	val makefcl = new MAKEFCL( asILLCode( fclcode ) )
	
	( List[Instruction]( makefcl ), ctxt )
      }
      case inl : InjectionLeft => {
	val ( ilcode, ilctxt ) =
	  compile( inl.rllexpr_, lvars, ctxt )
	val ncode =
	  ilcode ++ List( new INL( "INL" ) )
	
	( ncode, ctxt )
      }
      case inr : InjectionRight => {
	val ( ircode, irctxt ) =
	  compile( inr.rllexpr_, lvars, ctxt )
	val ncode =
	  ircode ++ List( new INL( "INL" ) )
	
	( ncode, ctxt )
      }
      case dur : Duration => {
	val ( dcode, dctxt ) =
	  compile( dur.rllexpr_, lvars, ctxt )
	val oclcode : List[Instruction] =
	  ( dcode ++ List( new RET( "RET" ) ) );
	val makeocl = new MAKEOCL( asILLCode( oclcode ) )
	
	( List[Instruction]( makeocl ), ctxt )
      }
      case dtor : Deconstruction => {
	dtor.rllptrn_ match {
	  case unitPtn : UnitPtn => {
	    val ( tcode, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		lvars,
		ctxt
	      )
	    val ( ucode, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		lvars,
		ctxt
	      )
	    val ncode = 
	      (
		tcode
		++ List( new UNUNIT( "UNUNIT" ) )
		++ ucode		
	      );
		    
	    ( ncode, ctxt )
	  }
	  case sepPtn : SeparationPtn => {
	    val ( tcode, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		lvars,
		ctxt
	      )
	    val ( ucode, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		sepPtn.formalexpr_1 :: sepPtn.formalexpr_2 :: lvars,
		ctxt
	      )
	    val ncode = 
	      (
		tcode
		++ List(
		  new UNPAIR( "UNPAIR" ),
		  new PUSH( "PUSH" ),
		  new PUSH( "PUSH" )
		)
		++ ucode		
	      );
		    
	    ( ncode, ctxt )
	  }
	  case dupPtn : DuplicationPtn => {
	    val ( tcode, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		lvars,
		ctxt
	      )
	    val ( ucode, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		dupPtn.formalexpr_1 :: dupPtn.formalexpr_2 :: lvars,
		ctxt
	      )
	    val ncode : List[Instruction] = 
	      (
		tcode
		++ List[Instruction](
		  new UNPAIR( "DUP" ),
		  new PUSH( "PUSH" ),
		  new PUSH( "PUSH" )
		)
		++ ucode
		++ List[Instruction](
		  new POP( "POP" ),
		  new POP( "POP" )
		)
	      );
		    
	    ( ncode, ctxt )
	  }
	  case inclPtn : InclusionLeft => {
	    val ( tcode, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		lvars,
		ctxt
	      )
	    val ( ucode, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		lvars,
		ctxt
	      )
	    val ncode = 
	      (
		tcode
		++ List[Instruction](
		  new FST( "FST" ),		  
		  new PUSH( "PUSH" )
		)
		++ ucode
		++ List[Instruction]( new POP( "POP" ) )
	      );
		    
	    ( ncode, ctxt )
	  }
	  case incrPtn : InclusionRight => {
	    val ( tcode, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		lvars,
		ctxt
	      )
	    val ( ucode, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		lvars,
		ctxt
	      )
	    val ncode = 
	      (
		tcode
		++ List(
		  new FST( "SND" ),		  
		  new PUSH( "PUSH" )
		)
		++ ucode
		++ List( new POP( "POP" ) )
	      );
		    
	    ( ncode, ctxt )
	  }
	  case extrPtn : Extraction => {
	    val ( tcode, tctxt ) = 
	      compile(
		dtor.rllexpr_1,
		lvars,
		ctxt
	      )
	    val ( ucode, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		extrPtn.formalexpr_ :: lvars,
		ctxt
	      )
	    val ncode = 
	      (
		tcode
		++ List(
		  new READ( "READ" ),		  
		  new PUSH( "PUSH" )
		)
		++ ucode
		++ List( new POP( "POP" ) )
	      );
	
	    ( ncode, ctxt )
	  }
	  case wcPtn : Wildcard => {	    
	    val ( ucode, uctxt ) = 
	      compile(
		dtor.rllexpr_2,
		lvars,
		ctxt
	      )
		    
	    ( ucode , ctxt )
	  }
	}
      }
      case sel : Selection => {
	val ( tcode, tctxt ) = 
	  compile(
	    sel.rllexpr_1,
	    lvars,
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
	val ( ucode, uctxt ) = 
	  compile(
	    sel.rllexpr_2,
	    leftPtrn.formalexpr_ :: lvars,
	    ctxt
	  )
	val ( vcode, vktxt ) = 
	  compile(
	    sel.rllexpr_3,
	    rightPtrn.formalexpr_ :: lvars,
	    ctxt
	  )
	val codeL : List[Instruction] =
	  (
	    ucode 
	    ++ List[Instruction](
	      new POP( "POP" ),
	      new RET( "RET" )
	    )
	  );
	val codeR : List[Instruction] =
	  (
	    vcode 
	    ++ List[Instruction](
	      new POP( "POP" ),
	      new RET( "RET" )
	    )
	  )
	val ncode : List[Instruction] = 
	  (
	    tcode
	    ++ List[Instruction](
	      new CASE( asILLCode( codeL ), asILLCode( codeR ) )
	    )
	  );
		
	( ncode, ctxt )
      }
      case mntn : Mention => {	
	val tls =
	  (
	    for( i <- 1 to fstOccurs( lvars, mntn.formalexpr_ ) )
	    yield { new TAIL( "TL" ) }
	  );
	val ncode =
	  (
	    List( new PUSHENV( "PUSHENV" ) )
	    ++ tls.toList
	    ++ List( new HEAD( "HD" ) )
	  );
	
	( ncode, ctxt )
      }
      case vl : SynVal => {
	vl match {
	  case ul : UnitLiteral => {	    
	    ( List( new UNIT( "UNIT" ) ) , ctxt )
	  }
	  case sl : StringLiteral => {
	    // TBD
	    ( Nil, ctxt )
	  }
	  case dl : DecimalLiteral => {
	    // TBD
	    ( Nil, ctxt )
	  }
	  case il : IntegerLiteral => {
	    // TBD
	    ( Nil, ctxt )
	  }
	}	
      }
    }
  }
}
