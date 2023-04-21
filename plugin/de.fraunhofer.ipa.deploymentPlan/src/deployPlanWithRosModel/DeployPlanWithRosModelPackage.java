/**
 */
package deployPlanWithRosModel;

import deploymentPlan.DeploymentPlanPackage;

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
 * @see deployPlanWithRosModel.DeployPlanWithRosModelFactory
 * @model kind="package"
 * @generated
 */
public interface DeployPlanWithRosModelPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "deployPlanWithRosModel";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.ipa.fraunhofer.de/DeployPlanWithRosModel";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "DeployPlanWithRosModel";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DeployPlanWithRosModelPackage eINSTANCE = deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl.init();

    /**
     * The meta object id for the '{@link deployPlanWithRosModel.impl.DeploymentPlanWithRosModelImpl <em>Deployment Plan With Ros Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployPlanWithRosModel.impl.DeploymentPlanWithRosModelImpl
     * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getDeploymentPlanWithRosModel()
     * @generated
     */
    int DEPLOYMENT_PLAN_WITH_ROS_MODEL = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_PLAN_WITH_ROS_MODEL__NAME = DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__NAME;

    /**
     * The feature id for the '<em><b>Deploy To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_PLAN_WITH_ROS_MODEL__DEPLOY_TO = DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO;

    /**
     * The feature id for the '<em><b>Realize</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_PLAN_WITH_ROS_MODEL__REALIZE = DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__REALIZE;

    /**
     * The number of structural features of the '<em>Deployment Plan With Ros Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_PLAN_WITH_ROS_MODEL_FEATURE_COUNT = DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Deployment Plan With Ros Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_PLAN_WITH_ROS_MODEL_OPERATION_COUNT = DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deployPlanWithRosModel.impl.RossystemAssignmentImpl <em>Rossystem Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployPlanWithRosModel.impl.RossystemAssignmentImpl
     * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getRossystemAssignment()
     * @generated
     */
    int ROSSYSTEM_ASSIGNMENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_ASSIGNMENT__NAME = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__NAME;

                /**
     * The feature id for the '<em><b>Executed By</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_ASSIGNMENT__EXECUTED_BY = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY;

    /**
     * The feature id for the '<em><b>Software Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_ASSIGNMENT__SOFTWARE_COMPONENTS = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__SOFTWARE_COMPONENTS;

                /**
     * The feature id for the '<em><b>Operting System Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_ASSIGNMENT__OPERTING_SYSTEM_VERSION = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__OPERTING_SYSTEM_VERSION;

                /**
     * The feature id for the '<em><b>Runtime Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_ASSIGNMENT__RUNTIME_TYPE = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE;

                /**
     * The feature id for the '<em><b>Middleware</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_ASSIGNMENT__MIDDLEWARE = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE;

                /**
     * The feature id for the '<em><b>Operting System Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_ASSIGNMENT__OPERTING_SYSTEM_TYPE = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__OPERTING_SYSTEM_TYPE;

                /**
     * The number of structural features of the '<em>Rossystem Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_ASSIGNMENT_FEATURE_COUNT = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Rossystem Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_ASSIGNMENT_OPERATION_COUNT = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deployPlanWithRosModel.impl.RospackageImplementationImpl <em>Rospackage Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployPlanWithRosModel.impl.RospackageImplementationImpl
     * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getRospackageImplementation()
     * @generated
     */
    int ROSPACKAGE_IMPLEMENTATION = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSPACKAGE_IMPLEMENTATION__NAME = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__NAME;

                /**
     * The feature id for the '<em><b>Executed By</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSPACKAGE_IMPLEMENTATION__EXECUTED_BY = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY;

                /**
     * The feature id for the '<em><b>Software Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSPACKAGE_IMPLEMENTATION__SOFTWARE_COMPONENTS = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__SOFTWARE_COMPONENTS;

                /**
     * The feature id for the '<em><b>Operting System Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSPACKAGE_IMPLEMENTATION__OPERTING_SYSTEM_VERSION = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__OPERTING_SYSTEM_VERSION;

                /**
     * The feature id for the '<em><b>Runtime Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSPACKAGE_IMPLEMENTATION__RUNTIME_TYPE = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE;

                /**
     * The feature id for the '<em><b>Middleware</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSPACKAGE_IMPLEMENTATION__MIDDLEWARE = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE;

                /**
     * The feature id for the '<em><b>Operting System Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSPACKAGE_IMPLEMENTATION__OPERTING_SYSTEM_TYPE = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__OPERTING_SYSTEM_TYPE;

    /**
     * The number of structural features of the '<em>Rospackage Implementation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSPACKAGE_IMPLEMENTATION_FEATURE_COUNT = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Rospackage Implementation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSPACKAGE_IMPLEMENTATION_OPERATION_COUNT = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deployPlanWithRosModel.impl.ConfigRosParameterImpl <em>Config Ros Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployPlanWithRosModel.impl.ConfigRosParameterImpl
     * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getConfigRosParameter()
     * @generated
     */
    int CONFIG_ROS_PARAMETER = 3;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_ROS_PARAMETER__FROM = DeploymentPlanPackage.ABSTRACT_CONFIG_EXECUTION_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_ROS_PARAMETER__TO = DeploymentPlanPackage.ABSTRACT_CONFIG_EXECUTION_PARAMETER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_ROS_PARAMETER__VALUE = DeploymentPlanPackage.ABSTRACT_CONFIG_EXECUTION_PARAMETER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Config Ros Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_ROS_PARAMETER_FEATURE_COUNT = DeploymentPlanPackage.ABSTRACT_CONFIG_EXECUTION_PARAMETER_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Config Ros Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_ROS_PARAMETER_OPERATION_COUNT = DeploymentPlanPackage.ABSTRACT_CONFIG_EXECUTION_PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link deployPlanWithRosModel.impl.ConfigRosSoftwareComponentImpl <em>Config Ros Software Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployPlanWithRosModel.impl.ConfigRosSoftwareComponentImpl
     * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getConfigRosSoftwareComponent()
     * @generated
     */
    int CONFIG_ROS_SOFTWARE_COMPONENT = 4;

    /**
     * The feature id for the '<em><b>Execution Configuration</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_ROS_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION = DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION;

    /**
     * The feature id for the '<em><b>Start Command</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_ROS_SOFTWARE_COMPONENT__START_COMMAND = DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT = DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Config Ros Software Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_ROS_SOFTWARE_COMPONENT_FEATURE_COUNT = DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Config Ros Software Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_ROS_SOFTWARE_COMPONENT_OPERATION_COUNT = DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link deployPlanWithRosModel.DeploymentPlanWithRosModel <em>Deployment Plan With Ros Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deployment Plan With Ros Model</em>'.
     * @see deployPlanWithRosModel.DeploymentPlanWithRosModel
     * @generated
     */
    EClass getDeploymentPlanWithRosModel();

    /**
     * Returns the meta object for class '{@link deployPlanWithRosModel.RossystemAssignment <em>Rossystem Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rossystem Assignment</em>'.
     * @see deployPlanWithRosModel.RossystemAssignment
     * @generated
     */
    EClass getRossystemAssignment();

    /**
     * Returns the meta object for class '{@link deployPlanWithRosModel.RospackageImplementation <em>Rospackage Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rospackage Implementation</em>'.
     * @see deployPlanWithRosModel.RospackageImplementation
     * @generated
     */
    EClass getRospackageImplementation();

    /**
     * Returns the meta object for class '{@link deployPlanWithRosModel.ConfigRosParameter <em>Config Ros Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Config Ros Parameter</em>'.
     * @see deployPlanWithRosModel.ConfigRosParameter
     * @generated
     */
    EClass getConfigRosParameter();

    /**
     * Returns the meta object for the reference '{@link deployPlanWithRosModel.ConfigRosParameter#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see deployPlanWithRosModel.ConfigRosParameter#getFrom()
     * @see #getConfigRosParameter()
     * @generated
     */
    EReference getConfigRosParameter_From();

    /**
     * Returns the meta object for the reference '{@link deployPlanWithRosModel.ConfigRosParameter#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>To</em>'.
     * @see deployPlanWithRosModel.ConfigRosParameter#getTo()
     * @see #getConfigRosParameter()
     * @generated
     */
    EReference getConfigRosParameter_To();

    /**
     * Returns the meta object for the containment reference '{@link deployPlanWithRosModel.ConfigRosParameter#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see deployPlanWithRosModel.ConfigRosParameter#getValue()
     * @see #getConfigRosParameter()
     * @generated
     */
    EReference getConfigRosParameter_Value();

    /**
     * Returns the meta object for class '{@link deployPlanWithRosModel.ConfigRosSoftwareComponent <em>Config Ros Software Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Config Ros Software Component</em>'.
     * @see deployPlanWithRosModel.ConfigRosSoftwareComponent
     * @generated
     */
    EClass getConfigRosSoftwareComponent();

    /**
     * Returns the meta object for the reference '{@link deployPlanWithRosModel.ConfigRosSoftwareComponent#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Component</em>'.
     * @see deployPlanWithRosModel.ConfigRosSoftwareComponent#getComponent()
     * @see #getConfigRosSoftwareComponent()
     * @generated
     */
    EReference getConfigRosSoftwareComponent_Component();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DeployPlanWithRosModelFactory getDeployPlanWithRosModelFactory();

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
         * The meta object literal for the '{@link deployPlanWithRosModel.impl.DeploymentPlanWithRosModelImpl <em>Deployment Plan With Ros Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deployPlanWithRosModel.impl.DeploymentPlanWithRosModelImpl
         * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getDeploymentPlanWithRosModel()
         * @generated
         */
        EClass DEPLOYMENT_PLAN_WITH_ROS_MODEL = eINSTANCE.getDeploymentPlanWithRosModel();

        /**
         * The meta object literal for the '{@link deployPlanWithRosModel.impl.RossystemAssignmentImpl <em>Rossystem Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deployPlanWithRosModel.impl.RossystemAssignmentImpl
         * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getRossystemAssignment()
         * @generated
         */
        EClass ROSSYSTEM_ASSIGNMENT = eINSTANCE.getRossystemAssignment();

        /**
         * The meta object literal for the '{@link deployPlanWithRosModel.impl.RospackageImplementationImpl <em>Rospackage Implementation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deployPlanWithRosModel.impl.RospackageImplementationImpl
         * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getRospackageImplementation()
         * @generated
         */
        EClass ROSPACKAGE_IMPLEMENTATION = eINSTANCE.getRospackageImplementation();

        /**
         * The meta object literal for the '{@link deployPlanWithRosModel.impl.ConfigRosParameterImpl <em>Config Ros Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deployPlanWithRosModel.impl.ConfigRosParameterImpl
         * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getConfigRosParameter()
         * @generated
         */
        EClass CONFIG_ROS_PARAMETER = eINSTANCE.getConfigRosParameter();

        /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_ROS_PARAMETER__FROM = eINSTANCE.getConfigRosParameter_From();

        /**
         * The meta object literal for the '<em><b>To</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_ROS_PARAMETER__TO = eINSTANCE.getConfigRosParameter_To();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_ROS_PARAMETER__VALUE = eINSTANCE.getConfigRosParameter_Value();

        /**
         * The meta object literal for the '{@link deployPlanWithRosModel.impl.ConfigRosSoftwareComponentImpl <em>Config Ros Software Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deployPlanWithRosModel.impl.ConfigRosSoftwareComponentImpl
         * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getConfigRosSoftwareComponent()
         * @generated
         */
        EClass CONFIG_ROS_SOFTWARE_COMPONENT = eINSTANCE.getConfigRosSoftwareComponent();

        /**
         * The meta object literal for the '<em><b>Component</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT = eINSTANCE.getConfigRosSoftwareComponent_Component();

    }

} //DeployPlanWithRosModelPackage
