/**
 */
package device.tests;

import device.DeviceFactory;
import device.MinimumKind;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Minimum Kind</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinimumKindTest extends CapabilityKindTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MinimumKindTest.class);
	}

	/**
	 * Constructs a new Minimum Kind test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimumKindTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Minimum Kind test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MinimumKind getFixture() {
		return (MinimumKind)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeviceFactory.eINSTANCE.createMinimumKind());
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

} //MinimumKindTest
