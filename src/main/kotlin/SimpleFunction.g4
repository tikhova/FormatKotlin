grammar SimpleFunction;

func: header exprsBlock ;

header: FUN NAME LBRACKET args? RBRACKET typeIndicator? ;

typeIndicator: COLON TYPE ;

args: argumentWithComma* argument;

argument: NAME typeIndicator ;

argumentWithComma: argument COMMA ;

exprsBlock: CURLY_LBRACKET NEWLINE? exprs NEWLINE? CURLY_RBRACKET NEWLINE? ;

exprs: (expr NEWLINE)* expr ;

expr: returnStatement |
      ifExpression |
      assignment |
      definition |
      functionCall |
      printExpression |
      cycle ;

// RETURN STATEMENT

returnStatement: RETURN value ;

// IF EXPRESSION

ifExpression: ifCond exprsBlock NEWLINE? (ELSE exprsBlock)? ;

ifCond: IF LBRACKET logicExpr RBRACKET ;

logicExpr: logicAtom | logicAtom LOGICAL_OPERATOR logicExpr | LBRACKET logicExpr RBRACKET ;

logicAtom: NAME | NOT logicExpr | LOGICAL_VALUE ;

// ASSIGNMENT

assignment: NAME assignmentOperator assignableVal ;

assignmentOperator: EQUAL | '+=' | '-=' ;

// DEFINITION

definition : VARIABLE_TYPE NAME typeIndicator? EQUAL assignableVal ;

// FUNCTION CALL

functionCall: NAME LBRACKET vals? RBRACKET ;

// PRINT EXPRESSION

printExpression: PRINT_FUN LBRACKET value RBRACKET ;

// CYCLES

cycle: forCycle | whileCycle | doWhileCycle ;

forCycle: FOR LBRACKET NAME typeIndicator? IN NAME RBRACKET exprsBlock ;

whileCycle: WHILE LBRACKET logicExpr? RBRACKET exprsBlock ;

doWhileCycle: DO exprsBlock WHILE LBRACKET logicExpr? RBRACKET ;

// VALUES

vals: valueWithComma* assignableVal ;

valueWithComma: assignableVal COMMA ;

assignableVal: value | calculation ;

calculation : value | value OPERATOR calculation | LBRACKET calculation RBRACKET ;

value: NAME | NUMBER | STR | functionCall | logicExpr ;

// LEXER

NOT: '!' ;

COMMA: ',' ;

COLON: ':' ;

LBRACKET: '(' ;

RBRACKET: ')' ;

CURLY_LBRACKET: '{' ;

CURLY_RBRACKET: '}' ;

EQUAL: '=' ;

VARIABLE_TYPE: 'val' | 'var' ;

LOGICAL_VALUE: 'true' | 'false';

LOGICAL_OPERATOR: '||' | '&&' ;

OPERATOR : '+' | '-' | '*' | '/' ;

TYPE:
    'Byte' |
    'Short' |
    'Int' |
    'Long' |
    'Char' |
    'String' |
    'Boolean' ;

FUN: 'fun' ;

FOR: 'for' ;

ELSE: 'else' ;

IN: 'in' ;

IF: 'if' ;

WHILE: 'while' ;

DO: 'do' ;

PRINT_FUN: 'print' | 'println' ;

RETURN: 'return' ;

NAME: [a-z][a-zA-Z0-9]* ;

NUMBER: '0' | [1-9][0-9]* ;

STR: '"' (~["\\])* '"' ;

EPS: /* epsilon */  ;

WS : [ \t\r]+ -> skip ;

NEWLINE : '\n'+;