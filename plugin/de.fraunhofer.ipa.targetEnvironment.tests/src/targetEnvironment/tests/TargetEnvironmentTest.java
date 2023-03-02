/**
 */
package targetEnvironment.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import targetEnvironment.TargetEnvironment;
import targetEnvironment.TargetEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Target Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetEnvironmentTest extends TestCase {

	/**
	 * The fixture for this Target Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetEnvironment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TargetEnvironmentTest.class);
	}

	/**
	 * Constructs a new Target Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Target Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TargetEnvironment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Target Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetEnvironment getFixture() {
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
		setFixture(TargetEnvironmentFactory.eINSTANCE.createTargetEnvironment());
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

} //TargetEnvironmentTest
