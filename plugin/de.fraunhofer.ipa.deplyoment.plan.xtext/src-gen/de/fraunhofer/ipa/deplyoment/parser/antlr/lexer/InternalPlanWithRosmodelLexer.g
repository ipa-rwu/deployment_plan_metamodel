/*
 * generated by Xtext 2.30.0
 */
lexer grammar InternalPlanWithRosmodelLexer;

@header {
package de.fraunhofer.ipa.deplyoment.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

DeploymentPlanWithRosModel : 'DeploymentPlanWithRosModel:';

ExecutionConfiguration : 'executionConfiguration:';

ProcessorArchitecture : 'ProcessorArchitecture';

SoftwareComponent : 'softwareComponent:';

DeploymentPlan : 'DeploymentPlan:';

HumbleROSDistro : 'HumbleROSDistro';

NoeticROSDistro : 'NoeticROSDistro';

AttributeKind : 'AttributeKind';

SelectionKind : 'SelectionKind';

StartCommand : 'startCommand:';

Description : 'description:';

MaximumKind : 'MaximumKind';

MinimumKind : 'MinimumKind';

Assignment : 'assignment:';

ExecutedBy : 'executedBy:';

Middleware : 'middleware:';

RangeKind : 'RangeKind';

DeployTo : 'deployTo:';

Ethernet : 'Ethernet';

X86_64 : 'X86_64';

Value : 'value:';

Arm64 : 'Arm64';

Linux : 'Linux';

MacOS : 'MacOS';

From : 'from:';

Kind : 'kind:';

Name : 'name:';

Wlan : 'Wlan';

To : 'to:';

HyphenMinus : '-';

Colon : ':';

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
