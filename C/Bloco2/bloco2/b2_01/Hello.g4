grammar Hello;
greetings : 'hello' ID;
ID : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;