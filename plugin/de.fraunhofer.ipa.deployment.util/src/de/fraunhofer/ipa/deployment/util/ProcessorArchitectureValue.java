/**
 */
package de.fraunhofer.ipa.deployment.util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Architecture Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getProcessorArchitectureValue()
 * @model
 * @generated
 */
public interface ProcessorArchitectureValue extends PropertyValue {

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The literals are from the enumeration {@link de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType
     * @see #setValue(ProcessorArchitectureType)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getProcessorArchitectureValue_Value()
     * @model required="true"
     * @generated
     */
    ProcessorArchitectureType getValue();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType
     * @see #getValue()
     * @generated
     */
    void setValue(ProcessorArchitectureType value);
} // ProcessorArchitectureValue
