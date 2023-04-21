/**
 */
package targetEnvironment;

import de.fraunhofer.ipa.deployment.util.PropertyValue;

import device.ConnectionProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Connection Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.ConfigConnectionProperty#getName <em>Name</em>}</li>
 *   <li>{@link targetEnvironment.ConfigConnectionProperty#getRefConnectionProperty <em>Ref Connection Property</em>}</li>
 *   <li>{@link targetEnvironment.ConfigConnectionProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getConfigConnectionProperty()
 * @model
 * @generated
 */
public interface ConfigConnectionProperty extends AbstractConfigProperty {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see targetEnvironment.TargetEnvironmentPackage#getConfigConnectionProperty_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link targetEnvironment.ConfigConnectionProperty#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Ref Connection Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ref Connection Property</em>' reference.
     * @see #setRefConnectionProperty(ConnectionProperty)
     * @see targetEnvironment.TargetEnvironmentPackage#getConfigConnectionProperty_RefConnectionProperty()
     * @model required="true" derived="true"
     * @generated
     */
    ConnectionProperty getRefConnectionProperty();

    /**
     * Sets the value of the '{@link targetEnvironment.ConfigConnectionProperty#getRefConnectionProperty <em>Ref Connection Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref Connection Property</em>' reference.
     * @see #getRefConnectionProperty()
     * @generated
     */
    void setRefConnectionProperty(ConnectionProperty value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(PropertyValue)
     * @see targetEnvironment.TargetEnvironmentPackage#getConfigConnectionProperty_Value()
     * @model containment="true" required="true"
     * @generated
     */
    PropertyValue getValue();

    /**
     * Sets the value of the '{@link targetEnvironment.ConfigConnectionProperty#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(PropertyValue value);

} // ConfigConnectionProperty
