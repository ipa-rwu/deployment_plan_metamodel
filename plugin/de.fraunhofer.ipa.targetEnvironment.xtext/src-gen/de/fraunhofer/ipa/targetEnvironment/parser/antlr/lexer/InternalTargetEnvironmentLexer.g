/*
 * generated by Xtext 2.30.0
 */
lexer grammar InternalTargetEnvironmentLexer;

@header {
package de.fraunhofer.ipa.targetEnvironment.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

CommunicationConnection : 'communicationConnection:';

TargetDeployEnviroment : 'TargetDeployEnviroment:';

RefConnectionProperty : 'refConnectionProperty:';

ConfigConnection : 'configConnection:';

Configuration : 'configuration:';

ConnectDevice : 'connectDevice:';

IncludeDevice : 'includeDevice:';

RefConnection : 'refConnection:';

RefDeviceType : 'refDeviceType:';

AttributeKind : 'AttributeKind';

SelectionKind : 'SelectionKind';

DeviceType : 'DeviceType:';

MaximumKind : 'MaximumKind';

MinimumKind : 'MinimumKind';

Capability : 'capability:';

Properties : 'properties:';

RefDevice : 'refDevice:';

Value : 'value:';

Kind : 'kind:';

Name : 'name:';

Type : 'type:';

HyphenMinus : '-';

fragment RULE_DIGIT : '0'..'9';

RULE_BINARY : ('0b'|'0B') ('0'|'1')+;

RULE_BOOLEAN : ('true'|'false');

RULE_DOUBLE : RULE_DIGIT ('.' RULE_DECINT*|('.' RULE_DIGIT*)? ('E'|'e') ('-'|'+')? RULE_DIGIT);

RULE_DECINT : ('0'|'1'..'9' RULE_DIGIT*|'-' '0'..'9' RULE_DIGIT*);

fragment RULE_DAY : ('1'..'9'|'1'..'3' '0'..'9');

fragment RULE_MONTH : ('1'..'9'|'1' '0'..'2');

fragment RULE_YEAR : '0'..'2' '0'..'9' '0'..'9' '0'..'9';

fragment RULE_HOUR : ('0'..'1' '0'..'9'|'2' '0'..'3');

fragment RULE_MIN_SEC : '0'..'5' '0'..'9';

RULE_DATE_TIME : RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))*;

fragment RULE_INDENT : ;

fragment RULE_DEDENT : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;