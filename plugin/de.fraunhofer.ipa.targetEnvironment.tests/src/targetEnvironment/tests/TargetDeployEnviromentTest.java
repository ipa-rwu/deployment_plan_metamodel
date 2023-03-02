/**
 */
package targetEnvironment.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import targetEnvironment.TargetDeployEnviroment;
import targetEnvironment.TargetEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Target Deploy Enviroment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetDeployEnviromentTest extends TestCase {

	/**
	 * The fixture for this Target Deploy Enviroment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetDeployEnviroment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TargetDeployEnviromentTest.class);
	}

	/**
	 * Constructs a new Target Deploy Enviroment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetDeployEnviromentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Target Deploy Enviroment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TargetDeployEnviroment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Target Deploy Enviroment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetDeployEnviroment getFixture() {
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
		setFixture(TargetEnvironmentFactory.eINSTANCE.createTargetDeployEnviroment());
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

} //TargetDeployEnviromentTest
