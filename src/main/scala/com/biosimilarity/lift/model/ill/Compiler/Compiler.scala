// -*- mode: Scala;-*- 
// Filename:    Compiler.scala 
// Authors:     lgm                                                    
// Creation:    Wed Aug 10 01:50:01 2011 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.seleKt.model.ill.compiler

import com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn._
import com.biosimilarity.seleKt.model.ill.lang.illtl.Absyn._

trait Compiler[Ctxt] {
  import com.biosimilarity.seleKt.model.ill.vm.illvm.executive.SyntaxConversion._

  def compile(
    rllExpr : RLLExpr,
    machine : MACHINE,
    ctxt : Ctxt
  ) : ( MACHINE, Ctxt )
}
