/**
 */
package targetEnvironment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targetEnvironment.TargetEnvironmentPackage
 * @generated
 */
public interface TargetEnvironmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetEnvironmentFactory eINSTANCE = targetEnvironment.impl.TargetEnvironmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Target Enviroment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Enviroment</em>'.
	 * @generated
	 */
	TargetEnviroment createTargetEnviroment();

	/**
	 * Returns a new object of class '<em>Config Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Connection</em>'.
	 * @generated
	 */
	ConfigConnection createConfigConnection();

	/**
	 * Returns a new object of class '<em>Device Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Instance</em>'.
	 * @generated
	 */
	DeviceInstance createDeviceInstance();

	/**
	 * Returns a new object of class '<em>Connected Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connected Device</em>'.
	 * @generated
	 */
	ConnectedDevice createConnectedDevice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TargetEnvironmentPackage getTargetEnvironmentPackage();

} //TargetEnvironmentFactory
