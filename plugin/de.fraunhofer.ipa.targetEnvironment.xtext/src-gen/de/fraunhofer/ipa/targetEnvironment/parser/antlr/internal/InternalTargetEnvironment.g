/*
 * generated by Xtext 2.30.0
 */
grammar InternalTargetEnvironment;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.fraunhofer.ipa.targetEnvironment.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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
import de.fraunhofer.ipa.targetEnvironment.services.TargetEnvironmentGrammarAccess;

}

@parser::members {

 	private TargetEnvironmentGrammarAccess grammarAccess;

    public InternalTargetEnvironmentParser(TokenStream input, TargetEnvironmentGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TargetEnviroment";
   	}

   	@Override
   	protected TargetEnvironmentGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTargetEnviroment
entryRuleTargetEnviroment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetEnviromentRule()); }
	iv_ruleTargetEnviroment=ruleTargetEnviroment
	{ $current=$iv_ruleTargetEnviroment.current; }
	EOF;

// Rule TargetEnviroment
ruleTargetEnviroment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTargetEnviromentAccess().getTargetEnviromentAction_0(),
					$current);
			}
		)
		otherlv_1='TargetEnviroment'
		{
			newLeafNode(otherlv_1, grammarAccess.getTargetEnviromentAccess().getTargetEnviromentKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetEnviromentAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetEnviromentRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getTargetEnviromentAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='includeDevice'
			{
				newLeafNode(otherlv_4, grammarAccess.getTargetEnviromentAccess().getIncludeDeviceKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getTargetEnviromentAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTargetEnviromentAccess().getIncludeDeviceDeviceInstanceParserRuleCall_4_2_0());
					}
					lv_includeDevice_6_0=ruleDeviceInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTargetEnviromentRule());
						}
						add(
							$current,
							"includeDevice",
							lv_includeDevice_6_0,
							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.DeviceInstance");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getTargetEnviromentAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTargetEnviromentAccess().getIncludeDeviceDeviceInstanceParserRuleCall_4_3_1_0());
						}
						lv_includeDevice_8_0=ruleDeviceInstance
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTargetEnviromentRule());
							}
							add(
								$current,
								"includeDevice",
								lv_includeDevice_8_0,
								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.DeviceInstance");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getTargetEnviromentAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_10='configConnection'
			{
				newLeafNode(otherlv_10, grammarAccess.getTargetEnviromentAccess().getConfigConnectionKeyword_5_0());
			}
			otherlv_11='{'
			{
				newLeafNode(otherlv_11, grammarAccess.getTargetEnviromentAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTargetEnviromentAccess().getConfigConnectionConfigConnectionParserRuleCall_5_2_0());
					}
					lv_configConnection_12_0=ruleConfigConnection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTargetEnviromentRule());
						}
						add(
							$current,
							"configConnection",
							lv_configConnection_12_0,
							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConfigConnection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getTargetEnviromentAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTargetEnviromentAccess().getConfigConnectionConfigConnectionParserRuleCall_5_3_1_0());
						}
						lv_configConnection_14_0=ruleConfigConnection
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTargetEnviromentRule());
							}
							add(
								$current,
								"configConnection",
								lv_configConnection_14_0,
								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConfigConnection");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_15='}'
			{
				newLeafNode(otherlv_15, grammarAccess.getTargetEnviromentAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getTargetEnviromentAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleConnection
entryRuleConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectionRule()); }
	iv_ruleConnection=ruleConnection
	{ $current=$iv_ruleConnection.current; }
	EOF;

// Rule Connection
ruleConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConnectionAccess().getIndirectConnectionParserRuleCall_0());
		}
		this_IndirectConnection_0=ruleIndirectConnection
		{
			$current = $this_IndirectConnection_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConnectionAccess().getDirectConnectionParserRuleCall_1());
		}
		this_DirectConnection_1=ruleDirectConnection
		{
			$current = $this_DirectConnection_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCapabilityKind
entryRuleCapabilityKind returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCapabilityKindRule()); }
	iv_ruleCapabilityKind=ruleCapabilityKind
	{ $current=$iv_ruleCapabilityKind.current; }
	EOF;

// Rule CapabilityKind
ruleCapabilityKind returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCapabilityKindAccess().getAttributeKindParserRuleCall_0());
		}
		this_AttributeKind_0=ruleAttributeKind
		{
			$current = $this_AttributeKind_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCapabilityKindAccess().getMaximumKindParserRuleCall_1());
		}
		this_MaximumKind_1=ruleMaximumKind
		{
			$current = $this_MaximumKind_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCapabilityKindAccess().getMinimumKindParserRuleCall_2());
		}
		this_MinimumKind_2=ruleMinimumKind
		{
			$current = $this_MinimumKind_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCapabilityKindAccess().getSelectionKindParserRuleCall_3());
		}
		this_SelectionKind_3=ruleSelectionKind
		{
			$current = $this_SelectionKind_3.current;
			afterParserOrEnumRuleCall();
		}
	)
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

