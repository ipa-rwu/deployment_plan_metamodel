/*
 * generated by Xtext 2.36.0
 */
package de.fraunhofer.ipa.deployment.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ImplementationDescriptionAntlrTokenFileProvider implements IAntlrTokenFileProvider {

  @Override
  public InputStream getAntlrTokenFile() {
    ClassLoader classLoader = getClass().getClassLoader();
    return classLoader.getResourceAsStream("de/fraunhofer/ipa/deployment/parser/antlr/internal/InternalImplementationDescriptionParser.tokens");
  }
}
