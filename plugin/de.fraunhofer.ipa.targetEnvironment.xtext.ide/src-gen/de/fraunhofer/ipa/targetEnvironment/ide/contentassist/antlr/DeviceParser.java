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
            builder.put(grammarAccess.getDeviceTypeAccess().getAlternatives(), "rule__DeviceType__Alternatives");
            builder.put(grammarAccess.getAbstractCommunicationConnectionAccess().getAlternatives(), "rule__AbstractCommunicationConnection__Alternatives");
            builder.put(grammarAccess.getAbstractNetworkPropertyAccess().getAlternatives(), "rule__AbstractNetworkProperty__Alternatives");
            builder.put(grammarAccess.getAbstractComputationResourceAccess().getAlternatives(), "rule__AbstractComputationResource__Alternatives");
            builder.put(grammarAccess.getAbstractOperatingSystemPropertyAccess().getAlternatives(), "rule__AbstractOperatingSystemProperty__Alternatives");
            builder.put(grammarAccess.getAbstracProcessorPropertyAccess().getAlternatives(), "rule__AbstracProcessorProperty__Alternatives");
            builder.put(grammarAccess.getAbstractPropertyAccess().getAlternatives(), "rule__AbstractProperty__Alternatives");
            builder.put(grammarAccess.getPropertyKindAccess().getAlternatives(), "rule__PropertyKind__Alternatives");
            builder.put(grammarAccess.getPropertyValueAccess().getAlternatives(), "rule__PropertyValue__Alternatives");
            builder.put(grammarAccess.getOpertingSystemResouceTypeAccess().getAlternatives(), "rule__OpertingSystemResouceType__Alternatives");
            builder.put(grammarAccess.getAbstractCommunicationTypeAccess().getAlternatives(), "rule__AbstractCommunicationType__Alternatives");
            builder.put(grammarAccess.getNetworkCommunicationTypeAccess().getAlternatives(), "rule__NetworkCommunicationType__Alternatives");
            builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
            builder.put(grammarAccess.getProcessorArchitectureTypeAccess().getAlternatives(), "rule__ProcessorArchitectureType__Alternatives");
            builder.put(grammarAccess.getLinuxDistributionAccess().getAlternatives(), "rule__LinuxDistribution__Alternatives");
            builder.put(grammarAccess.getUbuntuVersionAccess().getAlternatives(), "rule__UbuntuVersion__Alternatives");
            builder.put(grammarAccess.getDeviceSetAccess().getGroup(), "rule__DeviceSet__Group__0");
            builder.put(grammarAccess.getDeviceSetAccess().getGroup_1(), "rule__DeviceSet__Group_1__0");
            builder.put(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup(), "rule__InterfaceNetworkProperty__Group__0");
            builder.put(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_7(), "rule__InterfaceNetworkProperty__Group_7__0");
            builder.put(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_8(), "rule__InterfaceNetworkProperty__Group_8__0");
            builder.put(grammarAccess.getAddressNetworkPropertyAccess().getGroup(), "rule__AddressNetworkProperty__Group__0");
            builder.put(grammarAccess.getAddressNetworkPropertyAccess().getGroup_7(), "rule__AddressNetworkProperty__Group_7__0");
            builder.put(grammarAccess.getAddressNetworkPropertyAccess().getGroup_8(), "rule__AddressNetworkProperty__Group_8__0");
            builder.put(grammarAccess.getDeviceType_ImplAccess().getGroup(), "rule__DeviceType_Impl__Group__0");
            builder.put(grammarAccess.getDeviceType_ImplAccess().getGroup_5(), "rule__DeviceType_Impl__Group_5__0");
            builder.put(grammarAccess.getDeviceType_ImplAccess().getGroup_6(), "rule__DeviceType_Impl__Group_6__0");
            builder.put(grammarAccess.getDeviceResourceAccess().getGroup(), "rule__DeviceResource__Group__0");
            builder.put(grammarAccess.getDeviceResourceAccess().getGroup_6(), "rule__DeviceResource__Group_6__0");
            builder.put(grammarAccess.getComputationDeviceTypeAccess().getGroup(), "rule__ComputationDeviceType__Group__0");
            builder.put(grammarAccess.getComputationDeviceTypeAccess().getGroup_4(), "rule__ComputationDeviceType__Group_4__0");
            builder.put(grammarAccess.getComputationDeviceTypeAccess().getGroup_5(), "rule__ComputationDeviceType__Group_5__0");
            builder.put(grammarAccess.getComputationDeviceTypeAccess().getGroup_6(), "rule__ComputationDeviceType__Group_6__0");
            builder.put(grammarAccess.getConnectionPropertyAccess().getGroup(), "rule__ConnectionProperty__Group__0");
            builder.put(grammarAccess.getConnectionPropertyAccess().getGroup_7(), "rule__ConnectionProperty__Group_7__0");
            builder.put(grammarAccess.getConnectionPropertyAccess().getGroup_8(), "rule__ConnectionProperty__Group_8__0");
            builder.put(grammarAccess.getNetworkConnectionAccess().getGroup(), "rule__NetworkConnection__Group__0");
            builder.put(grammarAccess.getNetworkConnectionAccess().getGroup_7(), "rule__NetworkConnection__Group_7__0");
            builder.put(grammarAccess.getCommunicationConnectionAccess().getGroup(), "rule__CommunicationConnection__Group__0");
            builder.put(grammarAccess.getCommunicationConnectionAccess().getGroup_7(), "rule__CommunicationConnection__Group_7__0");
            builder.put(grammarAccess.getOperatingSystemResouceAccess().getGroup(), "rule__OperatingSystemResouce__Group__0");
            builder.put(grammarAccess.getOperatingSystemResouceAccess().getGroup_7(), "rule__OperatingSystemResouce__Group_7__0");
            builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup(), "rule__NameOperatingSystemProperty__Group__0");
            builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup_7(), "rule__NameOperatingSystemProperty__Group_7__0");
            builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup_8(), "rule__NameOperatingSystemProperty__Group_8__0");
            builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup(), "rule__VersionOperatingSystemProperty__Group__0");
            builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup_7(), "rule__VersionOperatingSystemProperty__Group_7__0");
            builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup_8(), "rule__VersionOperatingSystemProperty__Group_8__0");
            builder.put(grammarAccess.getProcessorResouceAccess().getGroup(), "rule__ProcessorResouce__Group__0");
            builder.put(grammarAccess.getProcessorResouceAccess().getGroup_7(), "rule__ProcessorResouce__Group_7__0");
            builder.put(grammarAccess.getArchitectureProcessorPropertyAccess().getGroup(), "rule__ArchitectureProcessorProperty__Group__0");
            builder.put(grammarAccess.getArchitectureProcessorPropertyAccess().getGroup_7(), "rule__ArchitectureProcessorProperty__Group_7__0");
            builder.put(grammarAccess.getArchitectureProcessorPropertyAccess().getGroup_8(), "rule__ArchitectureProcessorProperty__Group_8__0");
            builder.put(grammarAccess.getCoreProcessorPropertyAccess().getGroup(), "rule__CoreProcessorProperty__Group__0");
            builder.put(grammarAccess.getCoreProcessorPropertyAccess().getGroup_7(), "rule__CoreProcessorProperty__Group_7__0");
            builder.put(grammarAccess.getCoreProcessorPropertyAccess().getGroup_8(), "rule__CoreProcessorProperty__Group_8__0");
            builder.put(grammarAccess.getResourceAccess().getGroup(), "rule__Resource__Group__0");
            builder.put(grammarAccess.getResourceAccess().getGroup_5(), "rule__Resource__Group_5__0");
            builder.put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
            builder.put(grammarAccess.getPropertyAccess().getGroup_6(), "rule__Property__Group_6__0");
            builder.put(grammarAccess.getPropertyAccess().getGroup_7(), "rule__Property__Group_7__0");
            builder.put(grammarAccess.getPropertyAccess().getGroup_7_4(), "rule__Property__Group_7_4__0");
            builder.put(grammarAccess.getPropertyAttributeAccess().getGroup(), "rule__PropertyAttribute__Group__0");
            builder.put(grammarAccess.getPropertyAttributeAccess().getGroup_6(), "rule__PropertyAttribute__Group_6__0");
            builder.put(grammarAccess.getPropertyAttributeAccess().getGroup_7(), "rule__PropertyAttribute__Group_7__0");
            builder.put(grammarAccess.getPropertyMaximunAccess().getGroup(), "rule__PropertyMaximun__Group__0");
            builder.put(grammarAccess.getPropertyMaximunAccess().getGroup_6(), "rule__PropertyMaximun__Group_6__0");
            builder.put(grammarAccess.getPropertyMaximunAccess().getGroup_7(), "rule__PropertyMaximun__Group_7__0");
            builder.put(grammarAccess.getPropertyMinimumAccess().getGroup(), "rule__PropertyMinimum__Group__0");
            builder.put(grammarAccess.getPropertyMinimumAccess().getGroup_6(), "rule__PropertyMinimum__Group_6__0");
            builder.put(grammarAccess.getPropertyMinimumAccess().getGroup_7(), "rule__PropertyMinimum__Group_7__0");
            builder.put(grammarAccess.getPropertySelectionAccess().getGroup(), "rule__PropertySelection__Group__0");
            builder.put(grammarAccess.getPropertySelectionAccess().getGroup_6(), "rule__PropertySelection__Group_6__0");
            builder.put(grammarAccess.getPropertySelectionAccess().getGroup_7(), "rule__PropertySelection__Group_7__0");
            builder.put(grammarAccess.getPropertySelectionAccess().getGroup_7_4(), "rule__PropertySelection__Group_7_4__0");
            builder.put(grammarAccess.getPropertyRangeAccess().getGroup(), "rule__PropertyRange__Group__0");
            builder.put(grammarAccess.getPropertyRangeAccess().getGroup_6(), "rule__PropertyRange__Group_6__0");
            builder.put(grammarAccess.getPropertyRangeAccess().getGroup_7(), "rule__PropertyRange__Group_7__0");
            builder.put(grammarAccess.getResourceTypeAccess().getGroup(), "rule__ResourceType__Group__0");
            builder.put(grammarAccess.getProcessorResouceTypeAccess().getGroup(), "rule__ProcessorResouceType__Group__0");
            builder.put(grammarAccess.getLinuxOpertingSystemAccess().getGroup(), "rule__LinuxOpertingSystem__Group__0");
            builder.put(grammarAccess.getMacOSOpertingSystemAccess().getGroup(), "rule__MacOSOpertingSystem__Group__0");
            builder.put(grammarAccess.getCommunicationTypeAccess().getGroup(), "rule__CommunicationType__Group__0");
            builder.put(grammarAccess.getEthernetCommunicationTypeAccess().getGroup(), "rule__EthernetCommunicationType__Group__0");
            builder.put(grammarAccess.getWlanCommunicationTypeAccess().getGroup(), "rule__WlanCommunicationType__Group__0");
            builder.put(grammarAccess.getAttributeKindAccess().getGroup(), "rule__AttributeKind__Group__0");
            builder.put(grammarAccess.getMaximumKindAccess().getGroup(), "rule__MaximumKind__Group__0");
            builder.put(grammarAccess.getMinimumKindAccess().getGroup(), "rule__MinimumKind__Group__0");
            builder.put(grammarAccess.getSelectionKindAccess().getGroup(), "rule__SelectionKind__Group__0");
            builder.put(grammarAccess.getRangeKindAccess().getGroup(), "rule__RangeKind__Group__0");
            builder.put(grammarAccess.getLinuxDistributionValueAccess().getGroup(), "rule__LinuxDistributionValue__Group__0");
            builder.put(grammarAccess.getUbuntuVersionValueAccess().getGroup(), "rule__UbuntuVersionValue__Group__0");
            builder.put(grammarAccess.getDeviceSetAccess().getDeviceAssignment_0(), "rule__DeviceSet__DeviceAssignment_0");
            builder.put(grammarAccess.getDeviceSetAccess().getDeviceAssignment_1_1(), "rule__DeviceSet__DeviceAssignment_1_1");
            builder.put(grammarAccess.getInterfaceNetworkPropertyAccess().getNameAssignment_3(), "rule__InterfaceNetworkProperty__NameAssignment_3");
            builder.put(grammarAccess.getInterfaceNetworkPropertyAccess().getKindAssignment_6(), "rule__InterfaceNetworkProperty__KindAssignment_6");
            builder.put(grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionAssignment_7_1(), "rule__InterfaceNetworkProperty__DescriptionAssignment_7_1");
            builder.put(grammarAccess.getInterfaceNetworkPropertyAccess().getValueAssignment_8_1(), "rule__InterfaceNetworkProperty__ValueAssignment_8_1");
            builder.put(grammarAccess.getAddressNetworkPropertyAccess().getNameAssignment_3(), "rule__AddressNetworkProperty__NameAssignment_3");
            builder.put(grammarAccess.getAddressNetworkPropertyAccess().getKindAssignment_6(), "rule__AddressNetworkProperty__KindAssignment_6");
            builder.put(grammarAccess.getAddressNetworkPropertyAccess().getDescriptionAssignment_7_1(), "rule__AddressNetworkProperty__DescriptionAssignment_7_1");
            builder.put(grammarAccess.getAddressNetworkPropertyAccess().getValueAssignment_8_1(), "rule__AddressNetworkProperty__ValueAssignment_8_1");
            builder.put(grammarAccess.getDeviceType_ImplAccess().getNameAssignment_4(), "rule__DeviceType_Impl__NameAssignment_4");
            builder.put(grammarAccess.getDeviceType_ImplAccess().getDeviceResourceAssignment_5_2(), "rule__DeviceType_Impl__DeviceResourceAssignment_5_2");
            builder.put(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2(), "rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2");
            builder.put(grammarAccess.getDeviceResourceAccess().getNameAssignment_2(), "rule__DeviceResource__NameAssignment_2");
            builder.put(grammarAccess.getDeviceResourceAccess().getTypeAssignment_5(), "rule__DeviceResource__TypeAssignment_5");
            builder.put(grammarAccess.getDeviceResourceAccess().getPropertiesAssignment_6_2(), "rule__DeviceResource__PropertiesAssignment_6_2");
            builder.put(grammarAccess.getDeviceResourceAccess().getPropertiesAssignment_6_3(), "rule__DeviceResource__PropertiesAssignment_6_3");
            builder.put(grammarAccess.getComputationDeviceTypeAccess().getNameAssignment_3(), "rule__ComputationDeviceType__NameAssignment_3");
            builder.put(grammarAccess.getComputationDeviceTypeAccess().getDeviceResourceAssignment_4_2(), "rule__ComputationDeviceType__DeviceResourceAssignment_4_2");
            builder.put(grammarAccess.getComputationDeviceTypeAccess().getComputationResourceAssignment_5_2(), "rule__ComputationDeviceType__ComputationResourceAssignment_5_2");
            builder.put(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_6_2(), "rule__ComputationDeviceType__CommunicationConnectionAssignment_6_2");
            builder.put(grammarAccess.getConnectionPropertyAccess().getNameAssignment_3(), "rule__ConnectionProperty__NameAssignment_3");
            builder.put(grammarAccess.getConnectionPropertyAccess().getKindAssignment_6(), "rule__ConnectionProperty__KindAssignment_6");
            builder.put(grammarAccess.getConnectionPropertyAccess().getDescriptionAssignment_7_1(), "rule__ConnectionProperty__DescriptionAssignment_7_1");
            builder.put(grammarAccess.getConnectionPropertyAccess().getValueAssignment_8_1(), "rule__ConnectionProperty__ValueAssignment_8_1");
            builder.put(grammarAccess.getNetworkConnectionAccess().getNameAssignment_3(), "rule__NetworkConnection__NameAssignment_3");
            builder.put(grammarAccess.getNetworkConnectionAccess().getTypeAssignment_6(), "rule__NetworkConnection__TypeAssignment_6");
            builder.put(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2(), "rule__NetworkConnection__PropertiesAssignment_7_2");
            builder.put(grammarAccess.getCommunicationConnectionAccess().getNameAssignment_3(), "rule__CommunicationConnection__NameAssignment_3");
            builder.put(grammarAccess.getCommunicationConnectionAccess().getTypeAssignment_6(), "rule__CommunicationConnection__TypeAssignment_6");
            builder.put(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2(), "rule__CommunicationConnection__PropertiesAssignment_7_2");
            builder.put(grammarAccess.getOperatingSystemResouceAccess().getNameAssignment_3(), "rule__OperatingSystemResouce__NameAssignment_3");
            builder.put(grammarAccess.getOperatingSystemResouceAccess().getTypeAssignment_6(), "rule__OperatingSystemResouce__TypeAssignment_6");
            builder.put(grammarAccess.getOperatingSystemResouceAccess().getPropertiesAssignment_7_2(), "rule__OperatingSystemResouce__PropertiesAssignment_7_2");
            builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getNameAssignment_3(), "rule__NameOperatingSystemProperty__NameAssignment_3");
            builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAssignment_6(), "rule__NameOperatingSystemProperty__KindAssignment_6");
            builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionAssignment_7_1(), "rule__NameOperatingSystemProperty__DescriptionAssignment_7_1");
            builder.put(grammarAccess.getNameOperatingSystemPropertyAccess().getValueAssignment_8_1(), "rule__NameOperatingSystemProperty__ValueAssignment_8_1");
            builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getNameAssignment_3(), "rule__VersionOperatingSystemProperty__NameAssignment_3");
            builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAssignment_6(), "rule__VersionOperatingSystemProperty__KindAssignment_6");
            builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionAssignment_7_1(), "rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1");
            builder.put(grammarAccess.getVersionOperatingSystemPropertyAccess().getValueAssignment_8_1(), "rule__VersionOperatingSystemProperty__ValueAssignment_8_1");
            builder.put(grammarAccess.getProcessorResouceAccess().getNameAssignment_3(), "rule__ProcessorResouce__NameAssignment_3");
            builder.put(grammarAccess.getProcessorResouceAccess().getTypeAssignment_6(), "rule__ProcessorResouce__TypeAssignment_6");
            builder.put(grammarAccess.getProcessorResouceAccess().getPropertiesAssignment_7_2(), "rule__ProcessorResouce__PropertiesAssignment_7_2");
            builder.put(grammarAccess.getArchitectureProcessorPropertyAccess().getNameAssignment_3(), "rule__ArchitectureProcessorProperty__NameAssignment_3");
            builder.put(grammarAccess.getArchitectureProcessorPropertyAccess().getKindAssignment_6(), "rule__ArchitectureProcessorProperty__KindAssignment_6");
            builder.put(grammarAccess.getArchitectureProcessorPropertyAccess().getDescriptionAssignment_7_1(), "rule__ArchitectureProcessorProperty__DescriptionAssignment_7_1");
            builder.put(grammarAccess.getArchitectureProcessorPropertyAccess().getValueAssignment_8_1(), "rule__ArchitectureProcessorProperty__ValueAssignment_8_1");
            builder.put(grammarAccess.getCoreProcessorPropertyAccess().getNameAssignment_3(), "rule__CoreProcessorProperty__NameAssignment_3");
            builder.put(grammarAccess.getCoreProcessorPropertyAccess().getKindAssignment_6(), "rule__CoreProcessorProperty__KindAssignment_6");
            builder.put(grammarAccess.getCoreProcessorPropertyAccess().getDescriptionAssignment_7_1(), "rule__CoreProcessorProperty__DescriptionAssignment_7_1");
            builder.put(grammarAccess.getCoreProcessorPropertyAccess().getValueAssignment_8_1(), "rule__CoreProcessorProperty__ValueAssignment_8_1");
            builder.put(grammarAccess.getResourceAccess().getNameAssignment_1(), "rule__Resource__NameAssignment_1");
            builder.put(grammarAccess.getResourceAccess().getTypeAssignment_4(), "rule__Resource__TypeAssignment_4");
            builder.put(grammarAccess.getResourceAccess().getPropertiesAssignment_5_2(), "rule__Resource__PropertiesAssignment_5_2");
            builder.put(grammarAccess.getResourceAccess().getPropertiesAssignment_5_3(), "rule__Resource__PropertiesAssignment_5_3");
            builder.put(grammarAccess.getPropertyAccess().getNameAssignment_2(), "rule__Property__NameAssignment_2");
            builder.put(grammarAccess.getPropertyAccess().getKindAssignment_5(), "rule__Property__KindAssignment_5");
            builder.put(grammarAccess.getPropertyAccess().getDescriptionAssignment_6_1(), "rule__Property__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertyAccess().getValueAssignment_7_3(), "rule__Property__ValueAssignment_7_3");
            builder.put(grammarAccess.getPropertyAccess().getValueAssignment_7_4_1(), "rule__Property__ValueAssignment_7_4_1");
            builder.put(grammarAccess.getPropertyAttributeAccess().getNameAssignment_2(), "rule__PropertyAttribute__NameAssignment_2");
            builder.put(grammarAccess.getPropertyAttributeAccess().getKindAssignment_5(), "rule__PropertyAttribute__KindAssignment_5");
            builder.put(grammarAccess.getPropertyAttributeAccess().getDescriptionAssignment_6_1(), "rule__PropertyAttribute__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertyAttributeAccess().getValueAssignment_7_1(), "rule__PropertyAttribute__ValueAssignment_7_1");
            builder.put(grammarAccess.getPropertyMaximunAccess().getNameAssignment_2(), "rule__PropertyMaximun__NameAssignment_2");
            builder.put(grammarAccess.getPropertyMaximunAccess().getKindAssignment_5(), "rule__PropertyMaximun__KindAssignment_5");
            builder.put(grammarAccess.getPropertyMaximunAccess().getDescriptionAssignment_6_1(), "rule__PropertyMaximun__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertyMaximunAccess().getValueAssignment_7_1(), "rule__PropertyMaximun__ValueAssignment_7_1");
            builder.put(grammarAccess.getPropertyMinimumAccess().getNameAssignment_2(), "rule__PropertyMinimum__NameAssignment_2");
            builder.put(grammarAccess.getPropertyMinimumAccess().getKindAssignment_5(), "rule__PropertyMinimum__KindAssignment_5");
            builder.put(grammarAccess.getPropertyMinimumAccess().getDescriptionAssignment_6_1(), "rule__PropertyMinimum__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertyMinimumAccess().getValueAssignment_7_1(), "rule__PropertyMinimum__ValueAssignment_7_1");
            builder.put(grammarAccess.getPropertySelectionAccess().getNameAssignment_2(), "rule__PropertySelection__NameAssignment_2");
            builder.put(grammarAccess.getPropertySelectionAccess().getKindAssignment_5(), "rule__PropertySelection__KindAssignment_5");
            builder.put(grammarAccess.getPropertySelectionAccess().getDescriptionAssignment_6_1(), "rule__PropertySelection__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertySelectionAccess().getValueAssignment_7_3(), "rule__PropertySelection__ValueAssignment_7_3");
            builder.put(grammarAccess.getPropertySelectionAccess().getValueAssignment_7_4_1(), "rule__PropertySelection__ValueAssignment_7_4_1");
            builder.put(grammarAccess.getPropertyRangeAccess().getNameAssignment_2(), "rule__PropertyRange__NameAssignment_2");
            builder.put(grammarAccess.getPropertyRangeAccess().getKindAssignment_5(), "rule__PropertyRange__KindAssignment_5");
            builder.put(grammarAccess.getPropertyRangeAccess().getDescriptionAssignment_6_1(), "rule__PropertyRange__DescriptionAssignment_6_1");
            builder.put(grammarAccess.getPropertyRangeAccess().getValueAssignment_7_3(), "rule__PropertyRange__ValueAssignment_7_3");
            builder.put(grammarAccess.getPropertyRangeAccess().getValueAssignment_7_5(), "rule__PropertyRange__ValueAssignment_7_5");
            builder.put(grammarAccess.getPropertyValueIntAccess().getValueAssignment(), "rule__PropertyValueInt__ValueAssignment");
            builder.put(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment(), "rule__PropertyValueDouble__ValueAssignment");
            builder.put(grammarAccess.getPropertyValueStringAccess().getValueAssignment(), "rule__PropertyValueString__ValueAssignment");
            builder.put(grammarAccess.getProcessorArchitectureValueAccess().getValueAssignment(), "rule__ProcessorArchitectureValue__ValueAssignment");
            builder.put(grammarAccess.getResourceTypeAccess().getNameAssignment_1(), "rule__ResourceType__NameAssignment_1");
            builder.put(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1(), "rule__CommunicationType__NameAssignment_1");
            builder.put(grammarAccess.getLinuxDistributionValueAccess().getValueAssignment_1(), "rule__LinuxDistributionValue__ValueAssignment_1");
            builder.put(grammarAccess.getUbuntuVersionValueAccess().getValueAssignment_1(), "rule__UbuntuVersionValue__ValueAssignment_1");
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
