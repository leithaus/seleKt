package com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn; // Java Package generated by the BNF Converter.

public class STACKENV extends EnvOrVal {
  public final Env env_;

  public STACKENV(Env p1) { env_ = p1; }

  public <R,A> R accept(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.EnvOrVal.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.STACKENV) {
      com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.STACKENV x = (com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.STACKENV)o;
      return this.env_.equals(x.env_);
    }
    return false;
  }

  public int hashCode() {
    return this.env_.hashCode();
  }


}
