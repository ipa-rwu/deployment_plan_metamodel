/**
 */
package de.fraunhofer.ipa.deployment.util.tests;

import de.fraunhofer.ipa.deployment.util.UtilFactory;
import de.fraunhofer.ipa.deployment.util.X86ProcessorArchitecture;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>X86 Processor Architecture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class X86ProcessorArchitectureTest extends ProcessorArchitectureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(X86ProcessorArchitectureTest.class);
	}

	/**
	 * Constructs a new X86 Processor Architecture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X86ProcessorArchitectureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this X86 Processor Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected X86ProcessorArchitecture getFixture() {
		return (X86ProcessorArchitecture) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UtilFactory.eINSTANCE.createX86ProcessorArchitecture());
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

} //X86ProcessorArchitectureTest
