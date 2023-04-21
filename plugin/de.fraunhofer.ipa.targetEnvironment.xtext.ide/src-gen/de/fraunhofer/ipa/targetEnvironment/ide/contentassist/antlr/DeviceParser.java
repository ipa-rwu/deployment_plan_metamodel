/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.fraunhofer.ipa.targetEnvironment.ide.contentassist.antlr.internal.InternalDeviceParser;
import de.fraunhofer.ipa.targetEnvironment.services.DeviceGrammarAccess;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DeviceParser extends AbstractContentAssistParser {

    @Singleton
    public static final class NameMappings {

        private final Map<AbstractElement, String> mappings;

        @Inject
        public NameMappings(DeviceGrammarAccess grammarAccess) {
            ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
            init(builder, grammarAccess);
            this.mappings = builder.build();
        }

        public String getRuleName(AbstractElement element) {
            return mappings.get(element);
        }

        private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DeviceGrammarAccess grammarAccess) {
            builder.put(grammarAccess.getCapabilityKindAccess().getAlternatives(), "rule__CapabilityKind__Alternatives");
            builder.put(grammarAccess.getPropertyTypeAccess().getAlternatives(), "rule__PropertyType__Alternatives");
            builder.put(grammarAccess.getPropertyValueAccess().getAlternatives(), "rule__PropertyValue__Alternatives");
            builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
            builder.put(grammarAccess.getDeviceTypeAccess().getGroup(), "rule__DeviceType__Group__0");
            builder.put(grammarAccess.getDeviceTypeAccess().getGroup_5(), "rule__DeviceType__Group_5__0");
            builder.put(grammarAccess.getDeviceTypeAccess().getGroup_6(), "rule__DeviceType__Group_6__0");
            builder.put(grammarAccess.getCapabilityPropertyAccess().getGroup(), "rule__CapabilityProperty__Group__0");
            builder.put(grammarAccess.getCapabilityPropertyAccess().getGroup_8(), "rule__CapabilityProperty__Group_8__0");
            builder.put(grammarAccess.getAttributeKindAccess().getGroup(), "rule__AttributeKind__Group__0");
            builder.put(grammarAccess.getMaximumKindAccess().getGroup(), "rule__MaximumKind__Group__0");
            builder.put(grammarAccess.getMinimumKindAccess().getGroup(), "rule__MinimumKind__Group__0");
            builder.put(grammarAccess.getSelectionKindAccess().getGroup(), "rule__SelectionKind__Group__0");
            builder.put(grammarAccess.getConnectionPropertyAccess().getGroup(), "rule__ConnectionProperty__Group__0");
            builder.put(grammarAccess.getConnectionPropertyAccess().getGroup_4(), "rule__ConnectionProperty__Group_4__0");
            builder.put(grammarAccess.getCommunicationConnectionAccess().getGroup(), "rule__CommunicationConnection__Group__0");
            builder.put(grammarAccess.getCommunicationConnectionAccess().getGroup_7(), "rule__CommunicationConnection__Group_7__0");
            builder.put(grammarAccess.getCommunicationTypeAccess().getGroup(), "rule__CommunicationType__Group__0");
            builder.put(grammarAccess.getCapabilityTypeAccess().getGroup(), "rule__CapabilityType__Group__0");
            builder.put(grammarAccess.getDeviceSetAccess().getDeviceAssignment(), "rule__DeviceSet__DeviceAssignment");
            builder.put(grammarAccess.getDeviceTypeAccess().getNameAssignment_4(), "rule__DeviceType__NameAssignment_4");
            builder.put(grammarAccess.getDeviceTypeAccess().getCapabilityAssignment_5_2(), "rule__DeviceType__CapabilityAssignment_5_2");
            builder.put(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionAssignment_6_2(), "rule__DeviceType__CommunicationConnectionAssignment_6_2");
            builder.put(grammarAccess.getCapabilityPropertyAccess().getNameAssignment_2(), "rule__CapabilityProperty__NameAssignment_2");
            builder.put(grammarAccess.getCapabilityPropertyAccess().getTypeAssignment_5(), "rule__CapabilityProperty__TypeAssignment_5");
            builder.put(grammarAccess.getCapabilityPropertyAccess().getKindAssignment_7(), "rule__CapabilityProperty__KindAssignment_7");
            builder.put(grammarAccess.getCapabilityPropertyAccess().getValueAssignment_8_1(), "rule__CapabilityProperty__ValueAssignment_8_1");
            builder.put(grammarAccess.getConnectionPropertyAccess().getNameAssignment_3(), "rule__ConnectionProperty__NameAssignment_3");
            builder.put(grammarAccess.getConnectionPropertyAccess().getValueAssignment_4_2(), "rule__ConnectionProperty__ValueAssignment_4_2");
            builder.put(grammarAccess.getCommunicationConnectionAccess().getNameAssignment_3(), "rule__CommunicationConnection__NameAssignment_3");
            builder.put(grammarAccess.getCommunicationConnectionAccess().getTypeAssignment_6(), "rule__CommunicationConnection__TypeAssignment_6");
            builder.put(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2(), "rule__CommunicationConnection__PropertiesAssignment_7_2");
            builder.put(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1(), "rule__CommunicationType__NameAssignment_1");
            builder.put(grammarAccess.getCapabilityTypeAccess().getNameAssignment_1(), "rule__CapabilityType__NameAssignment_1");
            builder.put(grammarAccess.getPropertyValueIntAccess().getValueAssignment(), "rule__PropertyValueInt__ValueAssignment");
            builder.put(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment(), "rule__PropertyValueDouble__ValueAssignment");
            builder.put(grammarAccess.getPropertyValueStringAccess().getValueAssignment(), "rule__PropertyValueString__ValueAssignment");
        }
    }

    @Inject
    private NameMappings nameMappings;

    @Inject
    private DeviceGrammarAccess grammarAccess;

    @Override
    protected InternalDeviceParser createParser() {
        InternalDeviceParser result = new InternalDeviceParser(null);
        result.setGrammarAccess(grammarAccess);
        return result;
    }

    @Override
    protected TokenSource createLexer(CharStream stream) {
        return new DeviceTokenSource(super.createLexer(stream));
    }

    @Override
    protected String getRuleName(AbstractElement element) {
        return nameMappings.getRuleName(element);
    }

    @Override
    protected String[] getInitialHiddenTokens() {
        return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
    }

    public DeviceGrammarAccess getGrammarAccess() {
        return this.grammarAccess;
    }

    public void setGrammarAccess(DeviceGrammarAccess grammarAccess) {
        this.grammarAccess = grammarAccess;
    }

    public NameMappings getNameMappings() {
        return nameMappings;
    }

    public void setNameMappings(NameMappings nameMappings) {
        this.nameMappings = nameMappings;
    }
}