// Entry rule entryRuleDeviceInstance
entryRuleDeviceInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeviceInstanceRule()); }
	iv_ruleDeviceInstance=ruleDeviceInstance
	{ $current=$iv_ruleDeviceInstance.current; }
	EOF;

// Rule DeviceInstance
ruleDeviceInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DeviceInstance'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeviceInstanceAccess().getDeviceInstanceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeviceInstanceAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeviceInstanceRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDeviceInstanceAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='refDeviceType'
		{
			newLeafNode(otherlv_3, grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeviceInstanceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getDeviceInstanceAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleConfigConnection
entryRuleConfigConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigConnectionRule()); }
	iv_ruleConfigConnection=ruleConfigConnection
	{ $current=$iv_ruleConfigConnection.current; }
	EOF;

// Rule ConfigConnection
ruleConfigConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ConfigConnection'
		{
			newLeafNode(otherlv_0, grammarAccess.getConfigConnectionAccess().getConfigConnectionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigConnectionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigConnectionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConfigConnectionAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='connectDevice'
		{
			newLeafNode(otherlv_3, grammarAccess.getConfigConnectionAccess().getConnectDeviceKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getConfigConnectionAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigConnectionAccess().getConnectDeviceConnectedDeviceParserRuleCall_5_0());
				}
				lv_connectDevice_5_0=ruleConnectedDevice
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigConnectionRule());
					}
					add(
						$current,
						"connectDevice",
						lv_connectDevice_5_0,
						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConnectedDevice");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getConfigConnectionAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigConnectionAccess().getConnectDeviceConnectedDeviceParserRuleCall_6_1_0());
					}
					lv_connectDevice_7_0=ruleConnectedDevice
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigConnectionRule());
						}
						add(
							$current,
							"connectDevice",
							lv_connectDevice_7_0,
							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConnectedDevice");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getConfigConnectionAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getConfigConnectionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleCapabilityProperty
entryRuleCapabilityProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCapabilityPropertyRule()); }
	iv_ruleCapabilityProperty=ruleCapabilityProperty
	{ $current=$iv_ruleCapabilityProperty.current; }
	EOF;

// Rule CapabilityProperty
ruleCapabilityProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CapabilityProperty'
		{
			newLeafNode(otherlv_0, grammarAccess.getCapabilityPropertyAccess().getCapabilityPropertyKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCapabilityPropertyAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='value'
			{
				newLeafNode(otherlv_3, grammarAccess.getCapabilityPropertyAccess().getValueKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertyAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getValueEStringParserRuleCall_3_2_0());
					}
					lv_value_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
						}
						add(
							$current,
							"value",
							lv_value_5_0,
							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getCapabilityPropertyAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getValueEStringParserRuleCall_3_3_1_0());
						}
						lv_value_7_0=ruleEString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
							}
							add(
								$current,
								"value",
								lv_value_7_0,
								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getCapabilityPropertyAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		otherlv_9='kind'
		{
			newLeafNode(otherlv_9, grammarAccess.getCapabilityPropertyAccess().getKindKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_5_0());
				}
				lv_kind_10_0=ruleCapabilityKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
					}
					set(
						$current,
						"kind",
						lv_kind_10_0,
						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.CapabilityKind");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getCapabilityPropertyAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAttributeKind
entryRuleAttributeKind returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeKindRule()); }
	iv_ruleAttributeKind=ruleAttributeKind
	{ $current=$iv_ruleAttributeKind.current; }
	EOF;

// Rule AttributeKind
ruleAttributeKind returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAttributeKindAccess().getAttributeKindAction_0(),
					$current);
			}
		)
		otherlv_1='AttributeKind'
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeKindAccess().getAttributeKindKeyword_1());
		}
	)
;

// Entry rule entryRuleMaximumKind
entryRuleMaximumKind returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMaximumKindRule()); }
	iv_ruleMaximumKind=ruleMaximumKind
	{ $current=$iv_ruleMaximumKind.current; }
	EOF;

// Rule MaximumKind
ruleMaximumKind returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMaximumKindAccess().getMaximumKindAction_0(),
					$current);
			}
		)
		otherlv_1='MaximumKind'
		{
			newLeafNode(otherlv_1, grammarAccess.getMaximumKindAccess().getMaximumKindKeyword_1());
		}
	)
;

// Entry rule entryRuleMinimumKind
entryRuleMinimumKind returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMinimumKindRule()); }
	iv_ruleMinimumKind=ruleMinimumKind
	{ $current=$iv_ruleMinimumKind.current; }
	EOF;

// Rule MinimumKind
ruleMinimumKind returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMinimumKindAccess().getMinimumKindAction_0(),
					$current);
			}
		)
		otherlv_1='MinimumKind'
		{
			newLeafNode(otherlv_1, grammarAccess.getMinimumKindAccess().getMinimumKindKeyword_1());
		}
	)
