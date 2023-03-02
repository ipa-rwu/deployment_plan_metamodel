/**
 */
package device.tests;

import device.DeviceFactory;
import device.SelectionKind;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Selection Kind</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionKindTest extends CapabilityKindTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelectionKindTest.class);
	}

	/**
	 * Constructs a new Selection Kind test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionKindTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Selection Kind test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SelectionKind getFixture() {
		return (SelectionKind)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeviceFactory.eINSTANCE.createSelectionKind());
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

} //SelectionKindTest
