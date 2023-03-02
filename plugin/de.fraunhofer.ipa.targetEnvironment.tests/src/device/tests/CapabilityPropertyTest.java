/**
 */
package device.tests;

import device.CapabilityProperty;
import device.DeviceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Capability Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityPropertyTest extends PropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CapabilityPropertyTest.class);
	}

	/**
	 * Constructs a new Capability Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Capability Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CapabilityProperty getFixture() {
		return (CapabilityProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeviceFactory.eINSTANCE.createCapabilityProperty());
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

} //CapabilityPropertyTest
