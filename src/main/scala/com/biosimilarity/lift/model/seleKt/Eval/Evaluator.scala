// -*- mode: Scala;-*- 
// Filename:    Evaluator.scala 
// Authors:     lgm                                                    
// Creation:    Tue Sep 14 15:10:02 2010 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.lift.model.seleKt.Eval

import com.biosimilarity.lift.model._
import seleKt.Absyn._

import scala.collection.Map
import scala.collection.SeqProxy
import scala.collection.immutable.HashMap

import java.net.URI
import java.util.UUID
import java.io.StringReader

trait Evaluator {
  import scala.collection.JavaConversions._

  type Domain
  type Coll[A] <: Seq[A]
  type Name

  class RColl[A](
    rcoll : Coll[Either[A,RColl[A]]]
  ) extends SeqProxy[Either[A,RColl[A]]] {
    override def self = rcoll
  }

  type Normal = RColl[Domain]

  implicit def inject [A] ( seq : Seq[A] ) : Seq[Either[A,RColl[A]]] = {
    seq.map( ( a ) => { Left[A,RColl[A]]( a ) } )
  }

  implicit def asColl [A] ( seq : Seq[A] ) : Coll[A]

  implicit def asRColl [A] ( coll : Coll[Either[A,RColl[A]]] ) = {
    new RColl[A]( coll )
  }
  
  trait EvaluationContext {
    def env : Map[Name,Normal]
  }
  class EvalCtxt(
    val env : Map[Name,Normal]
  ) extends EvaluationContext

  def bindExpr(
    binding : Binding,
    ctxt : EvaluationContext
  ) : EvaluationContext 

  def normallyEmpty : Normal
  def unit( domExpr : Domain ) : Normal
  def mult( ccoll : Normal ) : Normal

  def eval( rexpr : RecordExpr ) : Normal = {
    eval(
      rexpr,
      new EvalCtxt( new HashMap[Name,Normal]( ) )
    )
  }     

  def eval( rexpr : RecordExpr, ctxt : EvaluationContext ) : Normal = {    
    rexpr match {
      case isoExpr : Isolated => {
	evalExpr( isoExpr, ctxt )
      }
      case joinExpr : Joined => {
	evalExpr( joinExpr, ctxt )
      }
      case consExpr : Consed => {
	evalExpr( consExpr, ctxt )
      }
      case ctxtExpr : Contexted => {
	evalExpr( ctxtExpr, ctxt )
      }
      case collExpr : Collected => {
	evalExpr( collExpr, ctxt )
      }
      case empty : Emptied => {
	evalExpr( empty, ctxt )
      }
    }
  }

  def evalExpr( rexpr : DomainExpr, ctxt : EvaluationContext ) : Domain
  
  def evalExpr( expr : Isolated, ctxt : EvaluationContext ) : Normal = {
    val nrml1 : Normal = eval( expr.recordexpr_1, ctxt )
    val nrml2 : Normal = eval( expr.recordexpr_2, ctxt )
    (nrml1 ++ nrml2).asInstanceOf[Normal]
  }
  
  def evalExpr( expr : Joined, ctxt : EvaluationContext ) : Normal = {
    val nrml1 : Normal = eval( expr.recordexpr_1, ctxt )
    val nrml2 : Normal = eval( expr.recordexpr_2, ctxt )    
    (nrml1 intersect nrml2).asInstanceOf[Normal]
  }

  def evalExpr( expr : Consed, ctxt : EvaluationContext ) : Normal = {
    val rest : Normal = eval( expr.recordexpr_, ctxt )
    val hed : Normal = unit( evalExpr( expr.domainexpr_, ctxt ) )
    (hed ++ rest).asInstanceOf[Normal]
  }

  def evalExpr( expr : Contexted, ctxt : EvaluationContext ) : Normal = {    
    eval(
      expr, 
      ( ctxt /: expr.listbinding_ )( 
	{
	  ( acc, binding ) => bindExpr( binding, acc )
	}
      )
    )
  }

  def evalExpr( expr : Collected, ctxt : EvaluationContext ) : Normal = {
    expr.collectionexpr_ match {
      case extn : Extension => {
	evalExpr( extn, ctxt )
      }
      case intn : Intension => {
	evalExpr( intn, ctxt )
      }
    }
  }

  def evalExpr( expr : Extension, ctxt : EvaluationContext ) : Normal = {
    expr.extensionbodyexpr_ match {
      case extnBody : ExtensionBody => {
	asRColl(
	  extnBody.listdomainexpr_.flatMap( 
	    ( domExpr ) => unit( evalExpr( domExpr, ctxt ) )
	  ).toList
	)
      }
    }    
  }

  def evalExpr( expr : Intension, ctxt : EvaluationContext ) : Normal = {
    expr.intensionbodyexpr_ match {
      case intnBody : IntensionBody => {
	normallyEmpty
      }
    }
  }
    
  def evalExpr( expr : Emptied, ctxt : EvaluationContext ) : Normal = {
    normallyEmpty
  }
  
}
