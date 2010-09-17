package com.biosimilarity.lift.model.seleKt;
import com.biosimilarity.lift.model.seleKt.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  com.biosimilarity.lift.model.seleKt.Absyn.RecordExpr.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.RecordExpr,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.Binding.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.Binding,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.RecordPtn.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.RecordPtn,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.RecordVariable.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.RecordVariable,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.CollectionExpr.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.CollectionExpr,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBodyExpr.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBodyExpr,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.IntensionBodyExpr.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.IntensionBodyExpr,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.DomainDeclOrCond.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.DomainDeclOrCond,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.DomainGen.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.DomainGen,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.DomainCond.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.DomainCond,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.DomainPtn.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.DomainPtn,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.DomainExpr.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.DomainExpr,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.RecordSource.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.RecordSource,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.DomainCondition.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.DomainCondition,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.Modality.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.Modality,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.RLambdaPCtxt.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.RLambdaPCtxt,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.ContinuePCtxt.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.ContinuePCtxt,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.FormalPCtxt.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.FormalPCtxt,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxt.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxt,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.RLambdaLCtxt.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.RLambdaLCtxt,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.ContinueLCtxt.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.ContinueLCtxt,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.FormalLCtxt.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.FormalLCtxt,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxt.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxt,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxtHole.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxtHole,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxtHole.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxtHole,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.LogicalGround.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.LogicalGround,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.Comparison.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.Comparison,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.RLambdaExpr.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.RLambdaExpr,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.ContinueExpr.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.ContinueExpr,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.FormalExpr.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.FormalExpr,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.ValueExpr.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.ValueExpr,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.ValueLiteral.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.ValueLiteral,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.StoreURL.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.StoreURL,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.WireURL.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.WireURL,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.URL.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.URL,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.URLPath.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.URLPath,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.URLLocation.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.URLLocation,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLocation.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLocation,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.URLRelativePath.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.URLRelativePath,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.URLRoot.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.URLRoot,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.NetLocation.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.NetLocation,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.URLScheme.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.URLScheme,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.URLPathElement.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.URLPathElement,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.DNSElement.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.DNSElement,A>,
  com.biosimilarity.lift.model.seleKt.Absyn.Port.Visitor<com.biosimilarity.lift.model.seleKt.Absyn.Port,A>
{
/* RecordExpr */
    public RecordExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Joined p, A arg)
    {
      RecordExpr recordexpr_1 = p.recordexpr_1.accept(this, arg);
      RecordExpr recordexpr_2 = p.recordexpr_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Joined(recordexpr_1, recordexpr_2);
    }
    public RecordExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Isolated p, A arg)
    {
      RecordExpr recordexpr_1 = p.recordexpr_1.accept(this, arg);
      RecordExpr recordexpr_2 = p.recordexpr_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Isolated(recordexpr_1, recordexpr_2);
    }
    public RecordExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Consed p, A arg)
    {
      DomainExpr domainexpr_ = p.domainexpr_.accept(this, arg);
      RecordExpr recordexpr_ = p.recordexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Consed(domainexpr_, recordexpr_);
    }
    public RecordExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Contexted p, A arg)
    {
      ListBinding listbinding_ = new ListBinding();
      for (Binding x : p.listbinding_) {
        listbinding_.add(x.accept(this,arg));
      }
      RecordExpr recordexpr_ = p.recordexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Contexted(listbinding_, recordexpr_);
    }
    public RecordExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Referenced p, A arg)
    {
      RecordVariable recordvariable_ = p.recordvariable_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Referenced(recordvariable_);
    }
    public RecordExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Collected p, A arg)
    {
      CollectionExpr collectionexpr_ = p.collectionexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Collected(collectionexpr_);
    }
    public RecordExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Emptied p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.Emptied();
    }

/* Binding */
    public Binding visit(com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr p, A arg)
    {
      RecordPtn recordptn_1 = p.recordptn_1.accept(this, arg);
      RecordPtn recordptn_2 = p.recordptn_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr(recordptn_1, recordptn_2);
    }

/* RecordPtn */
    public RecordPtn visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor p, A arg)
    {
      ListDomainPtn listdomainptn_ = new ListDomainPtn();
      for (DomainPtn x : p.listdomainptn_) {
        listdomainptn_.add(x.accept(this,arg));
      }
      RecordPtn recordptn_ = p.recordptn_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor(listdomainptn_, recordptn_);
    }
    public RecordPtn visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral p, A arg)
    {
      RecordExpr recordexpr_ = p.recordexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral(recordexpr_);
    }

