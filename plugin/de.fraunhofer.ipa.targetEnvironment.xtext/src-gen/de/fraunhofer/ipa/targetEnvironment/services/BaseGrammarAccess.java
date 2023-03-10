/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BaseGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.Description");
		private final Action cDescriptionAction = (Action)rule.eContents().get(1);
		
		//Description returns Description:
		//    {Description}
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Description}
		public Action getDescriptionAction() { return cDescriptionAction; }
	}
	public class PropertyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.PropertyValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPropertyValueIntParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPropertyValueDoubleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPropertyValueStringParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//PropertyValue returns PropertyValue:
		//    PropertyValueInt | PropertyValueDouble | PropertyValueString;
		@Override public ParserRule getRule() { return rule; }
		
		//PropertyValueInt | PropertyValueDouble | PropertyValueString
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PropertyValueInt
		public RuleCall getPropertyValueIntParserRuleCall_0() { return cPropertyValueIntParserRuleCall_0; }
		
		//PropertyValueDouble
		public RuleCall getPropertyValueDoubleParserRuleCall_1() { return cPropertyValueDoubleParserRuleCall_1; }
		
		//PropertyValueString
		public RuleCall getPropertyValueStringParserRuleCall_2() { return cPropertyValueStringParserRuleCall_2; }
	}
	public class PropertyValueIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.PropertyValueInt");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueInteger0ParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//PropertyValueInt returns PropertyValueInt:
		//    value=Integer0;
		@Override public ParserRule getRule() { return rule; }
		
		//value=Integer0
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//Integer0
		public RuleCall getValueInteger0ParserRuleCall_0() { return cValueInteger0ParserRuleCall_0; }
	}
	public class PropertyValueDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.PropertyValueDouble");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueDouble0ParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//PropertyValueDouble returns PropertyValueDouble:
		//    value=Double0
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value=Double0
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//Double0
		public RuleCall getValueDouble0ParserRuleCall_0() { return cValueDouble0ParserRuleCall_0; }
	}
	public class PropertyValueStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.PropertyValueString");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEStringParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//PropertyValueString returns PropertyValueString:
		//    value=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//value=EString
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//EString
		public RuleCall getValueEStringParserRuleCall_0() { return cValueEStringParserRuleCall_0; }
	}
	public class Base64BinaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.Base64Binary");
		private final RuleCall cBINARYTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Base64Binary returns type::Base64Binary:
		//    BINARY ;
		@Override public ParserRule getRule() { return rule; }
		
		//BINARY
		public RuleCall getBINARYTerminalRuleCall() { return cBINARYTerminalRuleCall; }
	}
	public class Boolean0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.boolean0");
		private final RuleCall cBOOLEANTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//boolean0 returns type::Boolean:
		//    BOOLEAN;
		@Override public ParserRule getRule() { return rule; }
		
		//BOOLEAN
		public RuleCall getBOOLEANTerminalRuleCall() { return cBOOLEANTerminalRuleCall; }
	}
	public class Double0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.Double0");
		private final RuleCall cDOUBLETerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Double0 returns type::Double:
		//    DOUBLE;
		@Override public ParserRule getRule() { return rule; }
		
		//DOUBLE
		public RuleCall getDOUBLETerminalRuleCall() { return cDOUBLETerminalRuleCall; }
	}
	public class Integer0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.Integer0");
		private final RuleCall cDECINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Integer0 returns type::Int:
		//    DECINT;
		@Override public ParserRule getRule() { return rule; }
		
		//DECINT
		public RuleCall getDECINTTerminalRuleCall() { return cDECINTTerminalRuleCall; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class PreListElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.PreListElement");
		private final Keyword cHyphenMinusKeyword = (Keyword)rule.eContents().get(1);
		
		//PreListElement hidden(SL_COMMENT):
		//  '-';
		@Override public ParserRule getRule() { return rule; }
		
		//'-'
		public Keyword getHyphenMinusKeyword() { return cHyphenMinusKeyword; }
	}
	
	
	private final DescriptionElements pDescription;
	private final PropertyValueElements pPropertyValue;
	private final PropertyValueIntElements pPropertyValueInt;
	private final PropertyValueDoubleElements pPropertyValueDouble;
	private final PropertyValueStringElements pPropertyValueString;
	private final TerminalRule tDIGIT;
	private final TerminalRule tBINARY;
	private final TerminalRule tBOOLEAN;
	private final TerminalRule tDOUBLE;
	private final TerminalRule tDECINT;
	private final TerminalRule tDAY;
	private final TerminalRule tMONTH;
	private final TerminalRule tYEAR;
	private final TerminalRule tHOUR;
	private final TerminalRule tMIN_SEC;
	private final TerminalRule tDATE_TIME;
	private final Base64BinaryElements pBase64Binary;
	private final Boolean0Elements pBoolean0;
	private final Double0Elements pDouble0;
	private final Integer0Elements pInteger0;
	private final EStringElements pEString;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tINDENT;
	private final TerminalRule tDEDENT;
	private final PreListElementElements pPreListElement;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BaseGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDescription = new DescriptionElements();
		this.pPropertyValue = new PropertyValueElements();
		this.pPropertyValueInt = new PropertyValueIntElements();
		this.pPropertyValueDouble = new PropertyValueDoubleElements();
		this.pPropertyValueString = new PropertyValueStringElements();
		this.tDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.DIGIT");
		this.tBINARY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.BINARY");
		this.tBOOLEAN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.BOOLEAN");
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.DOUBLE");
		this.tDECINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.DECINT");
		this.tDAY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.DAY");
		this.tMONTH = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.MONTH");
		this.tYEAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.YEAR");
		this.tHOUR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.HOUR");
		this.tMIN_SEC = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.MIN_SEC");
		this.tDATE_TIME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.DATE_TIME");
		this.pBase64Binary = new Base64BinaryElements();
		this.pBoolean0 = new Boolean0Elements();
		this.pDouble0 = new Double0Elements();
		this.pInteger0 = new Integer0Elements();
		this.pEString = new EStringElements();
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.SL_COMMENT");
		this.tINDENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.INDENT");
		this.tDEDENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.targetEnvironment.Base.DEDENT");
		this.pPreListElement = new PreListElementElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.fraunhofer.ipa.targetEnvironment.Base".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Description returns Description:
	//    {Description}
	//;
	public DescriptionElements getDescriptionAccess() {
		return pDescription;
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}
	
	//PropertyValue returns PropertyValue:
	//    PropertyValueInt | PropertyValueDouble | PropertyValueString;
	public PropertyValueElements getPropertyValueAccess() {
		return pPropertyValue;
	}
	
	public ParserRule getPropertyValueRule() {
		return getPropertyValueAccess().getRule();
	}
	
	//PropertyValueInt returns PropertyValueInt:
	//    value=Integer0;
	public PropertyValueIntElements getPropertyValueIntAccess() {
		return pPropertyValueInt;
	}
	
	public ParserRule getPropertyValueIntRule() {
		return getPropertyValueIntAccess().getRule();
	}
	
	//PropertyValueDouble returns PropertyValueDouble:
	//    value=Double0
	//;
	public PropertyValueDoubleElements getPropertyValueDoubleAccess() {
		return pPropertyValueDouble;
	}
	
	public ParserRule getPropertyValueDoubleRule() {
		return getPropertyValueDoubleAccess().getRule();
	}
	
	//PropertyValueString returns PropertyValueString:
	//    value=EString;
	public PropertyValueStringElements getPropertyValueStringAccess() {
		return pPropertyValueString;
	}
	
	public ParserRule getPropertyValueStringRule() {
		return getPropertyValueStringAccess().getRule();
	}
	
	//terminal DIGIT: '0'..'9';
	public TerminalRule getDIGITRule() {
		return tDIGIT;
	}
	
	//terminal BINARY: ('0b'|'0B')('0'|'1')+;
	public TerminalRule getBINARYRule() {
		return tBINARY;
	}
	
	//terminal BOOLEAN: 'true'|'false';
	public TerminalRule getBOOLEANRule() {
		return tBOOLEAN;
	}
	
	//terminal DOUBLE returns ecore::EDouble: DIGIT (('.' DECINT*) | (('.' DIGIT*)? ('E'|'e') ('-'|'+')? DIGIT));
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//  // Use terminal to avoid 'e' turning into a keyword
	//terminal DECINT: '0' | ('1'..'9' DIGIT*) | ('-''0'..'9' DIGIT*) ;
	public TerminalRule getDECINTRule() {
		return tDECINT;
	}
	
	//terminal DAY:'1'..'9' | '1'..'3' '0'..'9';
	public TerminalRule getDAYRule() {
		return tDAY;
	}
	
	//terminal MONTH:'1'..'9' | '1' '0'..'2';
	public TerminalRule getMONTHRule() {
		return tMONTH;
	}
	
	//terminal YEAR:'0'..'2' '0'..'9' '0'..'9' '0'..'9';
	public TerminalRule getYEARRule() {
		return tYEAR;
	}
	
	//terminal HOUR: ('0'..'1')('0'..'9') | ('2')('0'..'3');
	public TerminalRule getHOURRule() {
		return tHOUR;
	}
	
	//terminal MIN_SEC:('0'..'5')('0'..'9');
	public TerminalRule getMIN_SECRule() {
		return tMIN_SEC;
	}
	
	//terminal DATE_TIME: YEAR'-'MONTH'-'DAY'T'HOUR':'MIN_SEC':'MIN_SEC;
	public TerminalRule getDATE_TIMERule() {
		return tDATE_TIME;
	}
	
	//Base64Binary returns type::Base64Binary:
	//    BINARY ;
	public Base64BinaryElements getBase64BinaryAccess() {
		return pBase64Binary;
	}
	
	public ParserRule getBase64BinaryRule() {
		return getBase64BinaryAccess().getRule();
	}
	
	//boolean0 returns type::Boolean:
	//    BOOLEAN;
	public Boolean0Elements getBoolean0Access() {
		return pBoolean0;
	}
	
	public ParserRule getBoolean0Rule() {
		return getBoolean0Access().getRule();
	}
	
	//Double0 returns type::Double:
	//    DOUBLE;
	public Double0Elements getDouble0Access() {
		return pDouble0;
	}
	
	public ParserRule getDouble0Rule() {
		return getDouble0Access().getRule();
	}
	
	//Integer0 returns type::Int:
	//    DECINT;
	public Integer0Elements getInteger0Access() {
		return pInteger0;
	}
	
	public ParserRule getInteger0Rule() {
		return getInteger0Access().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//@Override
	//terminal SL_COMMENT: '#' !('\n'|'\r')*;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal INDENT: 'synthetic:INDENT';
	public TerminalRule getINDENTRule() {
		return tINDENT;
	}
	
	//terminal DEDENT: 'synthetic:DEDENT';
	public TerminalRule getDEDENTRule() {
		return tDEDENT;
	}
	
	//PreListElement hidden(SL_COMMENT):
	//  '-';
	public PreListElementElements getPreListElementAccess() {
		return pPreListElement;
	}
	
	public ParserRule getPreListElementRule() {
		return getPreListElementAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
