/**
 */
package targetEnvironment;

import de.fraunhofer.ipa.deployment.util.Description;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.TargetEnvironment#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getTargetEnvironment()
 * @model
 * @generated
 */
public interface TargetEnvironment extends EObject {
    /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link de.fraunhofer.ipa.deployment.util.Description}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see targetEnvironment.TargetEnvironmentPackage#getTargetEnvironment_Type()
   * @model containment="true" required="true"
   * @generated
   */
    EList<Description> getType();

} // TargetEnvironment
