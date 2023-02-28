/**
 */
package targetEnvironment;

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
	 * The meta object id for the '{@link targetEnvironment.impl.TargetDeployEnviromentImpl <em>Target Deploy Enviroment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetEnvironment.impl.TargetDeployEnviromentImpl
	 * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getTargetDeployEnviroment()
	 * @generated
	 */
	int TARGET_DEPLOY_ENVIROMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEPLOY_ENVIROMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Include Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEPLOY_ENVIROMENT__INCLUDE_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Config Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEPLOY_ENVIROMENT__CONFIG_CONNECTION = 2;

	/**
	 * The number of structural features of the '<em>Target Deploy Enviroment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEPLOY_ENVIROMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Target Deploy Enviroment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DEPLOY_ENVIROMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link targetEnvironment.impl.ConfigConnectionImpl <em>Config Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetEnvironment.impl.ConfigConnectionImpl
	 * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getConfigConnection()
	 * @generated
	 */
	int CONFIG_CONNECTION = 1;

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
	 * The meta object id for the '{@link targetEnvironment.impl.DeviceInstanceImpl <em>Device Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetEnvironment.impl.DeviceInstanceImpl
	 * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getDeviceInstance()
	 * @generated
	 */
	int DEVICE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref Device Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__REF_DEVICE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Device Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE_OPERATION_COUNT = 0;

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
	 * Returns the meta object for class '{@link targetEnvironment.DeviceInstance <em>Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Instance</em>'.
	 * @see targetEnvironment.DeviceInstance
	 * @generated
	 */
	EClass getDeviceInstance();

	/**
	 * Returns the meta object for the attribute '{@link targetEnvironment.DeviceInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see targetEnvironment.DeviceInstance#getName()
	 * @see #getDeviceInstance()
	 * @generated
	 */
	EAttribute getDeviceInstance_Name();

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
		 * The meta object literal for the '{@link targetEnvironment.impl.DeviceInstanceImpl <em>Device Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetEnvironment.impl.DeviceInstanceImpl
		 * @see targetEnvironment.impl.TargetEnvironmentPackageImpl#getDeviceInstance()
		 * @generated
		 */
		EClass DEVICE_INSTANCE = eINSTANCE.getDeviceInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_INSTANCE__NAME = eINSTANCE.getDeviceInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Ref Device Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_INSTANCE__REF_DEVICE_TYPE = eINSTANCE.getDeviceInstance_RefDeviceType();

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

	}

} //TargetEnvironmentPackage