/* RecordVariable */
    public RecordVariable visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent p, A arg)
    {
      String uident_ = p.uident_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent(uident_);
    }
    public RecordVariable visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordWild p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.RecordWild();
    }

/* CollectionExpr */
    public CollectionExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Extension p, A arg)
    {
      ExtensionBodyExpr extensionbodyexpr_ = p.extensionbodyexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Extension(extensionbodyexpr_);
    }
    public CollectionExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Intension p, A arg)
    {
      IntensionBodyExpr intensionbodyexpr_ = p.intensionbodyexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Intension(intensionbodyexpr_);
    }

/* ExtensionBodyExpr */
    public ExtensionBodyExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody p, A arg)
    {
      ListDomainExpr listdomainexpr_ = new ListDomainExpr();
      for (DomainExpr x : p.listdomainexpr_) {
        listdomainexpr_.add(x.accept(this,arg));
      }

      return new com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody(listdomainexpr_);
    }

/* IntensionBodyExpr */
    public IntensionBodyExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody p, A arg)
    {
      DomainPtn domainptn_ = p.domainptn_.accept(this, arg);
      ListDomainDeclOrCond listdomaindeclorcond_ = new ListDomainDeclOrCond();
      for (DomainDeclOrCond x : p.listdomaindeclorcond_) {
        listdomaindeclorcond_.add(x.accept(this,arg));
      }

      return new com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody(domainptn_, listdomaindeclorcond_);
    }

/* DomainDeclOrCond */
    public DomainDeclOrCond visit(com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn p, A arg)
    {
      DomainCond domaincond_ = p.domaincond_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn(domaincond_);
    }
    public DomainDeclOrCond visit(com.biosimilarity.lift.model.seleKt.Absyn.DeclIn p, A arg)
    {
      DomainGen domaingen_ = p.domaingen_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.DeclIn(domaingen_);
    }

/* DomainGen */
    public DomainGen visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr p, A arg)
    {
      DomainPtn domainptn_ = p.domainptn_.accept(this, arg);
      RecordSource recordsource_ = p.recordsource_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr(domainptn_, recordsource_);
    }

/* DomainCond */
    public DomainCond visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr p, A arg)
    {
      DomainPtn domainptn_ = p.domainptn_.accept(this, arg);
      DomainCondition domaincondition_ = p.domaincondition_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr(domainptn_, domaincondition_);
    }
    public DomainCond visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr p, A arg)
    {
      ValueExpr valueexpr_1 = p.valueexpr_1.accept(this, arg);
      Comparison comparison_ = p.comparison_.accept(this, arg);
      ValueExpr valueexpr_2 = p.valueexpr_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr(valueexpr_1, comparison_, valueexpr_2);
    }

/* DomainPtn */
    public DomainPtn visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr p, A arg)
    {
      RLambdaPCtxt rlambdapctxt_ = p.rlambdapctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr(rlambdapctxt_);
    }

/* DomainExpr */
    public DomainExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr p, A arg)
    {
      RLambdaExpr rlambdaexpr_ = p.rlambdaexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr(rlambdaexpr_);
    }

/* RecordSource */
    public RecordSource visit(com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource p, A arg)
    {
      RecordExpr recordexpr_ = p.recordexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource(recordexpr_);
    }
    public RecordSource visit(com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource p, A arg)
    {
      StoreURL storeurl_ = p.storeurl_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource(storeurl_);
    }
    public RecordSource visit(com.biosimilarity.lift.model.seleKt.Absyn.WireSource p, A arg)
    {
      WireURL wireurl_ = p.wireurl_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.WireSource(wireurl_);
    }

/* DomainCondition */
    public DomainCondition visit(com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition p, A arg)
    {
      DomainCondition domaincondition_1 = p.domaincondition_1.accept(this, arg);
      DomainCondition domaincondition_2 = p.domaincondition_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition(domaincondition_1, domaincondition_2);
    }
    public DomainCondition visit(com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition p, A arg)
    {
      DomainCondition domaincondition_1 = p.domaincondition_1.accept(this, arg);
      DomainCondition domaincondition_2 = p.domaincondition_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition(domaincondition_1, domaincondition_2);
    }
    public DomainCondition visit(com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition p, A arg)
    {
      DomainCondition domaincondition_ = p.domaincondition_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition(domaincondition_);
    }
    public DomainCondition visit(com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition p, A arg)
    {
      RLambdaLCtxt rlambdalctxt_ = p.rlambdalctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition(rlambdalctxt_);
    }
    public DomainCondition visit(com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition p, A arg)
    {
      Modality modality_ = p.modality_.accept(this, arg);
      DomainCondition domaincondition_ = p.domaincondition_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition(modality_, domaincondition_);
    }

/* Modality */
    public Modality visit(com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility p, A arg)
    {
      DomainCondition domaincondition_ = p.domaincondition_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility(domaincondition_);
    }

/* RLambdaPCtxt */
    public RLambdaPCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt p, A arg)
    {
      RLambdaPCtxt rlambdapctxt_ = p.rlambdapctxt_.accept(this, arg);
      ListRLambdaPCtxt listrlambdapctxt_ = new ListRLambdaPCtxt();
      for (RLambdaPCtxt x : p.listrlambdapctxt_) {
        listrlambdapctxt_.add(x.accept(this,arg));
      }

      return new com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt(rlambdapctxt_, listrlambdapctxt_);
    }
    public RLambdaPCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt p, A arg)
    {
      ListFormalPCtxt listformalpctxt_ = new ListFormalPCtxt();
      for (FormalPCtxt x : p.listformalpctxt_) {
        listformalpctxt_.add(x.accept(this,arg));
      }
      RLambdaPCtxt rlambdapctxt_ = p.rlambdapctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt(listformalpctxt_, rlambdapctxt_);
    }
    public RLambdaPCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt p, A arg)
    {
      ContinuePCtxt continuepctxt_ = p.continuepctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt(continuepctxt_);
    }
    public RLambdaPCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt p, A arg)
    {
      ValuePCtxt valuepctxt_ = p.valuepctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt(valuepctxt_);
    }
    public RLambdaPCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt p, A arg)
    {
      FormalPCtxt formalpctxt_ = p.formalpctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt(formalpctxt_);
    }

/* ContinuePCtxt */
    public ContinuePCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt p, A arg)
    {
      RLambdaPCtxt rlambdapctxt_1 = p.rlambdapctxt_1.accept(this, arg);
      RLambdaPCtxt rlambdapctxt_2 = p.rlambdapctxt_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt(rlambdapctxt_1, rlambdapctxt_2);
    }
    public ContinuePCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt p, A arg)
    {
      RLambdaPCtxt rlambdapctxt_1 = p.rlambdapctxt_1.accept(this, arg);
      RLambdaPCtxt rlambdapctxt_2 = p.rlambdapctxt_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt(rlambdapctxt_1, rlambdapctxt_2);
    }
    public ContinuePCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt p, A arg)
    {
      RLambdaPCtxt rlambdapctxt_1 = p.rlambdapctxt_1.accept(this, arg);
      RLambdaPCtxt rlambdapctxt_2 = p.rlambdapctxt_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt(rlambdapctxt_1, rlambdapctxt_2);
    }

/* FormalPCtxt */
    public FormalPCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt p, A arg)
    {
      RLambdaPCtxt rlambdapctxt_ = p.rlambdapctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt(rlambdapctxt_);
    }

/* ValuePCtxt */
    public ValuePCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt p, A arg)
    {
      ValuePCtxt valuepctxt_1 = p.valuepctxt_1.accept(this, arg);
      ValuePCtxt valuepctxt_2 = p.valuepctxt_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt(valuepctxt_1, valuepctxt_2);
    }
    public ValuePCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt p, A arg)
    {
      ValuePCtxt valuepctxt_1 = p.valuepctxt_1.accept(this, arg);
      ValuePCtxt valuepctxt_2 = p.valuepctxt_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt(valuepctxt_1, valuepctxt_2);
    }
    public ValuePCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt p, A arg)
    {
      ValuePCtxt valuepctxt_ = p.valuepctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt(valuepctxt_);
    }
    public ValuePCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt p, A arg)
    {
      ValueLiteral valueliteral_ = p.valueliteral_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt(valueliteral_);
    }
    public ValuePCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt p, A arg)
    {
      ValuePCtxtHole valuepctxthole_ = p.valuepctxthole_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt(valuepctxthole_);
    }

