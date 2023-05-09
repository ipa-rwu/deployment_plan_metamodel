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
     * The meta object id for the '{@link deployPlanWithRosModel.impl.RossystemImplementationAssignmentImpl <em>Rossystem Implementation Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployPlanWithRosModel.impl.RossystemImplementationAssignmentImpl
     * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getRossystemImplementationAssignment()
     * @generated
     */
    int ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT = 0;

                /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__NAME = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__NAME;

                /**
     * The feature id for the '<em><b>Executed By</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__EXECUTED_BY = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY;

                /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__VERSION = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__VERSION;

                /**
     * The feature id for the '<em><b>Middleware</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__MIDDLEWARE = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE;

                /**
     * The feature id for the '<em><b>Runtime Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__RUNTIME_TYPE = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE;

                /**
     * The feature id for the '<em><b>Software Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_FEATURE_COUNT + 0;

                /**
     * The number of structural features of the '<em>Rossystem Implementation Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT_FEATURE_COUNT = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_FEATURE_COUNT + 1;

                /**
     * The number of operations of the '<em>Rossystem Implementation Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT_OPERATION_COUNT = DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_OPERATION_COUNT + 0;

                /**
     * The meta object id for the '{@link deployPlanWithRosModel.impl.ConfigRosParameterImpl <em>Config Ros Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployPlanWithRosModel.impl.ConfigRosParameterImpl
     * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getConfigRosParameter()
     * @generated
     */
    int CONFIG_ROS_PARAMETER = 1;

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
    int CONFIG_ROS_SOFTWARE_COMPONENT = 2;

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
     * Returns the meta object for class '{@link deployPlanWithRosModel.RossystemImplementationAssignment <em>Rossystem Implementation Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rossystem Implementation Assignment</em>'.
     * @see deployPlanWithRosModel.RossystemImplementationAssignment
     * @generated
     */
    EClass getRossystemImplementationAssignment();

                /**
     * Returns the meta object for the containment reference list '{@link deployPlanWithRosModel.RossystemImplementationAssignment#getSoftwareComponents <em>Software Components</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Software Components</em>'.
     * @see deployPlanWithRosModel.RossystemImplementationAssignment#getSoftwareComponents()
     * @see #getRossystemImplementationAssignment()
     * @generated
     */
    EReference getRossystemImplementationAssignment_SoftwareComponents();

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
         * The meta object literal for the '{@link deployPlanWithRosModel.impl.RossystemImplementationAssignmentImpl <em>Rossystem Implementation Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see deployPlanWithRosModel.impl.RossystemImplementationAssignmentImpl
         * @see deployPlanWithRosModel.impl.DeployPlanWithRosModelPackageImpl#getRossystemImplementationAssignment()
         * @generated
         */
        EClass ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT = eINSTANCE.getRossystemImplementationAssignment();

                    /**
         * The meta object literal for the '<em><b>Software Components</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS = eINSTANCE.getRossystemImplementationAssignment_SoftwareComponents();

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
