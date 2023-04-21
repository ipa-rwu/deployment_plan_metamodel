/**
 */
package deploymentPlan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.AbstractRealization#getRealizations <em>Realizations</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getAbstractRealization()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRealization extends EObject {
    /**
     * Returns the value of the '<em><b>Realizations</b></em>' containment reference list.
     * The list contents are of type {@link deploymentPlan.AbstractComputationAssignment}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realizations</em>' containment reference list.
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractRealization_Realizations()
     * @model containment="true"
     * @generated
     */
    EList<AbstractComputationAssignment> getRealizations();

} // AbstractRealization
