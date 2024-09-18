grammar StrLang;

program: statement* EOF;

statement: 
        'print' expr            # print
        | ID ':' expr           # Assign
        ;

expr:
        expr op=('+'|'-') expr     # expr_concatenate_remove
        | 'trim' expr           # expr_trim
        | ID                    # expr_printID
        | '(' expr ')'          # expr_paren
        | 'input' '(' expr ')'  # expr_input
        | expr '/' expr '/' expr # expr_substitue
        | QUOTES                # expr_quotes
        ;

ID:[a-zA-Z0-9]+; 
QUOTES : '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' .*? '\n' -> skip;