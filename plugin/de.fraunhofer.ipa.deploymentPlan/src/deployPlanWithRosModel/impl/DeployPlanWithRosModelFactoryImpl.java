/**
 */
package deployPlanWithRosModel.impl;

import deployPlanWithRosModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeployPlanWithRosModelFactoryImpl extends EFactoryImpl implements DeployPlanWithRosModelFactory {
    /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public static DeployPlanWithRosModelFactory init() {
    try {
      DeployPlanWithRosModelFactory theDeployPlanWithRosModelFactory = (DeployPlanWithRosModelFactory)EPackage.Registry.INSTANCE.getEFactory(DeployPlanWithRosModelPackage.eNS_URI);
      if (theDeployPlanWithRosModelFactory != null) {
        return theDeployPlanWithRosModelFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DeployPlanWithRosModelFactoryImpl();
  }

    /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public DeployPlanWithRosModelFactoryImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case DeployPlanWithRosModelPackage.ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT: return createRossystemImplementationAssignment();
      case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER: return createConfigRosParameter();
      case DeployPlanWithRosModelPackage.CONFIG_ROS_SOFTWARE_COMPONENT: return createConfigRosSoftwareComponent();
      case DeployPlanWithRosModelPackage.DEPLOY_ROSSYSTEM_PLAN: return createDeployRossystemPlan();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public RossystemImplementationAssignment createRossystemImplementationAssignment() {
    RossystemImplementationAssignmentImpl rossystemImplementationAssignment = new RossystemImplementationAssignmentImpl();
    return rossystemImplementationAssignment;
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public ConfigRosParameter createConfigRosParameter() {
    ConfigRosParameterImpl configRosParameter = new ConfigRosParameterImpl();
    return configRosParameter;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public ConfigRosSoftwareComponent createConfigRosSoftwareComponent() {
    ConfigRosSoftwareComponentImpl configRosSoftwareComponent = new ConfigRosSoftwareComponentImpl();
    return configRosSoftwareComponent;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployRossystemPlan createDeployRossystemPlan() {
    DeployRossystemPlanImpl deployRossystemPlan = new DeployRossystemPlanImpl();
    return deployRossystemPlan;
  }

        /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public DeployPlanWithRosModelPackage getDeployPlanWithRosModelPackage() {
    return (DeployPlanWithRosModelPackage)getEPackage();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
    @Deprecated
    public static DeployPlanWithRosModelPackage getPackage() {
    return DeployPlanWithRosModelPackage.eINSTANCE;
  }

} //DeployPlanWithRosModelFactoryImpl
