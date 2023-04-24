/**
 */
package targetEnvironment;

import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.PropertyValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Device Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.ConfigDeviceProperty#getName <em>Name</em>}</li>
 *   <li>{@link targetEnvironment.ConfigDeviceProperty#getRefProperty <em>Ref Property</em>}</li>
 *   <li>{@link targetEnvironment.ConfigDeviceProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getConfigDeviceProperty()
 * @model
 * @generated
 */
public interface ConfigDeviceProperty extends AbstractConfigProperty {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see targetEnvironment.TargetEnvironmentPackage#getConfigDeviceProperty_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link targetEnvironment.ConfigDeviceProperty#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Ref Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ref Property</em>' reference.
     * @see #setRefProperty(AbstractProperty)
     * @see targetEnvironment.TargetEnvironmentPackage#getConfigDeviceProperty_RefProperty()
     * @model required="true" derived="true"
     * @generated
     */
    AbstractProperty getRefProperty();

    /**
     * Sets the value of the '{@link targetEnvironment.ConfigDeviceProperty#getRefProperty <em>Ref Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref Property</em>' reference.
     * @see #getRefProperty()
     * @generated
     */
    void setRefProperty(AbstractProperty value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(PropertyValue)
     * @see targetEnvironment.TargetEnvironmentPackage#getConfigDeviceProperty_Value()
     * @model containment="true" required="true"
     * @generated
     */
    PropertyValue getValue();

    /**
     * Sets the value of the '{@link targetEnvironment.ConfigDeviceProperty#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(PropertyValue value);

} // ConfigDeviceProperty
