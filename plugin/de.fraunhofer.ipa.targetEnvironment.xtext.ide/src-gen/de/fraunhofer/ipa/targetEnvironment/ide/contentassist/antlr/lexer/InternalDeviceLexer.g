/*
 * generated by Xtext 2.30.0
 */
lexer grammar InternalDeviceLexer;

@header {
package de.fraunhofer.ipa.targetEnvironment.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

CommunicationConnection : 'communicationConnection:';

ComputationDeviceType : 'ComputationDeviceType:';

Processor_architecture : 'processor_architecture';

LinuxOpertingSystem : 'LinuxOpertingSystem';

MacOSOpertingSystem : 'MacOSOpertingSystem';

ComputationResouce : 'computationResouce:';

DeviceResouce : 'deviceResouce:';

AttributeKind : 'AttributeKind';

SelectionKind : 'SelectionKind';

Description : 'description:';

DeviceType : 'DeviceType:';

MaximumKind : 'MaximumKind';

MinimumKind : 'MinimumKind';

Core_number : 'core_number';

Properties : 'properties:';

Os_version : 'os_version';

Processor : 'Processor';

RangeKind : 'RangeKind';

Container : 'container';

Interface : 'interface';

Ethernet : 'Ethernet';

Address : 'address';

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

HyphenMinusHyphenMinusHyphenMinus : '---';

X86 : 'x86';

HyphenMinus : '-';

fragment RULE_DIGIT : '0'..'9';

RULE_DOUBLE : RULE_DIGIT ('.' RULE_DECINT*|('.' RULE_DIGIT*)? ('E'|'e') ('-'|'+')? RULE_DIGIT);

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
