/**
 */
package deploymentPlan;

import org.eclipse.emf.ecore.EObject;

import targetEnvironment.TargetDeployEnviroment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Deployment Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.AbstractDeploymentPlan#getName <em>Name</em>}</li>
 *   <li>{@link deploymentPlan.AbstractDeploymentPlan#getDeployTo <em>Deploy To</em>}</li>
 *   <li>{@link deploymentPlan.AbstractDeploymentPlan#getRealize <em>Realize</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getAbstractDeploymentPlan()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDeploymentPlan extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractDeploymentPlan_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractDeploymentPlan#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Deploy To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deploy To</em>' reference.
     * @see #setDeployTo(TargetDeployEnviroment)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractDeploymentPlan_DeployTo()
     * @model required="true"
     * @generated
     */
    TargetDeployEnviroment getDeployTo();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractDeploymentPlan#getDeployTo <em>Deploy To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deploy To</em>' reference.
     * @see #getDeployTo()
     * @generated
     */
    void setDeployTo(TargetDeployEnviroment value);

    /**
     * Returns the value of the '<em><b>Realize</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realize</em>' containment reference.
     * @see #setRealize(AbstractRealization)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractDeploymentPlan_Realize()
     * @model containment="true" required="true"
     * @generated
     */
    AbstractRealization getRealize();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractDeploymentPlan#getRealize <em>Realize</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Realize</em>' containment reference.
     * @see #getRealize()
     * @generated
     */
    void setRealize(AbstractRealization value);

} // AbstractDeploymentPlan
