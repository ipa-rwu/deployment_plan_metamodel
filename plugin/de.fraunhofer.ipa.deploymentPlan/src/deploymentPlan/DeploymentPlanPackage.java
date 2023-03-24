/**
 */
package deploymentPlan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see deploymentPlan.DeploymentPlanFactory
 * @model kind="package"
 * @generated
 */
public interface DeploymentPlanPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "deploymentPlan";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.ipa.fraunhofer.de/DeploymentPlan";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "DeploymentPlan";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DeploymentPlanPackage eINSTANCE = deploymentPlan.impl.DeploymentPlanPackageImpl.init();

    /**
     * The meta object id for the '{@link deploymentPlan.impl.PlanImpl <em>Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.PlanImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getPlan()
     * @generated
     */
    int PLAN = 0;

    /**
     * The feature id for the '<em><b>Plan</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAN__PLAN = 0;

    /**
     * The number of structural features of the '<em>Plan</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAN_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Plan</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAN_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.AbstractDeploymentPlanImpl <em>Abstract Deployment Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.AbstractDeploymentPlanImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstractDeploymentPlan()
     * @generated
     */
    int ABSTRACT_DEPLOYMENT_PLAN = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEPLOYMENT_PLAN__NAME = 0;

    /**
     * The feature id for the '<em><b>Deploy To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO = 1;

    /**
     * The feature id for the '<em><b>Realize</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEPLOYMENT_PLAN__REALIZE = 2;

    /**
     * The number of structural features of the '<em>Abstract Deployment Plan</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEPLOYMENT_PLAN_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Abstract Deployment Plan</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DEPLOYMENT_PLAN_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.DeploymentPlanImpl <em>Deployment Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.DeploymentPlanImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getDeploymentPlan()
     * @generated
     */
    int DEPLOYMENT_PLAN = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_PLAN__NAME = ABSTRACT_DEPLOYMENT_PLAN__NAME;

    /**
     * The feature id for the '<em><b>Deploy To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_PLAN__DEPLOY_TO = ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO;

    /**
     * The feature id for the '<em><b>Realize</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_PLAN__REALIZE = ABSTRACT_DEPLOYMENT_PLAN__REALIZE;

    /**
     * The number of structural features of the '<em>Deployment Plan</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_PLAN_FEATURE_COUNT = ABSTRACT_DEPLOYMENT_PLAN_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Deployment Plan</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_PLAN_OPERATION_COUNT = ABSTRACT_DEPLOYMENT_PLAN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.AbstractRealizationImpl <em>Abstract Realization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.AbstractRealizationImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstractRealization()
     * @generated
     */
    int ABSTRACT_REALIZATION = 3;

    /**
     * The feature id for the '<em><b>Realization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_REALIZATION__REALIZATION = 0;

    /**
     * The number of structural features of the '<em>Abstract Realization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_REALIZATION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Abstract Realization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_REALIZATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.RealizationImpl <em>Realization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.RealizationImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getRealization()
     * @generated
     */
    int REALIZATION = 4;

    /**
     * The feature id for the '<em><b>Realization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REALIZATION__REALIZATION = ABSTRACT_REALIZATION__REALIZATION;

    /**
     * The number of structural features of the '<em>Realization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REALIZATION_FEATURE_COUNT = ABSTRACT_REALIZATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Realization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REALIZATION_OPERATION_COUNT = ABSTRACT_REALIZATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.AbstractComputationAssignmentImpl <em>Abstract Computation Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.AbstractComputationAssignmentImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstractComputationAssignment()
     * @generated
     */
    int ABSTRACT_COMPUTATION_ASSIGNMENT = 5;

    /**
     * The feature id for the '<em><b>Executed By</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY = 0;

    /**
     * The number of structural features of the '<em>Abstract Computation Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMPUTATION_ASSIGNMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Abstract Computation Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_COMPUTATION_ASSIGNMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.ImplementationAssignmentImpl <em>Implementation Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.ImplementationAssignmentImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getImplementationAssignment()
     * @generated
     */
    int IMPLEMENTATION_ASSIGNMENT = 6;

    /**
     * The feature id for the '<em><b>Executed By</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_ASSIGNMENT__EXECUTED_BY = ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY;

    /**
     * The feature id for the '<em><b>Software Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENT = ABSTRACT_COMPUTATION_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Middleware</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_ASSIGNMENT__MIDDLEWARE = ABSTRACT_COMPUTATION_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Implementation Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_ASSIGNMENT_FEATURE_COUNT = ABSTRACT_COMPUTATION_ASSIGNMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Implementation Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_ASSIGNMENT_OPERATION_COUNT = ABSTRACT_COMPUTATION_ASSIGNMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.AbstractConfigExecutionParameterImpl <em>Abstract Config Execution Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.AbstractConfigExecutionParameterImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstractConfigExecutionParameter()
     * @generated
     */
    int ABSTRACT_CONFIG_EXECUTION_PARAMETER = 7;

    /**
     * The number of structural features of the '<em>Abstract Config Execution Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONFIG_EXECUTION_PARAMETER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstract Config Execution Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONFIG_EXECUTION_PARAMETER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.ConfigExecutionParameterImpl <em>Config Execution Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.ConfigExecutionParameterImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getConfigExecutionParameter()
     * @generated
     */
    int CONFIG_EXECUTION_PARAMETER = 8;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_EXECUTION_PARAMETER__FROM = ABSTRACT_CONFIG_EXECUTION_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_EXECUTION_PARAMETER__TO = ABSTRACT_CONFIG_EXECUTION_PARAMETER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_EXECUTION_PARAMETER__VALUE = ABSTRACT_CONFIG_EXECUTION_PARAMETER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Config Execution Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_EXECUTION_PARAMETER_FEATURE_COUNT = ABSTRACT_CONFIG_EXECUTION_PARAMETER_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Config Execution Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_EXECUTION_PARAMETER_OPERATION_COUNT = ABSTRACT_CONFIG_EXECUTION_PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.AbstractExecutionConfigurationImpl <em>Abstract Execution Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.AbstractExecutionConfigurationImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstractExecutionConfiguration()
     * @generated
     */
    int ABSTRACT_EXECUTION_CONFIGURATION = 9;

    /**
     * The number of structural features of the '<em>Abstract Execution Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXECUTION_CONFIGURATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Abstract Execution Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXECUTION_CONFIGURATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.MiddlewareImpl <em>Middleware</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.MiddlewareImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getMiddleware()
     * @generated
     */
    int MIDDLEWARE = 10;

    /**
     * The number of structural features of the '<em>Middleware</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIDDLEWARE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Middleware</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIDDLEWARE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.ROSDistroImpl <em>ROS Distro</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.ROSDistroImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getROSDistro()
     * @generated
     */
    int ROS_DISTRO = 11;

    /**
     * The number of structural features of the '<em>ROS Distro</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_DISTRO_FEATURE_COUNT = MIDDLEWARE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>ROS Distro</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_DISTRO_OPERATION_COUNT = MIDDLEWARE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.HumbleROSDistroImpl <em>Humble ROS Distro</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.HumbleROSDistroImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getHumbleROSDistro()
     * @generated
     */
    int HUMBLE_ROS_DISTRO = 12;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMBLE_ROS_DISTRO__VERSION = ROS_DISTRO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Distro</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMBLE_ROS_DISTRO__DISTRO = ROS_DISTRO_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Humble ROS Distro</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMBLE_ROS_DISTRO_FEATURE_COUNT = ROS_DISTRO_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Humble ROS Distro</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMBLE_ROS_DISTRO_OPERATION_COUNT = ROS_DISTRO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.NoeticROSDistroImpl <em>Noetic ROS Distro</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.NoeticROSDistroImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getNoeticROSDistro()
     * @generated
     */
    int NOETIC_ROS_DISTRO = 13;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOETIC_ROS_DISTRO__VERSION = ROS_DISTRO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Distro</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOETIC_ROS_DISTRO__DISTRO = ROS_DISTRO_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Noetic ROS Distro</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOETIC_ROS_DISTRO_FEATURE_COUNT = ROS_DISTRO_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Noetic ROS Distro</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOETIC_ROS_DISTRO_OPERATION_COUNT = ROS_DISTRO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.AbstarctConfigSoftwareComponentImpl <em>Abstarct Config Software Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.AbstarctConfigSoftwareComponentImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstarctConfigSoftwareComponent()
     * @generated
     */
    int ABSTARCT_CONFIG_SOFTWARE_COMPONENT = 15;

    /**
     * The feature id for the '<em><b>Execution Configuration</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION = 0;

    /**
     * The feature id for the '<em><b>Start Command</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND = 1;

    /**
     * The number of structural features of the '<em>Abstarct Config Software Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTARCT_CONFIG_SOFTWARE_COMPONENT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Abstarct Config Software Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTARCT_CONFIG_SOFTWARE_COMPONENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link deploymentPlan.impl.ConfigSoftwareComponentImpl <em>Config Software Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deploymentPlan.impl.ConfigSoftwareComponentImpl
     * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getConfigSoftwareComponent()
     * @generated
     */
    int CONFIG_SOFTWARE_COMPONENT = 14;

    /**
     * The feature id for the '<em><b>Execution Configuration</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION = ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION;

    /**
     * The feature id for the '<em><b>Start Command</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_SOFTWARE_COMPONENT__START_COMMAND = ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_SOFTWARE_COMPONENT__COMPONENT = ABSTARCT_CONFIG_SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Config Software Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_SOFTWARE_COMPONENT_FEATURE_COUNT = ABSTARCT_CONFIG_SOFTWARE_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Config Software Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_SOFTWARE_COMPONENT_OPERATION_COUNT = ABSTARCT_CONFIG_SOFTWARE_COMPONENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link deploymentPlan.Plan <em>Plan</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Plan</em>'.
     * @see deploymentPlan.Plan
     * @generated
     */
    EClass getPlan();

    /**
     * Returns the meta object for the containment reference '{@link deploymentPlan.Plan#getPlan <em>Plan</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Plan</em>'.
     * @see deploymentPlan.Plan#getPlan()
     * @see #getPlan()
     * @generated
     */
    EReference getPlan_Plan();

    /**
     * Returns the meta object for class '{@link deploymentPlan.AbstractDeploymentPlan <em>Abstract Deployment Plan</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Deployment Plan</em>'.
     * @see deploymentPlan.AbstractDeploymentPlan
     * @generated
     */
    EClass getAbstractDeploymentPlan();

    /**
     * Returns the meta object for the attribute '{@link deploymentPlan.AbstractDeploymentPlan#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see deploymentPlan.AbstractDeploymentPlan#getName()
     * @see #getAbstractDeploymentPlan()
     * @generated
     */
    EAttribute getAbstractDeploymentPlan_Name();

    /**
     * Returns the meta object for the reference '{@link deploymentPlan.AbstractDeploymentPlan#getDeployTo <em>Deploy To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Deploy To</em>'.
     * @see deploymentPlan.AbstractDeploymentPlan#getDeployTo()
     * @see #getAbstractDeploymentPlan()
     * @generated
     */
    EReference getAbstractDeploymentPlan_DeployTo();

    /**
     * Returns the meta object for the containment reference '{@link deploymentPlan.AbstractDeploymentPlan#getRealize <em>Realize</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Realize</em>'.
     * @see deploymentPlan.AbstractDeploymentPlan#getRealize()
     * @see #getAbstractDeploymentPlan()
     * @generated
     */
    EReference getAbstractDeploymentPlan_Realize();

    /**
     * Returns the meta object for class '{@link deploymentPlan.DeploymentPlan <em>Deployment Plan</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deployment Plan</em>'.
     * @see deploymentPlan.DeploymentPlan
     * @generated
     */
    EClass getDeploymentPlan();

    /**
     * Returns the meta object for class '{@link deploymentPlan.AbstractRealization <em>Abstract Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Realization</em>'.
     * @see deploymentPlan.AbstractRealization
     * @generated
     */
    EClass getAbstractRealization();

    /**
     * Returns the meta object for the containment reference list '{@link deploymentPlan.AbstractRealization#getRealization <em>Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Realization</em>'.
     * @see deploymentPlan.AbstractRealization#getRealization()
     * @see #getAbstractRealization()
     * @generated
     */
    EReference getAbstractRealization_Realization();

    /**
     * Returns the meta object for class '{@link deploymentPlan.Realization <em>Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Realization</em>'.
     * @see deploymentPlan.Realization
     * @generated
     */
    EClass getRealization();

    /**
     * Returns the meta object for class '{@link deploymentPlan.AbstractComputationAssignment <em>Abstract Computation Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Computation Assignment</em>'.
     * @see deploymentPlan.AbstractComputationAssignment
     * @generated
     */
    EClass getAbstractComputationAssignment();

    /**
     * Returns the meta object for the reference '{@link deploymentPlan.AbstractComputationAssignment#getExecutedBy <em>Executed By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Executed By</em>'.
     * @see deploymentPlan.AbstractComputationAssignment#getExecutedBy()
     * @see #getAbstractComputationAssignment()
     * @generated
     */
    EReference getAbstractComputationAssignment_ExecutedBy();

    /**
     * Returns the meta object for class '{@link deploymentPlan.ImplementationAssignment <em>Implementation Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implementation Assignment</em>'.
     * @see deploymentPlan.ImplementationAssignment
     * @generated
     */
    EClass getImplementationAssignment();

    /**
     * Returns the meta object for the containment reference list '{@link deploymentPlan.ImplementationAssignment#getSoftwareComponent <em>Software Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Software Component</em>'.
     * @see deploymentPlan.ImplementationAssignment#getSoftwareComponent()
     * @see #getImplementationAssignment()
     * @generated
     */
    EReference getImplementationAssignment_SoftwareComponent();

    /**
     * Returns the meta object for the containment reference list '{@link deploymentPlan.ImplementationAssignment#getMiddleware <em>Middleware</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Middleware</em>'.
     * @see deploymentPlan.ImplementationAssignment#getMiddleware()
     * @see #getImplementationAssignment()
     * @generated
     */
    EReference getImplementationAssignment_Middleware();

    /**
     * Returns the meta object for class '{@link deploymentPlan.AbstractConfigExecutionParameter <em>Abstract Config Execution Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Config Execution Parameter</em>'.
     * @see deploymentPlan.AbstractConfigExecutionParameter
     * @generated
     */
    EClass getAbstractConfigExecutionParameter();

    /**
     * Returns the meta object for class '{@link deploymentPlan.ConfigExecutionParameter <em>Config Execution Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Config Execution Parameter</em>'.
     * @see deploymentPlan.ConfigExecutionParameter
     * @generated
     */
    EClass getConfigExecutionParameter();

    /**
     * Returns the meta object for the reference '{@link deploymentPlan.ConfigExecutionParameter#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see deploymentPlan.ConfigExecutionParameter#getFrom()
     * @see #getConfigExecutionParameter()
     * @generated
     */
    EReference getConfigExecutionParameter_From();

    /**
     * Returns the meta object for the reference '{@link deploymentPlan.ConfigExecutionParameter#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>To</em>'.
     * @see deploymentPlan.ConfigExecutionParameter#getTo()
     * @see #getConfigExecutionParameter()
     * @generated
     */
    EReference getConfigExecutionParameter_To();

    /**
     * Returns the meta object for the containment reference '{@link deploymentPlan.ConfigExecutionParameter#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see deploymentPlan.ConfigExecutionParameter#getValue()
     * @see #getConfigExecutionParameter()
     * @generated
     */
    EReference getConfigExecutionParameter_Value();

    /**
     * Returns the meta object for class '{@link deploymentPlan.AbstractExecutionConfiguration <em>Abstract Execution Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Execution Configuration</em>'.
     * @see deploymentPlan.AbstractExecutionConfiguration
     * @generated
     */
    EClass getAbstractExecutionConfiguration();

    /**
     * Returns the meta object for class '{@link deploymentPlan.Middleware <em>Middleware</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Middleware</em>'.
     * @see deploymentPlan.Middleware
     * @generated
     */
    EClass getMiddleware();

    /**
     * Returns the meta object for class '{@link deploymentPlan.ROSDistro <em>ROS Distro</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ROS Distro</em>'.
     * @see deploymentPlan.ROSDistro
     * @generated
     */
    EClass getROSDistro();

    /**
     * Returns the meta object for class '{@link deploymentPlan.HumbleROSDistro <em>Humble ROS Distro</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Humble ROS Distro</em>'.
     * @see deploymentPlan.HumbleROSDistro
     * @generated
     */
    EClass getHumbleROSDistro();

    /**
     * Returns the meta object for the attribute '{@link deploymentPlan.HumbleROSDistro#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see deploymentPlan.HumbleROSDistro#getVersion()
     * @see #getHumbleROSDistro()
     * @generated
     */
    EAttribute getHumbleROSDistro_Version();

    /**
     * Returns the meta object for the attribute '{@link deploymentPlan.HumbleROSDistro#getDistro <em>Distro</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Distro</em>'.
     * @see deploymentPlan.HumbleROSDistro#getDistro()
     * @see #getHumbleROSDistro()
     * @generated
     */
    EAttribute getHumbleROSDistro_Distro();

    /**
     * Returns the meta object for class '{@link deploymentPlan.NoeticROSDistro <em>Noetic ROS Distro</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Noetic ROS Distro</em>'.
     * @see deploymentPlan.NoeticROSDistro
     * @generated
     */
    EClass getNoeticROSDistro();

    /**
     * Returns the meta object for the attribute '{@link deploymentPlan.NoeticROSDistro#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see deploymentPlan.NoeticROSDistro#getVersion()
     * @see #getNoeticROSDistro()
     * @generated
     */
    EAttribute getNoeticROSDistro_Version();

    /**
     * Returns the meta object for the attribute '{@link deploymentPlan.NoeticROSDistro#getDistro <em>Distro</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Distro</em>'.
     * @see deploymentPlan.NoeticROSDistro#getDistro()
     * @see #getNoeticROSDistro()
     * @generated
     */
    EAttribute getNoeticROSDistro_Distro();

    /**
     * Returns the meta object for class '{@link deploymentPlan.ConfigSoftwareComponent <em>Config Software Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Config Software Component</em>'.
     * @see deploymentPlan.ConfigSoftwareComponent
     * @generated
     */
    EClass getConfigSoftwareComponent();

    /**
     * Returns the meta object for the reference '{@link deploymentPlan.ConfigSoftwareComponent#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Component</em>'.
     * @see deploymentPlan.ConfigSoftwareComponent#getComponent()
     * @see #getConfigSoftwareComponent()
     * @generated
     */
    EReference getConfigSoftwareComponent_Component();

    /**
     * Returns the meta object for class '{@link deploymentPlan.AbstarctConfigSoftwareComponent <em>Abstarct Config Software Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstarct Config Software Component</em>'.
     * @see deploymentPlan.AbstarctConfigSoftwareComponent
     * @generated
     */
    EClass getAbstarctConfigSoftwareComponent();

    /**
     * Returns the meta object for the containment reference list '{@link deploymentPlan.AbstarctConfigSoftwareComponent#getExecutionConfiguration <em>Execution Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Execution Configuration</em>'.
     * @see deploymentPlan.AbstarctConfigSoftwareComponent#getExecutionConfiguration()
     * @see #getAbstarctConfigSoftwareComponent()
     * @generated
     */
    EReference getAbstarctConfigSoftwareComponent_ExecutionConfiguration();

    /**
     * Returns the meta object for the attribute list '{@link deploymentPlan.AbstarctConfigSoftwareComponent#getStartCommand <em>Start Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Start Command</em>'.
     * @see deploymentPlan.AbstarctConfigSoftwareComponent#getStartCommand()
     * @see #getAbstarctConfigSoftwareComponent()
     * @generated
     */
    EAttribute getAbstarctConfigSoftwareComponent_StartCommand();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DeploymentPlanFactory getDeploymentPlanFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link deploymentPlan.impl.PlanImpl <em>Plan</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.PlanImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getPlan()
         * @generated
         */
        EClass PLAN = eINSTANCE.getPlan();

        /**
         * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLAN__PLAN = eINSTANCE.getPlan_Plan();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.AbstractDeploymentPlanImpl <em>Abstract Deployment Plan</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.AbstractDeploymentPlanImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstractDeploymentPlan()
         * @generated
         */
        EClass ABSTRACT_DEPLOYMENT_PLAN = eINSTANCE.getAbstractDeploymentPlan();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_DEPLOYMENT_PLAN__NAME = eINSTANCE.getAbstractDeploymentPlan_Name();

        /**
         * The meta object literal for the '<em><b>Deploy To</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO = eINSTANCE.getAbstractDeploymentPlan_DeployTo();

        /**
         * The meta object literal for the '<em><b>Realize</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_DEPLOYMENT_PLAN__REALIZE = eINSTANCE.getAbstractDeploymentPlan_Realize();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.DeploymentPlanImpl <em>Deployment Plan</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.DeploymentPlanImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getDeploymentPlan()
         * @generated
         */
        EClass DEPLOYMENT_PLAN = eINSTANCE.getDeploymentPlan();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.AbstractRealizationImpl <em>Abstract Realization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.AbstractRealizationImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstractRealization()
         * @generated
         */
        EClass ABSTRACT_REALIZATION = eINSTANCE.getAbstractRealization();

        /**
         * The meta object literal for the '<em><b>Realization</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_REALIZATION__REALIZATION = eINSTANCE.getAbstractRealization_Realization();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.RealizationImpl <em>Realization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.RealizationImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getRealization()
         * @generated
         */
        EClass REALIZATION = eINSTANCE.getRealization();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.AbstractComputationAssignmentImpl <em>Abstract Computation Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.AbstractComputationAssignmentImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstractComputationAssignment()
         * @generated
         */
        EClass ABSTRACT_COMPUTATION_ASSIGNMENT = eINSTANCE.getAbstractComputationAssignment();

        /**
         * The meta object literal for the '<em><b>Executed By</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY = eINSTANCE.getAbstractComputationAssignment_ExecutedBy();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.ImplementationAssignmentImpl <em>Implementation Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.ImplementationAssignmentImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getImplementationAssignment()
         * @generated
         */
        EClass IMPLEMENTATION_ASSIGNMENT = eINSTANCE.getImplementationAssignment();

        /**
         * The meta object literal for the '<em><b>Software Component</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENT = eINSTANCE.getImplementationAssignment_SoftwareComponent();

        /**
         * The meta object literal for the '<em><b>Middleware</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPLEMENTATION_ASSIGNMENT__MIDDLEWARE = eINSTANCE.getImplementationAssignment_Middleware();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.AbstractConfigExecutionParameterImpl <em>Abstract Config Execution Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.AbstractConfigExecutionParameterImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstractConfigExecutionParameter()
         * @generated
         */
        EClass ABSTRACT_CONFIG_EXECUTION_PARAMETER = eINSTANCE.getAbstractConfigExecutionParameter();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.ConfigExecutionParameterImpl <em>Config Execution Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.ConfigExecutionParameterImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getConfigExecutionParameter()
         * @generated
         */
        EClass CONFIG_EXECUTION_PARAMETER = eINSTANCE.getConfigExecutionParameter();

        /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_EXECUTION_PARAMETER__FROM = eINSTANCE.getConfigExecutionParameter_From();

        /**
         * The meta object literal for the '<em><b>To</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_EXECUTION_PARAMETER__TO = eINSTANCE.getConfigExecutionParameter_To();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_EXECUTION_PARAMETER__VALUE = eINSTANCE.getConfigExecutionParameter_Value();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.AbstractExecutionConfigurationImpl <em>Abstract Execution Configuration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.AbstractExecutionConfigurationImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstractExecutionConfiguration()
         * @generated
         */
        EClass ABSTRACT_EXECUTION_CONFIGURATION = eINSTANCE.getAbstractExecutionConfiguration();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.MiddlewareImpl <em>Middleware</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.MiddlewareImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getMiddleware()
         * @generated
         */
        EClass MIDDLEWARE = eINSTANCE.getMiddleware();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.ROSDistroImpl <em>ROS Distro</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.ROSDistroImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getROSDistro()
         * @generated
         */
        EClass ROS_DISTRO = eINSTANCE.getROSDistro();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.HumbleROSDistroImpl <em>Humble ROS Distro</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.HumbleROSDistroImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getHumbleROSDistro()
         * @generated
         */
        EClass HUMBLE_ROS_DISTRO = eINSTANCE.getHumbleROSDistro();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HUMBLE_ROS_DISTRO__VERSION = eINSTANCE.getHumbleROSDistro_Version();

        /**
         * The meta object literal for the '<em><b>Distro</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HUMBLE_ROS_DISTRO__DISTRO = eINSTANCE.getHumbleROSDistro_Distro();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.NoeticROSDistroImpl <em>Noetic ROS Distro</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.NoeticROSDistroImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getNoeticROSDistro()
         * @generated
         */
        EClass NOETIC_ROS_DISTRO = eINSTANCE.getNoeticROSDistro();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOETIC_ROS_DISTRO__VERSION = eINSTANCE.getNoeticROSDistro_Version();

        /**
         * The meta object literal for the '<em><b>Distro</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOETIC_ROS_DISTRO__DISTRO = eINSTANCE.getNoeticROSDistro_Distro();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.ConfigSoftwareComponentImpl <em>Config Software Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.ConfigSoftwareComponentImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getConfigSoftwareComponent()
         * @generated
         */
        EClass CONFIG_SOFTWARE_COMPONENT = eINSTANCE.getConfigSoftwareComponent();

        /**
         * The meta object literal for the '<em><b>Component</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_SOFTWARE_COMPONENT__COMPONENT = eINSTANCE.getConfigSoftwareComponent_Component();

        /**
         * The meta object literal for the '{@link deploymentPlan.impl.AbstarctConfigSoftwareComponentImpl <em>Abstarct Config Software Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deploymentPlan.impl.AbstarctConfigSoftwareComponentImpl
         * @see deploymentPlan.impl.DeploymentPlanPackageImpl#getAbstarctConfigSoftwareComponent()
         * @generated
         */
        EClass ABSTARCT_CONFIG_SOFTWARE_COMPONENT = eINSTANCE.getAbstarctConfigSoftwareComponent();

        /**
         * The meta object literal for the '<em><b>Execution Configuration</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION = eINSTANCE.getAbstarctConfigSoftwareComponent_ExecutionConfiguration();

        /**
         * The meta object literal for the '<em><b>Start Command</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND = eINSTANCE.getAbstarctConfigSoftwareComponent_StartCommand();

    }

} //DeploymentPlanPackage
