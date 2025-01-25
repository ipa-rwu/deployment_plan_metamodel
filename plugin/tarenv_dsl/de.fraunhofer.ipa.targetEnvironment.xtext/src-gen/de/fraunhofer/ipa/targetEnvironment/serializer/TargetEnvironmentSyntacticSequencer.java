/*
 * generated by Xtext 2.36.0
 */
package de.fraunhofer.ipa.targetEnvironment.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.targetEnvironment.services.TargetEnvironmentGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class TargetEnvironmentSyntacticSequencer extends AbstractSyntacticSequencer {

  protected TargetEnvironmentGrammarAccess grammarAccess;
  protected AbstractElementAlias match_PropertyAttribute_DEDENTTerminalRuleCall_8_q;
  protected AbstractElementAlias match_PropertyMaximun_DEDENTTerminalRuleCall_8_q;
  protected AbstractElementAlias match_PropertyMinimum_DEDENTTerminalRuleCall_8_q;
  protected AbstractElementAlias match_PropertyRange_DEDENTTerminalRuleCall_8_q;
  protected AbstractElementAlias match_PropertySelection_DEDENTTerminalRuleCall_8_q;
  protected AbstractElementAlias match_Property_DEDENTTerminalRuleCall_8_q;

  @Inject
  protected void init(IGrammarAccess access) {
    grammarAccess = (TargetEnvironmentGrammarAccess) access;
    match_PropertyAttribute_DEDENTTerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getPropertyAttributeAccess().getDEDENTTerminalRuleCall_8());
    match_PropertyMaximun_DEDENTTerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getPropertyMaximunAccess().getDEDENTTerminalRuleCall_8());
    match_PropertyMinimum_DEDENTTerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getPropertyMinimumAccess().getDEDENTTerminalRuleCall_8());
    match_PropertyRange_DEDENTTerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_8());
    match_PropertySelection_DEDENTTerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_8());
    match_Property_DEDENTTerminalRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_8());
  }

  @Override
  protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
    if (ruleCall.getRule() == grammarAccess.getDEDENTRule())
      return getDEDENTToken(semanticObject, ruleCall, node);
    else if (ruleCall.getRule() == grammarAccess.getINDENTRule())
      return getINDENTToken(semanticObject, ruleCall, node);
    else if (ruleCall.getRule() == grammarAccess.getPreListElementRule())
      return getPreListElementToken(semanticObject, ruleCall, node);
    return "";
  }

  /**
   * Synthetic terminal rule. The concrete syntax is to be specified by clients.
   * Defaults to the empty string.
   */
  protected String getDEDENTToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }

  /**
   * Synthetic terminal rule. The concrete syntax is to be specified by clients.
   * Defaults to the empty string.
   */
  protected String getINDENTToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }

  /**
   * PreListElement hidden(SL_COMMENT):
   *   '-';
   */
  protected String getPreListElementToken(EObject semanticObject, RuleCall ruleCall, INode node) {
    if (node != null)
      return getTokenText(node);
    return "-";
  }

  @Override
  protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
    if (transition.getAmbiguousSyntaxes().isEmpty()) return;
    List<INode> transitionNodes = collectNodes(fromNode, toNode);
    for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
      List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
      if (match_PropertyAttribute_DEDENTTerminalRuleCall_8_q.equals(syntax))
        emit_PropertyAttribute_DEDENTTerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
      else if (match_PropertyMaximun_DEDENTTerminalRuleCall_8_q.equals(syntax))
        emit_PropertyMaximun_DEDENTTerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
      else if (match_PropertyMinimum_DEDENTTerminalRuleCall_8_q.equals(syntax))
        emit_PropertyMinimum_DEDENTTerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
      else if (match_PropertyRange_DEDENTTerminalRuleCall_8_q.equals(syntax))
        emit_PropertyRange_DEDENTTerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
      else if (match_PropertySelection_DEDENTTerminalRuleCall_8_q.equals(syntax))
        emit_PropertySelection_DEDENTTerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
      else if (match_Property_DEDENTTerminalRuleCall_8_q.equals(syntax))
        emit_Property_DEDENTTerminalRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
      else acceptNodes(getLastNavigableState(), syntaxNodes);
    }
  }

  /**
   * <pre>
   * Ambiguous syntax:
   *     DEDENT?
   *
   * This ambiguous syntax occurs at:
   *     description=EString (ambiguity) (rule end)
   *     kind=AttributeKind (ambiguity) (rule end)
   *     value=PropertyValue (ambiguity) (rule end)

   * </pre>
   */
  protected void emit_PropertyAttribute_DEDENTTerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
    acceptNodes(transition, nodes);
  }

  /**
   * <pre>
   * Ambiguous syntax:
   *     DEDENT?
   *
   * This ambiguous syntax occurs at:
   *     description=EString (ambiguity) (rule end)
   *     kind=MaximumKind (ambiguity) (rule end)
   *     value=PropertyValue (ambiguity) (rule end)

   * </pre>
   */
  protected void emit_PropertyMaximun_DEDENTTerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
    acceptNodes(transition, nodes);
  }

  /**
   * <pre>
   * Ambiguous syntax:
   *     DEDENT?
   *
   * This ambiguous syntax occurs at:
   *     description=EString (ambiguity) (rule end)
   *     kind=MinimumKind (ambiguity) (rule end)
   *     value=PropertyValue (ambiguity) (rule end)

   * </pre>
   */
  protected void emit_PropertyMinimum_DEDENTTerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
    acceptNodes(transition, nodes);
  }

  /**
   * <pre>
   * Ambiguous syntax:
   *     DEDENT?
   *
   * This ambiguous syntax occurs at:
   *     description=EString (ambiguity) (rule end)
   *     kind=RangeKind (ambiguity) (rule end)
   *     value+=PropertyValue DEDENT (ambiguity) (rule end)

   * </pre>
   */
  protected void emit_PropertyRange_DEDENTTerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
    acceptNodes(transition, nodes);
  }

  /**
   * <pre>
   * Ambiguous syntax:
   *     DEDENT?
   *
   * This ambiguous syntax occurs at:
   *     description=EString (ambiguity) (rule end)
   *     kind=SelectionKind (ambiguity) (rule end)
   *     value+=PropertyValue DEDENT (ambiguity) (rule end)

   * </pre>
   */
  protected void emit_PropertySelection_DEDENTTerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
    acceptNodes(transition, nodes);
  }

  /**
   * <pre>
   * Ambiguous syntax:
   *     DEDENT?
   *
   * This ambiguous syntax occurs at:
   *     description=EString (ambiguity) (rule end)
   *     kind=PropertyKind (ambiguity) (rule end)
   *     value+=PropertyValue DEDENT (ambiguity) (rule end)

   * </pre>
   */
  protected void emit_Property_DEDENTTerminalRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
    acceptNodes(transition, nodes);
  }

}
