// Alfredo Hinojosa Huerta & Luis Juan Sanchez Padilla
grammar MadBasic;


// Rules
madbasic        :	PROGRAM ID SEMICOLON program;
program 		:	a b c main;
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
					| call SEMICOLON
					;
procedure 		:	VOID ID OPARENTHESIS k CPARENTHESIS OBRACE block CBRACE;
function 		:	type ID OPARENTHESIS k CPARENTHESIS OBRACE block retorno CBRACE;
reference 		:	TILDE;
assignment 		: 	identifier EQUAL o SEMICOLON;
o 				: 	expression
					| read
					;
condition 		: 	IF OPARENTHESIS expression CPARENTHESIS OBRACE l CBRACE p;
p 				:	ELSE OBRACE l CBRACE #pElse
					| #pEmpty// empty
					;
loop 			: 	WHILE OPARENTHESIS expression CPARENTHESIS OBRACE l CBRACE;
write 			: 	PRINT OPARENTHESIS exp q CPARENTHESIS SEMICOLON;
q 				:	CARET exp q
					| // empty
					;
call 			:	identifier OPARENTHESIS r CPARENTHESIS;
r 				:	args
					| // empty
					;
block 			:	b l;
retorno 			: 	RETURN expression SEMICOLON;
identifier 		: 	ID ss s;
s 				:	DOT ID ss
                    | DOT INIT //todo esto no debe estar aqui, mas como en call?
					| // empty
					;
ss              :   OBRACKET exp CBRACKET
                    | //empty
                    ;
expression 		: 	comparison t;
t 				:	u comparison
					| // empty
					;
u 				: AND #uAnd
				  | OR #uOr
				  ;
read 			: READ;
exp 			: term v;
v 				:	w term v
					| // empty
					;
w 				: PLUS #wPlus
				  | MINUS #wMinus
				  ;
args 			: m exp x;
x 				:	COMMA m exp x
					| // empty
					;
comparison		: exp y;
y 				:	z exp
					| // empty
					;
z 				:	GREATER zz #zGreater
					| LESSER zz #zLesser
					| EQUAL EQUAL #zEqualEqual
					| DIFFERENT #zDifferent
					| #zwtf// empty todo empty aqui?
					;
zz              : EQUAL #zzEqual
                    | #zzEmpty//empty
                    ;
term 			: 	factor aa;
aa 				:	ab factor aa
					| // empty
					;
ab				: 	MULTIPLICATION #abMultiplication
					| DIVISION #abDivision
					;
factor 			: OPARENTHESIS expression CPARENTHESIS #factorExpression
				  | ac value #factorValue
				  ;
ac 				:	PLUS #acPlus
					| MINUS #acMinus
					| #acEmpty// empty
					;
value 			: identifier # valueIdentifier
				  | CTEI # valueInt
				  | CTEF # valueFloat
				  | CTESTRING # valueString
				  | TRUE # valueBool
				  | FALSE # valueBool
				  | call # valueCall
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