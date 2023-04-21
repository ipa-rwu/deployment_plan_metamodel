/**
 */
package implementationDescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.Repository#getUrl <em>Url</em>}</li>
 *   <li>{@link implementationDescription.Repository#getVersion <em>Version</em>}</li>
 *   <li>{@link implementationDescription.Repository#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see implementationDescription.ImplementationDescriptionPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
    /**
     * Returns the value of the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Url</em>' attribute.
     * @see #setUrl(String)
     * @see implementationDescription.ImplementationDescriptionPackage#getRepository_Url()
     * @model required="true"
     * @generated
     */
    String getUrl();

    /**
     * Sets the value of the '{@link implementationDescription.Repository#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see implementationDescription.ImplementationDescriptionPackage#getRepository_Version()
     * @model required="true"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link implementationDescription.Repository#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(RepositoryType)
     * @see implementationDescription.ImplementationDescriptionPackage#getRepository_Type()
     * @model containment="true" required="true"
     * @generated
     */
    RepositoryType getType();

    /**
     * Sets the value of the '{@link implementationDescription.Repository#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(RepositoryType value);

} // Repository