/* RLambdaLCtxt */
    public RLambdaLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt p, A arg)
    {
      RLambdaLCtxt rlambdalctxt_ = p.rlambdalctxt_.accept(this, arg);
      ListRLambdaLCtxt listrlambdalctxt_ = new ListRLambdaLCtxt();
      for (RLambdaLCtxt x : p.listrlambdalctxt_) {
        listrlambdalctxt_.add(x.accept(this,arg));
      }

      return new com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt(rlambdalctxt_, listrlambdalctxt_);
    }
    public RLambdaLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt p, A arg)
    {
      ListFormalLCtxt listformallctxt_ = new ListFormalLCtxt();
      for (FormalLCtxt x : p.listformallctxt_) {
        listformallctxt_.add(x.accept(this,arg));
      }
      RLambdaLCtxt rlambdalctxt_ = p.rlambdalctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt(listformallctxt_, rlambdalctxt_);
    }
    public RLambdaLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt p, A arg)
    {
      ContinueLCtxt continuelctxt_ = p.continuelctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt(continuelctxt_);
    }
    public RLambdaLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt p, A arg)
    {
      FormalLCtxt formallctxt_ = p.formallctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt(formallctxt_);
    }
    public RLambdaLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt p, A arg)
    {
      ValueLCtxt valuelctxt_ = p.valuelctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt(valuelctxt_);
    }

/* ContinueLCtxt */
    public ContinueLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt p, A arg)
    {
      RLambdaLCtxt rlambdalctxt_1 = p.rlambdalctxt_1.accept(this, arg);
      RLambdaLCtxt rlambdalctxt_2 = p.rlambdalctxt_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt(rlambdalctxt_1, rlambdalctxt_2);
    }
    public ContinueLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt p, A arg)
    {
      RLambdaLCtxt rlambdalctxt_1 = p.rlambdalctxt_1.accept(this, arg);
      RLambdaLCtxt rlambdalctxt_2 = p.rlambdalctxt_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt(rlambdalctxt_1, rlambdalctxt_2);
    }
    public ContinueLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt p, A arg)
    {
      RLambdaLCtxt rlambdalctxt_1 = p.rlambdalctxt_1.accept(this, arg);
      RLambdaLCtxt rlambdalctxt_2 = p.rlambdalctxt_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt(rlambdalctxt_1, rlambdalctxt_2);
    }

/* FormalLCtxt */
    public FormalLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt p, A arg)
    {
      RLambdaLCtxt rlambdalctxt_ = p.rlambdalctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt(rlambdalctxt_);
    }

/* ValueLCtxt */
    public ValueLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt p, A arg)
    {
      ValueLCtxt valuelctxt_1 = p.valuelctxt_1.accept(this, arg);
      ValueLCtxt valuelctxt_2 = p.valuelctxt_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt(valuelctxt_1, valuelctxt_2);
    }
    public ValueLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt p, A arg)
    {
      ValueLCtxt valuelctxt_1 = p.valuelctxt_1.accept(this, arg);
      ValueLCtxt valuelctxt_2 = p.valuelctxt_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt(valuelctxt_1, valuelctxt_2);
    }
    public ValueLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt p, A arg)
    {
      ValueLCtxt valuelctxt_ = p.valuelctxt_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt(valuelctxt_);
    }
    public ValueLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt p, A arg)
    {
      ValueLiteral valueliteral_ = p.valueliteral_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt(valueliteral_);
    }
    public ValueLCtxt visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt p, A arg)
    {
      ValueLCtxtHole valuelctxthole_ = p.valuelctxthole_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt(valuelctxthole_);
    }

/* ValuePCtxtHole */
    public ValuePCtxtHole visit(com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder p, A arg)
    {
      String uident_ = p.uident_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder(uident_);
    }
    public ValuePCtxtHole visit(com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard p, A arg)
    {
      String wild_ = p.wild_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard(wild_);
    }

/* ValueLCtxtHole */
    public ValueLCtxtHole visit(com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder p, A arg)
    {
      LogicalGround logicalground_ = p.logicalground_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder(logicalground_);
    }

