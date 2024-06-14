grammar FracLang;

program: (stat ';')* EOF;

stat:   'display' expr #statDisplay
        | ID '<=' expr #statGetVarname
        ;

expr:    NUMBER '/' NUMBER    #ExprFRACTION
        | sign=('-' | '+') expr #ExprUnary
        | NUMBER    #ExprNumber
        | ID        #ExprID
        | expr op=('*' | ':') expr #ExprMulDiv
        | expr op=('+' | '-') expr #ExprSumSub
        | '(' expr ')'             #ExprParent
        | 'read' ASPAS             #ExprAspa
        | 'reduce' expr            #ExprReduce
        ;


ID: [a-z]+;
NUMBER :[0-9]+;
COMMENTS: '--' .*? '\n' -> skip;
ASPAS: '"' .*? '"';
WS: [ \t\r\n] -> skip;
