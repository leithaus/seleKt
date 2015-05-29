JAVAC = javac
JAVAC_FLAGS = -sourcepath .

JAVA = java
JAVA_FLAGS =

CUP = java_cup.Main
CUPFLAGS = -nopositions -expect 100

JLEX = JLex.Main

LATEX = latex
DVIPS = dvips

all: test rlambdaDC.ps

test: absyn com/biosimilarity/lift/lang/rlambdaDC/Yylex.class com/biosimilarity/lift/lang/rlambdaDC/PrettyPrinter.class com/biosimilarity/lift/lang/rlambdaDC/Test.class com/biosimilarity/lift/lang/rlambdaDC/ComposVisitor.class com/biosimilarity/lift/lang/rlambdaDC/AbstractVisitor.class com/biosimilarity/lift/lang/rlambdaDC/FoldVisitor.class com/biosimilarity/lift/lang/rlambdaDC/AllVisitor.class com/biosimilarity/lift/lang/rlambdaDC/parser.class com/biosimilarity/lift/lang/rlambdaDC/sym.class com/biosimilarity/lift/lang/rlambdaDC/Test.class

.PHONY: absyn

%.class: %.java
	${JAVAC} ${JAVAC_FLAGS} $^

absyn: com/biosimilarity/lift/lang/rlambdaDC/Absyn/Expression.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Application.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Mention.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Value.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Continuation.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Abstraction.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/ContinueExpr.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Prompt.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/PushPrompt.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Subcontinuation.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/PushSubCont.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/VariableExpr.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Transcription.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/AtomLiteral.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/ValueExpr.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Numeric.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/ListVariableExpr.java
	${JAVAC} ${JAVAC_FLAGS} $^

com/biosimilarity/lift/lang/rlambdaDC/Yylex.java: com/biosimilarity/lift/lang/rlambdaDC/Yylex
	${JAVA} ${JAVA_FLAGS} ${JLEX} com/biosimilarity/lift/lang/rlambdaDC/Yylex

com/biosimilarity/lift/lang/rlambdaDC/sym.java com/biosimilarity/lift/lang/rlambdaDC/parser.java: com/biosimilarity/lift/lang/rlambdaDC/rlambdaDC.cup
	${JAVA} ${JAVA_FLAGS} ${CUP} ${CUPFLAGS} com/biosimilarity/lift/lang/rlambdaDC/rlambdaDC.cup
	mv sym.java parser.java com/biosimilarity/lift/lang/rlambdaDC/

com/biosimilarity/lift/lang/rlambdaDC/Yylex.class: com/biosimilarity/lift/lang/rlambdaDC/Yylex.java com/biosimilarity/lift/lang/rlambdaDC/sym.java

com/biosimilarity/lift/lang/rlambdaDC/sym.class: com/biosimilarity/lift/lang/rlambdaDC/sym.java

com/biosimilarity/lift/lang/rlambdaDC/parser.class: com/biosimilarity/lift/lang/rlambdaDC/parser.java com/biosimilarity/lift/lang/rlambdaDC/sym.java

com/biosimilarity/lift/lang/rlambdaDC/PrettyPrinter.class: com/biosimilarity/lift/lang/rlambdaDC/PrettyPrinter.java

rlambdaDC.dvi: rlambdaDC.tex
	${LATEX} rlambdaDC.tex

rlambdaDC.ps: rlambdaDC.dvi
	${DVIPS} rlambdaDC.dvi -o rlambdaDC.ps

clean:
	 rm -f com/biosimilarity/lift/lang/rlambdaDC/Absyn/*.class com/biosimilarity/lift/lang/rlambdaDC/*.class
	 rm -f .dvi rlambdaDC.aux rlambdaDC.log rlambdaDC.ps  *.class

vclean:
	 rm -f com/biosimilarity/lift/lang/rlambdaDC/Absyn/Expression.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Application.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Mention.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Value.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Continuation.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Abstraction.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/ContinueExpr.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Prompt.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/PushPrompt.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Subcontinuation.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/PushSubCont.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/VariableExpr.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Transcription.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/AtomLiteral.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/ValueExpr.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Numeric.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/ListVariableExpr.java com/biosimilarity/lift/lang/rlambdaDC/Absyn/Expression.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/Application.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/Mention.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/Value.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/Continuation.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/Abstraction.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/ContinueExpr.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/Prompt.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/PushPrompt.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/Subcontinuation.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/PushSubCont.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/VariableExpr.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/Transcription.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/AtomLiteral.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/ValueExpr.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/Numeric.class com/biosimilarity/lift/lang/rlambdaDC/Absyn/ListVariableExpr.class
	 rm -f com/biosimilarity/lift/lang/rlambdaDC/Absyn/*.class
	 rmdir com/biosimilarity/lift/lang/rlambdaDC/Absyn/
	 rm -f rlambdaDC.tex rlambdaDC.dvi rlambdaDC.aux rlambdaDC.log rlambdaDC.ps 
	 rm -f com/biosimilarity/lift/lang/rlambdaDC/Yylex com/biosimilarity/lift/lang/rlambdaDC/rlambdaDC.cup com/biosimilarity/lift/lang/rlambdaDC/Yylex.java com/biosimilarity/lift/lang/rlambdaDC/VisitSkel.java com/biosimilarity/lift/lang/rlambdaDC/ComposVisitor.java com/biosimilarity/lift/lang/rlambdaDC/AbstractVisitor.java com/biosimilarity/lift/lang/rlambdaDC/FoldVisitor.java com/biosimilarity/lift/lang/rlambdaDC/AllVisitor.java com/biosimilarity/lift/lang/rlambdaDC/PrettyPrinter.java com/biosimilarity/lift/lang/rlambdaDC/Skeleton.java com/biosimilarity/lift/lang/rlambdaDC/Test.java com/biosimilarity/lift/lang/rlambdaDC/sym.java com/biosimilarity/lift/lang/rlambdaDC/parser.java com/biosimilarity/lift/lang/rlambdaDC/*.class
	 rm -f Makefile
	 rmdir -p com/biosimilarity/lift/lang/rlambdaDC/

