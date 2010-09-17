package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class Nullity extends LogicalGround {

  public Nullity() { }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.LogicalGround.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.Nullity) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
