package com.biosimilarity.lift.model.seleKt;
import com.biosimilarity.lift.model.seleKt.Absyn.*;
/*** BNFC-Generated Visitor Design Pattern Skeleton. ***/
/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use. 
   Replace the R and A parameters with the desired return
   and context types.*/

public class VisitSkel
{
  public class RecordExprVisitor<R,A> implements RecordExpr.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Joined p, A arg)
    {
      /* Code For Joined Goes Here */

      p.recordexpr_1.accept(new RecordExprVisitor<R,A>(), arg);
      p.recordexpr_2.accept(new RecordExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Isolated p, A arg)
    {
      /* Code For Isolated Goes Here */

      p.recordexpr_1.accept(new RecordExprVisitor<R,A>(), arg);
      p.recordexpr_2.accept(new RecordExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Consed p, A arg)
    {
      /* Code For Consed Goes Here */

      p.domainexpr_.accept(new DomainExprVisitor<R,A>(), arg);
      p.recordexpr_.accept(new RecordExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Contexted p, A arg)
    {
      /* Code For Contexted Goes Here */

      for (Binding x : p.listbinding_) {
      }
      p.recordexpr_.accept(new RecordExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Referenced p, A arg)
    {
      /* Code For Referenced Goes Here */

      p.recordvariable_.accept(new RecordVariableVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Collected p, A arg)
    {
      /* Code For Collected Goes Here */

      p.collectionexpr_.accept(new CollectionExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Emptied p, A arg)
    {
      /* Code For Emptied Goes Here */


      return null;
    }

  }
  public class BindingVisitor<R,A> implements Binding.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr p, A arg)
    {
      /* Code For BindingExpr Goes Here */

      p.recordptn_1.accept(new RecordPtnVisitor<R,A>(), arg);
      p.recordptn_2.accept(new RecordPtnVisitor<R,A>(), arg);

      return null;
    }

  }
  public class RecordPtnVisitor<R,A> implements RecordPtn.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor p, A arg)
    {
      /* Code For RecordDestructor Goes Here */

      for (DomainPtn x : p.listdomainptn_) {
      }
      p.recordptn_.accept(new RecordPtnVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral p, A arg)
    {
      /* Code For RecordLiteral Goes Here */

      p.recordexpr_.accept(new RecordExprVisitor<R,A>(), arg);

      return null;
    }

  }
  public class RecordVariableVisitor<R,A> implements RecordVariable.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent p, A arg)
    {
      /* Code For RecordIdent Goes Here */

      //p.uident_;

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordWild p, A arg)
    {
      /* Code For RecordWild Goes Here */


      return null;
    }

  }
  public class CollectionExprVisitor<R,A> implements CollectionExpr.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Extension p, A arg)
    {
      /* Code For Extension Goes Here */

      p.extensionbodyexpr_.accept(new ExtensionBodyExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Intension p, A arg)
    {
      /* Code For Intension Goes Here */

      p.intensionbodyexpr_.accept(new IntensionBodyExprVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ExtensionBodyExprVisitor<R,A> implements ExtensionBodyExpr.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody p, A arg)
    {
      /* Code For ExtensionBody Goes Here */

      for (DomainExpr x : p.listdomainexpr_) {
      }

      return null;
    }

  }
  public class IntensionBodyExprVisitor<R,A> implements IntensionBodyExpr.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody p, A arg)
    {
      /* Code For IntensionBody Goes Here */

      p.domainptn_.accept(new DomainPtnVisitor<R,A>(), arg);
      for (DomainDeclOrCond x : p.listdomaindeclorcond_) {
      }

      return null;
    }

  }
  public class DomainDeclOrCondVisitor<R,A> implements DomainDeclOrCond.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn p, A arg)
    {
      /* Code For ConditionIn Goes Here */

      p.domaincond_.accept(new DomainCondVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DeclIn p, A arg)
    {
      /* Code For DeclIn Goes Here */

      p.domaingen_.accept(new DomainGenVisitor<R,A>(), arg);

      return null;
    }

  }
  public class DomainGenVisitor<R,A> implements DomainGen.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr p, A arg)
    {
      /* Code For DomainGenExpr Goes Here */

      p.domainptn_.accept(new DomainPtnVisitor<R,A>(), arg);
      p.recordsource_.accept(new RecordSourceVisitor<R,A>(), arg);

      return null;
    }

  }
  public class DomainCondVisitor<R,A> implements DomainCond.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr p, A arg)
    {
      /* Code For DomainSatExpr Goes Here */

      p.domainptn_.accept(new DomainPtnVisitor<R,A>(), arg);
      p.domaincondition_.accept(new DomainConditionVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr p, A arg)
    {
      /* Code For DomainCompExpr Goes Here */

      p.valueexpr_1.accept(new ValueExprVisitor<R,A>(), arg);
      p.comparison_.accept(new ComparisonVisitor<R,A>(), arg);
      p.valueexpr_2.accept(new ValueExprVisitor<R,A>(), arg);

      return null;
    }

  }
  public class DomainPtnVisitor<R,A> implements DomainPtn.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr p, A arg)
    {
      /* Code For DomainPtnExpr Goes Here */

      p.rlambdapctxt_.accept(new RLambdaPCtxtVisitor<R,A>(), arg);

      return null;
    }

  }
  public class DomainExprVisitor<R,A> implements DomainExpr.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr p, A arg)
    {
      /* Code For DomainRLambdaExpr Goes Here */

      p.rlambdaexpr_.accept(new RLambdaExprVisitor<R,A>(), arg);

      return null;
    }

  }
  public class RecordSourceVisitor<R,A> implements RecordSource.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource p, A arg)
    {
      /* Code For OnBoardSource Goes Here */

      p.recordexpr_.accept(new RecordExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource p, A arg)
    {
      /* Code For PersistentSource Goes Here */

      p.storeurl_.accept(new StoreURLVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.WireSource p, A arg)
    {
      /* Code For WireSource Goes Here */

      p.wireurl_.accept(new WireURLVisitor<R,A>(), arg);

      return null;
    }

  }
  public class DomainConditionVisitor<R,A> implements DomainCondition.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition p, A arg)
    {
      /* Code For DisjunctDomainCondition Goes Here */

      p.domaincondition_1.accept(new DomainConditionVisitor<R,A>(), arg);
      p.domaincondition_2.accept(new DomainConditionVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition p, A arg)
    {
      /* Code For ConjunctDomainCondition Goes Here */

      p.domaincondition_1.accept(new DomainConditionVisitor<R,A>(), arg);
      p.domaincondition_2.accept(new DomainConditionVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition p, A arg)
    {
      /* Code For NegatedDomainCondition Goes Here */

      p.domaincondition_.accept(new DomainConditionVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition p, A arg)
    {
      /* Code For StructuralDomainCondition Goes Here */

      p.rlambdalctxt_.accept(new RLambdaLCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition p, A arg)
    {
      /* Code For BehavioralDomainCondition Goes Here */

      p.modality_.accept(new ModalityVisitor<R,A>(), arg);
      p.domaincondition_.accept(new DomainConditionVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ModalityVisitor<R,A> implements Modality.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility p, A arg)
    {
      /* Code For ProbePossibility Goes Here */

      p.domaincondition_.accept(new DomainConditionVisitor<R,A>(), arg);

      return null;
    }

  }
  public class RLambdaPCtxtVisitor<R,A> implements RLambdaPCtxt.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt p, A arg)
    {
      /* Code For ApplicationPCtxt Goes Here */

      p.rlambdapctxt_.accept(new RLambdaPCtxtVisitor<R,A>(), arg);
      for (RLambdaPCtxt x : p.listrlambdapctxt_) {
      }

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt p, A arg)
    {
      /* Code For AbstractionPCtxt Goes Here */

      for (FormalPCtxt x : p.listformalpctxt_) {
      }
      p.rlambdapctxt_.accept(new RLambdaPCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt p, A arg)
    {
      /* Code For KPCtxt Goes Here */

      p.continuepctxt_.accept(new ContinuePCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt p, A arg)
    {
      /* Code For GroundPCtxt Goes Here */

      p.valuepctxt_.accept(new ValuePCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt p, A arg)
    {
      /* Code For MentionPCtxt Goes Here */

      p.formalpctxt_.accept(new FormalPCtxtVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ContinuePCtxtVisitor<R,A> implements ContinuePCtxt.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt p, A arg)
    {
      /* Code For PushPromptPCtxt Goes Here */

      p.rlambdapctxt_1.accept(new RLambdaPCtxtVisitor<R,A>(), arg);
      p.rlambdapctxt_2.accept(new RLambdaPCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt p, A arg)
    {
      /* Code For SubcontPCtxt Goes Here */

      p.rlambdapctxt_1.accept(new RLambdaPCtxtVisitor<R,A>(), arg);
      p.rlambdapctxt_2.accept(new RLambdaPCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt p, A arg)
    {
      /* Code For PushSubContPCtxt Goes Here */

      p.rlambdapctxt_1.accept(new RLambdaPCtxtVisitor<R,A>(), arg);
      p.rlambdapctxt_2.accept(new RLambdaPCtxtVisitor<R,A>(), arg);

      return null;
    }

  }
  public class FormalPCtxtVisitor<R,A> implements FormalPCtxt.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt p, A arg)
    {
      /* Code For TranscriptPCtxt Goes Here */

      p.rlambdapctxt_.accept(new RLambdaPCtxtVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ValuePCtxtVisitor<R,A> implements ValuePCtxt.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt p, A arg)
    {
      /* Code For ValueAddPCtxt Goes Here */

      p.valuepctxt_1.accept(new ValuePCtxtVisitor<R,A>(), arg);
      p.valuepctxt_2.accept(new ValuePCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt p, A arg)
    {
      /* Code For ValueMultPCtxt Goes Here */

      p.valuepctxt_1.accept(new ValuePCtxtVisitor<R,A>(), arg);
      p.valuepctxt_2.accept(new ValuePCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt p, A arg)
    {
      /* Code For ValueNegPCtxt Goes Here */

      p.valuepctxt_.accept(new ValuePCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt p, A arg)
    {
      /* Code For ValueLitPCtxt Goes Here */

      p.valueliteral_.accept(new ValueLiteralVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt p, A arg)
    {
      /* Code For ValueEmptyPCtxt Goes Here */

      p.valuepctxthole_.accept(new ValuePCtxtHoleVisitor<R,A>(), arg);

      return null;
    }

  }
  public class RLambdaLCtxtVisitor<R,A> implements RLambdaLCtxt.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt p, A arg)
    {
      /* Code For ApplicationLCtxt Goes Here */

      p.rlambdalctxt_.accept(new RLambdaLCtxtVisitor<R,A>(), arg);
      for (RLambdaLCtxt x : p.listrlambdalctxt_) {
      }

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt p, A arg)
    {
      /* Code For AbstractionLCtxt Goes Here */

      for (FormalLCtxt x : p.listformallctxt_) {
      }
      p.rlambdalctxt_.accept(new RLambdaLCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt p, A arg)
    {
      /* Code For KLCtxt Goes Here */

      p.continuelctxt_.accept(new ContinueLCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt p, A arg)
    {
      /* Code For MentionLCtxt Goes Here */

      p.formallctxt_.accept(new FormalLCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt p, A arg)
    {
      /* Code For GroundLCtxt Goes Here */

      p.valuelctxt_.accept(new ValueLCtxtVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ContinueLCtxtVisitor<R,A> implements ContinueLCtxt.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt p, A arg)
    {
      /* Code For PushPromptLCtxt Goes Here */

      p.rlambdalctxt_1.accept(new RLambdaLCtxtVisitor<R,A>(), arg);
      p.rlambdalctxt_2.accept(new RLambdaLCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt p, A arg)
    {
      /* Code For SubconLCtxt Goes Here */

      p.rlambdalctxt_1.accept(new RLambdaLCtxtVisitor<R,A>(), arg);
      p.rlambdalctxt_2.accept(new RLambdaLCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt p, A arg)
    {
      /* Code For PushSubContLCtxt Goes Here */

      p.rlambdalctxt_1.accept(new RLambdaLCtxtVisitor<R,A>(), arg);
      p.rlambdalctxt_2.accept(new RLambdaLCtxtVisitor<R,A>(), arg);

      return null;
    }

  }
  public class FormalLCtxtVisitor<R,A> implements FormalLCtxt.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt p, A arg)
    {
      /* Code For TranscriptLCtxt Goes Here */

      p.rlambdalctxt_.accept(new RLambdaLCtxtVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ValueLCtxtVisitor<R,A> implements ValueLCtxt.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt p, A arg)
    {
      /* Code For ValueAddLCtxt Goes Here */

      p.valuelctxt_1.accept(new ValueLCtxtVisitor<R,A>(), arg);
      p.valuelctxt_2.accept(new ValueLCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt p, A arg)
    {
      /* Code For ValueMultLCtxt Goes Here */

      p.valuelctxt_1.accept(new ValueLCtxtVisitor<R,A>(), arg);
      p.valuelctxt_2.accept(new ValueLCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt p, A arg)
    {
      /* Code For ValueNegLCtxt Goes Here */

      p.valuelctxt_.accept(new ValueLCtxtVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt p, A arg)
    {
      /* Code For ValueLitLCtxt Goes Here */

      p.valueliteral_.accept(new ValueLiteralVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt p, A arg)
    {
      /* Code For ValueEmptyLCtxt Goes Here */

      p.valuelctxthole_.accept(new ValueLCtxtHoleVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ValuePCtxtHoleVisitor<R,A> implements ValuePCtxtHole.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder p, A arg)
    {
      /* Code For ValPPlaceHolder Goes Here */

      //p.uident_;

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard p, A arg)
    {
      /* Code For ValWildCard Goes Here */

      //p.wild_;

      return null;
    }

  }
  public class ValueLCtxtHoleVisitor<R,A> implements ValueLCtxtHole.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder p, A arg)
    {
      /* Code For ValLPlaceHolder Goes Here */

      p.logicalground_.accept(new LogicalGroundVisitor<R,A>(), arg);

      return null;
    }

  }
  public class LogicalGroundVisitor<R,A> implements LogicalGround.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Verity p, A arg)
    {
      /* Code For Verity Goes Here */


      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Absurdity p, A arg)
    {
      /* Code For Absurdity Goes Here */


      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Nullity p, A arg)
    {
      /* Code For Nullity Goes Here */


      return null;
    }

  }
  public class ComparisonVisitor<R,A> implements Comparison.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Equality p, A arg)
    {
      /* Code For Equality Goes Here */


      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Less p, A arg)
    {
      /* Code For Less Goes Here */


      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.More p, A arg)
    {
      /* Code For More Goes Here */


      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.LEq p, A arg)
    {
      /* Code For LEq Goes Here */


      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.GEq p, A arg)
    {
      /* Code For GEq Goes Here */


      return null;
    }

  }
  public class RLambdaExprVisitor<R,A> implements RLambdaExpr.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Application p, A arg)
    {
      /* Code For Application Goes Here */

      p.rlambdaexpr_.accept(new RLambdaExprVisitor<R,A>(), arg);
      for (RLambdaExpr x : p.listrlambdaexpr_) {
      }

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Abstraction p, A arg)
    {
      /* Code For Abstraction Goes Here */

      for (FormalExpr x : p.listformalexpr_) {
      }
      p.rlambdaexpr_.accept(new RLambdaExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Continuation p, A arg)
    {
      /* Code For Continuation Goes Here */

      p.continueexpr_.accept(new ContinueExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Mention p, A arg)
    {
      /* Code For Mention Goes Here */

      p.formalexpr_.accept(new FormalExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Value p, A arg)
    {
      /* Code For Value Goes Here */

      p.valueexpr_.accept(new ValueExprVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ContinueExprVisitor<R,A> implements ContinueExpr.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Prompt p, A arg)
    {
      /* Code For Prompt Goes Here */


      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt p, A arg)
    {
      /* Code For PushPrompt Goes Here */

      p.rlambdaexpr_1.accept(new RLambdaExprVisitor<R,A>(), arg);
      p.rlambdaexpr_2.accept(new RLambdaExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation p, A arg)
    {
      /* Code For Subcontinuation Goes Here */

      p.rlambdaexpr_1.accept(new RLambdaExprVisitor<R,A>(), arg);
      p.rlambdaexpr_2.accept(new RLambdaExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont p, A arg)
    {
      /* Code For PushSubCont Goes Here */

      p.rlambdaexpr_1.accept(new RLambdaExprVisitor<R,A>(), arg);
      p.rlambdaexpr_2.accept(new RLambdaExprVisitor<R,A>(), arg);

      return null;
    }

  }
  public class FormalExprVisitor<R,A> implements FormalExpr.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Transcription p, A arg)
    {
      /* Code For Transcription Goes Here */

      p.rlambdaexpr_.accept(new RLambdaExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral p, A arg)
    {
      /* Code For AtomLiteral Goes Here */

      //p.ident_;

      return null;
    }

  }
  public class ValueExprVisitor<R,A> implements ValueExpr.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr p, A arg)
    {
      /* Code For ValueAddExpr Goes Here */

      p.valueexpr_1.accept(new ValueExprVisitor<R,A>(), arg);
      p.valueexpr_2.accept(new ValueExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr p, A arg)
    {
      /* Code For ValueMultExpr Goes Here */

      p.valueexpr_1.accept(new ValueExprVisitor<R,A>(), arg);
      p.valueexpr_2.accept(new ValueExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr p, A arg)
    {
      /* Code For ValueNegExpr Goes Here */

      p.valueexpr_.accept(new ValueExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr p, A arg)
    {
      /* Code For ValueLitExpr Goes Here */

      p.valueliteral_.accept(new ValueLiteralVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ValueLiteralVisitor<R,A> implements ValueLiteral.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit p, A arg)
    {
      /* Code For ValueRecLit Goes Here */

      p.recordexpr_.accept(new RecordExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit p, A arg)
    {
      /* Code For ValueLamLit Goes Here */

      p.rlambdaexpr_.accept(new RLambdaExprVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit p, A arg)
    {
      /* Code For ValueIntLit Goes Here */

      //p.integer_;

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit p, A arg)
    {
      /* Code For ValueDoubleLit Goes Here */

      //p.double_;

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit p, A arg)
    {
      /* Code For ValueStringLit Goes Here */

      //p.string_;

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit p, A arg)
    {
      /* Code For ValueCharLit Goes Here */

      //p.char_;

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit p, A arg)
    {
      /* Code For ValueURLLit Goes Here */

      p.url_.accept(new URLVisitor<R,A>(), arg);

      return null;
    }

  }
  public class StoreURLVisitor<R,A> implements StoreURL.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL p, A arg)
    {
      /* Code For RecordStoreURL Goes Here */

      p.url_.accept(new URLVisitor<R,A>(), arg);

      return null;
    }

  }
  public class WireURLVisitor<R,A> implements WireURL.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL p, A arg)
    {
      /* Code For RecordWireURL Goes Here */

      p.url_.accept(new URLVisitor<R,A>(), arg);

      return null;
    }

  }
  public class URLVisitor<R,A> implements URL.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.BasicURL p, A arg)
    {
      /* Code For BasicURL Goes Here */

      p.urlscheme_.accept(new URLSchemeVisitor<R,A>(), arg);
      p.urlpath_.accept(new URLPathVisitor<R,A>(), arg);

      return null;
    }

  }
  public class URLPathVisitor<R,A> implements URLPath.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath p, A arg)
    {
      /* Code For LocatedtedPath Goes Here */

      p.urllocation_.accept(new URLLocationVisitor<R,A>(), arg);
      p.urlrelativepath_.accept(new URLRelativePathVisitor<R,A>(), arg);

      return null;
    }

  }
  public class URLLocationVisitor<R,A> implements URLLocation.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation p, A arg)
    {
      /* Code For URLNetLocation Goes Here */

      p.urlroot_.accept(new URLRootVisitor<R,A>(), arg);
      p.urlrsrclocation_.accept(new URLRsrcLocationVisitor<R,A>(), arg);

      return null;
    }

  }
  public class URLRsrcLocationVisitor<R,A> implements URLRsrcLocation.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc p, A arg)
    {
      /* Code For URLRsrcPortLoc Goes Here */

      p.netlocation_.accept(new NetLocationVisitor<R,A>(), arg);
      p.port_.accept(new PortVisitor<R,A>(), arg);

      return null;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc p, A arg)
    {
      /* Code For URLRsrcLoc Goes Here */

      p.netlocation_.accept(new NetLocationVisitor<R,A>(), arg);

      return null;
    }

  }
  public class URLRelativePathVisitor<R,A> implements URLRelativePath.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.SlashPath p, A arg)
    {
      /* Code For SlashPath Goes Here */

      p.urlroot_.accept(new URLRootVisitor<R,A>(), arg);
      for (URLPathElement x : p.listurlpathelement_) {
      }

      return null;
    }

  }
  public class URLRootVisitor<R,A> implements URLRoot.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin p, A arg)
    {
      /* Code For URLOrigin Goes Here */


      return null;
    }

  }
  public class NetLocationVisitor<R,A> implements NetLocation.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr p, A arg)
    {
      /* Code For DNSAddr Goes Here */

      for (DNSElement x : p.listdnselement_) {
      }

      return null;
    }

  }
  public class URLSchemeVisitor<R,A> implements URLScheme.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme p, A arg)
    {
      /* Code For AtomScheme Goes Here */

      //p.ident_;

      return null;
    }

  }
  public class URLPathElementVisitor<R,A> implements URLPathElement.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement p, A arg)
    {
      /* Code For AtomPathElement Goes Here */

      //p.ident_;

      return null;
    }

  }
  public class DNSElementVisitor<R,A> implements DNSElement.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement p, A arg)
    {
      /* Code For AtomDNSElement Goes Here */

      //p.ident_;

      return null;
    }

  }
  public class PortVisitor<R,A> implements Port.Visitor<R,A>
  {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomPort p, A arg)
    {
      /* Code For AtomPort Goes Here */

      //p.integer_;

      return null;
    }

  }
}