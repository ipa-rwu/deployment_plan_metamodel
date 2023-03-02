/**
 */
package base.tests;

import base.BaseFactory;
import base.PropertyValueInt;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Value Int</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyValueIntTest extends PropertyValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyValueIntTest.class);
	}

	/**
	 * Constructs a new Property Value Int test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueIntTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property Value Int test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertyValueInt getFixture() {
		return (PropertyValueInt)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaseFactory.eINSTANCE.createPropertyValueInt());
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

} //PropertyValueIntTest
