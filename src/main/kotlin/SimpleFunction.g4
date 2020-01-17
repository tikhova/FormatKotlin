grammar SimpleFunction;

func: header NEWLINE? exprsBlock ;

header: FUN NEWLINE? NAME NEWLINE? LBRACKET NEWLINE? args? NEWLINE? RBRACKET NEWLINE? typeIndicator? ;

typeIndicator: COLON NEWLINE? TYPE ;

args: argumentWithComma* argument;

argument: NAME NEWLINE? typeIndicator ;

argumentWithComma: argument NEWLINE? COMMA NEWLINE?;

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

ifExpression: ifCond NEWLINE? exprsBlock NEWLINE? (ELSE NEWLINE? exprsBlock)? ;

ifCond: IF NEWLINE? LBRACKET NEWLINE? logicExpr NEWLINE? RBRACKET ;

logicExpr: logicAtom | logicAtom NEWLINE? LOGICAL_OPERATOR NEWLINE? logicExpr | LBRACKET NEWLINE? logicExpr NEWLINE? RBRACKET ;

logicAtom: NAME | NOT NEWLINE? logicExpr | LOGICAL_VALUE ;

// ASSIGNMENT

assignment: NAME NEWLINE? assignmentOperator NEWLINE? assignableVal ;

assignmentOperator: EQUAL | '+=' | '-=' ;

// DEFINITION

definition : VARIABLE_TYPE NEWLINE? NAME NEWLINE? typeIndicator? NEWLINE? EQUAL NEWLINE? assignableVal ;

// FUNCTION CALL

functionCall: NAME LBRACKET NEWLINE? vals? NEWLINE? RBRACKET ;

// PRINT EXPRESSION

printExpression: PRINT_FUN LBRACKET NEWLINE? value NEWLINE? RBRACKET ;

// CYCLES

cycle: forCycle | whileCycle | doWhileCycle ;

forCycle: FOR NEWLINE? LBRACKET NEWLINE? NAME NEWLINE? typeIndicator? NEWLINE? IN NEWLINE? NAME NEWLINE? RBRACKET NEWLINE? exprsBlock ;

whileCycle: WHILE NEWLINE? LBRACKET NEWLINE? logicExpr? NEWLINE? RBRACKET NEWLINE? exprsBlock ;

doWhileCycle: DO NEWLINE? exprsBlock NEWLINE? WHILE NEWLINE? LBRACKET NEWLINE? logicExpr? NEWLINE? RBRACKET ;

// VALUES

vals: valueWithComma* assignableVal ;

valueWithComma: assignableVal NEWLINE? COMMA NEWLINE?;

assignableVal: value | calculation ;

calculation : value | value NEWLINE? OPERATOR NEWLINE? calculation | LBRACKET NEWLINE? calculation NEWLINE? RBRACKET ;

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