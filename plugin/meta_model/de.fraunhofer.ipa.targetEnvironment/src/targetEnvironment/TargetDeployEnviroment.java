/**
 */
package targetEnvironment;

import de.fraunhofer.ipa.deployment.util.Description;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Deploy Enviroment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.TargetDeployEnviroment#getName <em>Name</em>}</li>
 *   <li>{@link targetEnvironment.TargetDeployEnviroment#getIncludeDevice <em>Include Device</em>}</li>
 *   <li>{@link targetEnvironment.TargetDeployEnviroment#getConfigConnections <em>Config Connections</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getTargetDeployEnviroment()
 * @model
 * @generated
 */
public interface TargetDeployEnviroment extends Description {
    /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see targetEnvironment.TargetEnvironmentPackage#getTargetDeployEnviroment_Name()
   * @model
   * @generated
   */
    String getName();

    /**
   * Sets the value of the '{@link targetEnvironment.TargetDeployEnviroment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
    void setName(String value);

    /**
   * Returns the value of the '<em><b>Include Device</b></em>' containment reference list.
   * The list contents are of type {@link targetEnvironment.AbstractDeviceInstance}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Include Device</em>' containment reference list.
   * @see targetEnvironment.TargetEnvironmentPackage#getTargetDeployEnviroment_IncludeDevice()
   * @model containment="true"
   * @generated
   */
    EList<AbstractDeviceInstance> getIncludeDevice();

    /**
   * Returns the value of the '<em><b>Config Connections</b></em>' containment reference list.
   * The list contents are of type {@link targetEnvironment.ConfigConnection}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Config Connections</em>' containment reference list.
   * @see targetEnvironment.TargetEnvironmentPackage#getTargetDeployEnviroment_ConfigConnections()
   * @model containment="true"
   * @generated
   */
    EList<ConfigConnection> getConfigConnections();

} // TargetDeployEnviroment
