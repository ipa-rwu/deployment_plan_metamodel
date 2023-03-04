/**
 */
package device;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Network Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.AddressNetworkProperty#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getAddressNetworkProperty()
 * @model
 * @generated
 */
public interface AddressNetworkProperty extends AbstractNetworkProperty {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"address"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see device.DevicePackage#getAddressNetworkProperty_Name()
	 * @model default="address" id="true" changeable="false"
	 * @generated
	 */
	String getName();

} // AddressNetworkProperty
