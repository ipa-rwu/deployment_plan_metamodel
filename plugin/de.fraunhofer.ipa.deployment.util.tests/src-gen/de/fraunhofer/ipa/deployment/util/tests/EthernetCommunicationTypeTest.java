/**
 */
package de.fraunhofer.ipa.deployment.util.tests;

import de.fraunhofer.ipa.deployment.util.EthernetCommunicationType;
import de.fraunhofer.ipa.deployment.util.UtilFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ethernet Communication Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EthernetCommunicationTypeTest extends NetworkCommunicationTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EthernetCommunicationTypeTest.class);
	}

	/**
	 * Constructs a new Ethernet Communication Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetCommunicationTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ethernet Communication Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EthernetCommunicationType getFixture() {
		return (EthernetCommunicationType) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UtilFactory.eINSTANCE.createEthernetCommunicationType());
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

} //EthernetCommunicationTypeTest
