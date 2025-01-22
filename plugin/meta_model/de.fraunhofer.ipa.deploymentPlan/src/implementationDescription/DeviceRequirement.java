/**
 */
package implementationDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.DeviceRequirement#getType <em>Type</em>}</li>
 *   <li>{@link implementationDescription.DeviceRequirement#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see implementationDescription.ImplementationDescriptionPackage#getDeviceRequirement()
 * @model
 * @generated
 */
public interface DeviceRequirement extends ExecutionRequirement {
    /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see implementationDescription.ImplementationDescriptionPackage#getDeviceRequirement_Type()
   * @model required="true"
   * @generated
   */
    String getType();

    /**
   * Sets the value of the '{@link implementationDescription.DeviceRequirement#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
    void setType(String value);

    /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link implementationDescription.HWSWParemeter}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see implementationDescription.ImplementationDescriptionPackage#getDeviceRequirement_Parameter()
   * @model containment="true"
   * @generated
   */
    EList<HWSWParemeter> getParameter();

} // DeviceRequirement
