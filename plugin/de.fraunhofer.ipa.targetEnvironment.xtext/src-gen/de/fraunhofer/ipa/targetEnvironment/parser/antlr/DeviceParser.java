/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.parser.antlr;

import com.google.inject.Inject;
import de.fraunhofer.ipa.targetEnvironment.parser.antlr.internal.InternalDeviceParser;
import de.fraunhofer.ipa.targetEnvironment.services.DeviceGrammarAccess;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DeviceParser extends AbstractAntlrParser {

	@Inject
	private DeviceGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new DeviceTokenSource(super.createLexer(stream));
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
	protected InternalDeviceParser createParser(XtextTokenStream stream) {
		return new InternalDeviceParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DeviceSet";
	}

	public DeviceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DeviceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}