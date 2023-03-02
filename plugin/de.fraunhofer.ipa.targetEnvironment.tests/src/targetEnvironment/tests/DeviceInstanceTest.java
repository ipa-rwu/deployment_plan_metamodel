/**
 */
package targetEnvironment.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import targetEnvironment.DeviceInstance;
import targetEnvironment.TargetEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceInstanceTest extends TestCase {

	/**
	 * The fixture for this Device Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceInstance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeviceInstanceTest.class);
	}

	/**
	 * Constructs a new Device Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceInstanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Device Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DeviceInstance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Device Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceInstance getFixture() {
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
		setFixture(TargetEnvironmentFactory.eINSTANCE.createDeviceInstance());
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

} //DeviceInstanceTest
