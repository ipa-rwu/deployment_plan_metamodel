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
 *   <li>{@link deploymentPlan.AbstractRealization#getRealization <em>Realization</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getAbstractRealization()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRealization extends EObject {
    /**
     * Returns the value of the '<em><b>Realization</b></em>' containment reference list.
     * The list contents are of type {@link deploymentPlan.AbstractComputationAssignment}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realization</em>' containment reference list.
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractRealization_Realization()
     * @model containment="true"
     * @generated
     */
    EList<AbstractComputationAssignment> getRealization();

} // AbstractRealization
