/**
 */
package de.fraunhofer.ipa.deployment.util.tests;

import de.fraunhofer.ipa.deployment.util.UtilFactory;
import de.fraunhofer.ipa.deployment.util.WlanCommunicationType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wlan Communication Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WlanCommunicationTypeTest extends NetworkCommunicationTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WlanCommunicationTypeTest.class);
	}

	/**
	 * Constructs a new Wlan Communication Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WlanCommunicationTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wlan Communication Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WlanCommunicationType getFixture() {
		return (WlanCommunicationType) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UtilFactory.eINSTANCE.createWlanCommunicationType());
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

} //WlanCommunicationTypeTest
