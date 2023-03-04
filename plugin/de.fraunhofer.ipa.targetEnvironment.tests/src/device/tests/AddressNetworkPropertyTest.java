/**
 */
package device.tests;

import device.AddressNetworkProperty;
import device.DeviceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Address Network Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressNetworkPropertyTest extends AbstractNetworkPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddressNetworkPropertyTest.class);
	}

	/**
	 * Constructs a new Address Network Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressNetworkPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Address Network Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AddressNetworkProperty getFixture() {
		return (AddressNetworkProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeviceFactory.eINSTANCE.createAddressNetworkProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AddressNetworkPropertyTest
