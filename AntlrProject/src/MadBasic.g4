// Alfredo Hinojosa Huerta & Luis Juan Sanchez Padilla
grammar MadBasic;

// Rules
madbasic		:	PROGRAM ID SEMICOLON program;
program 		:	a b c MAIN;
a 				:	classe a
					| // empty
					;
b 				:	vars
					| // empty
					;
c 				:	methods
					| // empty
					;
classe 			:	CLASS OBJECT d OBRACE b init c CBRACE;
d 				:	PARENT OBJECT
					| // empty
					;
vars 			:	VARS COLON e;
e 				:	type ID f SEMICOLON g;
f 				:	COMMA ID f
					| // empty
					;
g 				:	e
					| // empty
					;
methods			:	METHODS COLON h;
h 				:	method j;
j 				:	method j
					| // empty
					;
init 			: INIT OPARENTHESIS k CPARENTHESIS OBRACE l CBRACE;
k 				:	params
					| // empty
					;
l 				:	statement l
					| // empty
					;
type 			:	INT
					| FLOAT
					| STRING
					| BOOL
					| LIST LESSER type GREATER
					| OBJECT
					;
method 			:	procedure
					| function
					;
params 			: 	type m ID n;
m 				:	reference
					| // empty
					;
n 				: COMMA type m ID n
					| // empty
					;
statement 		:	assignment
					| condition
					| loop
					| write
					| call
					;
procedure 		:	VOID ID OPARENTHESIS k CPARENTHESIS OBRACE block CBRACE;
function 		:	type ID OPARENTHESIS k CPARENTHESIS OBRACE block retorno CBRACE;
reference 		:	TILDE;
assignment 		: 	identifier EQUAL o SEMICOLON;
o 				: 	expression
					| read
					;
condition 		: 	IF OPARENTHESIS expression CPARENTHESIS OBRACE l CBRACE p;
p 				:	ELSE OBRACE l CBRACE
					| // empty
					;
loop 			: 	WHILE OPARENTHESIS expression CPARENTHESIS OBRACE l CBRACE;
write 			: 	PRINT OPARENTHESIS exp q CPARENTHESIS SEMICOLON;
q 				:	CARET exp q
					| // empty
					;
call 			:	identifier OPARENTHESIS r CPARENTHESIS SEMICOLON;
r 				:	args
					| // empty
					;
block 			:	b l;
retorno 			: 	RETURN expression SEMICOLON;
identifier 		: 	ID s;
s 				:	DOT ID
					| // empty
					;
expression 		: 	comparison t;
t 				:	u comparison
					| // empty
					;
u 				: AND
				  | OR
				  ;
read 			: READ;
exp 			: term v;
v 				:	w term v
					| // empty
					;
w 				: PLUS
				  | MINUS
				  ;
args 			: m ID x;
x 				:	COMMA m ID x
					| // empty
					;
comparison		: exp y;
y 				:	z exp
					| // empty
					;
z 				:	GREATER EQUAL
					| LESSER EQUAL
					| EQUAL EQUAL
					| DIFFERENT
					| // empty
					;
term 			: 	factor aa;
aa 				:	ab factor aa
					| // empty
					;
ab				: 	MULTIPLICATION
					| DIVISION
					;
factor 			: OPARENTHESIS expression CPARENTHESIS
				  | ac value
				  ;
ac 				:	PLUS
					| MINUS
					| // empty
					;
value 			: identifier
				  | ID OBRACKET exp CBRACKET
				  | CTEI
				  | CTEF
				  | CTESTRING
				  | TRUE
				  | FALSE
				  | call
				  ;
main 			: MAIN COLON block END;


// Tokens
PROGRAM 		:	'program';
SEMICOLON		: 	';';
VARS			: 	'vars';
COMMA			:	',';
COLON			: 	':';
INT				:	'int';
FLOAT			:	'float';
STRING 				: 'string' ;
BOOL 				: 'bool' ;
CLASS 				: 'classe' ;
PARENT 				: 'parent' ;
INIT 				: 'init' ;
METHODS				: 'methods' ;
VOID 				: 'void' ;
RETURN 				: 'returno' ;
OBRACE			:	'{';
CBRACE			:	'}';
OBRACKET		: '[';
CBRACKET		: ']';
EQUAL			:	'=';
GREATER			:	'>';
LESSER			:	'<';
INEQUALITY		:	'<>';
PLUS			:	'+';
AND				: '&&';
OR 				: '||';
DIFFERENT 		: '!=';
DOT 			: '.';
MINUS			:	'-';
MULTIPLICATION	:	'*';
DIVISION		:	'/';
OPARENTHESIS	:	'(';
CPARENTHESIS	:	')';
IF				:	'if';
LIST 			: 	'list';
ELSE			:	'else';
WHILE				: 'while' ;
READ				: 'read' ;
TRUE 				: 'true' ;
FALSE 				: 'false' ;
MAIN				: 'main' ;
END 				: 'end' ;
TILDE 			: '~';
CARET 			: '^';
PRINT			:	'print';
ID 					: [a-z][a-zA-Z0-9]* ;
OBJECT				: [A-Z][a-zA-Z0-9]* ;
CTESTRING			: '"' ~('\r' | '\n' | '"')* '"' ;
CTEF 				: [0-9]+'.'[0-9]+ ;
CTEI 				: [0-9]+ ;
SKIP				: [ \r\t\n]+ -> skip;