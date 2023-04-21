/*
 * generated by Xtext 2.30.0
 */
parser grammar InternalBaseParser;

options {
    tokenVocab=InternalBaseLexer;
    superClass=AbstractInternalAntlrParser;
}

@header {
package de.fraunhofer.ipa.targetEnvironment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.targetEnvironment.services.BaseGrammarAccess;

}

@members {

    private BaseGrammarAccess grammarAccess;

    public InternalBaseParser(TokenStream input, BaseGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
        return "Description";
    }

    @Override
    protected BaseGrammarAccess getGrammarAccess() {
        return grammarAccess;
    }

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDescription
entryRuleDescription returns [EObject current=null]:
    { newCompositeNode(grammarAccess.getDescriptionRule()); }
    iv_ruleDescription=ruleDescription
    { $current=$iv_ruleDescription.current; }
    EOF;

// Rule Description
ruleDescription returns [EObject current=null]
@init {
    enterRule();
}
@after {
    leaveRule();
}:
    (
        {
            $current = forceCreateModelElement(
                grammarAccess.getDescriptionAccess().getDescriptionAction(),
                $current);
        }
    )
;

// Entry rule entryRulePropertyValueInt
entryRulePropertyValueInt returns [EObject current=null]:
    { newCompositeNode(grammarAccess.getPropertyValueIntRule()); }
    iv_rulePropertyValueInt=rulePropertyValueInt
    { $current=$iv_rulePropertyValueInt.current; }
    EOF;

// Rule PropertyValueInt
rulePropertyValueInt returns [EObject current=null]
@init {
    enterRule();
}
@after {
    leaveRule();
}:
    (
        (
            {
                newCompositeNode(grammarAccess.getPropertyValueIntAccess().getValueInteger0ParserRuleCall_0());
            }
            lv_value_0_0=ruleInteger0
            {
                if ($current==null) {
                    $current = createModelElementForParent(grammarAccess.getPropertyValueIntRule());
                }
                set(
                    $current,
                    "value",
                    lv_value_0_0,
                    "de.fraunhofer.ipa.targetEnvironment.Base.Integer0");
                afterParserOrEnumRuleCall();
            }
        )
    )
;

// Entry rule entryRulePropertyValueDouble
entryRulePropertyValueDouble returns [EObject current=null]:
    { newCompositeNode(grammarAccess.getPropertyValueDoubleRule()); }
    iv_rulePropertyValueDouble=rulePropertyValueDouble
    { $current=$iv_rulePropertyValueDouble.current; }
    EOF;

// Rule PropertyValueDouble
rulePropertyValueDouble returns [EObject current=null]
@init {
    enterRule();
}
@after {
    leaveRule();
}:
    (
        (
            {
                newCompositeNode(grammarAccess.getPropertyValueDoubleAccess().getValueDouble0ParserRuleCall_0());
            }
            lv_value_0_0=ruleDouble0
            {
                if ($current==null) {
                    $current = createModelElementForParent(grammarAccess.getPropertyValueDoubleRule());
                }
                set(
                    $current,
                    "value",
                    lv_value_0_0,
                    "de.fraunhofer.ipa.targetEnvironment.Base.Double0");
                afterParserOrEnumRuleCall();
            }
        )
    )
;

// Entry rule entryRulePropertyValueString
entryRulePropertyValueString returns [EObject current=null]:
    { newCompositeNode(grammarAccess.getPropertyValueStringRule()); }
    iv_rulePropertyValueString=rulePropertyValueString
    { $current=$iv_rulePropertyValueString.current; }
    EOF;

// Rule PropertyValueString
rulePropertyValueString returns [EObject current=null]
@init {
    enterRule();
}
@after {
    leaveRule();
}:
    (
        (
            {
                newCompositeNode(grammarAccess.getPropertyValueStringAccess().getValueEStringParserRuleCall_0());
            }
            lv_value_0_0=ruleEString
            {
                if ($current==null) {
                    $current = createModelElementForParent(grammarAccess.getPropertyValueStringRule());
                }
                set(
                    $current,
                    "value",
                    lv_value_0_0,
                    "de.fraunhofer.ipa.targetEnvironment.Base.EString");
                afterParserOrEnumRuleCall();
            }
        )
    )
;

// Entry rule entryRuleDouble0
entryRuleDouble0 returns [String current=null]:
    { newCompositeNode(grammarAccess.getDouble0Rule()); }
    iv_ruleDouble0=ruleDouble0
    { $current=$iv_ruleDouble0.current.getText(); }
    EOF;

// Rule Double0
ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
    enterRule();
}
@after {
    leaveRule();
}:
    this_DOUBLE_0=RULE_DOUBLE
    {
        $current.merge(this_DOUBLE_0);
    }
    {
        newLeafNode(this_DOUBLE_0, grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());
    }
;

// Entry rule entryRuleInteger0
entryRuleInteger0 returns [String current=null]:
    { newCompositeNode(grammarAccess.getInteger0Rule()); }
    iv_ruleInteger0=ruleInteger0
    { $current=$iv_ruleInteger0.current.getText(); }
    EOF;

// Rule Integer0
ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
    enterRule();
}
@after {
    leaveRule();
}:
    this_DECINT_0=RULE_DECINT
    {
        $current.merge(this_DECINT_0);
    }
    {
        newLeafNode(this_DECINT_0, grammarAccess.getInteger0Access().getDECINTTerminalRuleCall());
    }
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
    { newCompositeNode(grammarAccess.getEStringRule()); }
    iv_ruleEString=ruleEString
    { $current=$iv_ruleEString.current.getText(); }
    EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
    enterRule();
}
@after {
    leaveRule();
}:
    (
        this_STRING_0=RULE_STRING
        {
            $current.merge(this_STRING_0);
        }
        {
            newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
        }
            |
        this_ID_1=RULE_ID
        {
            $current.merge(this_ID_1);
        }
        {
            newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
        }
    )
;
