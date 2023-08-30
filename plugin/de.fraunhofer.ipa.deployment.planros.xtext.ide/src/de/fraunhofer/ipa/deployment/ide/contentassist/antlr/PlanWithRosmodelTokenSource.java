/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.ide.contentassist.antlr;

import de.fraunhofer.ipa.deployment.ide.contentassist.antlr.internal.InternalPlanWithRosmodelParser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class PlanWithRosmodelTokenSource extends AbstractIndentationTokenSource {

  public PlanWithRosmodelTokenSource(TokenSource delegate) {
    super(delegate);
  }

  @Override
  protected boolean shouldSplitTokenImpl(Token token) {
    // TODO Review assumption
    return token.getType() == InternalPlanWithRosmodelParser.RULE_WS;
  }

  @Override
  protected int getBeginTokenType() {
    // TODO Review assumption
    return InternalPlanWithRosmodelParser.RULE_INDENT;
  }

  @Override
  protected int getEndTokenType() {
    // TODO Review assumption
    return InternalPlanWithRosmodelParser.RULE_DEDENT;
  }

  @Override
  protected boolean shouldEmitPendingEndTokens() {
    return false;
  }
}