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
	 * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.deployment.util.impl.PropertyImpl
	 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.ResouceTypeImpl <em>Resouce Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.deployment.util.impl.ResouceTypeImpl
	 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getResouceType()
	 * @generated
	 */
	int RESOUCE_TYPE = 9;

	/**
	 * The number of structural features of the '<em>Resouce Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOUCE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Resouce Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOUCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.OpertingSystemImpl <em>Operting System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.deployment.util.impl.OpertingSystemImpl
	 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getOpertingSystem()
	 * @generated
	 */
	int OPERTING_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERTING_SYSTEM__NAME = RESOUCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operting System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERTING_SYSTEM_FEATURE_COUNT = RESOUCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operting System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERTING_SYSTEM_OPERATION_COUNT = RESOUCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.LinuxOpertingSystemImpl <em>Linux Operting System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.deployment.util.impl.LinuxOpertingSystemImpl
	 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getLinuxOpertingSystem()
	 * @generated
	 */
	int LINUX_OPERTING_SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_OPERTING_SYSTEM__NAME = OPERTING_SYSTEM__NAME;

	/**
	 * The number of structural features of the '<em>Linux Operting System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_OPERTING_SYSTEM_FEATURE_COUNT = OPERTING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linux Operting System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_OPERTING_SYSTEM_OPERATION_COUNT = OPERTING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureImpl <em>Processor Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.deployment.util.impl.ProcessorArchitectureImpl
	 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProcessorArchitecture()
	 * @generated
	 */
	int PROCESSOR_ARCHITECTURE = 10;

	/**
	 * The number of structural features of the '<em>Processor Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_ARCHITECTURE_FEATURE_COUNT = RESOUCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Processor Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_ARCHITECTURE_OPERATION_COUNT = RESOUCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.X86ProcessorArchitectureImpl <em>X86 Processor Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.deployment.util.impl.X86ProcessorArchitectureImpl
	 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getX86ProcessorArchitecture()
	 * @generated
	 */
	int X86_PROCESSOR_ARCHITECTURE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X86_PROCESSOR_ARCHITECTURE__NAME = PROCESSOR_ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>X86 Processor Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X86_PROCESSOR_ARCHITECTURE_FEATURE_COUNT = PROCESSOR_ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>X86 Processor Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X86_PROCESSOR_ARCHITECTURE_OPERATION_COUNT = PROCESSOR_ARCHITECTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.Arm64ProcessorArchitectureImpl <em>Arm64 Processor Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.deployment.util.impl.Arm64ProcessorArchitectureImpl
	 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getArm64ProcessorArchitecture()
	 * @generated
	 */
	int ARM64_PROCESSOR_ARCHITECTURE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM64_PROCESSOR_ARCHITECTURE__NAME = PROCESSOR_ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arm64 Processor Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM64_PROCESSOR_ARCHITECTURE_FEATURE_COUNT = PROCESSOR_ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arm64 Processor Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM64_PROCESSOR_ARCHITECTURE_OPERATION_COUNT = PROCESSOR_ARCHITECTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.AbstractCommunicationTypeImpl <em>Abstract Communication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.deployment.util.impl.AbstractCommunicationTypeImpl
	 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getAbstractCommunicationType()
	 * @generated
	 */
	int ABSTRACT_COMMUNICATION_TYPE = 13;

	/**
	 * The number of structural features of the '<em>Abstract Communication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMUNICATION_TYPE_FEATURE_COUNT = RESOUCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Communication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMUNICATION_TYPE_OPERATION_COUNT = RESOUCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.deployment.util.impl.CommunicationTypeImpl <em>Communication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.deployment.util.impl.CommunicationTypeImpl
	 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getCommunicationType()
	 * @generated
	 */
	int COMMUNICATION_TYPE = 14;

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
	int NETWORK_COMMUNICATION_TYPE = 15;

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
	int ETHERNET_COMMUNICATION_TYPE = 16;

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
	int WLAN_COMMUNICATION_TYPE = 17;

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
	int AVAILABLE_RESOUCE = 18;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_RESOUCE__LIST = 0;

	/**
	 * The number of structural features of the '<em>Available Resouce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_RESOUCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Available Resouce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_RESOUCE_OPERATION_COUNT = 0;

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
	 * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see de.fraunhofer.ipa.deployment.util.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.ipa.deployment.util.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.ipa.deployment.util.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.fraunhofer.ipa.deployment.util.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Value();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.OpertingSystem <em>Operting System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operting System</em>'.
	 * @see de.fraunhofer.ipa.deployment.util.OpertingSystem
	 * @generated
	 */
	EClass getOpertingSystem();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.OpertingSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.ipa.deployment.util.OpertingSystem#getName()
	 * @see #getOpertingSystem()
	 * @generated
	 */
	EAttribute getOpertingSystem_Name();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.LinuxOpertingSystem <em>Linux Operting System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linux Operting System</em>'.
	 * @see de.fraunhofer.ipa.deployment.util.LinuxOpertingSystem
	 * @generated
	 */
	EClass getLinuxOpertingSystem();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.ResouceType <em>Resouce Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resouce Type</em>'.
	 * @see de.fraunhofer.ipa.deployment.util.ResouceType
	 * @generated
	 */
	EClass getResouceType();

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
	 * Returns the meta object for class '{@link de.fraunhofer.ipa.deployment.util.X86ProcessorArchitecture <em>X86 Processor Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X86 Processor Architecture</em>'.
	 * @see de.fraunhofer.ipa.deployment.util.X86ProcessorArchitecture
	 * @generated
	 */
	EClass getX86ProcessorArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.X86ProcessorArchitecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.ipa.deployment.util.X86ProcessorArchitecture#getName()
	 * @see #getX86ProcessorArchitecture()
	 * @generated
	 */
	EAttribute getX86ProcessorArchitecture_Name();

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
	 * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.deployment.util.Arm64ProcessorArchitecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.ipa.deployment.util.Arm64ProcessorArchitecture#getName()
	 * @see #getArm64ProcessorArchitecture()
	 * @generated
	 */
	EAttribute getArm64ProcessorArchitecture_Name();

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
		 * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.ipa.deployment.util.impl.PropertyImpl
		 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.OpertingSystemImpl <em>Operting System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.ipa.deployment.util.impl.OpertingSystemImpl
		 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getOpertingSystem()
		 * @generated
		 */
		EClass OPERTING_SYSTEM = eINSTANCE.getOpertingSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERTING_SYSTEM__NAME = eINSTANCE.getOpertingSystem_Name();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.LinuxOpertingSystemImpl <em>Linux Operting System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.ipa.deployment.util.impl.LinuxOpertingSystemImpl
		 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getLinuxOpertingSystem()
		 * @generated
		 */
		EClass LINUX_OPERTING_SYSTEM = eINSTANCE.getLinuxOpertingSystem();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.ResouceTypeImpl <em>Resouce Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.ipa.deployment.util.impl.ResouceTypeImpl
		 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getResouceType()
		 * @generated
		 */
		EClass RESOUCE_TYPE = eINSTANCE.getResouceType();

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
		 * The meta object literal for the '{@link de.fraunhofer.ipa.deployment.util.impl.X86ProcessorArchitectureImpl <em>X86 Processor Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.ipa.deployment.util.impl.X86ProcessorArchitectureImpl
		 * @see de.fraunhofer.ipa.deployment.util.impl.UtilPackageImpl#getX86ProcessorArchitecture()
		 * @generated
		 */
		EClass X86_PROCESSOR_ARCHITECTURE = eINSTANCE.getX86ProcessorArchitecture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X86_PROCESSOR_ARCHITECTURE__NAME = eINSTANCE.getX86ProcessorArchitecture_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARM64_PROCESSOR_ARCHITECTURE__NAME = eINSTANCE.getArm64ProcessorArchitecture_Name();

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

	}

} //UtilPackage
