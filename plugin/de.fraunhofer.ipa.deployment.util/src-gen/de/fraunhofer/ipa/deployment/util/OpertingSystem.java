/**
 */
package de.fraunhofer.ipa.deployment.util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operting System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.OpertingSystem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getOpertingSystem()
 * @model abstract="true"
 * @generated
 */
public interface OpertingSystem extends ResouceType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getOpertingSystem_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.OpertingSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OpertingSystem
