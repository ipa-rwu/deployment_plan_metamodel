/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.parser.antlr;

import de.fraunhofer.ipa.deployment.parser.antlr.internal.InternalPlanParser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class PlanTokenSource extends AbstractIndentationTokenSource {
  public PlanTokenSource(TokenSource delegate) {
    super(delegate);
  }

  @Override
  protected boolean shouldSplitTokenImpl(Token token) {
    // TODO Review assumption
    return token.getType() == InternalPlanParser.RULE_WS;
  }

  @Override
  protected int getBeginTokenType() {
    // TODO Review assumption
    return InternalPlanParser.RULE_INDENT;
  }

  @Override
  protected int getEndTokenType() {
    // TODO Review assumption
    return InternalPlanParser.RULE_DEDENT;
  }
}