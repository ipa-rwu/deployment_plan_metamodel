/**
 */
package targetEnvironment.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import targetEnvironment.ConfigConnection;
import targetEnvironment.TargetEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigConnectionTest extends TestCase {

	/**
	 * The fixture for this Config Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigConnection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigConnectionTest.class);
	}

	/**
	 * Constructs a new Config Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigConnectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Config Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConfigConnection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Config Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigConnection getFixture() {
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
		setFixture(TargetEnvironmentFactory.eINSTANCE.createConfigConnection());
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

} //ConfigConnectionTest
