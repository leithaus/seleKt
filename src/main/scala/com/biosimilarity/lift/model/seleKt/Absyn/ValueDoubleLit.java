package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class ValueDoubleLit extends ValueLiteral {
  public final Double double_;

  public ValueDoubleLit(Double p1) { double_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.ValueLiteral.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit) {
      com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit x = (com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit)o;
      return this.double_.equals(x.double_);
    }
    return false;
  }

  public int hashCode() {
    return this.double_.hashCode();
  }


}
