/**
 */
package de.fraunhofer.ipa.deployment.util.tests;

import de.fraunhofer.ipa.deployment.util.LinuxOpertingSystem;
import de.fraunhofer.ipa.deployment.util.UtilFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Linux Operting System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinuxOpertingSystemTest extends OpertingSystemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinuxOpertingSystemTest.class);
	}

	/**
	 * Constructs a new Linux Operting System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxOpertingSystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Linux Operting System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinuxOpertingSystem getFixture() {
		return (LinuxOpertingSystem) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UtilFactory.eINSTANCE.createLinuxOpertingSystem());
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

} //LinuxOpertingSystemTest
