/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.AbstractResouceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.ResourceType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getResourceType()
 * @model
 * @generated
 */
public interface ResourceType extends AbstractResouceType {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see device.DevicePackage#getResourceType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link device.ResourceType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ResourceType
