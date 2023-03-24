/**
 */
package targetEnvironment;

import de.fraunhofer.ipa.deployment.util.PropertyValue;

import device.DeviceProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Device Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.ConfigDeviceProperty#getFrom <em>From</em>}</li>
 *   <li>{@link targetEnvironment.ConfigDeviceProperty#getValue <em>Value</em>}</li>
 *   <li>{@link targetEnvironment.ConfigDeviceProperty#getFullname <em>Fullname</em>}</li>
 *   <li>{@link targetEnvironment.ConfigDeviceProperty#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getConfigDeviceProperty()
 * @model
 * @generated
 */
public interface ConfigDeviceProperty extends AbstractConfigProperty {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(DeviceProperty)
     * @see targetEnvironment.TargetEnvironmentPackage#getConfigDeviceProperty_From()
     * @model required="true" derived="true"
     * @generated
     */
    DeviceProperty getFrom();

    /**
     * Sets the value of the '{@link targetEnvironment.ConfigDeviceProperty#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(DeviceProperty value);

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

    /**
     * Returns the value of the '<em><b>Fullname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fullname</em>' attribute.
     * @see #isSetFullname()
     * @see targetEnvironment.TargetEnvironmentPackage#getConfigDeviceProperty_Fullname()
     * @model unsettable="true" required="true" changeable="false"
     * @generated
     */
    String getFullname();

    /**
     * Returns whether the value of the '{@link targetEnvironment.ConfigDeviceProperty#getFullname <em>Fullname</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fullname</em>' attribute is set.
     * @see #getFullname()
     * @generated
     */
    boolean isSetFullname();

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    AbstractDeviceInstance getParent();

} // ConfigDeviceProperty
