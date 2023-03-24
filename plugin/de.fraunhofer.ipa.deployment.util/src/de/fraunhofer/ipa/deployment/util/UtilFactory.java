/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage
 * @generated
 */
public interface UtilFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UtilFactory eINSTANCE = de.fraunhofer.ipa.deployment.util.impl.UtilFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Property Value Int</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Value Int</em>'.
     * @generated
     */
    PropertyValueInt createPropertyValueInt();

    /**
     * Returns a new object of class '<em>Property Value Double</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Value Double</em>'.
     * @generated
     */
    PropertyValueDouble createPropertyValueDouble();

    /**
     * Returns a new object of class '<em>Property Value String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Value String</em>'.
     * @generated
     */
    PropertyValueString createPropertyValueString();

    /**
     * Returns a new object of class '<em>Communication Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Communication Type</em>'.
     * @generated
     */
    CommunicationType createCommunicationType();

    /**
     * Returns a new object of class '<em>Ethernet Communication Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ethernet Communication Type</em>'.
     * @generated
     */
    EthernetCommunicationType createEthernetCommunicationType();

    /**
     * Returns a new object of class '<em>Wlan Communication Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wlan Communication Type</em>'.
     * @generated
     */
    WlanCommunicationType createWlanCommunicationType();

    /**
     * Returns a new object of class '<em>Available Resouce</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Available Resouce</em>'.
     * @generated
     */
    AvailableResouce createAvailableResouce();

    /**
     * Returns a new object of class '<em>Linux Operting System Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Linux Operting System Type</em>'.
     * @generated
     */
    LinuxOpertingSystemType createLinuxOpertingSystemType();

    /**
     * Returns a new object of class '<em>Mac OS Operting System Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mac OS Operting System Type</em>'.
     * @generated
     */
    MacOSOpertingSystemType createMacOSOpertingSystemType();

    /**
     * Returns a new object of class '<em>Processor Architecture Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Processor Architecture Type</em>'.
     * @generated
     */
    ProcessorArchitectureType createProcessorArchitectureType();

    /**
     * Returns a new object of class '<em>X86 Processor Architecture</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>X86 Processor Architecture</em>'.
     * @generated
     */
    X86ProcessorArchitecture createX86ProcessorArchitecture();

    /**
     * Returns a new object of class '<em>Arm64 Processor Architecture</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Arm64 Processor Architecture</em>'.
     * @generated
     */
    Arm64ProcessorArchitecture createArm64ProcessorArchitecture();

    /**
     * Returns a new object of class '<em>Attribute Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Kind</em>'.
     * @generated
     */
    AttributeKind createAttributeKind();

    /**
     * Returns a new object of class '<em>Maximum Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Maximum Kind</em>'.
     * @generated
     */
    MaximumKind createMaximumKind();

    /**
     * Returns a new object of class '<em>Minimum Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Minimum Kind</em>'.
     * @generated
     */
    MinimumKind createMinimumKind();

    /**
     * Returns a new object of class '<em>Selection Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Selection Kind</em>'.
     * @generated
     */
    SelectionKind createSelectionKind();

    /**
     * Returns a new object of class '<em>Range Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Range Kind</em>'.
     * @generated
     */
    RangeKind createRangeKind();

    /**
     * Returns a new object of class '<em>Property Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Attribute</em>'.
     * @generated
     */
    PropertyAttribute createPropertyAttribute();

    /**
     * Returns a new object of class '<em>Property Maximun</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Maximun</em>'.
     * @generated
     */
    PropertyMaximun createPropertyMaximun();

    /**
     * Returns a new object of class '<em>Property Minimum</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Minimum</em>'.
     * @generated
     */
    PropertyMinimum createPropertyMinimum();

    /**
     * Returns a new object of class '<em>Property Selection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Selection</em>'.
     * @generated
     */
    PropertySelection createPropertySelection();

    /**
     * Returns a new object of class '<em>Property Range</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Range</em>'.
     * @generated
     */
    PropertyRange createPropertyRange();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns a new object of class '<em>Resource Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resource Type</em>'.
     * @generated
     */
    ResourceType createResourceType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    UtilPackage getUtilPackage();

} //UtilFactory