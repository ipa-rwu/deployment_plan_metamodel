/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.Property#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.Property#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(PropertyValue)
	 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getProperty_Value()
	 * @model containment="true"
	 * @generated
	 */
	PropertyValue getValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.Property#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PropertyValue value);

} // Property
