package com.biosimilarity.lift.model.seleKt;
import java_cup.runtime.*;
import com.biosimilarity.lift.model.seleKt.*;
import com.biosimilarity.lift.model.seleKt.Absyn.*;
import java.io.*;

public class Test
{
  public static void main(String args[]) throws Exception
  {
    Yylex l = null;
    parser p;
    try
    {
      if (args.length == 0) l = new Yylex(System.in);
      else l = new Yylex(new FileReader(args[0]));
    }
    catch(FileNotFoundException e)
    {
     System.err.println("Error: File not found: " + args[0]);
     System.exit(1);
    }
    p = new parser(l);
    /* The default parser is the first-defined entry point. */
    /* You may want to change this. Other options are: */
    /* pBinding, pRecordPtn, pRecordVariable, pCollectionExpr, pExtensionBodyExpr, pIntensionBodyExpr, pDomainDeclOrCond, pDomainGen, pDomainCond, pDomainPtn, pDomainExpr, pRecordSource, pDomainCondition, pModality, pRLambdaPCtxt, pContinuePCtxt, pFormalPCtxt, pValuePCtxt, pRLambdaLCtxt, pContinueLCtxt, pFormalLCtxt, pValueLCtxt, pValuePCtxtHole, pValueLCtxtHole, pLogicalGround, pComparison, pRLambdaExpr, pContinueExpr, pFormalExpr, pValueExpr, pValueLiteral, pStoreURL, pWireURL, pURL, pURLPath, pURLLocation, pURLRsrcLocation, pURLRelativePath, pURLRoot, pNetLocation, pURLScheme, pURLPathElement, pDNSElement, pPort, pListBinding, pListDomainDeclOrCond, pListDomainExpr, pListDomainPtn, pListFormalExpr, pListFormalPCtxt, pListFormalLCtxt, pListURLPathElement, pListDNSElement */
    try
    {
      com.biosimilarity.lift.model.seleKt.Absyn.RecordExpr parse_tree = p.pRecordExpr();
      System.out.println();
      System.out.println("Parse Succesful!");
      System.out.println();
      System.out.println("[Abstract Syntax]");
      System.out.println();
      System.out.println(PrettyPrinter.show(parse_tree));
      System.out.println();
      System.out.println("[Linearized Tree]");
      System.out.println();
      System.out.println(PrettyPrinter.print(parse_tree));
    }
    catch(Throwable e)
    {
      System.err.println("At line " + String.valueOf(l.line_num()) + ", near \"" + l.buff() + "\" :");
      System.err.println("     " + e.getMessage());
      System.exit(1);
    }
  }
}
