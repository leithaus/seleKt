package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public abstract class CollectionExpr implements java.io.Serializable {
  public abstract <R,A> R accept(CollectionExpr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Extension p, A arg);
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.Intension p, A arg);

  }

}
