/**
 */
package implementationDescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.ImplementationDescriptionSet#getImplementations <em>Implementations</em>}</li>
 * </ul>
 *
 * @see implementationDescription.ImplementationDescriptionPackage#getImplementationDescriptionSet()
 * @model
 * @generated
 */
public interface ImplementationDescriptionSet extends EObject {
    /**
   * Returns the value of the '<em><b>Implementations</b></em>' containment reference list.
   * The list contents are of type {@link implementationDescription.ImplementationDescription}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Implementations</em>' containment reference list.
   * @see implementationDescription.ImplementationDescriptionPackage#getImplementationDescriptionSet_Implementations()
   * @model containment="true" required="true"
   * @generated
   */
    EList<ImplementationDescription> getImplementations();

} // ImplementationDescriptionSet
