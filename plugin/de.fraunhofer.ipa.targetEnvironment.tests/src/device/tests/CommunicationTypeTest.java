/**
 */
package device.tests;

import device.CommunicationType;
import device.DeviceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Communication Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationTypeTest extends PropertyTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommunicationTypeTest.class);
	}

	/**
	 * Constructs a new Communication Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Communication Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CommunicationType getFixture() {
		return (CommunicationType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeviceFactory.eINSTANCE.createCommunicationType());
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

} //CommunicationTypeTest