/* LogicalGround */
    public LogicalGround visit(com.biosimilarity.lift.model.seleKt.Absyn.Verity p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.Verity();
    }
    public LogicalGround visit(com.biosimilarity.lift.model.seleKt.Absyn.Absurdity p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.Absurdity();
    }
    public LogicalGround visit(com.biosimilarity.lift.model.seleKt.Absyn.Nullity p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.Nullity();
    }

/* Comparison */
    public Comparison visit(com.biosimilarity.lift.model.seleKt.Absyn.Equality p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.Equality();
    }
    public Comparison visit(com.biosimilarity.lift.model.seleKt.Absyn.Less p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.Less();
    }
    public Comparison visit(com.biosimilarity.lift.model.seleKt.Absyn.More p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.More();
    }
    public Comparison visit(com.biosimilarity.lift.model.seleKt.Absyn.LEq p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.LEq();
    }
    public Comparison visit(com.biosimilarity.lift.model.seleKt.Absyn.GEq p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.GEq();
    }

/* RLambdaExpr */
    public RLambdaExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Application p, A arg)
    {
      RLambdaExpr rlambdaexpr_ = p.rlambdaexpr_.accept(this, arg);
      ListRLambdaExpr listrlambdaexpr_ = new ListRLambdaExpr();
      for (RLambdaExpr x : p.listrlambdaexpr_) {
        listrlambdaexpr_.add(x.accept(this,arg));
      }

      return new com.biosimilarity.lift.model.seleKt.Absyn.Application(rlambdaexpr_, listrlambdaexpr_);
    }
    public RLambdaExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Abstraction p, A arg)
    {
      ListFormalExpr listformalexpr_ = new ListFormalExpr();
      for (FormalExpr x : p.listformalexpr_) {
        listformalexpr_.add(x.accept(this,arg));
      }
      RLambdaExpr rlambdaexpr_ = p.rlambdaexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Abstraction(listformalexpr_, rlambdaexpr_);
    }
    public RLambdaExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Continuation p, A arg)
    {
      ContinueExpr continueexpr_ = p.continueexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Continuation(continueexpr_);
    }
    public RLambdaExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Mention p, A arg)
    {
      FormalExpr formalexpr_ = p.formalexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Mention(formalexpr_);
    }
    public RLambdaExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Value p, A arg)
    {
      ValueExpr valueexpr_ = p.valueexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Value(valueexpr_);
    }

/* ContinueExpr */
    public ContinueExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Prompt p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.Prompt();
    }
    public ContinueExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt p, A arg)
    {
      RLambdaExpr rlambdaexpr_1 = p.rlambdaexpr_1.accept(this, arg);
      RLambdaExpr rlambdaexpr_2 = p.rlambdaexpr_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt(rlambdaexpr_1, rlambdaexpr_2);
    }
    public ContinueExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation p, A arg)
    {
      RLambdaExpr rlambdaexpr_1 = p.rlambdaexpr_1.accept(this, arg);
      RLambdaExpr rlambdaexpr_2 = p.rlambdaexpr_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation(rlambdaexpr_1, rlambdaexpr_2);
    }
    public ContinueExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont p, A arg)
    {
      RLambdaExpr rlambdaexpr_1 = p.rlambdaexpr_1.accept(this, arg);
      RLambdaExpr rlambdaexpr_2 = p.rlambdaexpr_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont(rlambdaexpr_1, rlambdaexpr_2);
    }

/* FormalExpr */
    public FormalExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.Transcription p, A arg)
    {
      RLambdaExpr rlambdaexpr_ = p.rlambdaexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.Transcription(rlambdaexpr_);
    }
    public FormalExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral p, A arg)
    {
      String ident_ = p.ident_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral(ident_);
    }

/* ValueExpr */
    public ValueExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr p, A arg)
    {
      ValueExpr valueexpr_1 = p.valueexpr_1.accept(this, arg);
      ValueExpr valueexpr_2 = p.valueexpr_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr(valueexpr_1, valueexpr_2);
    }
    public ValueExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr p, A arg)
    {
      ValueExpr valueexpr_1 = p.valueexpr_1.accept(this, arg);
      ValueExpr valueexpr_2 = p.valueexpr_2.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr(valueexpr_1, valueexpr_2);
    }
    public ValueExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr p, A arg)
    {
      ValueExpr valueexpr_ = p.valueexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr(valueexpr_);
    }
    public ValueExpr visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr p, A arg)
    {
      ValueLiteral valueliteral_ = p.valueliteral_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr(valueliteral_);
    }

