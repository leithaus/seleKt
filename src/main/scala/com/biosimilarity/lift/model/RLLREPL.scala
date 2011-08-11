// -*- mode: Scala;-*- 
// Filename:    REPL.scala 
// Authors:     lgm                                                    
// Creation:    Thu May  8 10:18:48 2008 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.lift.model

import com.biosimilarity.seleKt.model.ill.lang.illtl._
import com.biosimilarity.seleKt.model.ill.lang.illtl.Absyn._
import com.biosimilarity.seleKt.model.ill.compiler._
import com.biosimilarity.seleKt.model.ill.vm.illvm.executive._

import scala.collection.immutable.HashMap

import java.net.URI
import java.util.UUID
import java.io.StringReader

class RLLREPL {
  import SyntaxConversion._
  // parsing
  def lexer (str : String) = new Yylex( new StringReader( str ) )
  def parser (str : String) = new parser( lexer( str ) )
  def clientRequestParseTree (str : String) = (parser( str )).pRLLExpr()
  def read (str : String) = clientRequestParseTree(str)  

  // compilation      
  def compile( str : String ) = {
    CompilerNoCtxt.compile( 
      read( str ),
      Nil,
      ()
    )
  }
  
  // evaluation  
  def eval( str : String ) = {
    val ( code, ctxt ) = compile( str )
    val tmstate = 
      TMState(
	Nil,
	Nil,
	code,
	Nil
      )
    val ( v, _ ) =
      NoCtxtTransitions.reduce( tmstate, ctxt )
    v
  }

  // printing
  def showClientRequestParseTree (str : String) =
    PrettyPrinter.show(clientRequestParseTree(str))    
}
