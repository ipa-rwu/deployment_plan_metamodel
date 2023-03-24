/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.AbstractResouceType;
import de.fraunhofer.ipa.deployment.util.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.DeviceProperty#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getDeviceProperty()
 * @model
 * @generated
 */
public interface DeviceProperty extends Property {
    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(AbstractResouceType)
     * @see device.DevicePackage#getDeviceProperty_Type()
     * @model containment="true" required="true"
     * @generated
     */
    AbstractResouceType getType();

    /**
     * Sets the value of the '{@link device.DeviceProperty#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(AbstractResouceType value);

} // DeviceProperty
