/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.AbstractResouceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.CapabilityType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getCapabilityType()
 * @model abstract="true"
 * @generated
 */
public interface CapabilityType extends AbstractResouceType {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see device.DevicePackage#getCapabilityType_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link device.CapabilityType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // CapabilityType
