grammar CsvTable;

file: hdr row+ EOF ;

hdr: row;

row: field (',' field)* '\r'? '\n' ;

field: TEXT 
    | STRING 
    | 
    ;

TEXT    : ~[,\n\r"]+ ;
STRING  : '"' ('""'|~'"')* '"' ;
WS      : [\t]+ -> skip ;