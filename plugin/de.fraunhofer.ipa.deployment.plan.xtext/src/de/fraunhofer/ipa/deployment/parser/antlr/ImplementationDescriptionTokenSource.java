/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.parser.antlr;

import de.fraunhofer.ipa.deployment.parser.antlr.internal.InternalImplementationDescriptionParser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class ImplementationDescriptionTokenSource extends AbstractIndentationTokenSource {

    public ImplementationDescriptionTokenSource(TokenSource delegate) {
        super(delegate);
    }

    @Override
    protected boolean shouldSplitTokenImpl(Token token) {
        // TODO Review assumption
        return token.getType() == InternalImplementationDescriptionParser.RULE_WS;
    }

    @Override
    protected int getBeginTokenType() {
        // TODO Review assumption
        return InternalImplementationDescriptionParser.RULE_INDENT;
    }

    @Override
    protected int getEndTokenType() {
        // TODO Review assumption
        return InternalImplementationDescriptionParser.RULE_DEDENT;
    }

}
