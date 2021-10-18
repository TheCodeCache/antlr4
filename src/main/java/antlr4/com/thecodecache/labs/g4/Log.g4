/*
 * Grammar for Log Parsing
 */
grammar Log;
/*
 * Let's start by defining fragments which are reusable building blocks for lexer rules.
 */
fragment DIGIT : [0-9];
fragment TWODIGIT : DIGIT DIGIT;
fragment LETTER : [A-Za-z];
/*
 * Next, let's define the remaining lexer rules:
 */
DATE : TWODIGIT TWODIGIT '-' LETTER LETTER LETTER '-' TWODIGIT;
TIME : TWODIGIT ':' TWODIGIT ':' TWODIGIT;
TEXT   : LETTER+ ;
CRLF : '\r'? '\n' | '\r';
/*
 * With these building blocks in place, we can build parser rules for the basic structure:
 */
log : entry+;
entry : timestamp ' ' level ' ' message CRLF;
/*
 * And then we'll add the details for timestamp:
 */
timestamp : DATE ' ' TIME;
/*
 * For level:
 */
level : 'ERROR' | 'INFO' | 'DEBUG';
/*
 * For message;
 */
message : (TEXT | ' ')+;
