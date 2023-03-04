/**
 */
package device.tests;

import device.ComputationDeviceType;
import device.DeviceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Computation Device Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputationDeviceTypeTest extends DeviceTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComputationDeviceTypeTest.class);
	}

	/**
	 * Constructs a new Computation Device Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationDeviceTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Computation Device Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComputationDeviceType getFixture() {
		return (ComputationDeviceType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeviceFactory.eINSTANCE.createComputationDeviceType());
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

} //ComputationDeviceTypeTest
