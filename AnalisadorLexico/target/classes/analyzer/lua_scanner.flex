package analyzer;

import java_cup.runtime.Symbol;
@SuppressWarnings("unused")

%%

%{
    private LUAToken createToken(int type, String value, int start) {
        LUAToken token = new LUAToken(type, value, start);
        return token;
    }
%}

%cup
%public
%class AnalisadorLexico
%type java_cup.runtime.Symbol
%line



NUMBER = (-)?([0-9]*\.)?[0-9]+
NAME = [_|a-z|A-Z][a-z|A-Z|0-9|_]*
STRING = \"([^\"]*)?\"
COMMENT = "--"(.[^\n]*)?
BRANCO = [\n| |\t|\r]

%%

"do"			 { return new Symbol(sym.DO, createToken(sym.DO, yytext(), yyline)); }
"end"			 { return new Symbol(sym.END, createToken(sym.END, yytext(), yyline)); }
"while"			 { return new Symbol(sym.WHILE, createToken(sym.WHILE, yytext(), yyline)); }
"repeat"		 { return new Symbol(sym.REPEAT, createToken(sym.REPEAT, yytext(), yyline)); }
"until"			 { return new Symbol(sym.UNTIL, createToken(sym.UNTIL, yytext(), yyline)); }
"if"             { return new Symbol(sym.IF, createToken(sym.IF, yytext(), yyline)); }
"then"           { return new Symbol(sym.THEN, createToken(sym.THEN, yytext(), yyline)); }
"elseif"		 { return new Symbol(sym.ELSEIF, createToken(sym.ELSEIF, yytext(), yyline)); }
"else"			 { return new Symbol(sym.ELSE, createToken(sym.ELSE, yytext(), yyline)); }
"for"			 { return new Symbol(sym.FOR, createToken(sym.FOR, yytext(), yyline)); }
"in"			 { return new Symbol(sym.IN, createToken(sym.IN, yytext(), yyline)); }
"function"		 { return new Symbol(sym.FUNCTION, createToken(sym.FUNCTION, yytext(), yyline)); }
"local"			 { return new Symbol(sym.LOCAL, createToken(sym.LOCAL, yytext(), yyline)); }
"return"		 { return new Symbol(sym.RETURN, createToken(sym.RETURN, yytext(), yyline)); }
"break"			 { return new Symbol(sym.BREAK, createToken(sym.BREAK, yytext(), yyline)); }
"("				 { return new Symbol(sym.APAR, createToken(sym.APAR, yytext(), yyline)); }
")" 			 { return new Symbol(sym.FPAR, createToken(sym.FPAR, yytext(), yyline)); }
"[" 			 { return new Symbol(sym.ACOL, createToken(sym.ACOL, yytext(), yyline)); }
"]" 			 { return new Symbol(sym.FCOL, createToken(sym.FCOL, yytext(), yyline)); }
"{" 			 { return new Symbol(sym.ACHA, createToken(sym.ACHA, yytext(), yyline)); }
"}" 			 { return new Symbol(sym.FCHA, createToken(sym.FCHA, yytext(), yyline)); }
"."				 { return new Symbol(sym.PONTO, createToken(sym.PONTO, yytext(), yyline)); }
";"	 			 { return new Symbol(sym.PVIRGULA, createToken(sym.PVIRGULA, yytext(), yyline)); }
","	 			 { return new Symbol(sym.VIRGULA, createToken(sym.VIRGULA, yytext(), yyline)); }
":"	 			 { return new Symbol(sym.DPONTOS, createToken(sym.DPONTOS, yytext(), yyline)); }
"..."	 		 { return new Symbol(sym.PONTOS3, createToken(sym.PONTOS3, yytext(), yyline)); }
"="				 { return new Symbol(sym.ATRIBUICAO, createToken(sym.ATRIBUICAO, yytext(), yyline)); }
"+"			     { return new Symbol(sym.MAIS, createToken(sym.MAIS, yytext(), yyline)); }
"-"			     { return new Symbol(sym.MENOS, createToken(sym.MENOS, yytext(), yyline)); }
"*"			     { return new Symbol(sym.MULTIPLICACAO, createToken(sym.MULTIPLICACAO, yytext(), yyline)); }
"/"			     { return new Symbol(sym.DIVISAO, createToken(sym.DIVISAO, yytext(), yyline)); }
"^"			     { return new Symbol(sym.EXPOENTE, createToken(sym.EXPOENTE, yytext(), yyline)); }
"%"			     { return new Symbol(sym.RESTO, createToken(sym.RESTO, yytext(), yyline)); }
".."			 { return new Symbol(sym.PONTOS2, createToken(sym.PONTOS2, yytext(), yyline)); }
"<="			 { return new Symbol(sym.MENORIGUAL, createToken(sym.MENORIGUAL, yytext(), yyline)); }
">="			 { return new Symbol(sym.MAIORIGUAL, createToken(sym.MAIORIGUAL, yytext(), yyline)); }
"<"			     { return new Symbol(sym.MENOR, createToken(sym.MENOR, yytext(), yyline)); }
">"			     { return new Symbol(sym.MAIOR, createToken(sym.MAIOR, yytext(), yyline)); }
"=="			 { return new Symbol(sym.IGUAL, createToken(sym.IGUAL, yytext(), yyline)); }
"~="			 { return new Symbol(sym.DIFERENTE, createToken(sym.DIFERENTE, yytext(), yyline)); }
"and"			 { return new Symbol(sym.AND, createToken(sym.AND, yytext(), yyline)); }
"or"			 { return new Symbol(sym.OR, createToken(sym.OR, yytext(), yyline)); }
"nil"			 { return new Symbol(sym.NIL, createToken(sym.NIL, yytext(), yyline)); }
"true"			 { return new Symbol(sym.TRUE, createToken(sym.TRUE, yytext(), yyline)); }
"false"			 { return new Symbol(sym.FALSE, createToken(sym.FALSE, yytext(), yyline)); }
"not"			 { return new Symbol(sym.NOT, createToken(sym.NOT, yytext(), yyline)); }
"#"				 { return new Symbol(sym.TRALHA, createToken(sym.TRALHA, yytext(), yyline)); }
{NAME}  		 { return new Symbol(sym.NAME, createToken(sym.NAME, yytext(), yyline)); }
{NUMBER}         { return new Symbol(sym.NUMBER, createToken(sym.NUMBER, yytext(), yyline)); }
{STRING} 		 { return new Symbol(sym.STRING, createToken(sym.STRING, yytext(), yyline)); }
{COMMENT}		 {}
{BRANCO}         {}

<<EOF>> { return new Symbol( sym.EOF , createToken(sym.EOF, "EOF", yyline)); }

[^] { throw new RuntimeException("Caractere inválido " + yytext()); }