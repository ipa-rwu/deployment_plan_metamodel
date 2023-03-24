/**
 */
package deployPlanWithRosModel;

import deploymentPlan.AbstractComputationAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rospackage Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.RospackageImplementation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRospackageImplementation()
 * @model
 * @generated
 */
public interface RospackageImplementation extends AbstractComputationAssignment {
    /**
     * Returns the value of the '<em><b>Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' reference.
     * @see #setName(ros.Package)
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRospackageImplementation_Name()
     * @model
     * @generated
     */
    ros.Package getName();

    /**
     * Sets the value of the '{@link deployPlanWithRosModel.RospackageImplementation#getName <em>Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' reference.
     * @see #getName()
     * @generated
     */
    void setName(ros.Package value);

} // RospackageImplementation
