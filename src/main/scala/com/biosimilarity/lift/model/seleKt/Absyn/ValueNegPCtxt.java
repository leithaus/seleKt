package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class ValueNegPCtxt extends ValuePCtxt {
  public final ValuePCtxt valuepctxt_;

  public ValueNegPCtxt(ValuePCtxt p1) { valuepctxt_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxt.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt) {
      com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt x = (com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt)o;
      return this.valuepctxt_.equals(x.valuepctxt_);
    }
    return false;
  }

  public int hashCode() {
    return this.valuepctxt_.hashCode();
  }


}
