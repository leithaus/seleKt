package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class Prompt extends ContinueExpr {

  public Prompt() { }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.ContinueExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.Prompt) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
