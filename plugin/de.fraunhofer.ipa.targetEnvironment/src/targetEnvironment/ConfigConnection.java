/**
 */
package targetEnvironment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.ConfigConnection#getName <em>Name</em>}</li>
 *   <li>{@link targetEnvironment.ConfigConnection#getConnectDevice <em>Connect Device</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getConfigConnection()
 * @model
 * @generated
 */
public interface ConfigConnection extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see targetEnvironment.TargetEnvironmentPackage#getConfigConnection_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link targetEnvironment.ConfigConnection#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Connect Device</b></em>' containment reference list.
     * The list contents are of type {@link targetEnvironment.ConnectedDevice}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connect Device</em>' containment reference list.
     * @see targetEnvironment.TargetEnvironmentPackage#getConfigConnection_ConnectDevice()
     * @model containment="true" lower="2"
     * @generated
     */
    EList<ConnectedDevice> getConnectDevice();

} // ConfigConnection