;

// Entry rule entryRuleSelectionKind
entryRuleSelectionKind returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectionKindRule()); }
	iv_ruleSelectionKind=ruleSelectionKind
	{ $current=$iv_ruleSelectionKind.current; }
	EOF;

// Rule SelectionKind
ruleSelectionKind returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSelectionKindAccess().getSelectionKindAction_0(),
					$current);
			}
		)
		otherlv_1='SelectionKind'
		{
			newLeafNode(otherlv_1, grammarAccess.getSelectionKindAccess().getSelectionKindKeyword_1());
		}
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPropertyAccess().getPropertyAction_0(),
					$current);
			}
		)
		otherlv_1='Property'
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='value'
			{
				newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getValueKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_4_1_0());
					}
					lv_value_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"value",
							lv_value_5_0,
							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleIndirectConnection
entryRuleIndirectConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIndirectConnectionRule()); }
	iv_ruleIndirectConnection=ruleIndirectConnection
	{ $current=$iv_ruleIndirectConnection.current; }
	EOF;

// Rule IndirectConnection
ruleIndirectConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIndirectConnectionAccess().getIndirectConnectionAction_0(),
					$current);
			}
		)
		otherlv_1='IndirectConnection'
		{
			newLeafNode(otherlv_1, grammarAccess.getIndirectConnectionAccess().getIndirectConnectionKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIndirectConnectionAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIndirectConnectionRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getIndirectConnectionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='properties'
			{
				newLeafNode(otherlv_4, grammarAccess.getIndirectConnectionAccess().getPropertiesKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getIndirectConnectionAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIndirectConnectionAccess().getPropertiesPropertyParserRuleCall_4_2_0());
					}
					lv_properties_6_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIndirectConnectionRule());
						}
						add(
							$current,
							"properties",
							lv_properties_6_0,
							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getIndirectConnectionAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getIndirectConnectionAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
						}
						lv_properties_8_0=ruleProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getIndirectConnectionRule());
							}
							add(
								$current,
								"properties",
								lv_properties_8_0,
								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getIndirectConnectionAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getIndirectConnectionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleDirectConnection
entryRuleDirectConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDirectConnectionRule()); }
	iv_ruleDirectConnection=ruleDirectConnection
	{ $current=$iv_ruleDirectConnection.current; }
	EOF;

// Rule DirectConnection
ruleDirectConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDirectConnectionAccess().getDirectConnectionAction_0(),
					$current);
			}
		)
		otherlv_1='DirectConnection'
		{
			newLeafNode(otherlv_1, grammarAccess.getDirectConnectionAccess().getDirectConnectionKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDirectConnectionAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDirectConnectionRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDirectConnectionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='properties'
			{
				newLeafNode(otherlv_4, grammarAccess.getDirectConnectionAccess().getPropertiesKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getDirectConnectionAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDirectConnectionAccess().getPropertiesPropertyParserRuleCall_4_2_0());
					}
					lv_properties_6_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDirectConnectionRule());
						}
						add(
							$current,
							"properties",
							lv_properties_6_0,
							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getDirectConnectionAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDirectConnectionAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
						}
						lv_properties_8_0=ruleProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDirectConnectionRule());
							}
							add(
								$current,
								"properties",
								lv_properties_8_0,
								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getDirectConnectionAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getDirectConnectionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleConnectedDevice
entryRuleConnectedDevice returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectedDeviceRule()); }
	iv_ruleConnectedDevice=ruleConnectedDevice
	{ $current=$iv_ruleConnectedDevice.current; }
	EOF;

// Rule ConnectedDevice
ruleConnectedDevice returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ConnectedDevice'
		{
			newLeafNode(otherlv_0, grammarAccess.getConnectedDeviceAccess().getConnectedDeviceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getConnectedDeviceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='refDevice'
		{
			newLeafNode(otherlv_2, grammarAccess.getConnectedDeviceAccess().getRefDeviceKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectedDeviceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConnectedDeviceAccess().getRefDeviceDeviceInstanceCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='refConnection'
		{
			newLeafNode(otherlv_4, grammarAccess.getConnectedDeviceAccess().getRefConnectionKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectedDeviceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConnectedDeviceAccess().getRefConnectionConnectionCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6='properties'
			{
				newLeafNode(otherlv_6, grammarAccess.getConnectedDeviceAccess().getPropertiesKeyword_6_0());
			}
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getConnectedDeviceAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPropertiesPropertyParserRuleCall_6_2_0());
					}
					lv_properties_8_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConnectedDeviceRule());
						}
						add(
							$current,
							"properties",
							lv_properties_8_0,
							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getConnectedDeviceAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
						}
						lv_properties_10_0=ruleProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getConnectedDeviceRule());
							}
							add(
								$current,
								"properties",
								lv_properties_10_0,
								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getConnectedDeviceAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getConnectedDeviceAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
