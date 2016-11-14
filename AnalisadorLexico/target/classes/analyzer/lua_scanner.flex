package analyzer;

import java_cup.runtime.Symbol;

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
%column


NUMBER = ([0-9]*\.)?[0-9]+
VALUE = "nil"
NAME = [_|a-z|A-Z][a-z|A-Z|0-9|_]*
STRING = \"([^\"]*)?\"
COMMENT = "--"(.[^\n]*)?
BINOP = ["+"|"-"|"*"|"/"|"^"|"%"|".."|"<"|"<="|">"|">="|"=="|"~="|"and"|"or"]
UNOP = ["-"|"not"|"#"]
BRANCO = [\n| |\t|\r]

%%
<YYINITIAL> {
"do"			 { return new Symbol(sym.DO, createToken(sym.DO, yytext(), yycolumn)); }
"end"			 { return new Symbol(sym.END, createToken(sym.END, yytext(), yycolumn)); }
"while"			 { return new Symbol(sym.WHILE, createToken(sym.WHILE, yytext(), yycolumn)); }
"repeat"		 { return new Symbol(sym.REPEAT, createToken(sym.REPEAT, yytext(), yycolumn)); }
"until"			 { return new Symbol(sym.UNTIL, createToken(sym.UNTIL, yytext(), yycolumn)); }
"if"             { return new Symbol(sym.IF, createToken(sym.IF, yytext(), yycolumn)); }
"then"           { return new Symbol(sym.THEN, createToken(sym.THEN, yytext(), yycolumn)); }
"elseif"		 { return new Symbol(sym.ELSEIF, createToken(sym.ELSEIF, yytext(), yycolumn)); }
"else"			 { return new Symbol(sym.ELSE, createToken(sym.ELSE, yytext(), yycolumn)); }
"for"			 { return new Symbol(sym.FOR, createToken(sym.FOR, yytext(), yycolumn)); }
"in"			 { return new Symbol(sym.IN, createToken(sym.IN, yytext(), yycolumn)); }
"function"		 { return new Symbol(sym.FUNCTION, createToken(sym.FUNCTION, yytext(), yycolumn)); }
"local"			 { return new Symbol(sym.LOCAL, createToken(sym.LOCAL, yytext(), yycolumn)); }
"return"		 { return new Symbol(sym.RETURN, createToken(sym.RETURN, yytext(), yycolumn)); }
"break"			 { return new Symbol(sym.BREAK, createToken(sym.BREAK, yytext(), yycolumn)); }
"("				 { return new Symbol(sym.APAR, createToken(sym.APAR, yytext(), yycolumn)); }
")" 			 { return new Symbol(sym.FPAR, createToken(sym.FPAR, yytext(), yycolumn)); }
"[" 			 { return new Symbol(sym.ACOL, createToken(sym.ACOL, yytext(), yycolumn)); }
"]" 			 { return new Symbol(sym.FCOL, createToken(sym.FCOL, yytext(), yycolumn)); }
"{" 			 { return new Symbol(sym.ACHA, createToken(sym.ACHA, yytext(), yycolumn)); }
"}" 			 { return new Symbol(sym.FCHA, createToken(sym.FCHA, yytext(), yycolumn)); }
"."				 { return new Symbol(sym.PONTO, createToken(sym.PONTO, yytext(), yycolumn)); }
";"	 			 { return new Symbol(sym.PVIRGULA, createToken(sym.PVIRGULA, yytext(), yycolumn)); }
","	 			 { return new Symbol(sym.VIRGULA, createToken(sym.VIRGULA, yytext(), yycolumn)); }
":"	 			 { return new Symbol(sym.DPONTOS, createToken(sym.DPONTOS, yytext(), yycolumn)); }
"..."	 		 { return new Symbol(sym.TPONTOS, createToken(sym.TPONTOS, yytext(), yycolumn)); }
"="				 { return new Symbol(sym.ATRIBUICAO, createToken(sym.ATRIBUICAO, yytext(), yycolumn)); }
{VALUE}			 { return new Symbol(sym.VALUE, createToken(sym.VALUE, yytext(), yycolumn)); }
{NAME}  		 { return new Symbol(sym.NAME, createToken(sym.NAME, yytext(), yycolumn)); }
{NUMBER}         { return new Symbol(sym.NUMBER, createToken(sym.NUMBER, yytext(), yycolumn)); }
{STRING} 		 { return new Symbol(sym.STRING, createToken(sym.STRING, yytext(), yycolumn)); }
{BINOP}			 { return new Symbol(sym.BINOP, createToken(sym.BINOP, yytext(), yycolumn)); }
{UNOP} 			 { return new Symbol(sym.UNOP, createToken(sym.UNOP, yytext(), yycolumn)); }
{COMMENT}		 {}
{BRANCO}         {}
}

<<EOF>> { return new Symbol( sym.EOF , createToken(sym.EOF, yytext(), yycolumn)); }

[^] { throw new RuntimeException("Caractere inválido " + yytext()); }