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
     * The feature id for the '<em><b>Device Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__DEVICE_RESOURCE = 1;

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
     * The meta object id for the '{@link device.impl.DeviceResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.DeviceResourceImpl
     * @see device.impl.DevicePackageImpl#getDeviceResource()
     * @generated
     */
    int DEVICE_RESOURCE = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_RESOURCE__NAME = UtilPackage.RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_RESOURCE__TYPE = UtilPackage.RESOURCE__TYPE;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_RESOURCE__PROPERTIES = UtilPackage.RESOURCE__PROPERTIES;

    /**
     * The number of structural features of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_RESOURCE_FEATURE_COUNT = UtilPackage.RESOURCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_RESOURCE_OPERATION_COUNT = UtilPackage.RESOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.AbstractCommunicationConnectionImpl <em>Abstract Communication Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AbstractCommunicationConnectionImpl
     * @see device.impl.DevicePackageImpl#getAbstractCommunicationConnection()
     * @generated
     */
    int ABSTRACT_COMMUNICATION_CONNECTION = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMMUNICATION_CONNECTION__NAME = UtilPackage.ABSTRACT_RESOURCE__NAME;

    /**
     * The number of structural features of the '<em>Abstract Communication Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMMUNICATION_CONNECTION_FEATURE_COUNT = UtilPackage.ABSTRACT_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Abstract Communication Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMMUNICATION_CONNECTION_OPERATION_COUNT = UtilPackage.ABSTRACT_RESOURCE_OPERATION_COUNT + 0;

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
     * The meta object id for the '{@link device.impl.ConnectionPropertyImpl <em>Connection Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.ConnectionPropertyImpl
     * @see device.impl.DevicePackageImpl#getConnectionProperty()
     * @generated
     */
    int CONNECTION_PROPERTY = 4;

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
     * The meta object id for the '{@link device.impl.ComputationDeviceTypeImpl <em>Computation Device Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.ComputationDeviceTypeImpl
     * @see device.impl.DevicePackageImpl#getComputationDeviceType()
     * @generated
     */
    int COMPUTATION_DEVICE_TYPE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_TYPE__NAME = DEVICE_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Device Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_TYPE__DEVICE_RESOURCE = DEVICE_TYPE__DEVICE_RESOURCE;

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
    int NETWORK_CONNECTION = 6;

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
    int ABSTRACT_NETWORK_PROPERTY = 17;

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
    int INTERFACE_NETWORK_PROPERTY = 7;

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
    int ADDRESS_NETWORK_PROPERTY = 8;

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
    int MAC_NETWORK_PROPERTY = 9;

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
     * The meta object id for the '{@link device.impl.AbstractRuntimeEnviromentImpl <em>Abstract Runtime Enviroment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AbstractRuntimeEnviromentImpl
     * @see device.impl.DevicePackageImpl#getAbstractRuntimeEnviroment()
     * @generated
     */
    int ABSTRACT_RUNTIME_ENVIROMENT = 19;

    /**
     * The number of structural features of the '<em>Abstract Runtime Enviroment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_RUNTIME_ENVIROMENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstract Runtime Enviroment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_RUNTIME_ENVIROMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link device.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.ContainerImpl
     * @see device.impl.DevicePackageImpl#getContainer()
     * @generated
     */
    int CONTAINER = 10;

    /**
     * The number of structural features of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_FEATURE_COUNT = ABSTRACT_RUNTIME_ENVIROMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_OPERATION_COUNT = ABSTRACT_RUNTIME_ENVIROMENT_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link device.impl.OperatingSystemResouceImpl <em>Operating System Resouce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.OperatingSystemResouceImpl
     * @see device.impl.DevicePackageImpl#getOperatingSystemResouce()
     * @generated
     */
    int OPERATING_SYSTEM_RESOUCE = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATING_SYSTEM_RESOUCE__NAME = UtilPackage.ABSTRACT_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATING_SYSTEM_RESOUCE__TYPE = UtilPackage.ABSTRACT_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATING_SYSTEM_RESOUCE__PROPERTIES = UtilPackage.ABSTRACT_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Operating System Resouce</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATING_SYSTEM_RESOUCE_FEATURE_COUNT = UtilPackage.ABSTRACT_RESOURCE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Operating System Resouce</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATING_SYSTEM_RESOUCE_OPERATION_COUNT = UtilPackage.ABSTRACT_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.AbstractOperatingSystemPropertyImpl <em>Abstract Operating System Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AbstractOperatingSystemPropertyImpl
     * @see device.impl.DevicePackageImpl#getAbstractOperatingSystemProperty()
     * @generated
     */
    int ABSTRACT_OPERATING_SYSTEM_PROPERTY = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_OPERATING_SYSTEM_PROPERTY__NAME = UtilPackage.PROPERTY_ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_OPERATING_SYSTEM_PROPERTY__DESCRIPTION = UtilPackage.PROPERTY_ATTRIBUTE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_OPERATING_SYSTEM_PROPERTY__KIND = UtilPackage.PROPERTY_ATTRIBUTE__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_OPERATING_SYSTEM_PROPERTY__VALUE = UtilPackage.PROPERTY_ATTRIBUTE__VALUE;

    /**
     * The number of structural features of the '<em>Abstract Operating System Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_OPERATING_SYSTEM_PROPERTY_FEATURE_COUNT = UtilPackage.PROPERTY_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Abstract Operating System Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_OPERATING_SYSTEM_PROPERTY_OPERATION_COUNT = UtilPackage.PROPERTY_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.NameOperatingSystemPropertyImpl <em>Name Operating System Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.NameOperatingSystemPropertyImpl
     * @see device.impl.DevicePackageImpl#getNameOperatingSystemProperty()
     * @generated
     */
    int NAME_OPERATING_SYSTEM_PROPERTY = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_OPERATING_SYSTEM_PROPERTY__NAME = ABSTRACT_OPERATING_SYSTEM_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_OPERATING_SYSTEM_PROPERTY__DESCRIPTION = ABSTRACT_OPERATING_SYSTEM_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_OPERATING_SYSTEM_PROPERTY__KIND = ABSTRACT_OPERATING_SYSTEM_PROPERTY__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_OPERATING_SYSTEM_PROPERTY__VALUE = ABSTRACT_OPERATING_SYSTEM_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Name Operating System Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_OPERATING_SYSTEM_PROPERTY_FEATURE_COUNT = ABSTRACT_OPERATING_SYSTEM_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Name Operating System Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_OPERATING_SYSTEM_PROPERTY_OPERATION_COUNT = ABSTRACT_OPERATING_SYSTEM_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.VersionOperatingSystemPropertyImpl <em>Version Operating System Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.VersionOperatingSystemPropertyImpl
     * @see device.impl.DevicePackageImpl#getVersionOperatingSystemProperty()
     * @generated
     */
    int VERSION_OPERATING_SYSTEM_PROPERTY = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSION_OPERATING_SYSTEM_PROPERTY__NAME = ABSTRACT_OPERATING_SYSTEM_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSION_OPERATING_SYSTEM_PROPERTY__DESCRIPTION = ABSTRACT_OPERATING_SYSTEM_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSION_OPERATING_SYSTEM_PROPERTY__KIND = ABSTRACT_OPERATING_SYSTEM_PROPERTY__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSION_OPERATING_SYSTEM_PROPERTY__VALUE = ABSTRACT_OPERATING_SYSTEM_PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Version Operating System Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSION_OPERATING_SYSTEM_PROPERTY_FEATURE_COUNT = ABSTRACT_OPERATING_SYSTEM_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Version Operating System Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSION_OPERATING_SYSTEM_PROPERTY_OPERATION_COUNT = ABSTRACT_OPERATING_SYSTEM_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.ProcessorResouceImpl <em>Processor Resouce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.ProcessorResouceImpl
     * @see device.impl.DevicePackageImpl#getProcessorResouce()
     * @generated
     */
    int PROCESSOR_RESOUCE = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_RESOUCE__NAME = UtilPackage.ABSTRACT_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_RESOUCE__TYPE = UtilPackage.ABSTRACT_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_RESOUCE__PROPERTIES = UtilPackage.ABSTRACT_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Processor Resouce</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_RESOUCE_FEATURE_COUNT = UtilPackage.ABSTRACT_RESOURCE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Processor Resouce</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_RESOUCE_OPERATION_COUNT = UtilPackage.ABSTRACT_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.AbstracProcessorPropertyImpl <em>Abstrac Processor Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AbstracProcessorPropertyImpl
     * @see device.impl.DevicePackageImpl#getAbstracProcessorProperty()
     * @generated
     */
    int ABSTRAC_PROCESSOR_PROPERTY = 22;

    /**
     * The meta object id for the '{@link device.impl.ArchitectureProcessorPropertyImpl <em>Architecture Processor Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.ArchitectureProcessorPropertyImpl
     * @see device.impl.DevicePackageImpl#getArchitectureProcessorProperty()
     * @generated
     */
    int ARCHITECTURE_PROCESSOR_PROPERTY = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARCHITECTURE_PROCESSOR_PROPERTY__NAME = UtilPackage.PROPERTY_ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARCHITECTURE_PROCESSOR_PROPERTY__DESCRIPTION = UtilPackage.PROPERTY_ATTRIBUTE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARCHITECTURE_PROCESSOR_PROPERTY__KIND = UtilPackage.PROPERTY_ATTRIBUTE__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARCHITECTURE_PROCESSOR_PROPERTY__VALUE = UtilPackage.PROPERTY_ATTRIBUTE__VALUE;

    /**
     * The number of structural features of the '<em>Architecture Processor Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARCHITECTURE_PROCESSOR_PROPERTY_FEATURE_COUNT = UtilPackage.PROPERTY_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Architecture Processor Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARCHITECTURE_PROCESSOR_PROPERTY_OPERATION_COUNT = UtilPackage.PROPERTY_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.CoreProcessorPropertyImpl <em>Core Processor Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.CoreProcessorPropertyImpl
     * @see device.impl.DevicePackageImpl#getCoreProcessorProperty()
     * @generated
     */
    int CORE_PROCESSOR_PROPERTY = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_PROCESSOR_PROPERTY__NAME = UtilPackage.PROPERTY_ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_PROCESSOR_PROPERTY__DESCRIPTION = UtilPackage.PROPERTY_ATTRIBUTE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_PROCESSOR_PROPERTY__KIND = UtilPackage.PROPERTY_ATTRIBUTE__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_PROCESSOR_PROPERTY__VALUE = UtilPackage.PROPERTY_ATTRIBUTE__VALUE;

    /**
     * The number of structural features of the '<em>Core Processor Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_PROCESSOR_PROPERTY_FEATURE_COUNT = UtilPackage.PROPERTY_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Core Processor Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORE_PROCESSOR_PROPERTY_OPERATION_COUNT = UtilPackage.PROPERTY_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.AbstractComputationDeviceResourceImpl <em>Abstract Computation Device Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.AbstractComputationDeviceResourceImpl
     * @see device.impl.DevicePackageImpl#getAbstractComputationDeviceResource()
     * @generated
     */
    int ABSTRACT_COMPUTATION_DEVICE_RESOURCE = 21;

    /**
     * The number of structural features of the '<em>Abstract Computation Device Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMPUTATION_DEVICE_RESOURCE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstract Computation Device Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMPUTATION_DEVICE_RESOURCE_OPERATION_COUNT = 0;

    /**
     * The number of structural features of the '<em>Abstrac Processor Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRAC_PROCESSOR_PROPERTY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstrac Processor Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRAC_PROCESSOR_PROPERTY_OPERATION_COUNT = 0;

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
     * Returns the meta object for the containment reference list '{@link device.DeviceType#getDeviceResource <em>Device Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Device Resource</em>'.
     * @see device.DeviceType#getDeviceResource()
     * @see #getDeviceType()
     * @generated
     */
    EReference getDeviceType_DeviceResource();

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
     * Returns the meta object for class '{@link device.DeviceResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource</em>'.
     * @see device.DeviceResource
     * @generated
     */
    EClass getDeviceResource();

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
     * Returns the meta object for class '{@link device.ConnectionProperty <em>Connection Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Property</em>'.
     * @see device.ConnectionProperty
     * @generated
     */
    EClass getConnectionProperty();

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
     * Returns the meta object for class '{@link device.MacNetworkProperty <em>Mac Network Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mac Network Property</em>'.
     * @see device.MacNetworkProperty
     * @generated
     */
    EClass getMacNetworkProperty();

    /**
     * Returns the meta object for class '{@link device.Container <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Container</em>'.
     * @see device.Container
     * @generated
     */
    EClass getContainer();

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
     * Returns the meta object for class '{@link device.AbstractCommunicationConnection <em>Abstract Communication Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Communication Connection</em>'.
     * @see device.AbstractCommunicationConnection
     * @generated
     */
    EClass getAbstractCommunicationConnection();

    /**
     * Returns the meta object for class '{@link device.AbstractRuntimeEnviroment <em>Abstract Runtime Enviroment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Runtime Enviroment</em>'.
     * @see device.AbstractRuntimeEnviroment
     * @generated
     */
    EClass getAbstractRuntimeEnviroment();

    /**
     * Returns the meta object for class '{@link device.OperatingSystemResouce <em>Operating System Resouce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operating System Resouce</em>'.
     * @see device.OperatingSystemResouce
     * @generated
     */
    EClass getOperatingSystemResouce();

    /**
     * Returns the meta object for the containment reference '{@link device.OperatingSystemResouce#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see device.OperatingSystemResouce#getType()
     * @see #getOperatingSystemResouce()
     * @generated
     */
    EReference getOperatingSystemResouce_Type();

    /**
     * Returns the meta object for the containment reference list '{@link device.OperatingSystemResouce#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see device.OperatingSystemResouce#getProperties()
     * @see #getOperatingSystemResouce()
     * @generated
     */
    EReference getOperatingSystemResouce_Properties();

    /**
     * Returns the meta object for class '{@link device.AbstractOperatingSystemProperty <em>Abstract Operating System Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Operating System Property</em>'.
     * @see device.AbstractOperatingSystemProperty
     * @generated
     */
    EClass getAbstractOperatingSystemProperty();

    /**
     * Returns the meta object for class '{@link device.AbstractComputationDeviceResource <em>Abstract Computation Device Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Computation Device Resource</em>'.
     * @see device.AbstractComputationDeviceResource
     * @generated
     */
    EClass getAbstractComputationDeviceResource();

    /**
     * Returns the meta object for class '{@link device.NameOperatingSystemProperty <em>Name Operating System Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Name Operating System Property</em>'.
     * @see device.NameOperatingSystemProperty
     * @generated
     */
    EClass getNameOperatingSystemProperty();

    /**
     * Returns the meta object for class '{@link device.VersionOperatingSystemProperty <em>Version Operating System Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Version Operating System Property</em>'.
     * @see device.VersionOperatingSystemProperty
     * @generated
     */
    EClass getVersionOperatingSystemProperty();

    /**
     * Returns the meta object for class '{@link device.ProcessorResouce <em>Processor Resouce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor Resouce</em>'.
     * @see device.ProcessorResouce
     * @generated
     */
    EClass getProcessorResouce();

    /**
     * Returns the meta object for the containment reference '{@link device.ProcessorResouce#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see device.ProcessorResouce#getType()
     * @see #getProcessorResouce()
     * @generated
     */
    EReference getProcessorResouce_Type();

    /**
     * Returns the meta object for the containment reference list '{@link device.ProcessorResouce#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see device.ProcessorResouce#getProperties()
     * @see #getProcessorResouce()
     * @generated
     */
    EReference getProcessorResouce_Properties();

    /**
     * Returns the meta object for class '{@link device.ArchitectureProcessorProperty <em>Architecture Processor Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Architecture Processor Property</em>'.
     * @see device.ArchitectureProcessorProperty
     * @generated
     */
    EClass getArchitectureProcessorProperty();

    /**
     * Returns the meta object for class '{@link device.CoreProcessorProperty <em>Core Processor Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Core Processor Property</em>'.
     * @see device.CoreProcessorProperty
     * @generated
     */
    EClass getCoreProcessorProperty();

    /**
     * Returns the meta object for class '{@link device.AbstracProcessorProperty <em>Abstrac Processor Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstrac Processor Property</em>'.
     * @see device.AbstracProcessorProperty
     * @generated
     */
    EClass getAbstracProcessorProperty();

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
         * The meta object literal for the '<em><b>Device Resource</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_TYPE__DEVICE_RESOURCE = eINSTANCE.getDeviceType_DeviceResource();

        /**
         * The meta object literal for the '<em><b>Communication Connection</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_TYPE__COMMUNICATION_CONNECTION = eINSTANCE.getDeviceType_CommunicationConnection();

        /**
         * The meta object literal for the '{@link device.impl.DeviceResourceImpl <em>Resource</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.DeviceResourceImpl
         * @see device.impl.DevicePackageImpl#getDeviceResource()
         * @generated
         */
        EClass DEVICE_RESOURCE = eINSTANCE.getDeviceResource();

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
         * The meta object literal for the '{@link device.impl.ConnectionPropertyImpl <em>Connection Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.ConnectionPropertyImpl
         * @see device.impl.DevicePackageImpl#getConnectionProperty()
         * @generated
         */
        EClass CONNECTION_PROPERTY = eINSTANCE.getConnectionProperty();

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
         * The meta object literal for the '{@link device.impl.MacNetworkPropertyImpl <em>Mac Network Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.MacNetworkPropertyImpl
         * @see device.impl.DevicePackageImpl#getMacNetworkProperty()
         * @generated
         */
        EClass MAC_NETWORK_PROPERTY = eINSTANCE.getMacNetworkProperty();

        /**
         * The meta object literal for the '{@link device.impl.ContainerImpl <em>Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.ContainerImpl
         * @see device.impl.DevicePackageImpl#getContainer()
         * @generated
         */
        EClass CONTAINER = eINSTANCE.getContainer();

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
         * The meta object literal for the '{@link device.impl.AbstractCommunicationConnectionImpl <em>Abstract Communication Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AbstractCommunicationConnectionImpl
         * @see device.impl.DevicePackageImpl#getAbstractCommunicationConnection()
         * @generated
         */
        EClass ABSTRACT_COMMUNICATION_CONNECTION = eINSTANCE.getAbstractCommunicationConnection();

        /**
         * The meta object literal for the '{@link device.impl.AbstractRuntimeEnviromentImpl <em>Abstract Runtime Enviroment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AbstractRuntimeEnviromentImpl
         * @see device.impl.DevicePackageImpl#getAbstractRuntimeEnviroment()
         * @generated
         */
        EClass ABSTRACT_RUNTIME_ENVIROMENT = eINSTANCE.getAbstractRuntimeEnviroment();

        /**
         * The meta object literal for the '{@link device.impl.OperatingSystemResouceImpl <em>Operating System Resouce</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.OperatingSystemResouceImpl
         * @see device.impl.DevicePackageImpl#getOperatingSystemResouce()
         * @generated
         */
        EClass OPERATING_SYSTEM_RESOUCE = eINSTANCE.getOperatingSystemResouce();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATING_SYSTEM_RESOUCE__TYPE = eINSTANCE.getOperatingSystemResouce_Type();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATING_SYSTEM_RESOUCE__PROPERTIES = eINSTANCE.getOperatingSystemResouce_Properties();

        /**
         * The meta object literal for the '{@link device.impl.AbstractOperatingSystemPropertyImpl <em>Abstract Operating System Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AbstractOperatingSystemPropertyImpl
         * @see device.impl.DevicePackageImpl#getAbstractOperatingSystemProperty()
         * @generated
         */
        EClass ABSTRACT_OPERATING_SYSTEM_PROPERTY = eINSTANCE.getAbstractOperatingSystemProperty();

        /**
         * The meta object literal for the '{@link device.impl.AbstractComputationDeviceResourceImpl <em>Abstract Computation Device Resource</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AbstractComputationDeviceResourceImpl
         * @see device.impl.DevicePackageImpl#getAbstractComputationDeviceResource()
         * @generated
         */
        EClass ABSTRACT_COMPUTATION_DEVICE_RESOURCE = eINSTANCE.getAbstractComputationDeviceResource();

        /**
         * The meta object literal for the '{@link device.impl.NameOperatingSystemPropertyImpl <em>Name Operating System Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.NameOperatingSystemPropertyImpl
         * @see device.impl.DevicePackageImpl#getNameOperatingSystemProperty()
         * @generated
         */
        EClass NAME_OPERATING_SYSTEM_PROPERTY = eINSTANCE.getNameOperatingSystemProperty();

        /**
         * The meta object literal for the '{@link device.impl.VersionOperatingSystemPropertyImpl <em>Version Operating System Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.VersionOperatingSystemPropertyImpl
         * @see device.impl.DevicePackageImpl#getVersionOperatingSystemProperty()
         * @generated
         */
        EClass VERSION_OPERATING_SYSTEM_PROPERTY = eINSTANCE.getVersionOperatingSystemProperty();

        /**
         * The meta object literal for the '{@link device.impl.ProcessorResouceImpl <em>Processor Resouce</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.ProcessorResouceImpl
         * @see device.impl.DevicePackageImpl#getProcessorResouce()
         * @generated
         */
        EClass PROCESSOR_RESOUCE = eINSTANCE.getProcessorResouce();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR_RESOUCE__TYPE = eINSTANCE.getProcessorResouce_Type();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR_RESOUCE__PROPERTIES = eINSTANCE.getProcessorResouce_Properties();

        /**
         * The meta object literal for the '{@link device.impl.ArchitectureProcessorPropertyImpl <em>Architecture Processor Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.ArchitectureProcessorPropertyImpl
         * @see device.impl.DevicePackageImpl#getArchitectureProcessorProperty()
         * @generated
         */
        EClass ARCHITECTURE_PROCESSOR_PROPERTY = eINSTANCE.getArchitectureProcessorProperty();

        /**
         * The meta object literal for the '{@link device.impl.CoreProcessorPropertyImpl <em>Core Processor Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.CoreProcessorPropertyImpl
         * @see device.impl.DevicePackageImpl#getCoreProcessorProperty()
         * @generated
         */
        EClass CORE_PROCESSOR_PROPERTY = eINSTANCE.getCoreProcessorProperty();

        /**
         * The meta object literal for the '{@link device.impl.AbstracProcessorPropertyImpl <em>Abstrac Processor Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see device.impl.AbstracProcessorPropertyImpl
         * @see device.impl.DevicePackageImpl#getAbstracProcessorProperty()
         * @generated
         */
        EClass ABSTRAC_PROCESSOR_PROPERTY = eINSTANCE.getAbstracProcessorProperty();

    }

} //DevicePackage
