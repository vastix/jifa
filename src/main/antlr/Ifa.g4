grammar Ifa;

@header {
package name.bpdp.vastix.jifa.generated;
}

stat   : 
    'hello' ID;
ID  : [a-z]+ ;
WS  : [ \t\r\n]+ -> skip ;
