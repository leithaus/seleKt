package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public abstract class Modality implements java.io.Serializable {
  public abstract <R,A> R accept(Modality.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility p, A arg);

  }

}
