/**
 */
package deployPlanWithRosModel;

import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;

import system.SystemRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Computation Assignment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.RosComputationAssignmentTarget#getRefComponent <em>Ref Component</em>}</li>
 * </ul>
 *
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRosComputationAssignmentTarget()
 * @model
 * @generated
 */
public interface RosComputationAssignmentTarget extends AbstractComputationAssignmentTarget {
    /**
     * Returns the value of the '<em><b>Ref Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ref Component</em>' containment reference.
     * @see #setRefComponent(SystemRef)
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRosComputationAssignmentTarget_RefComponent()
     * @model containment="true" required="true"
     * @generated
     */
    SystemRef getRefComponent();

    /**
     * Sets the value of the '{@link deployPlanWithRosModel.RosComputationAssignmentTarget#getRefComponent <em>Ref Component</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref Component</em>' containment reference.
     * @see #getRefComponent()
     * @generated
     */
    void setRefComponent(SystemRef value);

} // RosComputationAssignmentTarget
