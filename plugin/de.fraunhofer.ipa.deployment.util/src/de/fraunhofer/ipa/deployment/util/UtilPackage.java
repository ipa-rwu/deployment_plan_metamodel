/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.deployment.util.UtilFactory
 * @model kind="package"
 * @generated
 */
public interface UtilPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "util";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.ipa.fraunhofer.de/Util";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "Util";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UtilPackage eINSTANCE = de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl.init();

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.DescriptionImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getDescription()
     * @generated
     */
    int DESCRIPTION = 0;

    /**
     * The number of structural features of the '<em>Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyValueImpl <em>Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyValueImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyValue()
     * @generated
     */
    int PROPERTY_VALUE = 1;

    /**
     * The number of structural features of the '<em>Property Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Property Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyValueIntImpl <em>Property Value Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyValueIntImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyValueInt()
     * @generated
     */
    int PROPERTY_VALUE_INT = 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_INT__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Property Value Int</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_INT_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Property Value Int</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_INT_OPERATION_COUNT = PROPERTY_VALUE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyValueDoubleImpl <em>Property Value Double</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyValueDoubleImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyValueDouble()
     * @generated
     */
    int PROPERTY_VALUE_DOUBLE = 3;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_DOUBLE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Property Value Double</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_DOUBLE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Property Value Double</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_DOUBLE_OPERATION_COUNT = PROPERTY_VALUE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyValueStringImpl <em>Property Value String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyValueStringImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyValueString()
     * @generated
     */
    int PROPERTY_VALUE_STRING = 4;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_STRING__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Property Value String</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_STRING_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Property Value String</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_VALUE_STRING_OPERATION_COUNT = PROPERTY_VALUE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyTypeImpl <em>Property Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyType()
     * @generated
     */
    int PROPERTY_TYPE = 5;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE__TYPE = 0;

    /**
     * The number of structural features of the '<em>Property Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Property Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractPropertyImpl <em>Abstract Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.AbstractPropertyImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractProperty()
     * @generated
     */
    int ABSTRACT_PROPERTY = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_PROPERTY__NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_PROPERTY__DESCRIPTION = 1;

    /**
     * The number of structural features of the '<em>Abstract Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_PROPERTY_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Abstract Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_PROPERTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractResouceTypeImpl <em>Abstract Resouce Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.AbstractResouceTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractResouceType()
     * @generated
     */
    int ABSTRACT_RESOUCE_TYPE = 7;

    /**
     * The number of structural features of the '<em>Abstract Resouce Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_RESOUCE_TYPE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstract Resouce Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_RESOUCE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureImpl <em>Processor Architecture</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProcessorArchitecture()
     * @generated
     */
    int PROCESSOR_ARCHITECTURE = 8;

    /**
     * The number of structural features of the '<em>Processor Architecture</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ARCHITECTURE_FEATURE_COUNT = ABSTRACT_RESOUCE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Processor Architecture</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ARCHITECTURE_OPERATION_COUNT = ABSTRACT_RESOUCE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractCommunicationTypeImpl <em>Abstract Communication Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.AbstractCommunicationTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractCommunicationType()
     * @generated
     */
    int ABSTRACT_COMMUNICATION_TYPE = 9;

    /**
     * The number of structural features of the '<em>Abstract Communication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMMUNICATION_TYPE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstract Communication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMMUNICATION_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.CommunicationTypeImpl <em>Communication Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.CommunicationTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getCommunicationType()
     * @generated
     */
    int COMMUNICATION_TYPE = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_TYPE__NAME = ABSTRACT_COMMUNICATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Communication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_TYPE_FEATURE_COUNT = ABSTRACT_COMMUNICATION_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Communication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_TYPE_OPERATION_COUNT = ABSTRACT_COMMUNICATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.NetworkCommunicationTypeImpl <em>Network Communication Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.NetworkCommunicationTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getNetworkCommunicationType()
     * @generated
     */
    int NETWORK_COMMUNICATION_TYPE = 11;

    /**
     * The number of structural features of the '<em>Network Communication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_COMMUNICATION_TYPE_FEATURE_COUNT = ABSTRACT_COMMUNICATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Network Communication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_COMMUNICATION_TYPE_OPERATION_COUNT = ABSTRACT_COMMUNICATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.EthernetCommunicationTypeImpl <em>Ethernet Communication Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.EthernetCommunicationTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getEthernetCommunicationType()
     * @generated
     */
    int ETHERNET_COMMUNICATION_TYPE = 12;

    /**
     * The number of structural features of the '<em>Ethernet Communication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETHERNET_COMMUNICATION_TYPE_FEATURE_COUNT = NETWORK_COMMUNICATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Ethernet Communication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETHERNET_COMMUNICATION_TYPE_OPERATION_COUNT = NETWORK_COMMUNICATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.WlanCommunicationTypeImpl <em>Wlan Communication Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.WlanCommunicationTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getWlanCommunicationType()
     * @generated
     */
    int WLAN_COMMUNICATION_TYPE = 13;

    /**
     * The number of structural features of the '<em>Wlan Communication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WLAN_COMMUNICATION_TYPE_FEATURE_COUNT = NETWORK_COMMUNICATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Wlan Communication Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WLAN_COMMUNICATION_TYPE_OPERATION_COUNT = NETWORK_COMMUNICATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.AvailableResouceImpl <em>Available Resouce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.AvailableResouceImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAvailableResouce()
     * @generated
     */
    int AVAILABLE_RESOUCE = 14;

    /**
     * The feature id for the '<em><b>List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_RESOUCE__LIST = 0;

    /**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_RESOUCE__PROPERTY = 1;

    /**
     * The number of structural features of the '<em>Available Resouce</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_RESOUCE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Available Resouce</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AVAILABLE_RESOUCE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.OpertingSystemTypeImpl <em>Operting System Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.OpertingSystemTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getOpertingSystemType()
     * @generated
     */
    int OPERTING_SYSTEM_TYPE = 15;

    /**
     * The number of structural features of the '<em>Operting System Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERTING_SYSTEM_TYPE_FEATURE_COUNT = ABSTRACT_RESOUCE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Operting System Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERTING_SYSTEM_TYPE_OPERATION_COUNT = ABSTRACT_RESOUCE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.LinuxOpertingSystemTypeImpl <em>Linux Operting System Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.LinuxOpertingSystemTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getLinuxOpertingSystemType()
     * @generated
     */
    int LINUX_OPERTING_SYSTEM_TYPE = 16;

    /**
     * The number of structural features of the '<em>Linux Operting System Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINUX_OPERTING_SYSTEM_TYPE_FEATURE_COUNT = OPERTING_SYSTEM_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Linux Operting System Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINUX_OPERTING_SYSTEM_TYPE_OPERATION_COUNT = OPERTING_SYSTEM_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.MacOSOpertingSystemTypeImpl <em>Mac OS Operting System Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.MacOSOpertingSystemTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getMacOSOpertingSystemType()
     * @generated
     */
    int MAC_OS_OPERTING_SYSTEM_TYPE = 17;

    /**
     * The number of structural features of the '<em>Mac OS Operting System Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAC_OS_OPERTING_SYSTEM_TYPE_FEATURE_COUNT = OPERTING_SYSTEM_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Mac OS Operting System Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAC_OS_OPERTING_SYSTEM_TYPE_OPERATION_COUNT = OPERTING_SYSTEM_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureTypeImpl <em>Processor Architecture Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProcessorArchitectureType()
     * @generated
     */
    int PROCESSOR_ARCHITECTURE_TYPE = 18;

    /**
     * The number of structural features of the '<em>Processor Architecture Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ARCHITECTURE_TYPE_FEATURE_COUNT = ABSTRACT_RESOUCE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Processor Architecture Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ARCHITECTURE_TYPE_OPERATION_COUNT = ABSTRACT_RESOUCE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureValueImpl <em>Processor Architecture Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureValueImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProcessorArchitectureValue()
     * @generated
     */
    int PROCESSOR_ARCHITECTURE_VALUE = 19;

    /**
     * The number of structural features of the '<em>Processor Architecture Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ARCHITECTURE_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Processor Architecture Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_ARCHITECTURE_VALUE_OPERATION_COUNT = PROPERTY_VALUE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.X86ProcessorArchitectureImpl <em>X86 Processor Architecture</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.X86ProcessorArchitectureImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getX86ProcessorArchitecture()
     * @generated
     */
    int X86_PROCESSOR_ARCHITECTURE = 20;

    /**
     * The number of structural features of the '<em>X86 Processor Architecture</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int X86_PROCESSOR_ARCHITECTURE_FEATURE_COUNT = PROCESSOR_ARCHITECTURE_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>X86 Processor Architecture</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int X86_PROCESSOR_ARCHITECTURE_OPERATION_COUNT = PROCESSOR_ARCHITECTURE_VALUE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.Arm64ProcessorArchitectureImpl <em>Arm64 Processor Architecture</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.Arm64ProcessorArchitectureImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getArm64ProcessorArchitecture()
     * @generated
     */
    int ARM64_PROCESSOR_ARCHITECTURE = 21;

    /**
     * The number of structural features of the '<em>Arm64 Processor Architecture</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARM64_PROCESSOR_ARCHITECTURE_FEATURE_COUNT = PROCESSOR_ARCHITECTURE_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Arm64 Processor Architecture</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARM64_PROCESSOR_ARCHITECTURE_OPERATION_COUNT = PROCESSOR_ARCHITECTURE_VALUE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractImplementationImpl <em>Abstract Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.AbstractImplementationImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractImplementation()
     * @generated
     */
    int ABSTRACT_IMPLEMENTATION = 22;

    /**
     * The number of structural features of the '<em>Abstract Implementation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IMPLEMENTATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstract Implementation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IMPLEMENTATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractComputationAssignmentTargetImpl <em>Abstract Computation Assignment Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.AbstractComputationAssignmentTargetImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractComputationAssignmentTarget()
     * @generated
     */
    int ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET = 23;

    /**
     * The number of structural features of the '<em>Abstract Computation Assignment Target</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstract Computation Assignment Target</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyKindImpl <em>Property Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyKindImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyKind()
     * @generated
     */
    int PROPERTY_KIND = 24;

    /**
     * The number of structural features of the '<em>Property Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_KIND_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Property Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_KIND_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.AttributeKindImpl <em>Attribute Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.AttributeKindImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAttributeKind()
     * @generated
     */
    int ATTRIBUTE_KIND = 25;

    /**
     * The number of structural features of the '<em>Attribute Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_KIND_FEATURE_COUNT = PROPERTY_KIND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Attribute Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_KIND_OPERATION_COUNT = PROPERTY_KIND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.MaximumKindImpl <em>Maximum Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.MaximumKindImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getMaximumKind()
     * @generated
     */
    int MAXIMUM_KIND = 26;

    /**
     * The number of structural features of the '<em>Maximum Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAXIMUM_KIND_FEATURE_COUNT = PROPERTY_KIND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Maximum Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAXIMUM_KIND_OPERATION_COUNT = PROPERTY_KIND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.MinimumKindImpl <em>Minimum Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.MinimumKindImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getMinimumKind()
     * @generated
     */
    int MINIMUM_KIND = 27;

    /**
     * The number of structural features of the '<em>Minimum Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMUM_KIND_FEATURE_COUNT = PROPERTY_KIND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Minimum Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMUM_KIND_OPERATION_COUNT = PROPERTY_KIND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.SelectionKindImpl <em>Selection Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.SelectionKindImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getSelectionKind()
     * @generated
     */
    int SELECTION_KIND = 28;

    /**
     * The number of structural features of the '<em>Selection Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTION_KIND_FEATURE_COUNT = PROPERTY_KIND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Selection Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTION_KIND_OPERATION_COUNT = PROPERTY_KIND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.RangeKindImpl <em>Range Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.RangeKindImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getRangeKind()
     * @generated
     */
    int RANGE_KIND = 29;

    /**
     * The number of structural features of the '<em>Range Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_KIND_FEATURE_COUNT = PROPERTY_KIND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Range Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_KIND_OPERATION_COUNT = PROPERTY_KIND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyAttributeImpl <em>Property Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyAttributeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyAttribute()
     * @generated
     */
    int PROPERTY_ATTRIBUTE = 30;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_ATTRIBUTE__NAME = ABSTRACT_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_ATTRIBUTE__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_ATTRIBUTE__KIND = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_ATTRIBUTE__VALUE = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Property Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_ATTRIBUTE_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Property Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_ATTRIBUTE_OPERATION_COUNT = ABSTRACT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyMaximunImpl <em>Property Maximun</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyMaximunImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyMaximun()
     * @generated
     */
    int PROPERTY_MAXIMUN = 31;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MAXIMUN__NAME = ABSTRACT_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MAXIMUN__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MAXIMUN__KIND = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MAXIMUN__VALUE = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Property Maximun</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MAXIMUN_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Property Maximun</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MAXIMUN_OPERATION_COUNT = ABSTRACT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyMinimumImpl <em>Property Minimum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyMinimumImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyMinimum()
     * @generated
     */
    int PROPERTY_MINIMUM = 32;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MINIMUM__NAME = ABSTRACT_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MINIMUM__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MINIMUM__KIND = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MINIMUM__VALUE = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Property Minimum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MINIMUM_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Property Minimum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MINIMUM_OPERATION_COUNT = ABSTRACT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertySelectionImpl <em>Property Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertySelectionImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertySelection()
     * @generated
     */
    int PROPERTY_SELECTION = 33;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SELECTION__NAME = ABSTRACT_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SELECTION__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SELECTION__KIND = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SELECTION__VALUE = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Property Selection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SELECTION_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Property Selection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SELECTION_OPERATION_COUNT = ABSTRACT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyRangeImpl <em>Property Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyRangeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyRange()
     * @generated
     */
    int PROPERTY_RANGE = 34;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_RANGE__NAME = ABSTRACT_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_RANGE__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_RANGE__KIND = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_RANGE__VALUE = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Property Range</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_RANGE_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Property Range</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_RANGE_OPERATION_COUNT = ABSTRACT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.PropertyImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 35;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = ABSTRACT_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__KIND = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VALUE = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = ABSTRACT_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fraunhofer.ipa.deployment.util.impl.ResourceTypeImpl
     * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getResourceType()
     * @generated
     */
    int RESOURCE_TYPE = 36;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__NAME = ABSTRACT_RESOUCE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Resource Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE_FEATURE_COUNT = ABSTRACT_RESOUCE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Resource Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE_OPERATION_COUNT = ABSTRACT_RESOUCE_TYPE_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.Description <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Description</em>'.
     * @see de.fraunhofer.ipa.deployment.util.Description
     * @generated
     */
    EClass getDescription();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertyValue <em>Property Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValue
     * @generated
     */
    EClass getPropertyValue();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertyValueInt <em>Property Value Int</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Value Int</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValueInt
     * @generated
     */
    EClass getPropertyValueInt();

    /**
     * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.PropertyValueInt#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValueInt#getValue()
     * @see #getPropertyValueInt()
     * @generated
     */
    EAttribute getPropertyValueInt_Value();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertyValueDouble <em>Property Value Double</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Value Double</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValueDouble
     * @generated
     */
    EClass getPropertyValueDouble();

    /**
     * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.PropertyValueDouble#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValueDouble#getValue()
     * @see #getPropertyValueDouble()
     * @generated
     */
    EAttribute getPropertyValueDouble_Value();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertyValueString <em>Property Value String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Value String</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValueString
     * @generated
     */
    EClass getPropertyValueString();

    /**
     * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.PropertyValueString#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValueString#getValue()
     * @see #getPropertyValueString()
     * @generated
     */
    EAttribute getPropertyValueString_Value();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertyType <em>Property Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyType
     * @generated
     */
    EClass getPropertyType();

    /**
     * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.PropertyType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyType#getType()
     * @see #getPropertyType()
     * @generated
     */
    EAttribute getPropertyType_Type();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.AbstractProperty <em>Abstract Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Property</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AbstractProperty
     * @generated
     */
    EClass getAbstractProperty();

    /**
     * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.AbstractProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AbstractProperty#getName()
     * @see #getAbstractProperty()
     * @generated
     */
    EAttribute getAbstractProperty_Name();

    /**
     * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.AbstractProperty#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AbstractProperty#getDescription()
     * @see #getAbstractProperty()
     * @generated
     */
    EAttribute getAbstractProperty_Description();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.AbstractResouceType <em>Abstract Resouce Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Resouce Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AbstractResouceType
     * @generated
     */
    EClass getAbstractResouceType();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.ProcessorArchitecture <em>Processor Architecture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor Architecture</em>'.
     * @see de.fraunhofer.ipa.deployment.util.ProcessorArchitecture
     * @generated
     */
    EClass getProcessorArchitecture();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.AbstractCommunicationType <em>Abstract Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Communication Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AbstractCommunicationType
     * @generated
     */
    EClass getAbstractCommunicationType();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.CommunicationType <em>Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Communication Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.CommunicationType
     * @generated
     */
    EClass getCommunicationType();

    /**
     * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.CommunicationType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.fraunhofer.ipa.deployment.util.CommunicationType#getName()
     * @see #getCommunicationType()
     * @generated
     */
    EAttribute getCommunicationType_Name();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.NetworkCommunicationType <em>Network Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Network Communication Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.NetworkCommunicationType
     * @generated
     */
    EClass getNetworkCommunicationType();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.EthernetCommunicationType <em>Ethernet Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ethernet Communication Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.EthernetCommunicationType
     * @generated
     */
    EClass getEthernetCommunicationType();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.WlanCommunicationType <em>Wlan Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wlan Communication Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.WlanCommunicationType
     * @generated
     */
    EClass getWlanCommunicationType();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.AvailableResouce <em>Available Resouce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Available Resouce</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AvailableResouce
     * @generated
     */
    EClass getAvailableResouce();

    /**
     * Returns the meta object for the containment reference list '{@link de.fraunhofer.ipa.deployment.util.AvailableResouce#getList <em>List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>List</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AvailableResouce#getList()
     * @see #getAvailableResouce()
     * @generated
     */
    EReference getAvailableResouce_List();

    /**
     * Returns the meta object for the reference '{@link de.fraunhofer.ipa.deployment.util.AvailableResouce#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Property</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AvailableResouce#getProperty()
     * @see #getAvailableResouce()
     * @generated
     */
    EReference getAvailableResouce_Property();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.OpertingSystemType <em>Operting System Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operting System Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.OpertingSystemType
     * @generated
     */
    EClass getOpertingSystemType();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.LinuxOpertingSystemType <em>Linux Operting System Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linux Operting System Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.LinuxOpertingSystemType
     * @generated
     */
    EClass getLinuxOpertingSystemType();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.MacOSOpertingSystemType <em>Mac OS Operting System Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mac OS Operting System Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.MacOSOpertingSystemType
     * @generated
     */
    EClass getMacOSOpertingSystemType();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType <em>Processor Architecture Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor Architecture Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType
     * @generated
     */
    EClass getProcessorArchitectureType();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue <em>Processor Architecture Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor Architecture Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue
     * @generated
     */
    EClass getProcessorArchitectureValue();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.X86ProcessorArchitecture <em>X86 Processor Architecture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>X86 Processor Architecture</em>'.
     * @see de.fraunhofer.ipa.deployment.util.X86ProcessorArchitecture
     * @generated
     */
    EClass getX86ProcessorArchitecture();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.Arm64ProcessorArchitecture <em>Arm64 Processor Architecture</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Arm64 Processor Architecture</em>'.
     * @see de.fraunhofer.ipa.deployment.util.Arm64ProcessorArchitecture
     * @generated
     */
    EClass getArm64ProcessorArchitecture();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.AbstractImplementation <em>Abstract Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Implementation</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AbstractImplementation
     * @generated
     */
    EClass getAbstractImplementation();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget <em>Abstract Computation Assignment Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Computation Assignment Target</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget
     * @generated
     */
    EClass getAbstractComputationAssignmentTarget();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertyKind <em>Property Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyKind
     * @generated
     */
    EClass getPropertyKind();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.AttributeKind <em>Attribute Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.AttributeKind
     * @generated
     */
    EClass getAttributeKind();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.MaximumKind <em>Maximum Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Maximum Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.MaximumKind
     * @generated
     */
    EClass getMaximumKind();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.MinimumKind <em>Minimum Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Minimum Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.MinimumKind
     * @generated
     */
    EClass getMinimumKind();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.SelectionKind <em>Selection Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Selection Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.SelectionKind
     * @generated
     */
    EClass getSelectionKind();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.RangeKind <em>Range Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Range Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.RangeKind
     * @generated
     */
    EClass getRangeKind();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertyAttribute <em>Property Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Attribute</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyAttribute
     * @generated
     */
    EClass getPropertyAttribute();

    /**
     * Returns the meta object for the containment reference '{@link de.fraunhofer.ipa.deployment.util.PropertyAttribute#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyAttribute#getKind()
     * @see #getPropertyAttribute()
     * @generated
     */
    EReference getPropertyAttribute_Kind();

    /**
     * Returns the meta object for the containment reference '{@link de.fraunhofer.ipa.deployment.util.PropertyAttribute#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyAttribute#getValue()
     * @see #getPropertyAttribute()
     * @generated
     */
    EReference getPropertyAttribute_Value();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertyMaximun <em>Property Maximun</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Maximun</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyMaximun
     * @generated
     */
    EClass getPropertyMaximun();

    /**
     * Returns the meta object for the containment reference '{@link de.fraunhofer.ipa.deployment.util.PropertyMaximun#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyMaximun#getKind()
     * @see #getPropertyMaximun()
     * @generated
     */
    EReference getPropertyMaximun_Kind();

    /**
     * Returns the meta object for the containment reference '{@link de.fraunhofer.ipa.deployment.util.PropertyMaximun#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyMaximun#getValue()
     * @see #getPropertyMaximun()
     * @generated
     */
    EReference getPropertyMaximun_Value();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertyMinimum <em>Property Minimum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Minimum</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyMinimum
     * @generated
     */
    EClass getPropertyMinimum();

    /**
     * Returns the meta object for the containment reference '{@link de.fraunhofer.ipa.deployment.util.PropertyMinimum#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyMinimum#getKind()
     * @see #getPropertyMinimum()
     * @generated
     */
    EReference getPropertyMinimum_Kind();

    /**
     * Returns the meta object for the containment reference '{@link de.fraunhofer.ipa.deployment.util.PropertyMinimum#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyMinimum#getValue()
     * @see #getPropertyMinimum()
     * @generated
     */
    EReference getPropertyMinimum_Value();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertySelection <em>Property Selection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Selection</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertySelection
     * @generated
     */
    EClass getPropertySelection();

    /**
     * Returns the meta object for the containment reference '{@link de.fraunhofer.ipa.deployment.util.PropertySelection#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertySelection#getKind()
     * @see #getPropertySelection()
     * @generated
     */
    EReference getPropertySelection_Kind();

    /**
     * Returns the meta object for the containment reference list '{@link de.fraunhofer.ipa.deployment.util.PropertySelection#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertySelection#getValue()
     * @see #getPropertySelection()
     * @generated
     */
    EReference getPropertySelection_Value();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.PropertyRange <em>Property Range</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Range</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyRange
     * @generated
     */
    EClass getPropertyRange();

    /**
     * Returns the meta object for the containment reference '{@link de.fraunhofer.ipa.deployment.util.PropertyRange#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyRange#getKind()
     * @see #getPropertyRange()
     * @generated
     */
    EReference getPropertyRange_Kind();

    /**
     * Returns the meta object for the containment reference list '{@link de.fraunhofer.ipa.deployment.util.PropertyRange#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.PropertyRange#getValue()
     * @see #getPropertyRange()
     * @generated
     */
    EReference getPropertyRange_Value();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see de.fraunhofer.ipa.deployment.util.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the containment reference '{@link de.fraunhofer.ipa.deployment.util.Property#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Kind</em>'.
     * @see de.fraunhofer.ipa.deployment.util.Property#getKind()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Kind();

    /**
     * Returns the meta object for the containment reference list '{@link de.fraunhofer.ipa.deployment.util.Property#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value</em>'.
     * @see de.fraunhofer.ipa.deployment.util.Property#getValue()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Value();

    /**
     * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.ResourceType <em>Resource Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Type</em>'.
     * @see de.fraunhofer.ipa.deployment.util.ResourceType
     * @generated
     */
    EClass getResourceType();

    /**
     * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.ResourceType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.fraunhofer.ipa.deployment.util.ResourceType#getName()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_Name();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    UtilFactory getUtilFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.DescriptionImpl <em>Description</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.DescriptionImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getDescription()
         * @generated
         */
        EClass DESCRIPTION = eINSTANCE.getDescription();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyValueImpl <em>Property Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyValueImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyValue()
         * @generated
         */
        EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyValueIntImpl <em>Property Value Int</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyValueIntImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyValueInt()
         * @generated
         */
        EClass PROPERTY_VALUE_INT = eINSTANCE.getPropertyValueInt();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY_VALUE_INT__VALUE = eINSTANCE.getPropertyValueInt_Value();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyValueDoubleImpl <em>Property Value Double</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyValueDoubleImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyValueDouble()
         * @generated
         */
        EClass PROPERTY_VALUE_DOUBLE = eINSTANCE.getPropertyValueDouble();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY_VALUE_DOUBLE__VALUE = eINSTANCE.getPropertyValueDouble_Value();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyValueStringImpl <em>Property Value String</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyValueStringImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyValueString()
         * @generated
         */
        EClass PROPERTY_VALUE_STRING = eINSTANCE.getPropertyValueString();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY_VALUE_STRING__VALUE = eINSTANCE.getPropertyValueString_Value();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyTypeImpl <em>Property Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyType()
         * @generated
         */
        EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY_TYPE__TYPE = eINSTANCE.getPropertyType_Type();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractPropertyImpl <em>Abstract Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.AbstractPropertyImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractProperty()
         * @generated
         */
        EClass ABSTRACT_PROPERTY = eINSTANCE.getAbstractProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_PROPERTY__NAME = eINSTANCE.getAbstractProperty_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_PROPERTY__DESCRIPTION = eINSTANCE.getAbstractProperty_Description();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractResouceTypeImpl <em>Abstract Resouce Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.AbstractResouceTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractResouceType()
         * @generated
         */
        EClass ABSTRACT_RESOUCE_TYPE = eINSTANCE.getAbstractResouceType();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureImpl <em>Processor Architecture</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProcessorArchitecture()
         * @generated
         */
        EClass PROCESSOR_ARCHITECTURE = eINSTANCE.getProcessorArchitecture();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractCommunicationTypeImpl <em>Abstract Communication Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.AbstractCommunicationTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractCommunicationType()
         * @generated
         */
        EClass ABSTRACT_COMMUNICATION_TYPE = eINSTANCE.getAbstractCommunicationType();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.CommunicationTypeImpl <em>Communication Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.CommunicationTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getCommunicationType()
         * @generated
         */
        EClass COMMUNICATION_TYPE = eINSTANCE.getCommunicationType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMUNICATION_TYPE__NAME = eINSTANCE.getCommunicationType_Name();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.NetworkCommunicationTypeImpl <em>Network Communication Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.NetworkCommunicationTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getNetworkCommunicationType()
         * @generated
         */
        EClass NETWORK_COMMUNICATION_TYPE = eINSTANCE.getNetworkCommunicationType();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.EthernetCommunicationTypeImpl <em>Ethernet Communication Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.EthernetCommunicationTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getEthernetCommunicationType()
         * @generated
         */
        EClass ETHERNET_COMMUNICATION_TYPE = eINSTANCE.getEthernetCommunicationType();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.WlanCommunicationTypeImpl <em>Wlan Communication Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.WlanCommunicationTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getWlanCommunicationType()
         * @generated
         */
        EClass WLAN_COMMUNICATION_TYPE = eINSTANCE.getWlanCommunicationType();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.AvailableResouceImpl <em>Available Resouce</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.AvailableResouceImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAvailableResouce()
         * @generated
         */
        EClass AVAILABLE_RESOUCE = eINSTANCE.getAvailableResouce();

        /**
         * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AVAILABLE_RESOUCE__LIST = eINSTANCE.getAvailableResouce_List();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AVAILABLE_RESOUCE__PROPERTY = eINSTANCE.getAvailableResouce_Property();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.OpertingSystemTypeImpl <em>Operting System Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.OpertingSystemTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getOpertingSystemType()
         * @generated
         */
        EClass OPERTING_SYSTEM_TYPE = eINSTANCE.getOpertingSystemType();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.LinuxOpertingSystemTypeImpl <em>Linux Operting System Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.LinuxOpertingSystemTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getLinuxOpertingSystemType()
         * @generated
         */
        EClass LINUX_OPERTING_SYSTEM_TYPE = eINSTANCE.getLinuxOpertingSystemType();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.MacOSOpertingSystemTypeImpl <em>Mac OS Operting System Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.MacOSOpertingSystemTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getMacOSOpertingSystemType()
         * @generated
         */
        EClass MAC_OS_OPERTING_SYSTEM_TYPE = eINSTANCE.getMacOSOpertingSystemType();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureTypeImpl <em>Processor Architecture Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProcessorArchitectureType()
         * @generated
         */
        EClass PROCESSOR_ARCHITECTURE_TYPE = eINSTANCE.getProcessorArchitectureType();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureValueImpl <em>Processor Architecture Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureValueImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProcessorArchitectureValue()
         * @generated
         */
        EClass PROCESSOR_ARCHITECTURE_VALUE = eINSTANCE.getProcessorArchitectureValue();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.X86ProcessorArchitectureImpl <em>X86 Processor Architecture</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.X86ProcessorArchitectureImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getX86ProcessorArchitecture()
         * @generated
         */
        EClass X86_PROCESSOR_ARCHITECTURE = eINSTANCE.getX86ProcessorArchitecture();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.Arm64ProcessorArchitectureImpl <em>Arm64 Processor Architecture</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.Arm64ProcessorArchitectureImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getArm64ProcessorArchitecture()
         * @generated
         */
        EClass ARM64_PROCESSOR_ARCHITECTURE = eINSTANCE.getArm64ProcessorArchitecture();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractImplementationImpl <em>Abstract Implementation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.AbstractImplementationImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractImplementation()
         * @generated
         */
        EClass ABSTRACT_IMPLEMENTATION = eINSTANCE.getAbstractImplementation();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractComputationAssignmentTargetImpl <em>Abstract Computation Assignment Target</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.AbstractComputationAssignmentTargetImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractComputationAssignmentTarget()
         * @generated
         */
        EClass ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET = eINSTANCE.getAbstractComputationAssignmentTarget();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyKindImpl <em>Property Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyKindImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyKind()
         * @generated
         */
        EClass PROPERTY_KIND = eINSTANCE.getPropertyKind();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.AttributeKindImpl <em>Attribute Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.AttributeKindImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAttributeKind()
         * @generated
         */
        EClass ATTRIBUTE_KIND = eINSTANCE.getAttributeKind();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.MaximumKindImpl <em>Maximum Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.MaximumKindImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getMaximumKind()
         * @generated
         */
        EClass MAXIMUM_KIND = eINSTANCE.getMaximumKind();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.MinimumKindImpl <em>Minimum Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.MinimumKindImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getMinimumKind()
         * @generated
         */
        EClass MINIMUM_KIND = eINSTANCE.getMinimumKind();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.SelectionKindImpl <em>Selection Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.SelectionKindImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getSelectionKind()
         * @generated
         */
        EClass SELECTION_KIND = eINSTANCE.getSelectionKind();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.RangeKindImpl <em>Range Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.RangeKindImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getRangeKind()
         * @generated
         */
        EClass RANGE_KIND = eINSTANCE.getRangeKind();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyAttributeImpl <em>Property Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyAttributeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyAttribute()
         * @generated
         */
        EClass PROPERTY_ATTRIBUTE = eINSTANCE.getPropertyAttribute();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_ATTRIBUTE__KIND = eINSTANCE.getPropertyAttribute_Kind();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_ATTRIBUTE__VALUE = eINSTANCE.getPropertyAttribute_Value();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyMaximunImpl <em>Property Maximun</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyMaximunImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyMaximun()
         * @generated
         */
        EClass PROPERTY_MAXIMUN = eINSTANCE.getPropertyMaximun();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_MAXIMUN__KIND = eINSTANCE.getPropertyMaximun_Kind();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_MAXIMUN__VALUE = eINSTANCE.getPropertyMaximun_Value();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyMinimumImpl <em>Property Minimum</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyMinimumImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyMinimum()
         * @generated
         */
        EClass PROPERTY_MINIMUM = eINSTANCE.getPropertyMinimum();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_MINIMUM__KIND = eINSTANCE.getPropertyMinimum_Kind();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_MINIMUM__VALUE = eINSTANCE.getPropertyMinimum_Value();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertySelectionImpl <em>Property Selection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertySelectionImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertySelection()
         * @generated
         */
        EClass PROPERTY_SELECTION = eINSTANCE.getPropertySelection();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_SELECTION__KIND = eINSTANCE.getPropertySelection_Kind();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_SELECTION__VALUE = eINSTANCE.getPropertySelection_Value();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyRangeImpl <em>Property Range</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyRangeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getPropertyRange()
         * @generated
         */
        EClass PROPERTY_RANGE = eINSTANCE.getPropertyRange();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_RANGE__KIND = eINSTANCE.getPropertyRange_Kind();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_RANGE__VALUE = eINSTANCE.getPropertyRange_Value();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.PropertyImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__KIND = eINSTANCE.getProperty_Kind();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

        /**
         * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fraunhofer.ipa.deployment.util.impl.ResourceTypeImpl
         * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getResourceType()
         * @generated
         */
        EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__NAME = eINSTANCE.getResourceType_Name();

    }

} //UtilPackage
