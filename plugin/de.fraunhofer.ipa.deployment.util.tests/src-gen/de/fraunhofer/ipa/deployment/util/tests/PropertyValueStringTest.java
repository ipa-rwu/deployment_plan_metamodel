/**
 */
package de.fraunhofer.ipa.deployment.util.tests;

import de.fraunhofer.ipa.deployment.util.PropertyValueString;
import de.fraunhofer.ipa.deployment.util.UtilFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Value String</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyValueStringTest extends PropertyValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyValueStringTest.class);
	}

	/**
	 * Constructs a new Property Value String test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueStringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property Value String test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertyValueString getFixture() {
		return (PropertyValueString) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UtilFactory.eINSTANCE.createPropertyValueString());
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

} //PropertyValueStringTest
