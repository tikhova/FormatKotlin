grammar SimpleFunction;

func: header exprsBlock ;

header: FUN NAME LBRACKET args? RBRACKET typeIndicator? ;

typeIndicator: COLON TYPE;

args: (argumentWithComma)* argument;

argument: NAME typeIndicator ;

argumentWithComma: argument COMMA ;

exprsBlock: CURLY_LBRACKET exprs CURLY_RBRACKET ;

exprs: expr* ;

expr: returnStatement |
      ifExpression |
      assignment |
      functionCall |
      printExpression |
      cycle ;

calculation : value OPERATOR calculation ;

assignment: NAME typeIndicator? EQUALITY assignmentExpr ;

assignmentExpr: functionCall | value ;

functionCall: NAME LBRACKET vals RBRACKET ;

vals: valueWithComma* value ;

valueWithComma: value COMMA ;

value: NAME | STR ;

cycle: forCycle | whileCycle | doWhileCycle ;

forCycle: FOR LBRACKET NAME typeIndicator? IN NAME RBRACKET exprsBlock ;

whileCycle: WHILE LBRACKET logicExpr? RBRACKET exprsBlock ;

doWhileCycle: DO exprsBlock WHILE LBRACKET logicExpr? RBRACKET;

returnStatement: RETURN value ;

ifExpression: ifCond exprsBlock (ELSE exprsBlock)? ;

printExpression: PRINT_FUN LBRACKET value RBRACKET;

ifCond: IF LBRACKET logicExpr RBRACKET ;

logicExpr: logicAtom | logicAtom LOGICAL_OPERATOR logicExpr | LBRACKET logicExpr RBRACKET ;

logicAtom: NAME | NOT NAME | LOGICAL_VALUE ;

// LEXER

NOT: '!' ;

COMMA: ',' ;

COLON: ':' ;

LBRACKET: '(' ;

RBRACKET: ')' ;

CURLY_LBRACKET: '{' ;

CURLY_RBRACKET: '}' ;

EQUALITY: '=' ;

VARIABLE_TYPE: 'val' | 'var' ;

LOGICAL_VALUE: 'true' | 'false' ;

LOGICAL_OPERATOR: '||' | '&&' ;

OPERATOR : '+' | '-' | '*' | '/' ;

TYPE:
    'Byte' |
    'Short' |
    'Int' |
    'Long' |
    'Float' |
    'Double' |
    'Char' ;

FUN: 'fun' ;

FOR: 'for' ;

ELSE: 'else' ;

IN: 'in' ;

IF: 'if' ;

WHILE: 'while' ;

DO: 'do' ;

PRINT_FUN: 'print' | 'println' ;

RETURN: 'return' ;

NAME: [a-z]([a-zA-Z0-9])* ;

STR: '"' (~["\\])* '"' ;

EPS: /* epsilon */  ;

WS : [ \t\r\n]+ -> skip ;