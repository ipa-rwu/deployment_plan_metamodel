/**
 */
package device;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.CapabilityProperty#getKind <em>Kind</em>}</li>
 *   <li>{@link device.CapabilityProperty#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getCapabilityProperty()
 * @model
 * @generated
 */
public interface CapabilityProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(CapabilityKind)
	 * @see device.DevicePackage#getCapabilityProperty_Kind()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CapabilityKind getKind();

	/**
	 * Sets the value of the '{@link device.CapabilityProperty#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CapabilityKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CapabilityType)
	 * @see device.DevicePackage#getCapabilityProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	CapabilityType getType();

	/**
	 * Sets the value of the '{@link device.CapabilityProperty#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CapabilityType value);

} // CapabilityProperty
