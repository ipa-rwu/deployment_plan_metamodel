/**
 */
package de.fraunhofer.ipa.deployment.util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linux Distribution Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.LinuxDistributionValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getLinuxDistributionValue()
 * @model
 * @generated
 */
public interface LinuxDistributionValue extends PropertyValue, OpertingSystemName {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The literals are from the enumeration {@link de.fraunhofer.ipa.deployment.util.LinuxDistribution}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see de.fraunhofer.ipa.deployment.util.LinuxDistribution
     * @see #setValue(LinuxDistribution)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getLinuxDistributionValue_Value()
     * @model required="true"
     * @generated
     */
    LinuxDistribution getValue();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.LinuxDistributionValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see de.fraunhofer.ipa.deployment.util.LinuxDistribution
     * @see #getValue()
     * @generated
     */
    void setValue(LinuxDistribution value);

} // LinuxDistributionValue
