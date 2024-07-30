/*
 * generated by Xtext 2.35.0
 */
lexer grammar InternalUtilLexer;

@header {
package de.fraunhofer.ipa.deployment.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

LinuxOpertingSystem : 'LinuxOpertingSystem';

MacOSOpertingSystem : 'MacOSOpertingSystem';

AttributeKind : 'AttributeKind';

SelectionKind : 'SelectionKind';

Description : 'description:';

MaximumKind : 'MaximumKind';

MinimumKind : 'MinimumKind';

Properties : 'properties:';

Os_version : 'os_version';

Processor : 'Processor';

RangeKind : 'RangeKind';

Container : 'container';

Ethernet : 'Ethernet';

Os_name : 'os_name';

Debian : 'debian';

Ubuntu : 'ubuntu';

Value : 'value:';

Arm64 : 'arm64';

Focal : 'focal';

Jammy : 'jammy';

Kind : 'kind:';

Name : 'name:';

Type : 'type:';

Wlan : 'Wlan';

Usb : 'Usb';

X86 : 'x86';

HyphenMinus : '-';

fragment RULE_DIGIT : '0'..'9';

RULE_DOUBLE : (RULE_DIGIT*|'-' RULE_DIGIT*) ('.' RULE_DECINT*|('.' RULE_DIGIT*)? ('E'|'e') ('-'|'+')? RULE_DIGIT*);

RULE_DECINT : ('0'|'1'..'9' RULE_DIGIT*|'-' '0'..'9' RULE_DIGIT*);

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))*;

fragment RULE_INDENT : ;

fragment RULE_DEDENT : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
