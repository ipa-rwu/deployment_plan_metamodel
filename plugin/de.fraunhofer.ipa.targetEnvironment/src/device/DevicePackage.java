/**
 */
package device;

import base.BasePackage;

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
    int DEVICE_SET__DEVICE = BasePackage.DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_SET_FEATURE_COUNT = BasePackage.DESCRIPTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_SET_OPERATION_COUNT = BasePackage.DESCRIPTION_OPERATION_COUNT + 0;

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
     * The feature id for the '<em><b>Capability</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__CAPABILITY = 1;

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
     * The meta object id for the '{@link device.impl.CommunicationConnectionImpl <em>Communication Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.CommunicationConnectionImpl
     * @see device.impl.DevicePackageImpl#getCommunicationConnection()
     * @generated
     */
    int COMMUNICATION_CONNECTION = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_CONNECTION__NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_CONNECTION__TYPE = 1;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_CONNECTION__PROPERTIES = 2;

    /**
     * The number of structural features of the '<em>Communication Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_CONNECTION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Communication Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_CONNECTION_OPERATION_COUNT = 0;

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
     * The meta object id for the '{@link device.impl.CapabilityPropertyImpl <em>Capability Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.CapabilityPropertyImpl
     * @see device.impl.DevicePackageImpl#getCapabilityProperty()
     * @generated
     */
    int CAPABILITY_PROPERTY = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_PROPERTY__VALUE = PROPERTY__VALUE;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_PROPERTY__KIND = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_PROPERTY__TYPE = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Capability Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Capability Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.CapabilityKindImpl <em>Capability Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.CapabilityKindImpl
     * @see device.impl.DevicePackageImpl#getCapabilityKind()
     * @generated
     */
    int CAPABILITY_KIND = 5;

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
    int ATTRIBUTE_KIND = 6;

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
    int MAXIMUM_KIND = 7;

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
    int MINIMUM_KIND = 8;

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
    int SELECTION_KIND = 9;

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
    int PROPERTY_TYPE = 10;

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
    int COMMUNICATION_TYPE = 11;

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
     * The meta object id for the '{@link device.impl.ConnectionPropertyImpl <em>Connection Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.ConnectionPropertyImpl
     * @see device.impl.DevicePackageImpl#getConnectionProperty()
     * @generated
     */
    int CONNECTION_PROPERTY = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_PROPERTY__VALUE = PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Connection Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Connection Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link device.impl.CapabilityTypeImpl <em>Capability Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see device.impl.CapabilityTypeImpl
     * @see device.impl.DevicePackageImpl#getCapabilityType()
     * @generated
     */
    int CAPABILITY_TYPE = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_TYPE__NAME = PROPERTY_TYPE__NAME;

    /**
     * The number of structural features of the '<em>Capability Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_TYPE_FEATURE_COUNT = PROPERTY_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Capability Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_TYPE_OPERATION_COUNT = PROPERTY_TYPE_OPERATION_COUNT + 0;


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
     * Returns the meta object for the containment reference list '{@link device.DeviceType#getCapability <em>Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Capability</em>'.
     * @see device.DeviceType#getCapability()
     * @see #getDeviceType()
     * @generated
     */
    EReference getDeviceType_Capability();

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
     * Returns the meta object for class '{@link device.CommunicationConnection <em>Communication Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Communication Connection</em>'.
     * @see device.CommunicationConnection
     * @generated
     */
    EClass getCommunicationConnection();

    /**
     * Returns the meta object for the attribute '{@link device.CommunicationConnection#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see device.CommunicationConnection#getName()
     * @see #getCommunicationConnection()
     * @generated
     */
    EAttribute getCommunicationConnection_Name();

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
     * Returns the meta object for the containment reference '{@link device.Property#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see device.Property#getValue()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Value();

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
     * Returns the meta object for the reference '{@link device.CapabilityProperty#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see device.CapabilityProperty#getType()
     * @see #getCapabilityProperty()
     * @generated
     */
    EReference getCapabilityProperty_Type();

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
         * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_TYPE__CAPABILITY = eINSTANCE.getDeviceType_Capability();

        /**
         * The meta object literal for the '<em><b>Communication Connection</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_TYPE__COMMUNICATION_CONNECTION = eINSTANCE.getDeviceType_CommunicationConnection();

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
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMUNICATION_CONNECTION__NAME = eINSTANCE.getCommunicationConnection_Name();

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
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

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
         * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_PROPERTY__KIND = eINSTANCE.getCapabilityProperty_Kind();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_PROPERTY__TYPE = eINSTANCE.getCapabilityProperty_Type();

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

    }

} //DevicePackage
