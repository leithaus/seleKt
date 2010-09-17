package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class AbstractionPCtxt extends RLambdaPCtxt {
  public final ListFormalPCtxt listformalpctxt_;
  public final RLambdaPCtxt rlambdapctxt_;

  public AbstractionPCtxt(ListFormalPCtxt p1, RLambdaPCtxt p2) { listformalpctxt_ = p1; rlambdapctxt_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaPCtxt.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt) {
      com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt x = (com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt)o;
      return this.listformalpctxt_.equals(x.listformalpctxt_) && this.rlambdapctxt_.equals(x.rlambdapctxt_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listformalpctxt_.hashCode())+this.rlambdapctxt_.hashCode();
  }


}
