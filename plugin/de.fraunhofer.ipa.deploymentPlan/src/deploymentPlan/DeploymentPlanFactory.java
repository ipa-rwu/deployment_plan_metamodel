/**
 */
package deploymentPlan;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see deploymentPlan.DeploymentPlanPackage
 * @generated
 */
public interface DeploymentPlanFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DeploymentPlanFactory eINSTANCE = deploymentPlan.impl.DeploymentPlanFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Plan</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Plan</em>'.
     * @generated
     */
    Plan createPlan();

    /**
     * Returns a new object of class '<em>Deployment Plan</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Deployment Plan</em>'.
     * @generated
     */
    DeploymentPlan createDeploymentPlan();

    /**
     * Returns a new object of class '<em>Realization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Realization</em>'.
     * @generated
     */
    Realization createRealization();

    /**
     * Returns a new object of class '<em>Implementation Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Implementation Assignment</em>'.
     * @generated
     */
    ImplementationAssignment createImplementationAssignment();

    /**
     * Returns a new object of class '<em>Config Execution Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Config Execution Parameter</em>'.
     * @generated
     */
    ConfigExecutionParameter createConfigExecutionParameter();

    /**
     * Returns a new object of class '<em>Humble ROS Distro</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Humble ROS Distro</em>'.
     * @generated
     */
    HumbleROSDistro createHumbleROSDistro();

    /**
     * Returns a new object of class '<em>Noetic ROS Distro</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Noetic ROS Distro</em>'.
     * @generated
     */
    NoeticROSDistro createNoeticROSDistro();

    /**
     * Returns a new object of class '<em>Config Software Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Config Software Component</em>'.
     * @generated
     */
    ConfigSoftwareComponent createConfigSoftwareComponent();

    /**
     * Returns a new object of class '<em>Abstarct Config Software Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abstarct Config Software Component</em>'.
     * @generated
     */
    AbstarctConfigSoftwareComponent createAbstarctConfigSoftwareComponent();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DeploymentPlanPackage getDeploymentPlanPackage();

} //DeploymentPlanFactory
