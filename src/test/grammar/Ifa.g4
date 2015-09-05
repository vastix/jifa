grammar Ifa;

//@header {
//package name.bpdp.vastix.jifa.generated;
//}

stat    
    : (force '(' propositional+ ')')+ EOF
    ;

// Illocutionary force - based on Searle's theory 
force
    : representatives
    | directives
    | commissives
    | expressives
    | declaratives
    ;

representatives
    : 'ASSERT'
    | 'INFORM'
    ;

directives
    : 'REQUEST'
    ;

commissives
    : 'CONSENT'
    ;

expressives
    : 'APOLOGIZE'
    | 'THANK'
    | 'COMPLAIN'
    ;

declaratives
    : 'DECLARE'
    ;

// Propositional contents
propositional
    : url
    ;
//    : [a-zA-Z0-9.:/]+ ;

// taken from https://github.com/yaojingguo/antlr-url-grammar
url
    : scheme ':' hier_part
    ;

scheme
    : 'http'
    ;

hier_part
    : net_path ('?' query)? ('#' fragment_)?
    ;

net_path
    : '//' server (abs_path)?
    ;

abs_path
    : ('/' segment)+
    ;

segment
    : (pchar)+
    ;

pchar
    : escaped
    | unreserved
    | ':'
    | '@'
    | '&'
    | '='
    | '+'
    | '$'
    | ','
    ;

server
    : host (':' port)?
    ;

port
    : (DIGIT)+
    ;

host
    : hostname 
    | ipV4Address
    ;

hostname
    : (domainlabel '.')* toplabel
    ;

domainlabel
    : alphanum ((alphanum | '-')* alphanum)?
    ;

toplabel
    : ALPHA ((alphanum | '-')? alphanum)?
    ;

ipV4Address
    : (DIGIT)+ '.' (DIGIT)+ '.' (DIGIT)+ '.' (DIGIT)+
    ;

fragment_
    : (uric)*
    ;

query
    : param ('&' param)*
    ;

param
    : pname '=' pvalue
    ;

pname
    : (qc)+
    ;

pvalue
    : (qc)+
    ;

qc
    : escaped
    | Q_RESERVED
    | unreserved
    ;

uric
    : escaped
    | reserved
    | unreserved
    ;

unreserved
    : alphanum 
    | MARK
    ;

escaped
    : '%' hex hex
    ;

hex
    : DIGIT
    | HEX_LETTER
    ;

alphanum
    : DIGIT
    | ALPHA
    ;

reserved
    : Q_RESERVED 
    | '=' 
    | '&'
    ; 

Q_RESERVED
    : ';' 
    | '/' 
    | '?' 
    | ':' 
    | '@' 
    | '+' 
    | '$' 
    | ','
    ;

MARK
    : '-' 
    | '_' 
    | '.' 
    | '!' 
    | '~' 
    | '*' 
    | '\'' 
    | '(' 
    | ')'
    ;

DIGIT
    : '0'..'9'
    ;

ALPHA
    : 'a'..'z' 
    | 'A'..'Z' 
    ;

fragment HEX_LETTER
    : 'a'..'f' 
    | 'A'..'F'
    ;

WS  
    : [ \t\r\n]+ -> skip 
    ;
