/**
 */
package deployPlanWithRosModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage
 * @generated
 */
public interface DeployPlanWithRosModelFactory extends EFactory {
    /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    DeployPlanWithRosModelFactory eINSTANCE = deployPlanWithRosModel.impl.DeployPlanWithRosModelFactoryImpl.init();

    /**
   * Returns a new object of class '<em>Rossystem Implementation Assignment</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Rossystem Implementation Assignment</em>'.
   * @generated
   */
    RossystemImplementationAssignment createRossystemImplementationAssignment();

                /**
   * Returns a new object of class '<em>Config Ros Parameter</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Ros Parameter</em>'.
   * @generated
   */
    ConfigRosParameter createConfigRosParameter();

    /**
   * Returns a new object of class '<em>Config Ros Software Component</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Ros Software Component</em>'.
   * @generated
   */
    ConfigRosSoftwareComponent createConfigRosSoftwareComponent();

    /**
   * Returns a new object of class '<em>Deploy Rossystem Plan</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy Rossystem Plan</em>'.
   * @generated
   */
  DeployRossystemPlan createDeployRossystemPlan();

        /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
    DeployPlanWithRosModelPackage getDeployPlanWithRosModelPackage();

} //DeployPlanWithRosModelFactory
