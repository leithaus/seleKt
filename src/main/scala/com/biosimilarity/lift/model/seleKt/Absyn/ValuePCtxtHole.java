package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public abstract class ValuePCtxtHole implements java.io.Serializable {
  public abstract <R,A> R accept(ValuePCtxtHole.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder p, A arg);
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard p, A arg);

  }

}
