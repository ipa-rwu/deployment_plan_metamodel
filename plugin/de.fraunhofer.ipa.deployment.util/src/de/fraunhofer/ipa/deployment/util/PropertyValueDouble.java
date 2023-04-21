/**
 */
package de.fraunhofer.ipa.deployment.util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Value Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyValueDouble#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyValueDouble()
 * @model
 * @generated
 */
public interface PropertyValueDouble extends PropertyValue {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(double)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyValueDouble_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
     * @generated
     */
    double getValue();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertyValueDouble#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(double value);

} // PropertyValueDouble
