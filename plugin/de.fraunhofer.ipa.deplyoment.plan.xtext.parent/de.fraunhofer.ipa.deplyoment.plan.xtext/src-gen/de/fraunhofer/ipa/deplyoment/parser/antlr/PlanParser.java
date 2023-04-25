/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deplyoment.parser.antlr;

import com.google.inject.Inject;
import de.fraunhofer.ipa.deplyoment.parser.antlr.internal.InternalPlanParser;
import de.fraunhofer.ipa.deplyoment.services.PlanGrammarAccess;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PlanParser extends AbstractAntlrParser {

    @Inject
    private PlanGrammarAccess grammarAccess;

    @Override
    protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
        tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
    }

    @Override
    protected TokenSource createLexer(CharStream stream) {
        return new PlanTokenSource(super.createLexer(stream));
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
    protected InternalPlanParser createParser(XtextTokenStream stream) {
        return new InternalPlanParser(stream, getGrammarAccess());
    }

    @Override
    protected String getDefaultRuleName() {
        return "DeploymentPlan";
    }

    public PlanGrammarAccess getGrammarAccess() {
        return this.grammarAccess;
    }

    public void setGrammarAccess(PlanGrammarAccess grammarAccess) {
        this.grammarAccess = grammarAccess;
    }
}