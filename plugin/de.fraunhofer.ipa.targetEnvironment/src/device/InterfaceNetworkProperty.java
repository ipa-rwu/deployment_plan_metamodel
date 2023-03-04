/**
 */
package device;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Network Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.InterfaceNetworkProperty#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getInterfaceNetworkProperty()
 * @model
 * @generated
 */
public interface InterfaceNetworkProperty extends AbstractNetworkProperty {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"interface"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see device.DevicePackage#getInterfaceNetworkProperty_Name()
	 * @model default="interface" id="true" changeable="false"
	 * @generated
	 */
	String getName();

} // InterfaceNetworkProperty
