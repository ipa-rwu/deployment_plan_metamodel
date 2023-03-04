/**
 */
package device.tests;

import device.DeviceFactory;
import device.InterfaceNetworkProperty;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interface Network Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceNetworkPropertyTest extends AbstractNetworkPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterfaceNetworkPropertyTest.class);
	}

	/**
	 * Constructs a new Interface Network Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceNetworkPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interface Network Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InterfaceNetworkProperty getFixture() {
		return (InterfaceNetworkProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeviceFactory.eINSTANCE.createInterfaceNetworkProperty());
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

} //InterfaceNetworkPropertyTest
