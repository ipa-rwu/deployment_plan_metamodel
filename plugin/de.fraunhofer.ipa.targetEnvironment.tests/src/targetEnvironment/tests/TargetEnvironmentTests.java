/**
 */
package targetEnvironment.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>targetEnvironment</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetEnvironmentTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new TargetEnvironmentTests("targetEnvironment Tests");
		suite.addTestSuite(ConfigConnectionPropertyTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEnvironmentTests(String name) {
		super(name);
	}

} //TargetEnvironmentTests
