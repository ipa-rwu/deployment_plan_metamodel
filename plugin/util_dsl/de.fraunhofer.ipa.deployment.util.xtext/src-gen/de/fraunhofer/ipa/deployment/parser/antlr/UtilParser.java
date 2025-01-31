/*
 * generated by Xtext 2.36.0
 */
package de.fraunhofer.ipa.deployment.parser.antlr;

import com.google.inject.Inject;
import de.fraunhofer.ipa.deployment.parser.antlr.internal.InternalUtilParser;
import de.fraunhofer.ipa.deployment.services.UtilGrammarAccess;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class UtilParser extends AbstractAntlrParser {

  @Inject
  private UtilGrammarAccess grammarAccess;

  @Override
  protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
    tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
  }

  @Override
  protected TokenSource createLexer(CharStream stream) {
    return new UtilTokenSource(super.createLexer(stream));
  }

  /**
   * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
   * Override and return {@code true} if your terminal splitting is stateless.
   */
  @Override
  protected boolean isReparseSupported() {
    return false;
  }

  @Override
  protected InternalUtilParser createParser(XtextTokenStream stream) {
    return new InternalUtilParser(stream, getGrammarAccess());
  }

  @Override
  protected String getDefaultRuleName() {
    return "Description";
  }

  public UtilGrammarAccess getGrammarAccess() {
    return this.grammarAccess;
  }

  public void setGrammarAccess(UtilGrammarAccess grammarAccess) {
    this.grammarAccess = grammarAccess;
  }
}
