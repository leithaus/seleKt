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

  def compile(
    rllExpr : RLLExpr,
    machine : MACHINE,
    lvars : List[FormalExpr],
    vctxt : Set[FormalExpr],
    ctxt : Ctxt
  ) : ( MACHINE, Ctxt ) = {
    rllExpr match {
      case ap : Application => {
	// TBD
	( machine, ctxt )
      }
      case sep : Separation => {
	// TBD
	( machine, ctxt )
      }
      case incl : Inclusion => {
	// TBD
	( machine, ctxt )
      }
      case abs : Abstraction => {	
	// TBD
	( machine, ctxt )
      }
      case inl : InjectionLeft => {
	// TBD
	( machine, ctxt )
      }
      case inr : InjectionRight => {
	// TBD
	( machine, ctxt )
      }
      case dur : Duration => {
	// TBD
	( machine, ctxt )
      }
      case dtor : Deconstruction => {
	// TBD
	( machine, ctxt )
      }
      case sel : Selection => {
	// TBD
	( machine, ctxt )
      }
      case mntn : Mention => {
	// TBD
	( machine, ctxt )
      }
      case vl : SynVal => {
	// TBD
	( machine, ctxt )
      }
    }
  }
}
