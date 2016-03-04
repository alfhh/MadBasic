// Alfredo Hinojosa Huerta & Luis Juan Sanchez Padilla
grammar MadBasic;

// Rules
programa		:	PROGRAM ID SEMICOLON a bloque;
a 				:	vars
					| //empty 
					;
vars			:	VAR b;
b 				:	ID c COLON tipo SEMICOLON d;
c 				:	COMMA ID c
					| //empty 
					;
d 				:	b
					| //empty 
					;
tipo 			:	INT
					| FLOAT 
					;
bloque			: 	OBRACE e;
e 	 			:	CBRACE
					| estatuto e 
					;
estatuto 		: 	asignacion
					| condicion
					| escritura
					;
asignacion 		:	ID EQUAL expresion SEMICOLON;
expresion 		:	exp g;
g 				:	GREATER exp
					| LESSER exp
					| INEQUALITY exp
					| //empty
					;
exp 			:	termino h;
h 				:	PLUS termino h
					| MINUS termino h
					| //empty
					;
termino 		:	factor i;
i 				:	MULTIPLICATION factor i
					| DIVISION factor i
					| //empty
					;
factor 			:	OPARENTHESIS expresion CPARENTHESIS
					| j
					;
j 				:	PLUS varcte
					| MINUS varcte
					| varcte
					;
varcte 			: 	ID
					| INTCONST
					| FLOATCONST
					;
condicion 		:	IF OPARENTHESIS expresion CPARENTHESIS bloque k SEMICOLON;
k 				:	ELSE bloque
					| //empty 
					;
escritura 		: 	PRINT OPARENTHESIS l;
l 				: 	expresion m
					| STRINGCONST m
					;
m 				:	CPARENTHESIS SEMICOLON
					| n CPARENTHESIS SEMICOLON
					;
n 				:	COMMA expresion n
					| COMMA STRINGCONST n
					| //empty
					;

// Tokens
PROGRAM 		:	'program';
SEMICOLON		: 	';';
VAR				: 	'var';
COMMA			:	',';
COLON			: 	':';
INT				:	'int';
FLOAT			:	'float';
OBRACE			:	'{';
CBRACE			:	'}';
EQUAL			:	'=';
GREATER			:	'>';
LESSER			:	'<';
INEQUALITY		:	'<>';
PLUS			:	'+';
MINUS			:	'-';
MULTIPLICATION	:	'*';
DIVISION		:	'/';
OPARENTHESIS	:	'(';
CPARENTHESIS	:	')';
IF				:	'if';
ELSE			:	'else';
PRINT			:	'print';
STRINGCONST		: 	'"' ~('\r' | '\n' | '"')* '"' ;
FLOATCONST 		:	[0-9]+'.'[0-9]+;
INTCONST		:	[0-9]+;
ID				:	[a-zA-Z0-9]+;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines