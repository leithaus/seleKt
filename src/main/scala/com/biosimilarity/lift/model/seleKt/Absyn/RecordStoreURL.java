package com.biosimilarity.lift.model.seleKt.Absyn; // Java Package generated by the BNF Converter.

public class RecordStoreURL extends StoreURL {
  public final URL url_;

  public RecordStoreURL(URL p1) { url_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.model.seleKt.Absyn.StoreURL.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL) {
      com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL x = (com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL)o;
      return this.url_.equals(x.url_);
    }
    return false;
  }

  public int hashCode() {
    return this.url_.hashCode();
  }


}
