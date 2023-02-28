/**
 */
package device;

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
	int DEVICE_SET__DEVICE = 0;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SET_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__CAPABILITIES = 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TYPE__CONNECTION = 2;

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
	 * The meta object id for the '{@link device.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see device.impl.ConnectionImpl
	 * @see device.impl.DevicePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link device.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see device.impl.PropertyImpl
	 * @see device.impl.DevicePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
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
	 * The meta object id for the '{@link device.impl.IndirectConnectionImpl <em>Indirect Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see device.impl.IndirectConnectionImpl
	 * @see device.impl.DevicePackageImpl#getIndirectConnection()
	 * @generated
	 */
	int INDIRECT_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_CONNECTION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_CONNECTION__TYPE = CONNECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Indirect Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Indirect Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link device.impl.DirectConnectionImpl <em>Direct Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see device.impl.DirectConnectionImpl
	 * @see device.impl.DevicePackageImpl#getDirectConnection()
	 * @generated
	 */
	int DIRECT_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION__TYPE = CONNECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Direct Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Direct Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link device.impl.CapabilityPropertyImpl <em>Capability Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see device.impl.CapabilityPropertyImpl
	 * @see device.impl.DevicePackageImpl#getCapabilityProperty()
	 * @generated
	 */
	int CAPABILITY_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROPERTY__KIND = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROPERTY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Capability Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Capability Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link device.impl.CapabilityKindImpl <em>Capability Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see device.impl.CapabilityKindImpl
	 * @see device.impl.DevicePackageImpl#getCapabilityKind()
	 * @generated
	 */
	int CAPABILITY_KIND = 7;

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
	int ATTRIBUTE_KIND = 8;

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
	int MAXIMUM_KIND = 9;

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
	int MINIMUM_KIND = 10;

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
	int SELECTION_KIND = 11;

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
	 * The meta object id for the '{@link device.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see device.impl.PropertyTypeImpl
	 * @see device.impl.DevicePackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 0;

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
	 * The meta object id for the '{@link device.impl.CommunicationTypeImpl <em>Communication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see device.impl.CommunicationTypeImpl
	 * @see device.impl.DevicePackageImpl#getCommunicationType()
	 * @generated
	 */
	int COMMUNICATION_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_TYPE__NAME = PROPERTY_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Communication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_TYPE_FEATURE_COUNT = PROPERTY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_TYPE_OPERATION_COUNT = PROPERTY_TYPE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link device.DeviceType#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see device.DeviceType#getCapabilities()
	 * @see #getDeviceType()
	 * @generated
	 */
	EReference getDeviceType_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link device.DeviceType#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see device.DeviceType#getConnection()
	 * @see #getDeviceType()
	 * @generated
	 */
	EReference getDeviceType_Connection();

	/**
	 * Returns the meta object for class '{@link device.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see device.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link device.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see device.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the containment reference '{@link device.Connection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see device.Connection#getType()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link device.Connection#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see device.Connection#getProperties()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Properties();

	/**
	 * Returns the meta object for class '{@link device.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see device.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link device.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see device.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link device.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see device.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link device.IndirectConnection <em>Indirect Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indirect Connection</em>'.
	 * @see device.IndirectConnection
	 * @generated
	 */
	EClass getIndirectConnection();

	/**
	 * Returns the meta object for class '{@link device.DirectConnection <em>Direct Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Connection</em>'.
	 * @see device.DirectConnection
	 * @generated
	 */
	EClass getDirectConnection();

	/**
	 * Returns the meta object for class '{@link device.CapabilityProperty <em>Capability Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Property</em>'.
	 * @see device.CapabilityProperty
	 * @generated
	 */
	EClass getCapabilityProperty();

	/**
	 * Returns the meta object for the attribute '{@link device.CapabilityProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see device.CapabilityProperty#getName()
	 * @see #getCapabilityProperty()
	 * @generated
	 */
	EAttribute getCapabilityProperty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link device.CapabilityProperty#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kind</em>'.
	 * @see device.CapabilityProperty#getKind()
	 * @see #getCapabilityProperty()
	 * @generated
	 */
	EReference getCapabilityProperty_Kind();

	/**
	 * Returns the meta object for the attribute list '{@link device.CapabilityProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see device.CapabilityProperty#getValue()
	 * @see #getCapabilityProperty()
	 * @generated
	 */
	EAttribute getCapabilityProperty_Value();

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
	 * Returns the meta object for class '{@link device.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see device.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link device.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see device.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for class '{@link device.CommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Type</em>'.
	 * @see device.CommunicationType
	 * @generated
	 */
	EClass getCommunicationType();

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
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TYPE__CAPABILITIES = eINSTANCE.getDeviceType_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TYPE__CONNECTION = eINSTANCE.getDeviceType_Connection();

		/**
		 * The meta object literal for the '{@link device.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see device.impl.ConnectionImpl
		 * @see device.impl.DevicePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TYPE = eINSTANCE.getConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PROPERTIES = eINSTANCE.getConnection_Properties();

		/**
		 * The meta object literal for the '{@link device.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see device.impl.PropertyImpl
		 * @see device.impl.DevicePackageImpl#getProperty()
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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link device.impl.IndirectConnectionImpl <em>Indirect Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see device.impl.IndirectConnectionImpl
		 * @see device.impl.DevicePackageImpl#getIndirectConnection()
		 * @generated
		 */
		EClass INDIRECT_CONNECTION = eINSTANCE.getIndirectConnection();

		/**
		 * The meta object literal for the '{@link device.impl.DirectConnectionImpl <em>Direct Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see device.impl.DirectConnectionImpl
		 * @see device.impl.DevicePackageImpl#getDirectConnection()
		 * @generated
		 */
		EClass DIRECT_CONNECTION = eINSTANCE.getDirectConnection();

		/**
		 * The meta object literal for the '{@link device.impl.CapabilityPropertyImpl <em>Capability Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see device.impl.CapabilityPropertyImpl
		 * @see device.impl.DevicePackageImpl#getCapabilityProperty()
		 * @generated
		 */
		EClass CAPABILITY_PROPERTY = eINSTANCE.getCapabilityProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_PROPERTY__NAME = eINSTANCE.getCapabilityProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PROPERTY__KIND = eINSTANCE.getCapabilityProperty_Kind();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_PROPERTY__VALUE = eINSTANCE.getCapabilityProperty_Value();

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
		 * The meta object literal for the '{@link device.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see device.impl.PropertyTypeImpl
		 * @see device.impl.DevicePackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

		/**
		 * The meta object literal for the '{@link device.impl.CommunicationTypeImpl <em>Communication Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see device.impl.CommunicationTypeImpl
		 * @see device.impl.DevicePackageImpl#getCommunicationType()
		 * @generated
		 */
		EClass COMMUNICATION_TYPE = eINSTANCE.getCommunicationType();

	}

} //DevicePackage
