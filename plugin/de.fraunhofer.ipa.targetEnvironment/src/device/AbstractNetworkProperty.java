/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.PropertyValue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Network Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.AbstractNetworkProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getAbstractNetworkProperty()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNetworkProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(PropertyValue)
	 * @see device.DevicePackage#getAbstractNetworkProperty_Value()
	 * @model
	 * @generated
	 */
	PropertyValue getValue();

	/**
	 * Sets the value of the '{@link device.AbstractNetworkProperty#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PropertyValue value);

} // AbstractNetworkProperty
