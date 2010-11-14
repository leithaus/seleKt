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

trait DomainAbbreviations {
  def declSrc( e : DomainGen ) : RecordSource
  def declTrgt( e : DomainGen ) : DomainPtn
}

trait TypeDependencies {
  type Domain
  type Name
  type Ctxt

  type Coll[A] <: Seq[A]
  type Trgt = Either[Ctxt,Name]
}

trait Evaluator {
  self : DomainAbbreviations with TypeDependencies =>

      import scala.collection.JavaConversions._   

  type Ctxt = DomainPtn

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
  
  // hmmm ... looks like EvaluationContext should extend Maplike
  trait EvaluationContext {
    def env : Map[Trgt,Normal]
    def extend( envp : Map[Trgt,Normal] ) : EvaluationContext
  }
  class EvalCtxt(
    val env : Map[Trgt,Normal]
  ) extends EvaluationContext {
    override def extend( envp : Map[Trgt,Normal] ) : EvaluationContext
    = {
      new EvalCtxt( env ++ envp )
    }
  }

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
      new EvalCtxt( new HashMap[Trgt,Normal]( ) )
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

  def evalExpr(
    expr : DomainCond,
    ctxt : EvaluationContext
  ) : List[Domain] => Boolean

  def evalCondition(
    cnd : DomainCond,
    sem : List[Domain] => Boolean,
    ctxt : EvaluationContext
  ) : Boolean

  def evalExpr(
    expr : DomainPtn,
    ctxt : EvaluationContext
  ) : Normal

  def satisfies(
    cnds : Seq[DomainCond],
    ctxt : EvaluationContext
  ) : Boolean = {
    def loop( cnds : Seq[DomainCond] ) : Boolean = {
      cnds match {
	case Nil => true
	case cnd :: rcnds => {
	  evalCondition( cnd, evalExpr( cnd, ctxt ), ctxt ) match {
	    case true => loop( rcnds )
	    case _ => false
	  }
	}
      }
    }
    loop( cnds )
  }
  
  def fill(
    dptn : DomainPtn,
    dval : Normal,
    ctxt : EvaluationContext
  ) : ( Map[Trgt,Normal], Normal )

  def evalExpr( expr : Intension, ctxt : EvaluationContext ) : Normal = {
//    record { ($H1 $A1 $A2) | $H1 <- R1, $A1 <- R2, $A2 <- R3, $A1 = $A2 }
    expr.intensionbodyexpr_ match {
      case intnBody : IntensionBody => {
// 	 for( H1 <- eval( R1 ); A1 <- eval( R2 ); A2 <- eval( R3 )
// 	   if A2 == A2 )
// 	 yield { LAMBDA X, Y, Z. (H1, A1 A2 ) }
	val dptn = intnBody.domainptn_
	val dclOrCnds = intnBody.listdomaindeclorcond_
	val dcls : Seq[DomainGen] =
	  (dclOrCnds filter ( (doc) => doc.isInstanceOf[DomainGen] )).toList.asInstanceOf[Seq[DomainGen]]
	val cnds : Seq[DomainCond] =
	  (dclOrCnds filter ( (doc) => doc.isInstanceOf[DomainCond] )).toList.asInstanceOf[Seq[DomainCond]]

	// create pairs of ( ptn-to-fill, domainSources )
	
	def loop( ctxt : EvaluationContext )
	: ( Normal, EvaluationContext ) = {
	  val envp = ( ctxt.env /: dcls )( 
	    {
	      ( acc, e ) => {
		val dclTrgt = declTrgt( e )
		val ( m, rSrc ) : ( Map[Trgt,Normal], Normal ) =
		  fill( dclTrgt, acc( Left[DomainPtn,Name]( dclTrgt ) ), ctxt )
		acc ++ List( ( Left[DomainPtn,Name]( dclTrgt ), rSrc ) )
	      }
	    }
	  )

	  val nCtxt = ctxt.extend( envp )

	  if ( satisfies( cnds, nCtxt ) ) {
	    ( evalExpr( dptn, nCtxt ), nCtxt )
	  }
	  else {
	    loop( nCtxt )
	  }
	}

	val nFormEnv =
	  loop(
	    ( ctxt /: dcls )( 
	      {
		( acc, e ) => {
		  val envp : Map[Trgt,Normal] = acc.env
		  val npair : List[ ( Trgt, Normal ) ] =
		    List(
		      ( Left[Ctxt,Name]( declTrgt( e ) ), evalExpr( declSrc( e ), acc ) )
		    )
		  val envpp : Map[Trgt,Normal] = envp ++ npair
		  acc.extend(
		    (		      
		      envpp
		    )
		  )
		}
	      }
	    )
	  )

	lazy val rslt : List[( Normal, EvaluationContext )] =
	  nFormEnv :: rslt map( 
	  {
	    ( nfm ) => {
	      nfm match {
		case ( nf, m ) => {
		  loop( m )
		}
	      }
	    }
	  }	    
	)
	
	rslt( 0 )_1
	
      }
    }
    //normallyEmpty
  }
    
  def evalExpr( expr : Emptied, ctxt : EvaluationContext ) : Normal = {
    normallyEmpty
  }

  def evalExpr( rsrc : RecordSource, ctxt : EvaluationContext ) : Normal
  
}
