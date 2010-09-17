package com.biosimilarity.lift.model.seleKt;

import com.biosimilarity.lift.model.seleKt.Absyn.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/** BNFC-Generated Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* RecordExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Joined p, A arg) {
      R r = leaf(arg);
      r = combine(p.recordexpr_1.accept(this, arg), r, arg);
      r = combine(p.recordexpr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Isolated p, A arg) {
      R r = leaf(arg);
      r = combine(p.recordexpr_1.accept(this, arg), r, arg);
      r = combine(p.recordexpr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Consed p, A arg) {
      R r = leaf(arg);
      r = combine(p.domainexpr_.accept(this, arg), r, arg);
      r = combine(p.recordexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Contexted p, A arg) {
      R r = leaf(arg);
      for (Binding x : p.listbinding_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.recordexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Referenced p, A arg) {
      R r = leaf(arg);
      r = combine(p.recordvariable_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Collected p, A arg) {
      R r = leaf(arg);
      r = combine(p.collectionexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Emptied p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Binding */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr p, A arg) {
      R r = leaf(arg);
      r = combine(p.recordptn_1.accept(this, arg), r, arg);
      r = combine(p.recordptn_2.accept(this, arg), r, arg);
      return r;
    }

/* RecordPtn */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor p, A arg) {
      R r = leaf(arg);
      for (DomainPtn x : p.listdomainptn_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.recordptn_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral p, A arg) {
      R r = leaf(arg);
      r = combine(p.recordexpr_.accept(this, arg), r, arg);
      return r;
    }

/* RecordVariable */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordWild p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* CollectionExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Extension p, A arg) {
      R r = leaf(arg);
      r = combine(p.extensionbodyexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Intension p, A arg) {
      R r = leaf(arg);
      r = combine(p.intensionbodyexpr_.accept(this, arg), r, arg);
      return r;
    }

/* ExtensionBodyExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody p, A arg) {
      R r = leaf(arg);
      for (DomainExpr x : p.listdomainexpr_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* IntensionBodyExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody p, A arg) {
      R r = leaf(arg);
      r = combine(p.domainptn_.accept(this, arg), r, arg);
      for (DomainDeclOrCond x : p.listdomaindeclorcond_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* DomainDeclOrCond */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn p, A arg) {
      R r = leaf(arg);
      r = combine(p.domaincond_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DeclIn p, A arg) {
      R r = leaf(arg);
      r = combine(p.domaingen_.accept(this, arg), r, arg);
      return r;
    }

/* DomainGen */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr p, A arg) {
      R r = leaf(arg);
      r = combine(p.domainptn_.accept(this, arg), r, arg);
      r = combine(p.recordsource_.accept(this, arg), r, arg);
      return r;
    }

/* DomainCond */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr p, A arg) {
      R r = leaf(arg);
      r = combine(p.domainptn_.accept(this, arg), r, arg);
      r = combine(p.domaincondition_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr p, A arg) {
      R r = leaf(arg);
      r = combine(p.valueexpr_1.accept(this, arg), r, arg);
      r = combine(p.comparison_.accept(this, arg), r, arg);
      r = combine(p.valueexpr_2.accept(this, arg), r, arg);
      return r;
    }

/* DomainPtn */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdapctxt_.accept(this, arg), r, arg);
      return r;
    }

/* DomainExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdaexpr_.accept(this, arg), r, arg);
      return r;
    }

/* RecordSource */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource p, A arg) {
      R r = leaf(arg);
      r = combine(p.recordexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource p, A arg) {
      R r = leaf(arg);
      r = combine(p.storeurl_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.WireSource p, A arg) {
      R r = leaf(arg);
      r = combine(p.wireurl_.accept(this, arg), r, arg);
      return r;
    }

/* DomainCondition */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition p, A arg) {
      R r = leaf(arg);
      r = combine(p.domaincondition_1.accept(this, arg), r, arg);
      r = combine(p.domaincondition_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition p, A arg) {
      R r = leaf(arg);
      r = combine(p.domaincondition_1.accept(this, arg), r, arg);
      r = combine(p.domaincondition_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition p, A arg) {
      R r = leaf(arg);
      r = combine(p.domaincondition_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdalctxt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition p, A arg) {
      R r = leaf(arg);
      r = combine(p.modality_.accept(this, arg), r, arg);
      r = combine(p.domaincondition_.accept(this, arg), r, arg);
      return r;
    }

/* Modality */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility p, A arg) {
      R r = leaf(arg);
      r = combine(p.domaincondition_.accept(this, arg), r, arg);
      return r;
    }

/* RLambdaPCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdapctxt_.accept(this, arg), r, arg);
      for (RLambdaPCtxt x : p.listrlambdapctxt_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt p, A arg) {
      R r = leaf(arg);
      for (FormalPCtxt x : p.listformalpctxt_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.rlambdapctxt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.continuepctxt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valuepctxt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.formalpctxt_.accept(this, arg), r, arg);
      return r;
    }

/* ContinuePCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdapctxt_1.accept(this, arg), r, arg);
      r = combine(p.rlambdapctxt_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdapctxt_1.accept(this, arg), r, arg);
      r = combine(p.rlambdapctxt_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdapctxt_1.accept(this, arg), r, arg);
      r = combine(p.rlambdapctxt_2.accept(this, arg), r, arg);
      return r;
    }

/* FormalPCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdapctxt_.accept(this, arg), r, arg);
      return r;
    }

/* ValuePCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valuepctxt_1.accept(this, arg), r, arg);
      r = combine(p.valuepctxt_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valuepctxt_1.accept(this, arg), r, arg);
      r = combine(p.valuepctxt_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valuepctxt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valueliteral_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valuepctxthole_.accept(this, arg), r, arg);
      return r;
    }

/* RLambdaLCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdalctxt_.accept(this, arg), r, arg);
      for (RLambdaLCtxt x : p.listrlambdalctxt_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt p, A arg) {
      R r = leaf(arg);
      for (FormalLCtxt x : p.listformallctxt_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.rlambdalctxt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.continuelctxt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.formallctxt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valuelctxt_.accept(this, arg), r, arg);
      return r;
    }

/* ContinueLCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdalctxt_1.accept(this, arg), r, arg);
      r = combine(p.rlambdalctxt_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdalctxt_1.accept(this, arg), r, arg);
      r = combine(p.rlambdalctxt_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdalctxt_1.accept(this, arg), r, arg);
      r = combine(p.rlambdalctxt_2.accept(this, arg), r, arg);
      return r;
    }

/* FormalLCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdalctxt_.accept(this, arg), r, arg);
      return r;
    }

/* ValueLCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valuelctxt_1.accept(this, arg), r, arg);
      r = combine(p.valuelctxt_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valuelctxt_1.accept(this, arg), r, arg);
      r = combine(p.valuelctxt_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valuelctxt_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valueliteral_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt p, A arg) {
      R r = leaf(arg);
      r = combine(p.valuelctxthole_.accept(this, arg), r, arg);
      return r;
    }

/* ValuePCtxtHole */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* ValueLCtxtHole */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder p, A arg) {
      R r = leaf(arg);
      r = combine(p.logicalground_.accept(this, arg), r, arg);
      return r;
    }

/* LogicalGround */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Verity p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Absurdity p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Nullity p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Comparison */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Equality p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Less p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.More p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.LEq p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.GEq p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* RLambdaExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Application p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdaexpr_.accept(this, arg), r, arg);
      for (RLambdaExpr x : p.listrlambdaexpr_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Abstraction p, A arg) {
      R r = leaf(arg);
      for (FormalExpr x : p.listformalexpr_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.rlambdaexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Continuation p, A arg) {
      R r = leaf(arg);
      r = combine(p.continueexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Mention p, A arg) {
      R r = leaf(arg);
      r = combine(p.formalexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Value p, A arg) {
      R r = leaf(arg);
      r = combine(p.valueexpr_.accept(this, arg), r, arg);
      return r;
    }

/* ContinueExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Prompt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdaexpr_1.accept(this, arg), r, arg);
      r = combine(p.rlambdaexpr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdaexpr_1.accept(this, arg), r, arg);
      r = combine(p.rlambdaexpr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdaexpr_1.accept(this, arg), r, arg);
      r = combine(p.rlambdaexpr_2.accept(this, arg), r, arg);
      return r;
    }

/* FormalExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Transcription p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdaexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* ValueExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr p, A arg) {
      R r = leaf(arg);
      r = combine(p.valueexpr_1.accept(this, arg), r, arg);
      r = combine(p.valueexpr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr p, A arg) {
      R r = leaf(arg);
      r = combine(p.valueexpr_1.accept(this, arg), r, arg);
      r = combine(p.valueexpr_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr p, A arg) {
      R r = leaf(arg);
      r = combine(p.valueexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr p, A arg) {
      R r = leaf(arg);
      r = combine(p.valueliteral_.accept(this, arg), r, arg);
      return r;
    }

/* ValueLiteral */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit p, A arg) {
      R r = leaf(arg);
      r = combine(p.recordexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit p, A arg) {
      R r = leaf(arg);
      r = combine(p.rlambdaexpr_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit p, A arg) {
      R r = leaf(arg);
      r = combine(p.url_.accept(this, arg), r, arg);
      return r;
    }

/* StoreURL */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL p, A arg) {
      R r = leaf(arg);
      r = combine(p.url_.accept(this, arg), r, arg);
      return r;
    }

/* WireURL */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL p, A arg) {
      R r = leaf(arg);
      r = combine(p.url_.accept(this, arg), r, arg);
      return r;
    }

/* URL */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.BasicURL p, A arg) {
      R r = leaf(arg);
      r = combine(p.urlscheme_.accept(this, arg), r, arg);
      r = combine(p.urlpath_.accept(this, arg), r, arg);
      return r;
    }

/* URLPath */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath p, A arg) {
      R r = leaf(arg);
      r = combine(p.urllocation_.accept(this, arg), r, arg);
      r = combine(p.urlrelativepath_.accept(this, arg), r, arg);
      return r;
    }

/* URLLocation */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation p, A arg) {
      R r = leaf(arg);
      r = combine(p.urlroot_.accept(this, arg), r, arg);
      r = combine(p.urlrsrclocation_.accept(this, arg), r, arg);
      return r;
    }

/* URLRsrcLocation */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc p, A arg) {
      R r = leaf(arg);
      r = combine(p.netlocation_.accept(this, arg), r, arg);
      r = combine(p.port_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc p, A arg) {
      R r = leaf(arg);
      r = combine(p.netlocation_.accept(this, arg), r, arg);
      return r;
    }

/* URLRelativePath */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.SlashPath p, A arg) {
      R r = leaf(arg);
      r = combine(p.urlroot_.accept(this, arg), r, arg);
      for (URLPathElement x : p.listurlpathelement_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* URLRoot */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* NetLocation */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr p, A arg) {
      R r = leaf(arg);
      for (DNSElement x : p.listdnselement_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* URLScheme */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* URLPathElement */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* DNSElement */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Port */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomPort p, A arg) {
      R r = leaf(arg);
      return r;
    }


}
