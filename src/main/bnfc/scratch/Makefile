all:
	happy -i -gca ParseleKt.y
	alex -g LexseleKt.x
	latex DocseleKt.tex; dvips DocseleKt.dvi -o DocseleKt.ps
	ghc --make TestseleKt.hs -o TestseleKt
clean:
	-rm -f *.log *.aux *.hi *.o *.dvi
	-rm -f DocseleKt.ps
distclean: clean
	-rm -f DocseleKt.* LexseleKt.* ParseleKt.* LayoutseleKt.* SkelseleKt.* PrintseleKt.* TestseleKt.* AbsseleKt.* TestseleKt ErrM.* SharedString.* seleKt.dtd XMLseleKt.* Makefile*

