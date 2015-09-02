grammar Ifa;

stat    
    : (force '(' Propositional+ ')')+ EOF
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
Propositional
    : [a-zA-Z0-9]+ ;

WS  : [ \t\r\n]+ -> skip ;
