/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.UtilPackage;

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
 * @see device.DeviceFactory
 * @model kind="package"
 * @generated
 */
public interface DevicePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "device";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.ipa.fraunhofer.de/Device";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "Device";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DevicePackage eINSTANCE = device.impl.DevicePackageImpl.init();

    /**
     * The meta object id for the '{@link device.impl.DeviceSetImpl <em>Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.DeviceSetImpl
     * @see device.impl.DevicePackageImpl#getDeviceSet()
     * @generated
     */
    int DEVICE_SET = 0;

    /**
     * The feature id for the '<em><b>Device</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_SET__DEVICE = UtilPackage.DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_SET_FEATURE_COUNT = UtilPackage.DESCRIPTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_SET_OPERATION_COUNT = UtilPackage.DESCRIPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.DeviceTypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.DeviceTypeImpl
     * @see device.impl.DevicePackageImpl#getDeviceType()
     * @generated
     */
    int DEVICE_TYPE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>Device Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__DEVICE_PROPERTY = 1;

    /**
     * The feature id for the '<em><b>Communication Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__COMMUNICATION_CONNECTION = 2;

    /**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link device.impl.AbstractDeviceConfigImpl <em>Abstract Device Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AbstractDeviceConfigImpl
     * @see device.impl.DevicePackageImpl#getAbstractDeviceConfig()
     * @generated
     */
    int ABSTRACT_DEVICE_CONFIG = 19;

    /**
     * The meta object id for the '{@link device.impl.DevicePropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.DevicePropertyImpl
     * @see device.impl.DevicePackageImpl#getDeviceProperty()
     * @generated
     */
    int DEVICE_PROPERTY = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_PROPERTY__NAME = UtilPackage.PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_PROPERTY__DESCRIPTION = UtilPackage.PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_PROPERTY__KIND = UtilPackage.PROPERTY__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_PROPERTY__VALUE = UtilPackage.PROPERTY__VALUE;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_PROPERTY__TYPE = UtilPackage.PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_PROPERTY_FEATURE_COUNT = UtilPackage.PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_PROPERTY_OPERATION_COUNT = UtilPackage.PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.AbstractCommunicationConnectionImpl <em>Abstract Communication Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AbstractCommunicationConnectionImpl
     * @see device.impl.DevicePackageImpl#getAbstractCommunicationConnection()
     * @generated
     */
    int ABSTRACT_COMMUNICATION_CONNECTION = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMMUNICATION_CONNECTION__NAME = 0;

    /**
     * The number of structural features of the '<em>Abstract Communication Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMMUNICATION_CONNECTION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Abstract Communication Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMMUNICATION_CONNECTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link device.impl.CommunicationConnectionImpl <em>Communication Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.CommunicationConnectionImpl
     * @see device.impl.DevicePackageImpl#getCommunicationConnection()
     * @generated
     */
    int COMMUNICATION_CONNECTION = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_CONNECTION__NAME = ABSTRACT_COMMUNICATION_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_CONNECTION__TYPE = ABSTRACT_COMMUNICATION_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_CONNECTION__PROPERTIES = ABSTRACT_COMMUNICATION_CONNECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Communication Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_CONNECTION_FEATURE_COUNT = ABSTRACT_COMMUNICATION_CONNECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Communication Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_CONNECTION_OPERATION_COUNT = ABSTRACT_COMMUNICATION_CONNECTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.CapabilityKindImpl <em>Capability Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.CapabilityKindImpl
     * @see device.impl.DevicePackageImpl#getCapabilityKind()
     * @generated
     */
    int CAPABILITY_KIND = 4;

    /**
     * The number of structural features of the '<em>Capability Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_KIND_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Capability Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_KIND_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link device.impl.AttributeKindImpl <em>Attribute Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AttributeKindImpl
     * @see device.impl.DevicePackageImpl#getAttributeKind()
     * @generated
     */
    int ATTRIBUTE_KIND = 5;

    /**
     * The number of structural features of the '<em>Attribute Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_KIND_FEATURE_COUNT = CAPABILITY_KIND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Attribute Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_KIND_OPERATION_COUNT = CAPABILITY_KIND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.MaximumKindImpl <em>Maximum Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.MaximumKindImpl
     * @see device.impl.DevicePackageImpl#getMaximumKind()
     * @generated
     */
    int MAXIMUM_KIND = 6;

    /**
     * The number of structural features of the '<em>Maximum Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAXIMUM_KIND_FEATURE_COUNT = CAPABILITY_KIND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Maximum Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAXIMUM_KIND_OPERATION_COUNT = CAPABILITY_KIND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.MinimumKindImpl <em>Minimum Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.MinimumKindImpl
     * @see device.impl.DevicePackageImpl#getMinimumKind()
     * @generated
     */
    int MINIMUM_KIND = 7;

    /**
     * The number of structural features of the '<em>Minimum Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMUM_KIND_FEATURE_COUNT = CAPABILITY_KIND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Minimum Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MINIMUM_KIND_OPERATION_COUNT = CAPABILITY_KIND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.SelectionKindImpl <em>Selection Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.SelectionKindImpl
     * @see device.impl.DevicePackageImpl#getSelectionKind()
     * @generated
     */
    int SELECTION_KIND = 8;

    /**
     * The number of structural features of the '<em>Selection Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTION_KIND_FEATURE_COUNT = CAPABILITY_KIND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Selection Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTION_KIND_OPERATION_COUNT = CAPABILITY_KIND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.RangeKindImpl <em>Range Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.RangeKindImpl
     * @see device.impl.DevicePackageImpl#getRangeKind()
     * @generated
     */
    int RANGE_KIND = 9;

    /**
     * The number of structural features of the '<em>Range Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_KIND_FEATURE_COUNT = CAPABILITY_KIND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Range Kind</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_KIND_OPERATION_COUNT = CAPABILITY_KIND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.ConnectionPropertyImpl <em>Connection Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.ConnectionPropertyImpl
     * @see device.impl.DevicePackageImpl#getConnectionProperty()
     * @generated
     */
    int CONNECTION_PROPERTY = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_PROPERTY__NAME = UtilPackage.PROPERTY_ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_PROPERTY__DESCRIPTION = UtilPackage.PROPERTY_ATTRIBUTE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_PROPERTY__KIND = UtilPackage.PROPERTY_ATTRIBUTE__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_PROPERTY__VALUE = UtilPackage.PROPERTY_ATTRIBUTE__VALUE;

    /**
     * The number of structural features of the '<em>Connection Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_PROPERTY_FEATURE_COUNT = UtilPackage.PROPERTY_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Connection Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_PROPERTY_OPERATION_COUNT = UtilPackage.PROPERTY_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.CapabilityTypeImpl <em>Capability Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.CapabilityTypeImpl
     * @see device.impl.DevicePackageImpl#getCapabilityType()
     * @generated
     */
    int CAPABILITY_TYPE = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_TYPE__NAME = UtilPackage.ABSTRACT_RESOUCE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Capability Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_TYPE_FEATURE_COUNT = UtilPackage.ABSTRACT_RESOUCE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Capability Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_TYPE_OPERATION_COUNT = UtilPackage.ABSTRACT_RESOUCE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.ComputationDeviceTypeImpl <em>Computation Device Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.ComputationDeviceTypeImpl
     * @see device.impl.DevicePackageImpl#getComputationDeviceType()
     * @generated
     */
    int COMPUTATION_DEVICE_TYPE = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_TYPE__NAME = DEVICE_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Device Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_TYPE__DEVICE_PROPERTY = DEVICE_TYPE__DEVICE_PROPERTY;

    /**
     * The feature id for the '<em><b>Communication Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_TYPE__COMMUNICATION_CONNECTION = DEVICE_TYPE__COMMUNICATION_CONNECTION;

    /**
     * The number of structural features of the '<em>Computation Device Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_TYPE_FEATURE_COUNT = DEVICE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Computation Device Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_TYPE_OPERATION_COUNT = DEVICE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.NetworkConnectionImpl <em>Network Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.NetworkConnectionImpl
     * @see device.impl.DevicePackageImpl#getNetworkConnection()
     * @generated
     */
    int NETWORK_CONNECTION = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_CONNECTION__NAME = ABSTRACT_COMMUNICATION_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_CONNECTION__TYPE = ABSTRACT_COMMUNICATION_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_CONNECTION__PROPERTIES = ABSTRACT_COMMUNICATION_CONNECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Network Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_CONNECTION_FEATURE_COUNT = ABSTRACT_COMMUNICATION_CONNECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Network Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK_CONNECTION_OPERATION_COUNT = ABSTRACT_COMMUNICATION_CONNECTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.AbstractNetworkPropertyImpl <em>Abstract Network Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AbstractNetworkPropertyImpl
     * @see device.impl.DevicePackageImpl#getAbstractNetworkProperty()
     * @generated
     */
    int ABSTRACT_NETWORK_PROPERTY = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NETWORK_PROPERTY__NAME = UtilPackage.PROPERTY_ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NETWORK_PROPERTY__DESCRIPTION = UtilPackage.PROPERTY_ATTRIBUTE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NETWORK_PROPERTY__KIND = UtilPackage.PROPERTY_ATTRIBUTE__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NETWORK_PROPERTY__VALUE = UtilPackage.PROPERTY_ATTRIBUTE__VALUE;

    /**
     * The number of structural features of the '<em>Abstract Network Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NETWORK_PROPERTY_FEATURE_COUNT = UtilPackage.PROPERTY_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Abstract Network Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_NETWORK_PROPERTY_OPERATION_COUNT = UtilPackage.PROPERTY_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.InterfaceNetworkPropertyImpl <em>Interface Network Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.InterfaceNetworkPropertyImpl
     * @see device.impl.DevicePackageImpl#getInterfaceNetworkProperty()
     * @generated
     */
    int INTERFACE_NETWORK_PROPERTY = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_NETWORK_PROPERTY__NAME = ABSTRACT_NETWORK_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_NETWORK_PROPERTY__DESCRIPTION = ABSTRACT_NETWORK_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_NETWORK_PROPERTY__KIND = ABSTRACT_NETWORK_PROPERTY__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_NETWORK_PROPERTY__VALUE = ABSTRACT_NETWORK_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Interface Network Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_NETWORK_PROPERTY_FEATURE_COUNT = ABSTRACT_NETWORK_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Interface Network Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_NETWORK_PROPERTY_OPERATION_COUNT = ABSTRACT_NETWORK_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.AddressNetworkPropertyImpl <em>Address Network Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AddressNetworkPropertyImpl
     * @see device.impl.DevicePackageImpl#getAddressNetworkProperty()
     * @generated
     */
    int ADDRESS_NETWORK_PROPERTY = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_NETWORK_PROPERTY__NAME = ABSTRACT_NETWORK_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_NETWORK_PROPERTY__DESCRIPTION = ABSTRACT_NETWORK_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_NETWORK_PROPERTY__KIND = ABSTRACT_NETWORK_PROPERTY__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_NETWORK_PROPERTY__VALUE = ABSTRACT_NETWORK_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Address Network Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_NETWORK_PROPERTY_FEATURE_COUNT = ABSTRACT_NETWORK_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Address Network Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_NETWORK_PROPERTY_OPERATION_COUNT = ABSTRACT_NETWORK_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.MacNetworkPropertyImpl <em>Mac Network Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.MacNetworkPropertyImpl
     * @see device.impl.DevicePackageImpl#getMacNetworkProperty()
     * @generated
     */
    int MAC_NETWORK_PROPERTY = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAC_NETWORK_PROPERTY__NAME = ABSTRACT_NETWORK_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAC_NETWORK_PROPERTY__DESCRIPTION = ABSTRACT_NETWORK_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAC_NETWORK_PROPERTY__KIND = ABSTRACT_NETWORK_PROPERTY__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAC_NETWORK_PROPERTY__VALUE = ABSTRACT_NETWORK_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Mac Network Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAC_NETWORK_PROPERTY_FEATURE_COUNT = ABSTRACT_NETWORK_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Mac Network Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAC_NETWORK_PROPERTY_OPERATION_COUNT = ABSTRACT_NETWORK_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abstract Device Config</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEVICE_CONFIG_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstract Device Config</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEVICE_CONFIG_OPERATION_COUNT = 0;


    /**
     * The meta object id for the '{@link device.impl.AbstractDeviceTypeImpl <em>Abstract Device Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AbstractDeviceTypeImpl
     * @see device.impl.DevicePackageImpl#getAbstractDeviceType()
     * @generated
     */
    int ABSTRACT_DEVICE_TYPE = 21;

                /**
     * The number of structural features of the '<em>Abstract Device Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEVICE_TYPE_FEATURE_COUNT = 0;

                /**
     * The number of operations of the '<em>Abstract Device Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEVICE_TYPE_OPERATION_COUNT = 0;

                /**
     * The meta object id for the '{@link device.impl.DeviceTypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.DeviceTypeRefImpl
     * @see device.impl.DevicePackageImpl#getDeviceTypeRef()
     * @generated
     */
    int DEVICE_TYPE_REF = 20;

                /**
     * The feature id for the '<em><b>Device Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE_REF__DEVICE_TYPE = ABSTRACT_DEVICE_TYPE_FEATURE_COUNT + 0;

                /**
     * The number of structural features of the '<em>Type Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE_REF_FEATURE_COUNT = ABSTRACT_DEVICE_TYPE_FEATURE_COUNT + 1;

                /**
     * The number of operations of the '<em>Type Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE_REF_OPERATION_COUNT = ABSTRACT_DEVICE_TYPE_OPERATION_COUNT + 0;


                /**
     * Returns the meta object for class '{@link device.DeviceSet <em>Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set</em>'.
     * @see device.DeviceSet
     * @generated
     */
    EClass getDeviceSet();

    /**
     * Returns the meta object for the containment reference list '{@link device.DeviceSet#getDevice <em>Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Device</em>'.
     * @see device.DeviceSet#getDevice()
     * @see #getDeviceSet()
     * @generated
     */
    EReference getDeviceSet_Device();

    /**
     * Returns the meta object for class '{@link device.DeviceType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type</em>'.
     * @see device.DeviceType
     * @generated
     */
    EClass getDeviceType();

    /**
     * Returns the meta object for the attribute '{@link device.DeviceType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see device.DeviceType#getName()
     * @see #getDeviceType()
     * @generated
     */
    EAttribute getDeviceType_Name();

    /**
     * Returns the meta object for the containment reference list '{@link device.DeviceType#getDeviceProperty <em>Device Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Device Property</em>'.
     * @see device.DeviceType#getDeviceProperty()
     * @see #getDeviceType()
     * @generated
     */
    EReference getDeviceType_DeviceProperty();

    /**
     * Returns the meta object for the containment reference list '{@link device.DeviceType#getCommunicationConnection <em>Communication Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Communication Connection</em>'.
     * @see device.DeviceType#getCommunicationConnection()
     * @see #getDeviceType()
     * @generated
     */
    EReference getDeviceType_CommunicationConnection();

    /**
     * Returns the meta object for class '{@link device.DeviceProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see device.DeviceProperty
     * @generated
     */
    EClass getDeviceProperty();

    /**
     * Returns the meta object for the containment reference '{@link device.DeviceProperty#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see device.DeviceProperty#getType()
     * @see #getDeviceProperty()
     * @generated
     */
    EReference getDeviceProperty_Type();

    /**
     * Returns the meta object for class '{@link device.CommunicationConnection <em>Communication Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Communication Connection</em>'.
     * @see device.CommunicationConnection
     * @generated
     */
    EClass getCommunicationConnection();

    /**
     * Returns the meta object for the containment reference '{@link device.CommunicationConnection#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see device.CommunicationConnection#getType()
     * @see #getCommunicationConnection()
     * @generated
     */
    EReference getCommunicationConnection_Type();

    /**
     * Returns the meta object for the containment reference list '{@link device.CommunicationConnection#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see device.CommunicationConnection#getProperties()
     * @see #getCommunicationConnection()
     * @generated
     */
    EReference getCommunicationConnection_Properties();

    /**
     * Returns the meta object for class '{@link device.CapabilityKind <em>Capability Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Capability Kind</em>'.
     * @see device.CapabilityKind
     * @generated
     */
    EClass getCapabilityKind();

    /**
     * Returns the meta object for class '{@link device.AttributeKind <em>Attribute Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Kind</em>'.
     * @see device.AttributeKind
     * @generated
     */
    EClass getAttributeKind();

    /**
     * Returns the meta object for class '{@link device.MaximumKind <em>Maximum Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Maximum Kind</em>'.
     * @see device.MaximumKind
     * @generated
     */
    EClass getMaximumKind();

    /**
     * Returns the meta object for class '{@link device.MinimumKind <em>Minimum Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Minimum Kind</em>'.
     * @see device.MinimumKind
     * @generated
     */
    EClass getMinimumKind();

    /**
     * Returns the meta object for class '{@link device.SelectionKind <em>Selection Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Selection Kind</em>'.
     * @see device.SelectionKind
     * @generated
     */
    EClass getSelectionKind();

    /**
     * Returns the meta object for class '{@link device.RangeKind <em>Range Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Range Kind</em>'.
     * @see device.RangeKind
     * @generated
     */
    EClass getRangeKind();

    /**
     * Returns the meta object for class '{@link device.ConnectionProperty <em>Connection Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Property</em>'.
     * @see device.ConnectionProperty
     * @generated
     */
    EClass getConnectionProperty();

    /**
     * Returns the meta object for class '{@link device.CapabilityType <em>Capability Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Capability Type</em>'.
     * @see device.CapabilityType
     * @generated
     */
    EClass getCapabilityType();

    /**
     * Returns the meta object for the attribute '{@link device.CapabilityType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see device.CapabilityType#getName()
     * @see #getCapabilityType()
     * @generated
     */
    EAttribute getCapabilityType_Name();

    /**
     * Returns the meta object for class '{@link device.ComputationDeviceType <em>Computation Device Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Computation Device Type</em>'.
     * @see device.ComputationDeviceType
     * @generated
     */
    EClass getComputationDeviceType();

    /**
     * Returns the meta object for class '{@link device.AbstractCommunicationConnection <em>Abstract Communication Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Communication Connection</em>'.
     * @see device.AbstractCommunicationConnection
     * @generated
     */
    EClass getAbstractCommunicationConnection();

    /**
     * Returns the meta object for the attribute '{@link device.AbstractCommunicationConnection#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see device.AbstractCommunicationConnection#getName()
     * @see #getAbstractCommunicationConnection()
     * @generated
     */
    EAttribute getAbstractCommunicationConnection_Name();

    /**
     * Returns the meta object for class '{@link device.NetworkConnection <em>Network Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Network Connection</em>'.
     * @see device.NetworkConnection
     * @generated
     */
    EClass getNetworkConnection();

    /**
     * Returns the meta object for the containment reference '{@link device.NetworkConnection#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see device.NetworkConnection#getType()
     * @see #getNetworkConnection()
     * @generated
     */
    EReference getNetworkConnection_Type();

    /**
     * Returns the meta object for the containment reference list '{@link device.NetworkConnection#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see device.NetworkConnection#getProperties()
     * @see #getNetworkConnection()
     * @generated
     */
    EReference getNetworkConnection_Properties();

    /**
     * Returns the meta object for class '{@link device.AbstractNetworkProperty <em>Abstract Network Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Network Property</em>'.
     * @see device.AbstractNetworkProperty
     * @generated
     */
    EClass getAbstractNetworkProperty();

    /**
     * Returns the meta object for class '{@link device.InterfaceNetworkProperty <em>Interface Network Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Network Property</em>'.
     * @see device.InterfaceNetworkProperty
     * @generated
     */
    EClass getInterfaceNetworkProperty();

    /**
     * Returns the meta object for class '{@link device.AddressNetworkProperty <em>Address Network Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Address Network Property</em>'.
     * @see device.AddressNetworkProperty
     * @generated
     */
    EClass getAddressNetworkProperty();

    /**
     * Returns the meta object for class '{@link device.AbstractDeviceConfig <em>Abstract Device Config</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Device Config</em>'.
     * @see device.AbstractDeviceConfig
     * @generated
     */
    EClass getAbstractDeviceConfig();

    /**
     * Returns the meta object for class '{@link device.DeviceTypeRef <em>Type Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Ref</em>'.
     * @see device.DeviceTypeRef
     * @generated
     */
    EClass getDeviceTypeRef();

                /**
     * Returns the meta object for the reference '{@link device.DeviceTypeRef#getDeviceType <em>Device Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Device Type</em>'.
     * @see device.DeviceTypeRef#getDeviceType()
     * @see #getDeviceTypeRef()
     * @generated
     */
    EReference getDeviceTypeRef_DeviceType();

                /**
     * Returns the meta object for class '{@link device.AbstractDeviceType <em>Abstract Device Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Device Type</em>'.
     * @see device.AbstractDeviceType
     * @generated
     */
    EClass getAbstractDeviceType();

                /**
     * Returns the meta object for class '{@link device.MacNetworkProperty <em>Mac Network Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mac Network Property</em>'.
     * @see device.MacNetworkProperty
     * @generated
     */
    EClass getMacNetworkProperty();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DeviceFactory getDeviceFactory();

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
         * The meta object literal for the '{@link device.impl.DeviceSetImpl <em>Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.DeviceSetImpl
         * @see device.impl.DevicePackageImpl#getDeviceSet()
         * @generated
         */
        EClass DEVICE_SET = eINSTANCE.getDeviceSet();

        /**
         * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_SET__DEVICE = eINSTANCE.getDeviceSet_Device();

        /**
         * The meta object literal for the '{@link device.impl.DeviceTypeImpl <em>Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.DeviceTypeImpl
         * @see device.impl.DevicePackageImpl#getDeviceType()
         * @generated
         */
        EClass DEVICE_TYPE = eINSTANCE.getDeviceType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEVICE_TYPE__NAME = eINSTANCE.getDeviceType_Name();

        /**
         * The meta object literal for the '<em><b>Device Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_TYPE__DEVICE_PROPERTY = eINSTANCE.getDeviceType_DeviceProperty();

        /**
         * The meta object literal for the '<em><b>Communication Connection</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_TYPE__COMMUNICATION_CONNECTION = eINSTANCE.getDeviceType_CommunicationConnection();

        /**
         * The meta object literal for the '{@link device.impl.DevicePropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.DevicePropertyImpl
         * @see device.impl.DevicePackageImpl#getDeviceProperty()
         * @generated
         */
        EClass DEVICE_PROPERTY = eINSTANCE.getDeviceProperty();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_PROPERTY__TYPE = eINSTANCE.getDeviceProperty_Type();

        /**
         * The meta object literal for the '{@link device.impl.CommunicationConnectionImpl <em>Communication Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.CommunicationConnectionImpl
         * @see device.impl.DevicePackageImpl#getCommunicationConnection()
         * @generated
         */
        EClass COMMUNICATION_CONNECTION = eINSTANCE.getCommunicationConnection();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMUNICATION_CONNECTION__TYPE = eINSTANCE.getCommunicationConnection_Type();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMUNICATION_CONNECTION__PROPERTIES = eINSTANCE.getCommunicationConnection_Properties();

        /**
         * The meta object literal for the '{@link device.impl.CapabilityKindImpl <em>Capability Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.CapabilityKindImpl
         * @see device.impl.DevicePackageImpl#getCapabilityKind()
         * @generated
         */
        EClass CAPABILITY_KIND = eINSTANCE.getCapabilityKind();

        /**
         * The meta object literal for the '{@link device.impl.AttributeKindImpl <em>Attribute Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AttributeKindImpl
         * @see device.impl.DevicePackageImpl#getAttributeKind()
         * @generated
         */
        EClass ATTRIBUTE_KIND = eINSTANCE.getAttributeKind();

        /**
         * The meta object literal for the '{@link device.impl.MaximumKindImpl <em>Maximum Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.MaximumKindImpl
         * @see device.impl.DevicePackageImpl#getMaximumKind()
         * @generated
         */
        EClass MAXIMUM_KIND = eINSTANCE.getMaximumKind();

        /**
         * The meta object literal for the '{@link device.impl.MinimumKindImpl <em>Minimum Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.MinimumKindImpl
         * @see device.impl.DevicePackageImpl#getMinimumKind()
         * @generated
         */
        EClass MINIMUM_KIND = eINSTANCE.getMinimumKind();

        /**
         * The meta object literal for the '{@link device.impl.SelectionKindImpl <em>Selection Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.SelectionKindImpl
         * @see device.impl.DevicePackageImpl#getSelectionKind()
         * @generated
         */
        EClass SELECTION_KIND = eINSTANCE.getSelectionKind();

        /**
         * The meta object literal for the '{@link device.impl.RangeKindImpl <em>Range Kind</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.RangeKindImpl
         * @see device.impl.DevicePackageImpl#getRangeKind()
         * @generated
         */
        EClass RANGE_KIND = eINSTANCE.getRangeKind();

        /**
         * The meta object literal for the '{@link device.impl.ConnectionPropertyImpl <em>Connection Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.ConnectionPropertyImpl
         * @see device.impl.DevicePackageImpl#getConnectionProperty()
         * @generated
         */
        EClass CONNECTION_PROPERTY = eINSTANCE.getConnectionProperty();

        /**
         * The meta object literal for the '{@link device.impl.CapabilityTypeImpl <em>Capability Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.CapabilityTypeImpl
         * @see device.impl.DevicePackageImpl#getCapabilityType()
         * @generated
         */
        EClass CAPABILITY_TYPE = eINSTANCE.getCapabilityType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAPABILITY_TYPE__NAME = eINSTANCE.getCapabilityType_Name();

        /**
         * The meta object literal for the '{@link device.impl.ComputationDeviceTypeImpl <em>Computation Device Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.ComputationDeviceTypeImpl
         * @see device.impl.DevicePackageImpl#getComputationDeviceType()
         * @generated
         */
        EClass COMPUTATION_DEVICE_TYPE = eINSTANCE.getComputationDeviceType();

        /**
         * The meta object literal for the '{@link device.impl.AbstractCommunicationConnectionImpl <em>Abstract Communication Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AbstractCommunicationConnectionImpl
         * @see device.impl.DevicePackageImpl#getAbstractCommunicationConnection()
         * @generated
         */
        EClass ABSTRACT_COMMUNICATION_CONNECTION = eINSTANCE.getAbstractCommunicationConnection();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_COMMUNICATION_CONNECTION__NAME = eINSTANCE.getAbstractCommunicationConnection_Name();

        /**
         * The meta object literal for the '{@link device.impl.NetworkConnectionImpl <em>Network Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.NetworkConnectionImpl
         * @see device.impl.DevicePackageImpl#getNetworkConnection()
         * @generated
         */
        EClass NETWORK_CONNECTION = eINSTANCE.getNetworkConnection();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NETWORK_CONNECTION__TYPE = eINSTANCE.getNetworkConnection_Type();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NETWORK_CONNECTION__PROPERTIES = eINSTANCE.getNetworkConnection_Properties();

        /**
         * The meta object literal for the '{@link device.impl.AbstractNetworkPropertyImpl <em>Abstract Network Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AbstractNetworkPropertyImpl
         * @see device.impl.DevicePackageImpl#getAbstractNetworkProperty()
         * @generated
         */
        EClass ABSTRACT_NETWORK_PROPERTY = eINSTANCE.getAbstractNetworkProperty();

        /**
         * The meta object literal for the '{@link device.impl.InterfaceNetworkPropertyImpl <em>Interface Network Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.InterfaceNetworkPropertyImpl
         * @see device.impl.DevicePackageImpl#getInterfaceNetworkProperty()
         * @generated
         */
        EClass INTERFACE_NETWORK_PROPERTY = eINSTANCE.getInterfaceNetworkProperty();

        /**
         * The meta object literal for the '{@link device.impl.AddressNetworkPropertyImpl <em>Address Network Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AddressNetworkPropertyImpl
         * @see device.impl.DevicePackageImpl#getAddressNetworkProperty()
         * @generated
         */
        EClass ADDRESS_NETWORK_PROPERTY = eINSTANCE.getAddressNetworkProperty();

        /**
         * The meta object literal for the '{@link device.impl.AbstractDeviceConfigImpl <em>Abstract Device Config</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AbstractDeviceConfigImpl
         * @see device.impl.DevicePackageImpl#getAbstractDeviceConfig()
         * @generated
         */
        EClass ABSTRACT_DEVICE_CONFIG = eINSTANCE.getAbstractDeviceConfig();

        /**
         * The meta object literal for the '{@link device.impl.DeviceTypeRefImpl <em>Type Ref</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.DeviceTypeRefImpl
         * @see device.impl.DevicePackageImpl#getDeviceTypeRef()
         * @generated
         */
        EClass DEVICE_TYPE_REF = eINSTANCE.getDeviceTypeRef();

                                /**
         * The meta object literal for the '<em><b>Device Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_TYPE_REF__DEVICE_TYPE = eINSTANCE.getDeviceTypeRef_DeviceType();

                                /**
         * The meta object literal for the '{@link device.impl.AbstractDeviceTypeImpl <em>Abstract Device Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AbstractDeviceTypeImpl
         * @see device.impl.DevicePackageImpl#getAbstractDeviceType()
         * @generated
         */
        EClass ABSTRACT_DEVICE_TYPE = eINSTANCE.getAbstractDeviceType();

                                /**
         * The meta object literal for the '{@link device.impl.MacNetworkPropertyImpl <em>Mac Network Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.MacNetworkPropertyImpl
         * @see device.impl.DevicePackageImpl#getMacNetworkProperty()
         * @generated
         */
        EClass MAC_NETWORK_PROPERTY = eINSTANCE.getMacNetworkProperty();

    }

} //DevicePackage
