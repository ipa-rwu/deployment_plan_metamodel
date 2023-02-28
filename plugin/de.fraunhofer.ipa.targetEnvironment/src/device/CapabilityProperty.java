/**
 */
package device;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.CapabilityProperty#getName <em>Name</em>}</li>
 *   <li>{@link device.CapabilityProperty#getKind <em>Kind</em>}</li>
 *   <li>{@link device.CapabilityProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getCapabilityProperty()
 * @model
 * @generated
 */
public interface CapabilityProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see device.DevicePackage#getCapabilityProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link device.CapabilityProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see device.DevicePackage#getCapabilityProperty_Value()
	 * @model
	 * @generated
	 */
	EList<String> getValue();

} // CapabilityProperty
