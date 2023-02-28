/**
 */
package targetEnvironment.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import targetEnvironment.ConnectedDevice;
import targetEnvironment.TargetEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connected Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectedDeviceTest extends TestCase {

	/**
	 * The fixture for this Connected Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectedDevice fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectedDeviceTest.class);
	}

	/**
	 * Constructs a new Connected Device test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedDeviceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Connected Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConnectedDevice fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Connected Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectedDevice getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TargetEnvironmentFactory.eINSTANCE.createConnectedDevice());
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

} //ConnectedDeviceTest
