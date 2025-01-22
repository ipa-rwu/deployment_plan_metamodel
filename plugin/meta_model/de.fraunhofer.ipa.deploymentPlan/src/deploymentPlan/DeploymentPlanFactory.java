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
   * Returns a new object of class '<em>Config Software Component</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Software Component</em>'.
   * @generated
   */
    ConfigSoftwareComponent createConfigSoftwareComponent();

    /**
   * Returns a new object of class '<em>Ros Middleware</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Ros Middleware</em>'.
   * @generated
   */
    RosMiddleware createRosMiddleware();

    /**
   * Returns a new object of class '<em>Container Runtime</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Runtime</em>'.
   * @generated
   */
    ContainerRuntime createContainerRuntime();

                /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
    DeploymentPlanPackage getDeploymentPlanPackage();

} //DeploymentPlanFactory
