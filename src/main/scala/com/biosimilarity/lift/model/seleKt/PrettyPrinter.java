package com.biosimilarity.lift.model.seleKt;
import com.biosimilarity.lift.model.seleKt.Absyn.*;

public class PrettyPrinter
{
  //For certain applications increasing the initial size of the buffer may improve performance.
  private static final int INITIAL_BUFFER_SIZE = 128;
  //You may wish to change the parentheses used in precedence.
  private static final String _L_PAREN = new String("(");
  private static final String _R_PAREN = new String(")");
  //You may wish to change render
  private static void render(String s)
  {
    if (s.equals("{"))
    {
       buf_.append("\n");
       indent();
       buf_.append(s);
       _n_ = _n_ + 2;
       buf_.append("\n");
       indent();
    }
    else if (s.equals("(") || s.equals("["))
       buf_.append(s);
    else if (s.equals(")") || s.equals("]"))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals("}"))
    {
       _n_ = _n_ - 2;
       backup();
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals(","))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals(";"))
    {
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals("")) return;
    else
    {
       buf_.append(s);
       buf_.append(" ");
    }
  }


  //  print and show methods are defined for each category.
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.RecordExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.RecordExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.Binding foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.Binding foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.RecordPtn foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.RecordPtn foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.RecordVariable foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.RecordVariable foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.CollectionExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.CollectionExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBodyExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBodyExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.IntensionBodyExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.IntensionBodyExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.DomainDeclOrCond foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.DomainDeclOrCond foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.DomainGen foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.DomainGen foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.DomainCond foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.DomainCond foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.DomainPtn foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.DomainPtn foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.DomainExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.DomainExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.RecordSource foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.RecordSource foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.DomainCondition foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.DomainCondition foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.Modality foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.Modality foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaPCtxt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaPCtxt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ContinuePCtxt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ContinuePCtxt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.FormalPCtxt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.FormalPCtxt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaLCtxt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaLCtxt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ContinueLCtxt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ContinueLCtxt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.FormalLCtxt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.FormalLCtxt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxtHole foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxtHole foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxtHole foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxtHole foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.LogicalGround foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.LogicalGround foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.Comparison foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.Comparison foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ContinueExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ContinueExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.FormalExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.FormalExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ValueExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ValueExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ValueLiteral foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ValueLiteral foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.StoreURL foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.StoreURL foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.WireURL foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.WireURL foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.URL foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.URL foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.URLPath foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.URLPath foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.URLLocation foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.URLLocation foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLocation foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLocation foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.URLRelativePath foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.URLRelativePath foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.URLRoot foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.URLRoot foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.NetLocation foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.NetLocation foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.URLScheme foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.URLScheme foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.URLPathElement foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.URLPathElement foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.DNSElement foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.DNSElement foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.Port foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.Port foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ListBinding foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ListBinding foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainDeclOrCond foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainDeclOrCond foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainPtn foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainPtn foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalExpr foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalExpr foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalPCtxt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalPCtxt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalLCtxt foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalLCtxt foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ListURLPathElement foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ListURLPathElement foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(com.biosimilarity.lift.model.seleKt.Absyn.ListDNSElement foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(com.biosimilarity.lift.model.seleKt.Absyn.ListDNSElement foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  /***   You shouldn't need to change anything beyond this point.   ***/

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.RecordExpr foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Joined)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Joined _joined = (com.biosimilarity.lift.model.seleKt.Absyn.Joined) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_joined.recordexpr_1, 0);
       render("&");
       pp(_joined.recordexpr_2, 1);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Isolated)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Isolated _isolated = (com.biosimilarity.lift.model.seleKt.Absyn.Isolated) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_isolated.recordexpr_1, 1);
       render("|");
       pp(_isolated.recordexpr_2, 2);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Consed)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Consed _consed = (com.biosimilarity.lift.model.seleKt.Absyn.Consed) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_consed.domainexpr_, 0);
       render("::");
       pp(_consed.recordexpr_, 3);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Contexted)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Contexted _contexted = (com.biosimilarity.lift.model.seleKt.Absyn.Contexted) foo;
       if (_i_ > 3) render(_L_PAREN);
       render("let");
       pp(_contexted.listbinding_, 0);
       render("in");
       pp(_contexted.recordexpr_, 3);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Referenced)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Referenced _referenced = (com.biosimilarity.lift.model.seleKt.Absyn.Referenced) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_referenced.recordvariable_, 0);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Collected)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Collected _collected = (com.biosimilarity.lift.model.seleKt.Absyn.Collected) foo;
       if (_i_ > 3) render(_L_PAREN);
       render("record");
       pp(_collected.collectionexpr_, 0);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Emptied)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Emptied _emptied = (com.biosimilarity.lift.model.seleKt.Absyn.Emptied) foo;
       if (_i_ > 3) render(_L_PAREN);
       render("Nil");
       if (_i_ > 3) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.Binding foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr _bindingexpr = (com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_bindingexpr.recordptn_1, 0);
       render("=");
       pp(_bindingexpr.recordptn_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.RecordPtn foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor _recorddestructor = (com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{:");
       pp(_recorddestructor.listdomainptn_, 0);
       render(":");
       pp(_recorddestructor.recordptn_, 0);
       render(":}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral _recordliteral = (com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_recordliteral.recordexpr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.RecordVariable foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent _recordident = (com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_recordident.uident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordWild)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordWild _recordwild = (com.biosimilarity.lift.model.seleKt.Absyn.RecordWild) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("_");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.CollectionExpr foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Extension)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Extension _extension = (com.biosimilarity.lift.model.seleKt.Absyn.Extension) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_extension.extensionbodyexpr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Intension)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Intension _intension = (com.biosimilarity.lift.model.seleKt.Absyn.Intension) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_intension.intensionbodyexpr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBodyExpr foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody _extensionbody = (com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_extensionbody.listdomainexpr_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.IntensionBodyExpr foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody _intensionbody = (com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_intensionbody.domainptn_, 0);
       render("|");
       pp(_intensionbody.listdomaindeclorcond_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.DomainDeclOrCond foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn _conditionin = (com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_conditionin.domaincond_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DeclIn)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DeclIn _declin = (com.biosimilarity.lift.model.seleKt.Absyn.DeclIn) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_declin.domaingen_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.DomainGen foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr _domaingenexpr = (com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_domaingenexpr.domainptn_, 0);
       render("<-");
       pp(_domaingenexpr.recordsource_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.DomainCond foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr _domainsatexpr = (com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_domainsatexpr.domainptn_, 0);
       render("in");
       pp(_domainsatexpr.domaincondition_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr _domaincompexpr = (com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_domaincompexpr.valueexpr_1, 0);
       pp(_domaincompexpr.comparison_, 0);
       pp(_domaincompexpr.valueexpr_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.DomainPtn foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr _domainptnexpr = (com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("?");
       pp(_domainptnexpr.rlambdapctxt_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.DomainExpr foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr _domainrlambdaexpr = (com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_domainrlambdaexpr.rlambdaexpr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.RecordSource foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource _onboardsource = (com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_onboardsource.recordexpr_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource _persistentsource = (com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("store");
       pp(_persistentsource.storeurl_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.WireSource)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.WireSource _wiresource = (com.biosimilarity.lift.model.seleKt.Absyn.WireSource) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("wire");
       pp(_wiresource.wireurl_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.DomainCondition foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition _disjunctdomaincondition = (com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_disjunctdomaincondition.domaincondition_1, 0);
       render("||");
       pp(_disjunctdomaincondition.domaincondition_2, 1);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition _conjunctdomaincondition = (com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition) foo;
       if (_i_ > 1) render(_L_PAREN);
       pp(_conjunctdomaincondition.domaincondition_1, 1);
       render("&");
       pp(_conjunctdomaincondition.domaincondition_2, 2);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition _negateddomaincondition = (com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition) foo;
       if (_i_ > 2) render(_L_PAREN);
       render("~");
       pp(_negateddomaincondition.domaincondition_, 2);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition _structuraldomaincondition = (com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition) foo;
       if (_i_ > 2) render(_L_PAREN);
       render("?");
       pp(_structuraldomaincondition.rlambdalctxt_, 0);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition _behavioraldomaincondition = (com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_behavioraldomaincondition.modality_, 0);
       pp(_behavioraldomaincondition.domaincondition_, 2);
       if (_i_ > 2) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.Modality foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility _probepossibility = (com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("<");
       pp(_probepossibility.domaincondition_, 2);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaPCtxt foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt _applicationpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_applicationpctxt.rlambdapctxt_, 0);
       pp(_applicationpctxt.listrlambdapctxt_, 1);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt _abstractionpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt) foo;
       if (_i_ > 1) render(_L_PAREN);
       render("lambda");
       pp(_abstractionpctxt.listformalpctxt_, 0);
       render(".");
       pp(_abstractionpctxt.rlambdapctxt_, 2);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt _kpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_kpctxt.continuepctxt_, 0);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt _groundpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_groundpctxt.valuepctxt_, 0);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt _mentionpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_mentionpctxt.formalpctxt_, 0);
       if (_i_ > 2) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ContinuePCtxt foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt _pushpromptpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("pushPrompt");
       pp(_pushpromptpctxt.rlambdapctxt_1, 2);
       pp(_pushpromptpctxt.rlambdapctxt_2, 2);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt _subcontpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("withSubCont");
       pp(_subcontpctxt.rlambdapctxt_1, 2);
       pp(_subcontpctxt.rlambdapctxt_2, 2);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt _pushsubcontpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("pushSubCont");
       pp(_pushsubcontpctxt.rlambdapctxt_1, 2);
       pp(_pushsubcontpctxt.rlambdapctxt_2, 2);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.FormalPCtxt foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt _transcriptpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("@");
       render("<");
       pp(_transcriptpctxt.rlambdapctxt_, 2);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxt foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt _valueaddpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_valueaddpctxt.valuepctxt_1, 0);
       render("+");
       pp(_valueaddpctxt.valuepctxt_2, 1);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt _valuemultpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt) foo;
       if (_i_ > 1) render(_L_PAREN);
       pp(_valuemultpctxt.valuepctxt_1, 1);
       render("*");
       pp(_valuemultpctxt.valuepctxt_2, 2);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt _valuenegpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt) foo;
       if (_i_ > 2) render(_L_PAREN);
       render("-");
       pp(_valuenegpctxt.valuepctxt_, 3);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt _valuelitpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt) foo;
       if (_i_ > 3) render(_L_PAREN);
       render("!");
       pp(_valuelitpctxt.valueliteral_, 0);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt _valueemptypctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_valueemptypctxt.valuepctxthole_, 0);
       if (_i_ > 3) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaLCtxt foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt _applicationlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_applicationlctxt.rlambdalctxt_, 0);
       pp(_applicationlctxt.listrlambdalctxt_, 1);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt _abstractionlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt) foo;
       if (_i_ > 1) render(_L_PAREN);
       render("lambda");
       pp(_abstractionlctxt.listformallctxt_, 0);
       render(".");
       pp(_abstractionlctxt.rlambdalctxt_, 2);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt _klctxt = (com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_klctxt.continuelctxt_, 0);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt _mentionlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_mentionlctxt.formallctxt_, 0);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt _groundlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_groundlctxt.valuelctxt_, 0);
       if (_i_ > 2) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ContinueLCtxt foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt _pushpromptlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("pushPrompt");
       pp(_pushpromptlctxt.rlambdalctxt_1, 2);
       pp(_pushpromptlctxt.rlambdalctxt_2, 2);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt _subconlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("withSubCont");
       pp(_subconlctxt.rlambdalctxt_1, 2);
       pp(_subconlctxt.rlambdalctxt_2, 2);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt _pushsubcontlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("pushSubCont");
       pp(_pushsubcontlctxt.rlambdalctxt_1, 2);
       pp(_pushsubcontlctxt.rlambdalctxt_2, 2);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.FormalLCtxt foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt _transcriptlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("@");
       render("<");
       pp(_transcriptlctxt.rlambdalctxt_, 2);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxt foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt _valueaddlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_valueaddlctxt.valuelctxt_1, 0);
       render("+");
       pp(_valueaddlctxt.valuelctxt_2, 1);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt _valuemultlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt) foo;
       if (_i_ > 1) render(_L_PAREN);
       pp(_valuemultlctxt.valuelctxt_1, 1);
       render("*");
       pp(_valuemultlctxt.valuelctxt_2, 2);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt _valueneglctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt) foo;
       if (_i_ > 2) render(_L_PAREN);
       render("-");
       pp(_valueneglctxt.valuelctxt_, 3);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt _valuelitlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt) foo;
       if (_i_ > 3) render(_L_PAREN);
       render("!");
       pp(_valuelitlctxt.valueliteral_, 0);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt _valueemptylctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_valueemptylctxt.valuelctxthole_, 0);
       if (_i_ > 3) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxtHole foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder _valpplaceholder = (com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_valpplaceholder.uident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard _valwildcard = (com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_valwildcard.wild_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxtHole foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder _vallplaceholder = (com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_vallplaceholder.logicalground_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.LogicalGround foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Verity)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Verity _verity = (com.biosimilarity.lift.model.seleKt.Absyn.Verity) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("true");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Absurdity)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Absurdity _absurdity = (com.biosimilarity.lift.model.seleKt.Absyn.Absurdity) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("false");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Nullity)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Nullity _nullity = (com.biosimilarity.lift.model.seleKt.Absyn.Nullity) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("null");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.Comparison foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Equality)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Equality _equality = (com.biosimilarity.lift.model.seleKt.Absyn.Equality) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("==");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Less)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Less _less = (com.biosimilarity.lift.model.seleKt.Absyn.Less) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("<");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.More)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.More _more = (com.biosimilarity.lift.model.seleKt.Absyn.More) foo;
       if (_i_ > 0) render(_L_PAREN);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.LEq)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.LEq _leq = (com.biosimilarity.lift.model.seleKt.Absyn.LEq) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("<=");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.GEq)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.GEq _geq = (com.biosimilarity.lift.model.seleKt.Absyn.GEq) foo;
       if (_i_ > 0) render(_L_PAREN);
       render(">=");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaExpr foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Application)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Application _application = (com.biosimilarity.lift.model.seleKt.Absyn.Application) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_application.rlambdaexpr_, 0);
       pp(_application.listrlambdaexpr_, 1);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Abstraction)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Abstraction _abstraction = (com.biosimilarity.lift.model.seleKt.Absyn.Abstraction) foo;
       if (_i_ > 1) render(_L_PAREN);
       render("lambda");
       pp(_abstraction.listformalexpr_, 0);
       render(".");
       pp(_abstraction.rlambdaexpr_, 2);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Continuation)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Continuation _continuation = (com.biosimilarity.lift.model.seleKt.Absyn.Continuation) foo;
       if (_i_ > 1) render(_L_PAREN);
       pp(_continuation.continueexpr_, 0);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Mention)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Mention _mention = (com.biosimilarity.lift.model.seleKt.Absyn.Mention) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_mention.formalexpr_, 0);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Value)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Value _value = (com.biosimilarity.lift.model.seleKt.Absyn.Value) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_value.valueexpr_, 0);
       if (_i_ > 2) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ContinueExpr foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Prompt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Prompt _prompt = (com.biosimilarity.lift.model.seleKt.Absyn.Prompt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("newPrompt");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt _pushprompt = (com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("pushPrompt");
       pp(_pushprompt.rlambdaexpr_1, 2);
       pp(_pushprompt.rlambdaexpr_2, 2);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation _subcontinuation = (com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("withSubCont");
       pp(_subcontinuation.rlambdaexpr_1, 2);
       pp(_subcontinuation.rlambdaexpr_2, 2);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont _pushsubcont = (com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("pushSubCont");
       pp(_pushsubcont.rlambdaexpr_1, 2);
       pp(_pushsubcont.rlambdaexpr_2, 2);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.FormalExpr foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Transcription)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Transcription _transcription = (com.biosimilarity.lift.model.seleKt.Absyn.Transcription) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("@");
       render("<");
       pp(_transcription.rlambdaexpr_, 2);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral _atomliteral = (com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_atomliteral.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ValueExpr foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr _valueaddexpr = (com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_valueaddexpr.valueexpr_1, 0);
       render("+");
       pp(_valueaddexpr.valueexpr_2, 1);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr _valuemultexpr = (com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr) foo;
       if (_i_ > 1) render(_L_PAREN);
       pp(_valuemultexpr.valueexpr_1, 1);
       render("*");
       pp(_valuemultexpr.valueexpr_2, 2);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr _valuenegexpr = (com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr) foo;
       if (_i_ > 2) render(_L_PAREN);
       render("-");
       pp(_valuenegexpr.valueexpr_, 3);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr _valuelitexpr = (com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_valuelitexpr.valueliteral_, 0);
       if (_i_ > 3) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ValueLiteral foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit _valuereclit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("!");
       pp(_valuereclit.recordexpr_, 3);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit _valuelamlit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("(");
       pp(_valuelamlit.rlambdaexpr_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit _valueintlit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_valueintlit.integer_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit _valuedoublelit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_valuedoublelit.double_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit _valuestringlit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit) foo;
       if (_i_ > 0) render(_L_PAREN);
       printQuoted(_valuestringlit.string_);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit _valuecharlit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_valuecharlit.char_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit _valueurllit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_valueurllit.url_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.StoreURL foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL _recordstoreurl = (com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_recordstoreurl.url_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.WireURL foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL _recordwireurl = (com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_recordwireurl.url_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.URL foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.BasicURL)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.BasicURL _basicurl = (com.biosimilarity.lift.model.seleKt.Absyn.BasicURL) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("<");
       pp(_basicurl.urlscheme_, 0);
       render(":");
       pp(_basicurl.urlpath_, 0);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.URLPath foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath _locatedtedpath = (com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("/");
       pp(_locatedtedpath.urllocation_, 0);
       pp(_locatedtedpath.urlrelativepath_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.URLLocation foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation _urlnetlocation = (com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_urlnetlocation.urlroot_, 0);
       pp(_urlnetlocation.urlrsrclocation_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLocation foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc _urlrsrcportloc = (com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_urlrsrcportloc.netlocation_, 0);
       render(":");
       pp(_urlrsrcportloc.port_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc _urlrsrcloc = (com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_urlrsrcloc.netlocation_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.URLRelativePath foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.SlashPath)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.SlashPath _slashpath = (com.biosimilarity.lift.model.seleKt.Absyn.SlashPath) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_slashpath.urlroot_, 0);
       pp(_slashpath.listurlpathelement_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.URLRoot foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin _urlorigin = (com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("/");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.NetLocation foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr _dnsaddr = (com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_dnsaddr.listdnselement_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.URLScheme foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme _atomscheme = (com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_atomscheme.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.URLPathElement foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement _atompathelement = (com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_atompathelement.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.DNSElement foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement _atomdnselement = (com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_atomdnselement.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.Port foo, int _i_)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AtomPort)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AtomPort _atomport = (com.biosimilarity.lift.model.seleKt.Absyn.AtomPort) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_atomport.integer_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListBinding foo, int _i_)
  {
     for (java.util.Iterator<Binding> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainDeclOrCond foo, int _i_)
  {
     for (java.util.Iterator<DomainDeclOrCond> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainExpr foo, int _i_)
  {
     for (java.util.Iterator<DomainExpr> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainPtn foo, int _i_)
  {
     for (java.util.Iterator<DomainPtn> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalExpr foo, int _i_)
  {
     for (java.util.Iterator<FormalExpr> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListRLambdaExpr foo, int _i_)
  {
     for (java.util.Iterator<RLambdaExpr> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalPCtxt foo, int _i_)
  {
     for (java.util.Iterator<FormalPCtxt> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListRLambdaPCtxt foo, int _i_)
  {
     for (java.util.Iterator<RLambdaPCtxt> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalLCtxt foo, int _i_)
  {
     for (java.util.Iterator<FormalLCtxt> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListRLambdaLCtxt foo, int _i_)
  {
     for (java.util.Iterator<RLambdaLCtxt> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListURLPathElement foo, int _i_)
  {
     for (java.util.Iterator<URLPathElement> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("/");
       } else {
         render("");
       }
     }
  }

  private static void pp(com.biosimilarity.lift.model.seleKt.Absyn.ListDNSElement foo, int _i_)
  {
     for (java.util.Iterator<DNSElement> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(".");
       } else {
         render("");
       }
     }
  }


  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.RecordExpr foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Joined)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Joined _joined = (com.biosimilarity.lift.model.seleKt.Absyn.Joined) foo;
       render("(");
       render("Joined");
       sh(_joined.recordexpr_1);
       sh(_joined.recordexpr_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Isolated)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Isolated _isolated = (com.biosimilarity.lift.model.seleKt.Absyn.Isolated) foo;
       render("(");
       render("Isolated");
       sh(_isolated.recordexpr_1);
       sh(_isolated.recordexpr_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Consed)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Consed _consed = (com.biosimilarity.lift.model.seleKt.Absyn.Consed) foo;
       render("(");
       render("Consed");
       sh(_consed.domainexpr_);
       sh(_consed.recordexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Contexted)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Contexted _contexted = (com.biosimilarity.lift.model.seleKt.Absyn.Contexted) foo;
       render("(");
       render("Contexted");
       render("[");
       sh(_contexted.listbinding_);
       render("]");
       sh(_contexted.recordexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Referenced)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Referenced _referenced = (com.biosimilarity.lift.model.seleKt.Absyn.Referenced) foo;
       render("(");
       render("Referenced");
       sh(_referenced.recordvariable_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Collected)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Collected _collected = (com.biosimilarity.lift.model.seleKt.Absyn.Collected) foo;
       render("(");
       render("Collected");
       sh(_collected.collectionexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Emptied)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Emptied _emptied = (com.biosimilarity.lift.model.seleKt.Absyn.Emptied) foo;
       render("Emptied");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.Binding foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr _bindingexpr = (com.biosimilarity.lift.model.seleKt.Absyn.BindingExpr) foo;
       render("(");
       render("BindingExpr");
       sh(_bindingexpr.recordptn_1);
       sh(_bindingexpr.recordptn_2);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.RecordPtn foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor _recorddestructor = (com.biosimilarity.lift.model.seleKt.Absyn.RecordDestructor) foo;
       render("(");
       render("RecordDestructor");
       render("[");
       sh(_recorddestructor.listdomainptn_);
       render("]");
       sh(_recorddestructor.recordptn_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral _recordliteral = (com.biosimilarity.lift.model.seleKt.Absyn.RecordLiteral) foo;
       render("(");
       render("RecordLiteral");
       sh(_recordliteral.recordexpr_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.RecordVariable foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent _recordident = (com.biosimilarity.lift.model.seleKt.Absyn.RecordIdent) foo;
       render("(");
       render("RecordIdent");
       sh(_recordident.uident_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordWild)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordWild _recordwild = (com.biosimilarity.lift.model.seleKt.Absyn.RecordWild) foo;
       render("RecordWild");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.CollectionExpr foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Extension)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Extension _extension = (com.biosimilarity.lift.model.seleKt.Absyn.Extension) foo;
       render("(");
       render("Extension");
       sh(_extension.extensionbodyexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Intension)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Intension _intension = (com.biosimilarity.lift.model.seleKt.Absyn.Intension) foo;
       render("(");
       render("Intension");
       sh(_intension.intensionbodyexpr_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBodyExpr foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody _extensionbody = (com.biosimilarity.lift.model.seleKt.Absyn.ExtensionBody) foo;
       render("(");
       render("ExtensionBody");
       render("[");
       sh(_extensionbody.listdomainexpr_);
       render("]");
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.IntensionBodyExpr foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody _intensionbody = (com.biosimilarity.lift.model.seleKt.Absyn.IntensionBody) foo;
       render("(");
       render("IntensionBody");
       sh(_intensionbody.domainptn_);
       render("[");
       sh(_intensionbody.listdomaindeclorcond_);
       render("]");
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.DomainDeclOrCond foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn _conditionin = (com.biosimilarity.lift.model.seleKt.Absyn.ConditionIn) foo;
       render("(");
       render("ConditionIn");
       sh(_conditionin.domaincond_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DeclIn)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DeclIn _declin = (com.biosimilarity.lift.model.seleKt.Absyn.DeclIn) foo;
       render("(");
       render("DeclIn");
       sh(_declin.domaingen_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.DomainGen foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr _domaingenexpr = (com.biosimilarity.lift.model.seleKt.Absyn.DomainGenExpr) foo;
       render("(");
       render("DomainGenExpr");
       sh(_domaingenexpr.domainptn_);
       sh(_domaingenexpr.recordsource_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.DomainCond foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr _domainsatexpr = (com.biosimilarity.lift.model.seleKt.Absyn.DomainSatExpr) foo;
       render("(");
       render("DomainSatExpr");
       sh(_domainsatexpr.domainptn_);
       sh(_domainsatexpr.domaincondition_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr _domaincompexpr = (com.biosimilarity.lift.model.seleKt.Absyn.DomainCompExpr) foo;
       render("(");
       render("DomainCompExpr");
       sh(_domaincompexpr.valueexpr_1);
       sh(_domaincompexpr.comparison_);
       sh(_domaincompexpr.valueexpr_2);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.DomainPtn foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr _domainptnexpr = (com.biosimilarity.lift.model.seleKt.Absyn.DomainPtnExpr) foo;
       render("(");
       render("DomainPtnExpr");
       sh(_domainptnexpr.rlambdapctxt_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.DomainExpr foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr _domainrlambdaexpr = (com.biosimilarity.lift.model.seleKt.Absyn.DomainRLambdaExpr) foo;
       render("(");
       render("DomainRLambdaExpr");
       sh(_domainrlambdaexpr.rlambdaexpr_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.RecordSource foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource _onboardsource = (com.biosimilarity.lift.model.seleKt.Absyn.OnBoardSource) foo;
       render("(");
       render("OnBoardSource");
       sh(_onboardsource.recordexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource _persistentsource = (com.biosimilarity.lift.model.seleKt.Absyn.PersistentSource) foo;
       render("(");
       render("PersistentSource");
       sh(_persistentsource.storeurl_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.WireSource)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.WireSource _wiresource = (com.biosimilarity.lift.model.seleKt.Absyn.WireSource) foo;
       render("(");
       render("WireSource");
       sh(_wiresource.wireurl_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.DomainCondition foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition _disjunctdomaincondition = (com.biosimilarity.lift.model.seleKt.Absyn.DisjunctDomainCondition) foo;
       render("(");
       render("DisjunctDomainCondition");
       sh(_disjunctdomaincondition.domaincondition_1);
       sh(_disjunctdomaincondition.domaincondition_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition _conjunctdomaincondition = (com.biosimilarity.lift.model.seleKt.Absyn.ConjunctDomainCondition) foo;
       render("(");
       render("ConjunctDomainCondition");
       sh(_conjunctdomaincondition.domaincondition_1);
       sh(_conjunctdomaincondition.domaincondition_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition _negateddomaincondition = (com.biosimilarity.lift.model.seleKt.Absyn.NegatedDomainCondition) foo;
       render("(");
       render("NegatedDomainCondition");
       sh(_negateddomaincondition.domaincondition_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition _structuraldomaincondition = (com.biosimilarity.lift.model.seleKt.Absyn.StructuralDomainCondition) foo;
       render("(");
       render("StructuralDomainCondition");
       sh(_structuraldomaincondition.rlambdalctxt_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition _behavioraldomaincondition = (com.biosimilarity.lift.model.seleKt.Absyn.BehavioralDomainCondition) foo;
       render("(");
       render("BehavioralDomainCondition");
       sh(_behavioraldomaincondition.modality_);
       sh(_behavioraldomaincondition.domaincondition_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.Modality foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility _probepossibility = (com.biosimilarity.lift.model.seleKt.Absyn.ProbePossibility) foo;
       render("(");
       render("ProbePossibility");
       sh(_probepossibility.domaincondition_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaPCtxt foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt _applicationpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ApplicationPCtxt) foo;
       render("(");
       render("ApplicationPCtxt");
       sh(_applicationpctxt.rlambdapctxt_);
       render("[");
       sh(_applicationpctxt.listrlambdapctxt_);
       render("]");
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt _abstractionpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.AbstractionPCtxt) foo;
       render("(");
       render("AbstractionPCtxt");
       render("[");
       sh(_abstractionpctxt.listformalpctxt_);
       render("]");
       sh(_abstractionpctxt.rlambdapctxt_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt _kpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.KPCtxt) foo;
       render("(");
       render("KPCtxt");
       sh(_kpctxt.continuepctxt_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt _groundpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.GroundPCtxt) foo;
       render("(");
       render("GroundPCtxt");
       sh(_groundpctxt.valuepctxt_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt _mentionpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.MentionPCtxt) foo;
       render("(");
       render("MentionPCtxt");
       sh(_mentionpctxt.formalpctxt_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ContinuePCtxt foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt _pushpromptpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.PushPromptPCtxt) foo;
       render("(");
       render("PushPromptPCtxt");
       sh(_pushpromptpctxt.rlambdapctxt_1);
       sh(_pushpromptpctxt.rlambdapctxt_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt _subcontpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.SubcontPCtxt) foo;
       render("(");
       render("SubcontPCtxt");
       sh(_subcontpctxt.rlambdapctxt_1);
       sh(_subcontpctxt.rlambdapctxt_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt _pushsubcontpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.PushSubContPCtxt) foo;
       render("(");
       render("PushSubContPCtxt");
       sh(_pushsubcontpctxt.rlambdapctxt_1);
       sh(_pushsubcontpctxt.rlambdapctxt_2);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.FormalPCtxt foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt _transcriptpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.TranscriptPCtxt) foo;
       render("(");
       render("TranscriptPCtxt");
       sh(_transcriptpctxt.rlambdapctxt_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxt foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt _valueaddpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueAddPCtxt) foo;
       render("(");
       render("ValueAddPCtxt");
       sh(_valueaddpctxt.valuepctxt_1);
       sh(_valueaddpctxt.valuepctxt_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt _valuemultpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueMultPCtxt) foo;
       render("(");
       render("ValueMultPCtxt");
       sh(_valuemultpctxt.valuepctxt_1);
       sh(_valuemultpctxt.valuepctxt_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt _valuenegpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueNegPCtxt) foo;
       render("(");
       render("ValueNegPCtxt");
       sh(_valuenegpctxt.valuepctxt_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt _valuelitpctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueLitPCtxt) foo;
       render("(");
       render("ValueLitPCtxt");
       sh(_valuelitpctxt.valueliteral_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt _valueemptypctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyPCtxt) foo;
       render("(");
       render("ValueEmptyPCtxt");
       sh(_valueemptypctxt.valuepctxthole_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaLCtxt foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt _applicationlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ApplicationLCtxt) foo;
       render("(");
       render("ApplicationLCtxt");
       sh(_applicationlctxt.rlambdalctxt_);
       render("[");
       sh(_applicationlctxt.listrlambdalctxt_);
       render("]");
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt _abstractionlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.AbstractionLCtxt) foo;
       render("(");
       render("AbstractionLCtxt");
       render("[");
       sh(_abstractionlctxt.listformallctxt_);
       render("]");
       sh(_abstractionlctxt.rlambdalctxt_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt _klctxt = (com.biosimilarity.lift.model.seleKt.Absyn.KLCtxt) foo;
       render("(");
       render("KLCtxt");
       sh(_klctxt.continuelctxt_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt _mentionlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.MentionLCtxt) foo;
       render("(");
       render("MentionLCtxt");
       sh(_mentionlctxt.formallctxt_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt _groundlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.GroundLCtxt) foo;
       render("(");
       render("GroundLCtxt");
       sh(_groundlctxt.valuelctxt_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ContinueLCtxt foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt _pushpromptlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.PushPromptLCtxt) foo;
       render("(");
       render("PushPromptLCtxt");
       sh(_pushpromptlctxt.rlambdalctxt_1);
       sh(_pushpromptlctxt.rlambdalctxt_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt _subconlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.SubconLCtxt) foo;
       render("(");
       render("SubconLCtxt");
       sh(_subconlctxt.rlambdalctxt_1);
       sh(_subconlctxt.rlambdalctxt_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt _pushsubcontlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.PushSubContLCtxt) foo;
       render("(");
       render("PushSubContLCtxt");
       sh(_pushsubcontlctxt.rlambdalctxt_1);
       sh(_pushsubcontlctxt.rlambdalctxt_2);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.FormalLCtxt foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt _transcriptlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.TranscriptLCtxt) foo;
       render("(");
       render("TranscriptLCtxt");
       sh(_transcriptlctxt.rlambdalctxt_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxt foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt _valueaddlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueAddLCtxt) foo;
       render("(");
       render("ValueAddLCtxt");
       sh(_valueaddlctxt.valuelctxt_1);
       sh(_valueaddlctxt.valuelctxt_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt _valuemultlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueMultLCtxt) foo;
       render("(");
       render("ValueMultLCtxt");
       sh(_valuemultlctxt.valuelctxt_1);
       sh(_valuemultlctxt.valuelctxt_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt _valueneglctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueNegLCtxt) foo;
       render("(");
       render("ValueNegLCtxt");
       sh(_valueneglctxt.valuelctxt_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt _valuelitlctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueLitLCtxt) foo;
       render("(");
       render("ValueLitLCtxt");
       sh(_valuelitlctxt.valueliteral_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt _valueemptylctxt = (com.biosimilarity.lift.model.seleKt.Absyn.ValueEmptyLCtxt) foo;
       render("(");
       render("ValueEmptyLCtxt");
       sh(_valueemptylctxt.valuelctxthole_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ValuePCtxtHole foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder _valpplaceholder = (com.biosimilarity.lift.model.seleKt.Absyn.ValPPlaceHolder) foo;
       render("(");
       render("ValPPlaceHolder");
       sh(_valpplaceholder.uident_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard _valwildcard = (com.biosimilarity.lift.model.seleKt.Absyn.ValWildCard) foo;
       render("(");
       render("ValWildCard");
       sh(_valwildcard.wild_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ValueLCtxtHole foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder _vallplaceholder = (com.biosimilarity.lift.model.seleKt.Absyn.ValLPlaceHolder) foo;
       render("(");
       render("ValLPlaceHolder");
       sh(_vallplaceholder.logicalground_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.LogicalGround foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Verity)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Verity _verity = (com.biosimilarity.lift.model.seleKt.Absyn.Verity) foo;
       render("Verity");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Absurdity)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Absurdity _absurdity = (com.biosimilarity.lift.model.seleKt.Absyn.Absurdity) foo;
       render("Absurdity");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Nullity)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Nullity _nullity = (com.biosimilarity.lift.model.seleKt.Absyn.Nullity) foo;
       render("Nullity");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.Comparison foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Equality)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Equality _equality = (com.biosimilarity.lift.model.seleKt.Absyn.Equality) foo;
       render("Equality");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Less)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Less _less = (com.biosimilarity.lift.model.seleKt.Absyn.Less) foo;
       render("Less");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.More)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.More _more = (com.biosimilarity.lift.model.seleKt.Absyn.More) foo;
       render("More");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.LEq)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.LEq _leq = (com.biosimilarity.lift.model.seleKt.Absyn.LEq) foo;
       render("LEq");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.GEq)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.GEq _geq = (com.biosimilarity.lift.model.seleKt.Absyn.GEq) foo;
       render("GEq");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.RLambdaExpr foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Application)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Application _application = (com.biosimilarity.lift.model.seleKt.Absyn.Application) foo;
       render("(");
       render("Application");
       sh(_application.rlambdaexpr_);
       render("[");
       sh(_application.listrlambdaexpr_);
       render("]");
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Abstraction)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Abstraction _abstraction = (com.biosimilarity.lift.model.seleKt.Absyn.Abstraction) foo;
       render("(");
       render("Abstraction");
       render("[");
       sh(_abstraction.listformalexpr_);
       render("]");
       sh(_abstraction.rlambdaexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Continuation)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Continuation _continuation = (com.biosimilarity.lift.model.seleKt.Absyn.Continuation) foo;
       render("(");
       render("Continuation");
       sh(_continuation.continueexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Mention)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Mention _mention = (com.biosimilarity.lift.model.seleKt.Absyn.Mention) foo;
       render("(");
       render("Mention");
       sh(_mention.formalexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Value)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Value _value = (com.biosimilarity.lift.model.seleKt.Absyn.Value) foo;
       render("(");
       render("Value");
       sh(_value.valueexpr_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ContinueExpr foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Prompt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Prompt _prompt = (com.biosimilarity.lift.model.seleKt.Absyn.Prompt) foo;
       render("Prompt");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt _pushprompt = (com.biosimilarity.lift.model.seleKt.Absyn.PushPrompt) foo;
       render("(");
       render("PushPrompt");
       sh(_pushprompt.rlambdaexpr_1);
       sh(_pushprompt.rlambdaexpr_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation _subcontinuation = (com.biosimilarity.lift.model.seleKt.Absyn.Subcontinuation) foo;
       render("(");
       render("Subcontinuation");
       sh(_subcontinuation.rlambdaexpr_1);
       sh(_subcontinuation.rlambdaexpr_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont _pushsubcont = (com.biosimilarity.lift.model.seleKt.Absyn.PushSubCont) foo;
       render("(");
       render("PushSubCont");
       sh(_pushsubcont.rlambdaexpr_1);
       sh(_pushsubcont.rlambdaexpr_2);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.FormalExpr foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.Transcription)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.Transcription _transcription = (com.biosimilarity.lift.model.seleKt.Absyn.Transcription) foo;
       render("(");
       render("Transcription");
       sh(_transcription.rlambdaexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral _atomliteral = (com.biosimilarity.lift.model.seleKt.Absyn.AtomLiteral) foo;
       render("(");
       render("AtomLiteral");
       sh(_atomliteral.ident_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ValueExpr foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr _valueaddexpr = (com.biosimilarity.lift.model.seleKt.Absyn.ValueAddExpr) foo;
       render("(");
       render("ValueAddExpr");
       sh(_valueaddexpr.valueexpr_1);
       sh(_valueaddexpr.valueexpr_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr _valuemultexpr = (com.biosimilarity.lift.model.seleKt.Absyn.ValueMultExpr) foo;
       render("(");
       render("ValueMultExpr");
       sh(_valuemultexpr.valueexpr_1);
       sh(_valuemultexpr.valueexpr_2);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr _valuenegexpr = (com.biosimilarity.lift.model.seleKt.Absyn.ValueNegExpr) foo;
       render("(");
       render("ValueNegExpr");
       sh(_valuenegexpr.valueexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr _valuelitexpr = (com.biosimilarity.lift.model.seleKt.Absyn.ValueLitExpr) foo;
       render("(");
       render("ValueLitExpr");
       sh(_valuelitexpr.valueliteral_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ValueLiteral foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit _valuereclit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueRecLit) foo;
       render("(");
       render("ValueRecLit");
       sh(_valuereclit.recordexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit _valuelamlit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueLamLit) foo;
       render("(");
       render("ValueLamLit");
       sh(_valuelamlit.rlambdaexpr_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit _valueintlit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueIntLit) foo;
       render("(");
       render("ValueIntLit");
       sh(_valueintlit.integer_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit _valuedoublelit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueDoubleLit) foo;
       render("(");
       render("ValueDoubleLit");
       sh(_valuedoublelit.double_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit _valuestringlit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueStringLit) foo;
       render("(");
       render("ValueStringLit");
       sh(_valuestringlit.string_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit _valuecharlit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueCharLit) foo;
       render("(");
       render("ValueCharLit");
       sh(_valuecharlit.char_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit _valueurllit = (com.biosimilarity.lift.model.seleKt.Absyn.ValueURLLit) foo;
       render("(");
       render("ValueURLLit");
       sh(_valueurllit.url_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.StoreURL foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL _recordstoreurl = (com.biosimilarity.lift.model.seleKt.Absyn.RecordStoreURL) foo;
       render("(");
       render("RecordStoreURL");
       sh(_recordstoreurl.url_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.WireURL foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL _recordwireurl = (com.biosimilarity.lift.model.seleKt.Absyn.RecordWireURL) foo;
       render("(");
       render("RecordWireURL");
       sh(_recordwireurl.url_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.URL foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.BasicURL)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.BasicURL _basicurl = (com.biosimilarity.lift.model.seleKt.Absyn.BasicURL) foo;
       render("(");
       render("BasicURL");
       sh(_basicurl.urlscheme_);
       sh(_basicurl.urlpath_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.URLPath foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath _locatedtedpath = (com.biosimilarity.lift.model.seleKt.Absyn.LocatedtedPath) foo;
       render("(");
       render("LocatedtedPath");
       sh(_locatedtedpath.urllocation_);
       sh(_locatedtedpath.urlrelativepath_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.URLLocation foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation _urlnetlocation = (com.biosimilarity.lift.model.seleKt.Absyn.URLNetLocation) foo;
       render("(");
       render("URLNetLocation");
       sh(_urlnetlocation.urlroot_);
       sh(_urlnetlocation.urlrsrclocation_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLocation foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc _urlrsrcportloc = (com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcPortLoc) foo;
       render("(");
       render("URLRsrcPortLoc");
       sh(_urlrsrcportloc.netlocation_);
       sh(_urlrsrcportloc.port_);
       render(")");
    }
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc _urlrsrcloc = (com.biosimilarity.lift.model.seleKt.Absyn.URLRsrcLoc) foo;
       render("(");
       render("URLRsrcLoc");
       sh(_urlrsrcloc.netlocation_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.URLRelativePath foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.SlashPath)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.SlashPath _slashpath = (com.biosimilarity.lift.model.seleKt.Absyn.SlashPath) foo;
       render("(");
       render("SlashPath");
       sh(_slashpath.urlroot_);
       render("[");
       sh(_slashpath.listurlpathelement_);
       render("]");
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.URLRoot foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin _urlorigin = (com.biosimilarity.lift.model.seleKt.Absyn.URLOrigin) foo;
       render("URLOrigin");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.NetLocation foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr _dnsaddr = (com.biosimilarity.lift.model.seleKt.Absyn.DNSAddr) foo;
       render("(");
       render("DNSAddr");
       render("[");
       sh(_dnsaddr.listdnselement_);
       render("]");
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.URLScheme foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme _atomscheme = (com.biosimilarity.lift.model.seleKt.Absyn.AtomScheme) foo;
       render("(");
       render("AtomScheme");
       sh(_atomscheme.ident_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.URLPathElement foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement _atompathelement = (com.biosimilarity.lift.model.seleKt.Absyn.AtomPathElement) foo;
       render("(");
       render("AtomPathElement");
       sh(_atompathelement.ident_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.DNSElement foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement _atomdnselement = (com.biosimilarity.lift.model.seleKt.Absyn.AtomDNSElement) foo;
       render("(");
       render("AtomDNSElement");
       sh(_atomdnselement.ident_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.Port foo)
  {
    if (foo instanceof com.biosimilarity.lift.model.seleKt.Absyn.AtomPort)
    {
       com.biosimilarity.lift.model.seleKt.Absyn.AtomPort _atomport = (com.biosimilarity.lift.model.seleKt.Absyn.AtomPort) foo;
       render("(");
       render("AtomPort");
       sh(_atomport.integer_);
       render(")");
    }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListBinding foo)
  {
     for (java.util.Iterator<Binding> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainDeclOrCond foo)
  {
     for (java.util.Iterator<DomainDeclOrCond> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainExpr foo)
  {
     for (java.util.Iterator<DomainExpr> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListDomainPtn foo)
  {
     for (java.util.Iterator<DomainPtn> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalExpr foo)
  {
     for (java.util.Iterator<FormalExpr> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListRLambdaExpr foo)
  {
     for (java.util.Iterator<RLambdaExpr> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalPCtxt foo)
  {
     for (java.util.Iterator<FormalPCtxt> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListRLambdaPCtxt foo)
  {
     for (java.util.Iterator<RLambdaPCtxt> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListFormalLCtxt foo)
  {
     for (java.util.Iterator<FormalLCtxt> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListRLambdaLCtxt foo)
  {
     for (java.util.Iterator<RLambdaLCtxt> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListURLPathElement foo)
  {
     for (java.util.Iterator<URLPathElement> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(com.biosimilarity.lift.model.seleKt.Absyn.ListDNSElement foo)
  {
     for (java.util.Iterator<DNSElement> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }


  private static void pp(Integer n, int _i_) { buf_.append(n); buf_.append(" "); }
  private static void pp(Double d, int _i_) { buf_.append(d); buf_.append(" "); }
  private static void pp(String s, int _i_) { buf_.append(s); buf_.append(" "); }
  private static void pp(Character c, int _i_) { buf_.append("'" + c.toString() + "'"); buf_.append(" "); }
  private static void sh(Integer n) { render(n.toString()); }
  private static void sh(Double d) { render(d.toString()); }
  private static void sh(Character c) { render(c.toString()); }
  private static void sh(String s) { printQuoted(s); }
  private static void printQuoted(String s) { render("\"" + s + "\""); }
  private static void indent()
  {
    int n = _n_;
    while (n > 0)
    {
      buf_.append(" ");
      n--;
    }
  }
  private static void backup()
  {
     if (buf_.charAt(buf_.length() - 1) == ' ') {
      buf_.setLength(buf_.length() - 1);
    }
  }
  private static void trim()
  {
     while (buf_.length() > 0 && buf_.charAt(0) == ' ')
        buf_.deleteCharAt(0); 
    while (buf_.length() > 0 && buf_.charAt(buf_.length()-1) == ' ')
        buf_.deleteCharAt(buf_.length()-1);
  }
  private static int _n_ = 0;
  private static StringBuilder buf_ = new StringBuilder(INITIAL_BUFFER_SIZE);
}

