grammar Vector;

program: (stat ';')* EOF;

stat:   'show' expr          #statementshow
        | expr '->' ID             #statID
        ;

expr:   ID                            #ExprID
        | op=('+' | '-') expr #ExprUnary
        | VECTOR                      #ExprVector
        | NUMBER                      #ExprNumber
        | expr '*' expr     #ExprMulDiv
        | expr op=('+' | '-') expr    #ExprAddSub
        | '(' expr ')'                #ExprParan
        | expr '.' expr               #ExprEscalar
        ;

VECTOR: '[' NUMBER  (',' NUMBER)* ']';
NUMBER: FLOAT | INT;
FLOAT: [0-9]+ '.' [0-9]+;
INT: [0-9]+;
ID: [a-z][a-z0-9]*;
Comments: '#' .*? ('\n'|EOF)  -> skip; 
WS: [ \t\r\n]+ -> skip;