/* ValueLiteral */
    public ValueLiteral visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit p, A arg)
    {
      RecordExpr recordexpr_ = p.recordexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit(recordexpr_);
    }
    public ValueLiteral visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit p, A arg)
    {
      RLambdaExpr rlambdaexpr_ = p.rlambdaexpr_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit(rlambdaexpr_);
    }
    public ValueLiteral visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit p, A arg)
    {
      Integer integer_ = p.integer_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit(integer_);
    }
    public ValueLiteral visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit p, A arg)
    {
      Double double_ = p.double_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit(double_);
    }
    public ValueLiteral visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit p, A arg)
    {
      String string_ = p.string_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit(string_);
    }
    public ValueLiteral visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit p, A arg)
    {
      Character char_ = p.char_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit(char_);
    }
    public ValueLiteral visit(com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit p, A arg)
    {
      URL url_ = p.url_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit(url_);
    }

/* StoreURL */
    public StoreURL visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL p, A arg)
    {
      URL url_ = p.url_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL(url_);
    }

/* WireURL */
    public WireURL visit(com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL p, A arg)
    {
      URL url_ = p.url_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL(url_);
    }

/* URL */
    public URL visit(com.biosimilarity.lift.model.seleKt.Absyn.BasicURL p, A arg)
    {
      URLScheme urlscheme_ = p.urlscheme_.accept(this, arg);
      URLPath urlpath_ = p.urlpath_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.BasicURL(urlscheme_, urlpath_);
    }

/* URLPath */
    public URLPath visit(com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath p, A arg)
    {
      URLLocation urllocation_ = p.urllocation_.accept(this, arg);
      URLRelativePath urlrelativepath_ = p.urlrelativepath_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath(urllocation_, urlrelativepath_);
    }

/* URLLocation */
    public URLLocation visit(com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation p, A arg)
    {
      URLRoot urlroot_ = p.urlroot_.accept(this, arg);
      URLRsrcLocation urlrsrclocation_ = p.urlrsrclocation_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation(urlroot_, urlrsrclocation_);
    }

/* URLRsrcLocation */
    public URLRsrcLocation visit(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc p, A arg)
    {
      NetLocation netlocation_ = p.netlocation_.accept(this, arg);
      Port port_ = p.port_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc(netlocation_, port_);
    }
    public URLRsrcLocation visit(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc p, A arg)
    {
      NetLocation netlocation_ = p.netlocation_.accept(this, arg);

      return new com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc(netlocation_);
    }

/* URLRelativePath */
    public URLRelativePath visit(com.biosimilarity.lift.model.seleKt.Absyn.SlashPath p, A arg)
    {
      URLRoot urlroot_ = p.urlroot_.accept(this, arg);
      ListURLPathElement listurlpathelement_ = new ListURLPathElement();
      for (URLPathElement x : p.listurlpathelement_) {
        listurlpathelement_.add(x.accept(this,arg));
      }

      return new com.biosimilarity.lift.model.seleKt.Absyn.SlashPath(urlroot_, listurlpathelement_);
    }

/* URLRoot */
    public URLRoot visit(com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin p, A arg)
    {

      return new com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin();
    }

/* NetLocation */
    public NetLocation visit(com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr p, A arg)
    {
      ListDNSElement listdnselement_ = new ListDNSElement();
      for (DNSElement x : p.listdnselement_) {
        listdnselement_.add(x.accept(this,arg));
      }

      return new com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr(listdnselement_);
    }

/* URLScheme */
    public URLScheme visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme p, A arg)
    {
      String ident_ = p.ident_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme(ident_);
    }

/* URLPathElement */
    public URLPathElement visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement p, A arg)
    {
      String ident_ = p.ident_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement(ident_);
    }

/* DNSElement */
    public DNSElement visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement p, A arg)
    {
      String ident_ = p.ident_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement(ident_);
    }

/* Port */
    public Port visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomPort p, A arg)
    {
      Integer integer_ = p.integer_;

      return new com.biosimilarity.lift.model.seleKt.Absyn.AtomPort(integer_);
    }

}