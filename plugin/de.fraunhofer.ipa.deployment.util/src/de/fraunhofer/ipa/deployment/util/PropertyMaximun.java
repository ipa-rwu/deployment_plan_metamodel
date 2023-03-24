/**
 */
package de.fraunhofer.ipa.deployment.util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Maximun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyMaximun#getKind <em>Kind</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyMaximun#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyMaximun()
 * @model
 * @generated
 */
public interface PropertyMaximun extends AbstractProperty {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' containment reference.
     * @see #setKind(MaximumKind)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyMaximun_Kind()
     * @model containment="true" required="true"
     * @generated
     */
    MaximumKind getKind();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertyMaximun#getKind <em>Kind</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' containment reference.
     * @see #getKind()
     * @generated
     */
    void setKind(MaximumKind value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(PropertyValue)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyMaximun_Value()
     * @model containment="true"
     * @generated
     */
    PropertyValue getValue();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertyMaximun#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(PropertyValue value);

} // PropertyMaximun
