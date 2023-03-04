/**
 */
package de.fraunhofer.ipa.deployment.util.tests;

import de.fraunhofer.ipa.deployment.util.Arm64ProcessorArchitecture;
import de.fraunhofer.ipa.deployment.util.UtilFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arm64 Processor Architecture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Arm64ProcessorArchitectureTest extends ProcessorArchitectureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Arm64ProcessorArchitectureTest.class);
	}

	/**
	 * Constructs a new Arm64 Processor Architecture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arm64ProcessorArchitectureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arm64 Processor Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Arm64ProcessorArchitecture getFixture() {
		return (Arm64ProcessorArchitecture) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UtilFactory.eINSTANCE.createArm64ProcessorArchitecture());
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

} //Arm64ProcessorArchitectureTest
