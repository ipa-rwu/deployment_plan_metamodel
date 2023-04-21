/**
 */
package targetEnvironment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Device Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.AbstractDeviceInstance#getName <em>Name</em>}</li>
 *   <li>{@link targetEnvironment.AbstractDeviceInstance#getConfigDeviceProperty <em>Config Device Property</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getAbstractDeviceInstance()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDeviceInstance extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see targetEnvironment.TargetEnvironmentPackage#getAbstractDeviceInstance_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link targetEnvironment.AbstractDeviceInstance#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Config Device Property</b></em>' containment reference list.
     * The list contents are of type {@link targetEnvironment.ConfigDeviceProperty}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Config Device Property</em>' containment reference list.
     * @see targetEnvironment.TargetEnvironmentPackage#getAbstractDeviceInstance_ConfigDeviceProperty()
     * @model containment="true"
     * @generated
     */
    EList<ConfigDeviceProperty> getConfigDeviceProperty();

} // AbstractDeviceInstance
