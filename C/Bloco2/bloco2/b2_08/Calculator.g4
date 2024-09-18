grammar Calculator;

program:
    stat* EOF;
stat:
    (expr | assignment)? NEWLINE;
assignment: 
    ID '=' expr;
expr:
    expr op=('*'|'/'|'%') expr # ExprMultDivMod
    | expr op=('+'|'-') expr   # ExprAddSub
    | Integer                  # ExprIntefer
    | '(' expr ')'             # ExprParent
    | ID                       # ExprID
    ;

Integer: [0-9]+;
ID: [a-zA-Z_]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;