/**
 */
package targetEnvironment;

import base.PropertyValue;
import device.ConnectionProperty;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Connection Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.ConfigConnectionProperty#getRefConnectionProperty <em>Ref Connection Property</em>}</li>
 *   <li>{@link targetEnvironment.ConfigConnectionProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getConfigConnectionProperty()
 * @model
 * @generated
 */
public interface ConfigConnectionProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Connection Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Connection Property</em>' reference.
	 * @see #setRefConnectionProperty(ConnectionProperty)
	 * @see targetEnvironment.TargetEnvironmentPackage#getConfigConnectionProperty_RefConnectionProperty()
	 * @model keys="name" required="true" derived="true"
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
