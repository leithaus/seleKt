package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public abstract class URLScheme implements java.io.Serializable {
  public abstract <R,A> R accept(URLScheme.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme p, A arg);

  }

}
