/**
 */
package deploymentPlan;

import org.eclipse.emf.ecore.EObject;

import targetEnvironment.ComputationDeviceInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Computation Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getExecutedBy <em>Executed By</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment()
 * @model abstract="true"
 * @generated
 */
public interface AbstractComputationAssignment extends EObject {
    /**
     * Returns the value of the '<em><b>Executed By</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Executed By</em>' reference.
     * @see #setExecutedBy(ComputationDeviceInstance)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment_ExecutedBy()
     * @model required="true"
     * @generated
     */
    ComputationDeviceInstance getExecutedBy();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractComputationAssignment#getExecutedBy <em>Executed By</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Executed By</em>' reference.
     * @see #getExecutedBy()
     * @generated
     */
    void setExecutedBy(ComputationDeviceInstance value);

} // AbstractComputationAssignment
