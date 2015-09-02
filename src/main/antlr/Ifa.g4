grammar Ifa;

@header {
package name.bpdp.vastix.jifa.generated;
}

r   : 'hello' ID;
ID  : [a-z]+ ;
WS  : [ \t\r\n]+ -> skip ;
