/**
 */
package de.fraunhofer.ipa.deployment.util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.CommunicationType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getCommunicationType()
 * @model
 * @generated
 */
public interface CommunicationType extends AbstractCommunicationType {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * The default value is <code>"Ethernet"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getCommunicationType_Name()
     * @model default="Ethernet"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.CommunicationType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // CommunicationType
