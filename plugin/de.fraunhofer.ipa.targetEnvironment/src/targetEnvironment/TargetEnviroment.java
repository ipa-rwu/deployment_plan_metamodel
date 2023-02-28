/**
 */
package targetEnvironment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Enviroment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.TargetEnviroment#getName <em>Name</em>}</li>
 *   <li>{@link targetEnvironment.TargetEnviroment#getIncludeDevice <em>Include Device</em>}</li>
 *   <li>{@link targetEnvironment.TargetEnviroment#getConfigConnection <em>Config Connection</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getTargetEnviroment()
 * @model
 * @generated
 */
public interface TargetEnviroment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see targetEnvironment.TargetEnvironmentPackage#getTargetEnviroment_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link targetEnvironment.TargetEnviroment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Include Device</b></em>' containment reference list.
	 * The list contents are of type {@link targetEnvironment.DeviceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Device</em>' containment reference list.
	 * @see targetEnvironment.TargetEnvironmentPackage#getTargetEnviroment_IncludeDevice()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceInstance> getIncludeDevice();

	/**
	 * Returns the value of the '<em><b>Config Connection</b></em>' containment reference list.
	 * The list contents are of type {@link targetEnvironment.ConfigConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Connection</em>' containment reference list.
	 * @see targetEnvironment.TargetEnvironmentPackage#getTargetEnviroment_ConfigConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigConnection> getConfigConnection();

} // TargetEnviroment