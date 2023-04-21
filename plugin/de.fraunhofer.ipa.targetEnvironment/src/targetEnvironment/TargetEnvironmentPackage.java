/**
 */
package targetEnvironment;

import de.fraunhofer.ipa.deployment.util.UtilPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see targetEnvironment.TargetEnvironmentFactory
 * @model kind="package"
 * @generated
 */
public interface TargetEnvironmentPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "targetEnvironment";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.ipa.fraunhofer.de/TargetEnvironment";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TargetEnvironment";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TargetEnvironmentPackage eINSTANCE = targetEnvironment.impl.TargetEnvironmentPackageImpl.init();

    /**
     * The meta object id for the '{@link targetEnvironment.impl.TargetEnvironmentImpl <em>Target Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see targetEnvironment.impl.TargetEnvironmentImpl
     * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getTargetEnvironment()
     * @generated
     */
    int TARGET_ENVIRONMENT = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_ENVIRONMENT__TYPE = 0;

    /**
     * The number of structural features of the '<em>Target Environment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_ENVIRONMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Target Environment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_ENVIRONMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link targetEnvironment.impl.TargetDeployEnviromentImpl <em>Target Deploy Enviroment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see targetEnvironment.impl.TargetDeployEnviromentImpl
     * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getTargetDeployEnviroment()
     * @generated
     */
    int TARGET_DEPLOY_ENVIROMENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_DEPLOY_ENVIROMENT__NAME = UtilPackage.DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Include Device</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_DEPLOY_ENVIROMENT__INCLUDE_DEVICE = UtilPackage.DESCRIPTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Config Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_DEPLOY_ENVIROMENT__CONFIG_CONNECTION = UtilPackage.DESCRIPTION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Target Deploy Enviroment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_DEPLOY_ENVIROMENT_FEATURE_COUNT = UtilPackage.DESCRIPTION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Target Deploy Enviroment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_DEPLOY_ENVIROMENT_OPERATION_COUNT = UtilPackage.DESCRIPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link targetEnvironment.impl.ConfigConnectionImpl <em>Config Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see targetEnvironment.impl.ConfigConnectionImpl
     * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getConfigConnection()
     * @generated
     */
    int CONFIG_CONNECTION = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_CONNECTION__NAME = 0;

    /**
     * The feature id for the '<em><b>Connect Device</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_CONNECTION__CONNECT_DEVICE = 1;

    /**
     * The number of structural features of the '<em>Config Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_CONNECTION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Config Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_CONNECTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link targetEnvironment.impl.ConnectedDeviceImpl <em>Connected Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see targetEnvironment.impl.ConnectedDeviceImpl
     * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getConnectedDevice()
     * @generated
     */
    int CONNECTED_DEVICE = 3;

    /**
     * The feature id for the '<em><b>Ref Device</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_DEVICE__REF_DEVICE = 0;

    /**
     * The feature id for the '<em><b>Ref Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_DEVICE__REF_CONNECTION = 1;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_DEVICE__PROPERTIES = 2;

    /**
     * The number of structural features of the '<em>Connected Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_DEVICE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Connected Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_DEVICE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link targetEnvironment.impl.AbstractConfigPropertyImpl <em>Abstract Config Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see targetEnvironment.impl.AbstractConfigPropertyImpl
     * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getAbstractConfigProperty()
     * @generated
     */
    int ABSTRACT_CONFIG_PROPERTY = 9;

    /**
     * The number of structural features of the '<em>Abstract Config Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONFIG_PROPERTY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstract Config Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONFIG_PROPERTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link targetEnvironment.impl.ConfigConnectionPropertyImpl <em>Config Connection Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see targetEnvironment.impl.ConfigConnectionPropertyImpl
     * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getConfigConnectionProperty()
     * @generated
     */
    int CONFIG_CONNECTION_PROPERTY = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_CONNECTION_PROPERTY__NAME = ABSTRACT_CONFIG_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ref Connection Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_CONNECTION_PROPERTY__REF_CONNECTION_PROPERTY = ABSTRACT_CONFIG_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_CONNECTION_PROPERTY__VALUE = ABSTRACT_CONFIG_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Config Connection Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_CONNECTION_PROPERTY_FEATURE_COUNT = ABSTRACT_CONFIG_PROPERTY_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Config Connection Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_CONNECTION_PROPERTY_OPERATION_COUNT = ABSTRACT_CONFIG_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link targetEnvironment.impl.AbstractDeviceInstanceImpl <em>Abstract Device Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see targetEnvironment.impl.AbstractDeviceInstanceImpl
     * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getAbstractDeviceInstance()
     * @generated
     */
    int ABSTRACT_DEVICE_INSTANCE = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEVICE_INSTANCE__NAME = 0;

    /**
     * The feature id for the '<em><b>Config Device Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY = 1;

    /**
     * The number of structural features of the '<em>Abstract Device Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEVICE_INSTANCE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Abstract Device Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEVICE_INSTANCE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link targetEnvironment.impl.ComputationDeviceInstanceImpl <em>Computation Device Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see targetEnvironment.impl.ComputationDeviceInstanceImpl
     * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getComputationDeviceInstance()
     * @generated
     */
    int COMPUTATION_DEVICE_INSTANCE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_INSTANCE__NAME = ABSTRACT_DEVICE_INSTANCE__NAME;

    /**
     * The feature id for the '<em><b>Config Device Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY = ABSTRACT_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY;

    /**
     * The feature id for the '<em><b>Ref Device Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_INSTANCE__REF_DEVICE_TYPE = ABSTRACT_DEVICE_INSTANCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Computation Device Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_INSTANCE_FEATURE_COUNT = ABSTRACT_DEVICE_INSTANCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Computation Device Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPUTATION_DEVICE_INSTANCE_OPERATION_COUNT = ABSTRACT_DEVICE_INSTANCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link targetEnvironment.impl.DeviceInstanceImpl <em>Device Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see targetEnvironment.impl.DeviceInstanceImpl
     * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getDeviceInstance()
     * @generated
     */
    int DEVICE_INSTANCE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_INSTANCE__NAME = ABSTRACT_DEVICE_INSTANCE__NAME;

    /**
     * The feature id for the '<em><b>Config Device Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY = ABSTRACT_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY;

    /**
     * The feature id for the '<em><b>Ref Device Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_INSTANCE__REF_DEVICE_TYPE = ABSTRACT_DEVICE_INSTANCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Device Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_INSTANCE_FEATURE_COUNT = ABSTRACT_DEVICE_INSTANCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Device Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_INSTANCE_OPERATION_COUNT = ABSTRACT_DEVICE_INSTANCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link targetEnvironment.impl.ConfigDevicePropertyImpl <em>Config Device Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see targetEnvironment.impl.ConfigDevicePropertyImpl
     * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getConfigDeviceProperty()
     * @generated
     */
    int CONFIG_DEVICE_PROPERTY = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_DEVICE_PROPERTY__NAME = ABSTRACT_CONFIG_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_DEVICE_PROPERTY__FROM = ABSTRACT_CONFIG_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_DEVICE_PROPERTY__VALUE = ABSTRACT_CONFIG_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Fullname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_DEVICE_PROPERTY__FULLNAME = ABSTRACT_CONFIG_PROPERTY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Config Device Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_DEVICE_PROPERTY_FEATURE_COUNT = ABSTRACT_CONFIG_PROPERTY_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Parent</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_DEVICE_PROPERTY___GET_PARENT = ABSTRACT_CONFIG_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Device Resouce</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_DEVICE_PROPERTY___GET_DEVICE_RESOUCE = ABSTRACT_CONFIG_PROPERTY_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Config Device Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_DEVICE_PROPERTY_OPERATION_COUNT = ABSTRACT_CONFIG_PROPERTY_OPERATION_COUNT + 2;


    /**
     * Returns the meta object for class '{@link targetEnvironment.TargetEnvironment <em>Target Environment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Target Environment</em>'.
     * @see targetEnvironment.TargetEnvironment
     * @generated
     */
    EClass getTargetEnvironment();

    /**
     * Returns the meta object for the containment reference list '{@link targetEnvironment.TargetEnvironment#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Type</em>'.
     * @see targetEnvironment.TargetEnvironment#getType()
     * @see #getTargetEnvironment()
     * @generated
     */
    EReference getTargetEnvironment_Type();

    /**
     * Returns the meta object for class '{@link targetEnvironment.TargetDeployEnviroment <em>Target Deploy Enviroment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Target Deploy Enviroment</em>'.
     * @see targetEnvironment.TargetDeployEnviroment
     * @generated
     */
    EClass getTargetDeployEnviroment();

    /**
     * Returns the meta object for the attribute '{@link targetEnvironment.TargetDeployEnviroment#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see targetEnvironment.TargetDeployEnviroment#getName()
     * @see #getTargetDeployEnviroment()
     * @generated
     */
    EAttribute getTargetDeployEnviroment_Name();

    /**
     * Returns the meta object for the containment reference list '{@link targetEnvironment.TargetDeployEnviroment#getIncludeDevice <em>Include Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Include Device</em>'.
     * @see targetEnvironment.TargetDeployEnviroment#getIncludeDevice()
     * @see #getTargetDeployEnviroment()
     * @generated
     */
    EReference getTargetDeployEnviroment_IncludeDevice();

    /**
     * Returns the meta object for the containment reference list '{@link targetEnvironment.TargetDeployEnviroment#getConfigConnection <em>Config Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Config Connection</em>'.
     * @see targetEnvironment.TargetDeployEnviroment#getConfigConnection()
     * @see #getTargetDeployEnviroment()
     * @generated
     */
    EReference getTargetDeployEnviroment_ConfigConnection();

    /**
     * Returns the meta object for class '{@link targetEnvironment.ConfigConnection <em>Config Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Config Connection</em>'.
     * @see targetEnvironment.ConfigConnection
     * @generated
     */
    EClass getConfigConnection();

    /**
     * Returns the meta object for the attribute '{@link targetEnvironment.ConfigConnection#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see targetEnvironment.ConfigConnection#getName()
     * @see #getConfigConnection()
     * @generated
     */
    EAttribute getConfigConnection_Name();

    /**
     * Returns the meta object for the containment reference list '{@link targetEnvironment.ConfigConnection#getConnectDevice <em>Connect Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connect Device</em>'.
     * @see targetEnvironment.ConfigConnection#getConnectDevice()
     * @see #getConfigConnection()
     * @generated
     */
    EReference getConfigConnection_ConnectDevice();

    /**
     * Returns the meta object for class '{@link targetEnvironment.ConnectedDevice <em>Connected Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connected Device</em>'.
     * @see targetEnvironment.ConnectedDevice
     * @generated
     */
    EClass getConnectedDevice();

    /**
     * Returns the meta object for the reference '{@link targetEnvironment.ConnectedDevice#getRefDevice <em>Ref Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Ref Device</em>'.
     * @see targetEnvironment.ConnectedDevice#getRefDevice()
     * @see #getConnectedDevice()
     * @generated
     */
    EReference getConnectedDevice_RefDevice();

    /**
     * Returns the meta object for the reference '{@link targetEnvironment.ConnectedDevice#getRefConnection <em>Ref Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Ref Connection</em>'.
     * @see targetEnvironment.ConnectedDevice#getRefConnection()
     * @see #getConnectedDevice()
     * @generated
     */
    EReference getConnectedDevice_RefConnection();

    /**
     * Returns the meta object for the containment reference list '{@link targetEnvironment.ConnectedDevice#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see targetEnvironment.ConnectedDevice#getProperties()
     * @see #getConnectedDevice()
     * @generated
     */
    EReference getConnectedDevice_Properties();

    /**
     * Returns the meta object for class '{@link targetEnvironment.ConfigConnectionProperty <em>Config Connection Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Config Connection Property</em>'.
     * @see targetEnvironment.ConfigConnectionProperty
     * @generated
     */
    EClass getConfigConnectionProperty();

    /**
     * Returns the meta object for the attribute '{@link targetEnvironment.ConfigConnectionProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see targetEnvironment.ConfigConnectionProperty#getName()
     * @see #getConfigConnectionProperty()
     * @generated
     */
    EAttribute getConfigConnectionProperty_Name();

    /**
     * Returns the meta object for the reference '{@link targetEnvironment.ConfigConnectionProperty#getRefConnectionProperty <em>Ref Connection Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Ref Connection Property</em>'.
     * @see targetEnvironment.ConfigConnectionProperty#getRefConnectionProperty()
     * @see #getConfigConnectionProperty()
     * @generated
     */
    EReference getConfigConnectionProperty_RefConnectionProperty();

    /**
     * Returns the meta object for the containment reference '{@link targetEnvironment.ConfigConnectionProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see targetEnvironment.ConfigConnectionProperty#getValue()
     * @see #getConfigConnectionProperty()
     * @generated
     */
    EReference getConfigConnectionProperty_Value();

    /**
     * Returns the meta object for class '{@link targetEnvironment.ComputationDeviceInstance <em>Computation Device Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Computation Device Instance</em>'.
     * @see targetEnvironment.ComputationDeviceInstance
     * @generated
     */
    EClass getComputationDeviceInstance();

    /**
     * Returns the meta object for the reference '{@link targetEnvironment.ComputationDeviceInstance#getRefDeviceType <em>Ref Device Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Ref Device Type</em>'.
     * @see targetEnvironment.ComputationDeviceInstance#getRefDeviceType()
     * @see #getComputationDeviceInstance()
     * @generated
     */
    EReference getComputationDeviceInstance_RefDeviceType();

    /**
     * Returns the meta object for class '{@link targetEnvironment.DeviceInstance <em>Device Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Device Instance</em>'.
     * @see targetEnvironment.DeviceInstance
     * @generated
     */
    EClass getDeviceInstance();

    /**
     * Returns the meta object for the reference '{@link targetEnvironment.DeviceInstance#getRefDeviceType <em>Ref Device Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Ref Device Type</em>'.
     * @see targetEnvironment.DeviceInstance#getRefDeviceType()
     * @see #getDeviceInstance()
     * @generated
     */
    EReference getDeviceInstance_RefDeviceType();

    /**
     * Returns the meta object for class '{@link targetEnvironment.ConfigDeviceProperty <em>Config Device Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Config Device Property</em>'.
     * @see targetEnvironment.ConfigDeviceProperty
     * @generated
     */
    EClass getConfigDeviceProperty();

    /**
     * Returns the meta object for the attribute '{@link targetEnvironment.ConfigDeviceProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see targetEnvironment.ConfigDeviceProperty#getName()
     * @see #getConfigDeviceProperty()
     * @generated
     */
    EAttribute getConfigDeviceProperty_Name();

    /**
     * Returns the meta object for the reference '{@link targetEnvironment.ConfigDeviceProperty#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see targetEnvironment.ConfigDeviceProperty#getFrom()
     * @see #getConfigDeviceProperty()
     * @generated
     */
    EReference getConfigDeviceProperty_From();

    /**
     * Returns the meta object for the containment reference '{@link targetEnvironment.ConfigDeviceProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see targetEnvironment.ConfigDeviceProperty#getValue()
     * @see #getConfigDeviceProperty()
     * @generated
     */
    EReference getConfigDeviceProperty_Value();

    /**
     * Returns the meta object for the attribute '{@link targetEnvironment.ConfigDeviceProperty#getFullname <em>Fullname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fullname</em>'.
     * @see targetEnvironment.ConfigDeviceProperty#getFullname()
     * @see #getConfigDeviceProperty()
     * @generated
     */
    EAttribute getConfigDeviceProperty_Fullname();

    /**
     * Returns the meta object for the '{@link targetEnvironment.ConfigDeviceProperty#getParent() <em>Get Parent</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Parent</em>' operation.
     * @see targetEnvironment.ConfigDeviceProperty#getParent()
     * @generated
     */
    EOperation getConfigDeviceProperty__GetParent();

    /**
     * Returns the meta object for the '{@link targetEnvironment.ConfigDeviceProperty#getDeviceResouce() <em>Get Device Resouce</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Device Resouce</em>' operation.
     * @see targetEnvironment.ConfigDeviceProperty#getDeviceResouce()
     * @generated
     */
    EOperation getConfigDeviceProperty__GetDeviceResouce();

    /**
     * Returns the meta object for class '{@link targetEnvironment.AbstractDeviceInstance <em>Abstract Device Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Device Instance</em>'.
     * @see targetEnvironment.AbstractDeviceInstance
     * @generated
     */
    EClass getAbstractDeviceInstance();

    /**
     * Returns the meta object for the attribute '{@link targetEnvironment.AbstractDeviceInstance#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see targetEnvironment.AbstractDeviceInstance#getName()
     * @see #getAbstractDeviceInstance()
     * @generated
     */
    EAttribute getAbstractDeviceInstance_Name();

    /**
     * Returns the meta object for the containment reference list '{@link targetEnvironment.AbstractDeviceInstance#getConfigDeviceProperty <em>Config Device Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Config Device Property</em>'.
     * @see targetEnvironment.AbstractDeviceInstance#getConfigDeviceProperty()
     * @see #getAbstractDeviceInstance()
     * @generated
     */
    EReference getAbstractDeviceInstance_ConfigDeviceProperty();

    /**
     * Returns the meta object for class '{@link targetEnvironment.AbstractConfigProperty <em>Abstract Config Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Config Property</em>'.
     * @see targetEnvironment.AbstractConfigProperty
     * @generated
     */
    EClass getAbstractConfigProperty();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TargetEnvironmentFactory getTargetEnvironmentFactory();

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
         * The meta object literal for the '{@link targetEnvironment.impl.TargetEnvironmentImpl <em>Target Environment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see targetEnvironment.impl.TargetEnvironmentImpl
         * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getTargetEnvironment()
         * @generated
         */
        EClass TARGET_ENVIRONMENT = eINSTANCE.getTargetEnvironment();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TARGET_ENVIRONMENT__TYPE = eINSTANCE.getTargetEnvironment_Type();

        /**
         * The meta object literal for the '{@link targetEnvironment.impl.TargetDeployEnviromentImpl <em>Target Deploy Enviroment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see targetEnvironment.impl.TargetDeployEnviromentImpl
         * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getTargetDeployEnviroment()
         * @generated
         */
        EClass TARGET_DEPLOY_ENVIROMENT = eINSTANCE.getTargetDeployEnviroment();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TARGET_DEPLOY_ENVIROMENT__NAME = eINSTANCE.getTargetDeployEnviroment_Name();

        /**
         * The meta object literal for the '<em><b>Include Device</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TARGET_DEPLOY_ENVIROMENT__INCLUDE_DEVICE = eINSTANCE.getTargetDeployEnviroment_IncludeDevice();

        /**
         * The meta object literal for the '<em><b>Config Connection</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TARGET_DEPLOY_ENVIROMENT__CONFIG_CONNECTION = eINSTANCE.getTargetDeployEnviroment_ConfigConnection();

        /**
         * The meta object literal for the '{@link targetEnvironment.impl.ConfigConnectionImpl <em>Config Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see targetEnvironment.impl.ConfigConnectionImpl
         * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getConfigConnection()
         * @generated
         */
        EClass CONFIG_CONNECTION = eINSTANCE.getConfigConnection();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_CONNECTION__NAME = eINSTANCE.getConfigConnection_Name();

        /**
         * The meta object literal for the '<em><b>Connect Device</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_CONNECTION__CONNECT_DEVICE = eINSTANCE.getConfigConnection_ConnectDevice();

        /**
         * The meta object literal for the '{@link targetEnvironment.impl.ConnectedDeviceImpl <em>Connected Device</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see targetEnvironment.impl.ConnectedDeviceImpl
         * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getConnectedDevice()
         * @generated
         */
        EClass CONNECTED_DEVICE = eINSTANCE.getConnectedDevice();

        /**
         * The meta object literal for the '<em><b>Ref Device</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTED_DEVICE__REF_DEVICE = eINSTANCE.getConnectedDevice_RefDevice();

        /**
         * The meta object literal for the '<em><b>Ref Connection</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTED_DEVICE__REF_CONNECTION = eINSTANCE.getConnectedDevice_RefConnection();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTED_DEVICE__PROPERTIES = eINSTANCE.getConnectedDevice_Properties();

        /**
         * The meta object literal for the '{@link targetEnvironment.impl.ConfigConnectionPropertyImpl <em>Config Connection Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see targetEnvironment.impl.ConfigConnectionPropertyImpl
         * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getConfigConnectionProperty()
         * @generated
         */
        EClass CONFIG_CONNECTION_PROPERTY = eINSTANCE.getConfigConnectionProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_CONNECTION_PROPERTY__NAME = eINSTANCE.getConfigConnectionProperty_Name();

        /**
         * The meta object literal for the '<em><b>Ref Connection Property</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_CONNECTION_PROPERTY__REF_CONNECTION_PROPERTY = eINSTANCE.getConfigConnectionProperty_RefConnectionProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_CONNECTION_PROPERTY__VALUE = eINSTANCE.getConfigConnectionProperty_Value();

        /**
         * The meta object literal for the '{@link targetEnvironment.impl.ComputationDeviceInstanceImpl <em>Computation Device Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see targetEnvironment.impl.ComputationDeviceInstanceImpl
         * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getComputationDeviceInstance()
         * @generated
         */
        EClass COMPUTATION_DEVICE_INSTANCE = eINSTANCE.getComputationDeviceInstance();

        /**
         * The meta object literal for the '<em><b>Ref Device Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPUTATION_DEVICE_INSTANCE__REF_DEVICE_TYPE = eINSTANCE.getComputationDeviceInstance_RefDeviceType();

        /**
         * The meta object literal for the '{@link targetEnvironment.impl.DeviceInstanceImpl <em>Device Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see targetEnvironment.impl.DeviceInstanceImpl
         * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getDeviceInstance()
         * @generated
         */
        EClass DEVICE_INSTANCE = eINSTANCE.getDeviceInstance();

        /**
         * The meta object literal for the '<em><b>Ref Device Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_INSTANCE__REF_DEVICE_TYPE = eINSTANCE.getDeviceInstance_RefDeviceType();

        /**
         * The meta object literal for the '{@link targetEnvironment.impl.ConfigDevicePropertyImpl <em>Config Device Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see targetEnvironment.impl.ConfigDevicePropertyImpl
         * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getConfigDeviceProperty()
         * @generated
         */
        EClass CONFIG_DEVICE_PROPERTY = eINSTANCE.getConfigDeviceProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_DEVICE_PROPERTY__NAME = eINSTANCE.getConfigDeviceProperty_Name();

        /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_DEVICE_PROPERTY__FROM = eINSTANCE.getConfigDeviceProperty_From();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_DEVICE_PROPERTY__VALUE = eINSTANCE.getConfigDeviceProperty_Value();

        /**
         * The meta object literal for the '<em><b>Fullname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG_DEVICE_PROPERTY__FULLNAME = eINSTANCE.getConfigDeviceProperty_Fullname();

        /**
         * The meta object literal for the '<em><b>Get Parent</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CONFIG_DEVICE_PROPERTY___GET_PARENT = eINSTANCE.getConfigDeviceProperty__GetParent();

        /**
         * The meta object literal for the '<em><b>Get Device Resouce</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CONFIG_DEVICE_PROPERTY___GET_DEVICE_RESOUCE = eINSTANCE.getConfigDeviceProperty__GetDeviceResouce();

        /**
         * The meta object literal for the '{@link targetEnvironment.impl.AbstractDeviceInstanceImpl <em>Abstract Device Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see targetEnvironment.impl.AbstractDeviceInstanceImpl
         * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getAbstractDeviceInstance()
         * @generated
         */
        EClass ABSTRACT_DEVICE_INSTANCE = eINSTANCE.getAbstractDeviceInstance();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_DEVICE_INSTANCE__NAME = eINSTANCE.getAbstractDeviceInstance_Name();

        /**
         * The meta object literal for the '<em><b>Config Device Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY = eINSTANCE.getAbstractDeviceInstance_ConfigDeviceProperty();

        /**
         * The meta object literal for the '{@link targetEnvironment.impl.AbstractConfigPropertyImpl <em>Abstract Config Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see targetEnvironment.impl.AbstractConfigPropertyImpl
         * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getAbstractConfigProperty()
         * @generated
         */
        EClass ABSTRACT_CONFIG_PROPERTY = eINSTANCE.getAbstractConfigProperty();

    }

} //TargetEnvironmentPackage
