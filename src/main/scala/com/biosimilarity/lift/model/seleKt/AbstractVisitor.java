package com.biosimilarity.lift.model.seleKt;
import com.biosimilarity.lift.model.seleKt.Absyn.*;
/** BNFC-Generated Abstract Visitor */
public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
/* RecordExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Joined p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Isolated p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Consed p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Contexted p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Referenced p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Collected p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Emptied p, A arg) { return visitDefault(p, arg); }


    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.RecordExpr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Binding */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.Binding p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* RecordPtn */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.RecordPtn p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* RecordVariable */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordWild p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.RecordVariable p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* CollectionExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Extension p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Intension p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.CollectionExpr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ExtensionBodyExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBodyExpr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* IntensionBodyExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.IntensionBodyExpr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* DomainDeclOrCond */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DeclIn p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.DomainDeclOrCond p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* DomainGen */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.DomainGen p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* DomainCond */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.DomainCond p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* DomainPtn */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.DomainPtn p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* DomainExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.DomainExpr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* RecordSource */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.WireSource p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.RecordSource p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* DomainCondition */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.DomainCondition p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Modality */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.Modality p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* RLambdaPCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt p, A arg) { return visitDefault(p, arg); }

    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaPCtxt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ContinuePCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.ContinuePCtxt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* FormalPCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.FormalPCtxt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ValuePCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt p, A arg) { return visitDefault(p, arg); }

    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* RLambdaLCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt p, A arg) { return visitDefault(p, arg); }

    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaLCtxt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ContinueLCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.ContinueLCtxt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* FormalLCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.FormalLCtxt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ValueLCtxt */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt p, A arg) { return visitDefault(p, arg); }

    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxt p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ValuePCtxtHole */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxtHole p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ValueLCtxtHole */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxtHole p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* LogicalGround */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Verity p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Absurdity p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Nullity p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.LogicalGround p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Comparison */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Equality p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Less p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.More p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.LEq p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.GEq p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.Comparison p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* RLambdaExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Application p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Abstraction p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Continuation p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Mention p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Value p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaExpr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ContinueExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Prompt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.ContinueExpr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* FormalExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Transcription p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.FormalExpr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ValueExpr */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr p, A arg) { return visitDefault(p, arg); }

    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr p, A arg) { return visitDefault(p, arg); }

    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.ValueExpr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ValueLiteral */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.ValueLiteral p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* StoreURL */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.StoreURL p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* WireURL */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.WireURL p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* URL */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.BasicURL p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.URL p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* URLPath */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.URLPath p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* URLLocation */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.URLLocation p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* URLRsrcLocation */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc p, A arg) { return visitDefault(p, arg); }
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLocation p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* URLRelativePath */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.SlashPath p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.URLRelativePath p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* URLRoot */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.URLRoot p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* NetLocation */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.NetLocation p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* URLScheme */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.URLScheme p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* URLPathElement */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.URLPathElement p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* DNSElement */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.DNSElement p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Port */
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomPort p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(com.biosimilarity.lift.model.seleKt.Absyn.Port p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
