/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deplyoment.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PlanWithRosmodelAntlrTokenFileProvider implements IAntlrTokenFileProvider {

    @Override
    public InputStream getAntlrTokenFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResourceAsStream("de/fraunhofer/ipa/deplyoment/parser/antlr/internal/InternalPlanWithRosmodelParser.tokens");
    }
}
