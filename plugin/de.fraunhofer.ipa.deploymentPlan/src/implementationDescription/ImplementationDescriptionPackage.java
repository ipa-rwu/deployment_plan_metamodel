/**
 */
package implementationDescription;

import de.fraunhofer.ipa.deployment.util.UtilPackage;

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
 * @see implementationDescription.ImplementationDescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface ImplementationDescriptionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "implementationDescription";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.ipa.fraunhofer.de/ImplementationDescription";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "ImplementationDescription";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ImplementationDescriptionPackage eINSTANCE = implementationDescription.impl.ImplementationDescriptionPackageImpl.init();

    /**
     * The meta object id for the '{@link implementationDescription.impl.ImplementationDescriptionImpl <em>Implementation Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.ImplementationDescriptionImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getImplementationDescription()
     * @generated
     */
    int IMPLEMENTATION_DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_DESCRIPTION__NAME = UtilPackage.ABSTRACT_IMPLEMENTATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Include Software Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_DESCRIPTION__INCLUDE_SOFTWARE_COMPONENTS = UtilPackage.ABSTRACT_IMPLEMENTATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Implementation Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_DESCRIPTION_FEATURE_COUNT = UtilPackage.ABSTRACT_IMPLEMENTATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Implementation Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTATION_DESCRIPTION_OPERATION_COUNT = UtilPackage.ABSTRACT_IMPLEMENTATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link implementationDescription.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.SoftwareComponentImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getSoftwareComponent()
     * @generated
     */
    int SOFTWARE_COMPONENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_COMPONENT__NAME = UtilPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Repository</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_COMPONENT__REPOSITORY = UtilPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Execution Requirement</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_COMPONENT__EXECUTION_REQUIREMENT = UtilPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Software Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_COMPONENT_FEATURE_COUNT = UtilPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Software Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_COMPONENT_OPERATION_COUNT = UtilPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link implementationDescription.impl.ExecutionRequirementImpl <em>Execution Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.ExecutionRequirementImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getExecutionRequirement()
     * @generated
     */
    int EXECUTION_REQUIREMENT = 7;

    /**
     * The number of structural features of the '<em>Execution Requirement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_REQUIREMENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Execution Requirement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_REQUIREMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link implementationDescription.impl.DeviceRequirementImpl <em>Device Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.DeviceRequirementImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getDeviceRequirement()
     * @generated
     */
    int DEVICE_REQUIREMENT = 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_REQUIREMENT__TYPE = EXECUTION_REQUIREMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_REQUIREMENT__PARAMETER = EXECUTION_REQUIREMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Device Requirement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_REQUIREMENT_FEATURE_COUNT = EXECUTION_REQUIREMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Device Requirement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_REQUIREMENT_OPERATION_COUNT = EXECUTION_REQUIREMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link implementationDescription.impl.SoftwareConfigurationRequirementImpl <em>Software Configuration Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.SoftwareConfigurationRequirementImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getSoftwareConfigurationRequirement()
     * @generated
     */
    int SOFTWARE_CONFIGURATION_REQUIREMENT = 3;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_CONFIGURATION_REQUIREMENT__PARAMETER = EXECUTION_REQUIREMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Software Configuration Requirement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_CONFIGURATION_REQUIREMENT_FEATURE_COUNT = EXECUTION_REQUIREMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Software Configuration Requirement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_CONFIGURATION_REQUIREMENT_OPERATION_COUNT = EXECUTION_REQUIREMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link implementationDescription.impl.ExecutionParameterImpl <em>Execution Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.ExecutionParameterImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getExecutionParameter()
     * @generated
     */
    int EXECUTION_PARAMETER = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PARAMETER__NAME = UtilPackage.PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PARAMETER__DESCRIPTION = UtilPackage.PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PARAMETER__KIND = UtilPackage.PROPERTY__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PARAMETER__VALUE = UtilPackage.PROPERTY__VALUE;

    /**
     * The number of structural features of the '<em>Execution Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PARAMETER_FEATURE_COUNT = UtilPackage.PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Execution Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PARAMETER_OPERATION_COUNT = UtilPackage.PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link implementationDescription.impl.HWSWParemeterImpl <em>HWSW Paremeter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.HWSWParemeterImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getHWSWParemeter()
     * @generated
     */
    int HWSW_PAREMETER = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HWSW_PAREMETER__NAME = EXECUTION_PARAMETER__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HWSW_PAREMETER__DESCRIPTION = EXECUTION_PARAMETER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HWSW_PAREMETER__KIND = EXECUTION_PARAMETER__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HWSW_PAREMETER__VALUE = EXECUTION_PARAMETER__VALUE;

    /**
     * The number of structural features of the '<em>HWSW Paremeter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HWSW_PAREMETER_FEATURE_COUNT = EXECUTION_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>HWSW Paremeter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HWSW_PAREMETER_OPERATION_COUNT = EXECUTION_PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link implementationDescription.impl.SoftwareExecutionParemeterImpl <em>Software Execution Paremeter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.SoftwareExecutionParemeterImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getSoftwareExecutionParemeter()
     * @generated
     */
    int SOFTWARE_EXECUTION_PAREMETER = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_EXECUTION_PAREMETER__NAME = EXECUTION_PARAMETER__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_EXECUTION_PAREMETER__DESCRIPTION = EXECUTION_PARAMETER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_EXECUTION_PAREMETER__KIND = EXECUTION_PARAMETER__KIND;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_EXECUTION_PAREMETER__VALUE = EXECUTION_PARAMETER__VALUE;

    /**
     * The number of structural features of the '<em>Software Execution Paremeter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_EXECUTION_PAREMETER_FEATURE_COUNT = EXECUTION_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Software Execution Paremeter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_EXECUTION_PAREMETER_OPERATION_COUNT = EXECUTION_PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link implementationDescription.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.RepositoryImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getRepository()
     * @generated
     */
    int REPOSITORY = 8;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY__URL = 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY__VERSION = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY__TYPE = 2;

    /**
     * The number of structural features of the '<em>Repository</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Repository</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link implementationDescription.impl.RepositoryTypeImpl <em>Repository Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.RepositoryTypeImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getRepositoryType()
     * @generated
     */
    int REPOSITORY_TYPE = 9;

    /**
     * The number of structural features of the '<em>Repository Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_TYPE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Repository Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link implementationDescription.impl.GitRepositoryTypeImpl <em>Git Repository Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see implementationDescription.impl.GitRepositoryTypeImpl
     * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getGitRepositoryType()
     * @generated
     */
    int GIT_REPOSITORY_TYPE = 10;

    /**
     * The number of structural features of the '<em>Git Repository Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GIT_REPOSITORY_TYPE_FEATURE_COUNT = REPOSITORY_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Git Repository Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GIT_REPOSITORY_TYPE_OPERATION_COUNT = REPOSITORY_TYPE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link implementationDescription.ImplementationDescription <em>Implementation Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implementation Description</em>'.
     * @see implementationDescription.ImplementationDescription
     * @generated
     */
    EClass getImplementationDescription();

    /**
     * Returns the meta object for the attribute '{@link implementationDescription.ImplementationDescription#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see implementationDescription.ImplementationDescription#getName()
     * @see #getImplementationDescription()
     * @generated
     */
    EAttribute getImplementationDescription_Name();

    /**
     * Returns the meta object for the containment reference list '{@link implementationDescription.ImplementationDescription#getIncludeSoftwareComponents <em>Include Software Components</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Include Software Components</em>'.
     * @see implementationDescription.ImplementationDescription#getIncludeSoftwareComponents()
     * @see #getImplementationDescription()
     * @generated
     */
    EReference getImplementationDescription_IncludeSoftwareComponents();

    /**
     * Returns the meta object for class '{@link implementationDescription.SoftwareComponent <em>Software Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Software Component</em>'.
     * @see implementationDescription.SoftwareComponent
     * @generated
     */
    EClass getSoftwareComponent();

    /**
     * Returns the meta object for the attribute '{@link implementationDescription.SoftwareComponent#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see implementationDescription.SoftwareComponent#getName()
     * @see #getSoftwareComponent()
     * @generated
     */
    EAttribute getSoftwareComponent_Name();

    /**
     * Returns the meta object for the containment reference '{@link implementationDescription.SoftwareComponent#getRepository <em>Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Repository</em>'.
     * @see implementationDescription.SoftwareComponent#getRepository()
     * @see #getSoftwareComponent()
     * @generated
     */
    EReference getSoftwareComponent_Repository();

    /**
     * Returns the meta object for the containment reference list '{@link implementationDescription.SoftwareComponent#getExecutionRequirement <em>Execution Requirement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Execution Requirement</em>'.
     * @see implementationDescription.SoftwareComponent#getExecutionRequirement()
     * @see #getSoftwareComponent()
     * @generated
     */
    EReference getSoftwareComponent_ExecutionRequirement();

    /**
     * Returns the meta object for class '{@link implementationDescription.DeviceRequirement <em>Device Requirement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Device Requirement</em>'.
     * @see implementationDescription.DeviceRequirement
     * @generated
     */
    EClass getDeviceRequirement();

    /**
     * Returns the meta object for the attribute '{@link implementationDescription.DeviceRequirement#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see implementationDescription.DeviceRequirement#getType()
     * @see #getDeviceRequirement()
     * @generated
     */
    EAttribute getDeviceRequirement_Type();

    /**
     * Returns the meta object for the containment reference list '{@link implementationDescription.DeviceRequirement#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see implementationDescription.DeviceRequirement#getParameter()
     * @see #getDeviceRequirement()
     * @generated
     */
    EReference getDeviceRequirement_Parameter();

    /**
     * Returns the meta object for class '{@link implementationDescription.SoftwareConfigurationRequirement <em>Software Configuration Requirement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Software Configuration Requirement</em>'.
     * @see implementationDescription.SoftwareConfigurationRequirement
     * @generated
     */
    EClass getSoftwareConfigurationRequirement();

    /**
     * Returns the meta object for the containment reference list '{@link implementationDescription.SoftwareConfigurationRequirement#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see implementationDescription.SoftwareConfigurationRequirement#getParameter()
     * @see #getSoftwareConfigurationRequirement()
     * @generated
     */
    EReference getSoftwareConfigurationRequirement_Parameter();

    /**
     * Returns the meta object for class '{@link implementationDescription.HWSWParemeter <em>HWSW Paremeter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>HWSW Paremeter</em>'.
     * @see implementationDescription.HWSWParemeter
     * @generated
     */
    EClass getHWSWParemeter();

    /**
     * Returns the meta object for class '{@link implementationDescription.SoftwareExecutionParemeter <em>Software Execution Paremeter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Software Execution Paremeter</em>'.
     * @see implementationDescription.SoftwareExecutionParemeter
     * @generated
     */
    EClass getSoftwareExecutionParemeter();

    /**
     * Returns the meta object for class '{@link implementationDescription.ExecutionParameter <em>Execution Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Execution Parameter</em>'.
     * @see implementationDescription.ExecutionParameter
     * @generated
     */
    EClass getExecutionParameter();

    /**
     * Returns the meta object for class '{@link implementationDescription.ExecutionRequirement <em>Execution Requirement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Execution Requirement</em>'.
     * @see implementationDescription.ExecutionRequirement
     * @generated
     */
    EClass getExecutionRequirement();

    /**
     * Returns the meta object for class '{@link implementationDescription.Repository <em>Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Repository</em>'.
     * @see implementationDescription.Repository
     * @generated
     */
    EClass getRepository();

    /**
     * Returns the meta object for the attribute '{@link implementationDescription.Repository#getUrl <em>Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Url</em>'.
     * @see implementationDescription.Repository#getUrl()
     * @see #getRepository()
     * @generated
     */
    EAttribute getRepository_Url();

    /**
     * Returns the meta object for the attribute '{@link implementationDescription.Repository#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see implementationDescription.Repository#getVersion()
     * @see #getRepository()
     * @generated
     */
    EAttribute getRepository_Version();

    /**
     * Returns the meta object for the containment reference '{@link implementationDescription.Repository#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see implementationDescription.Repository#getType()
     * @see #getRepository()
     * @generated
     */
    EReference getRepository_Type();

    /**
     * Returns the meta object for class '{@link implementationDescription.RepositoryType <em>Repository Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Repository Type</em>'.
     * @see implementationDescription.RepositoryType
     * @generated
     */
    EClass getRepositoryType();

    /**
     * Returns the meta object for class '{@link implementationDescription.GitRepositoryType <em>Git Repository Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Git Repository Type</em>'.
     * @see implementationDescription.GitRepositoryType
     * @generated
     */
    EClass getGitRepositoryType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ImplementationDescriptionFactory getImplementationDescriptionFactory();

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
         * The meta object literal for the '{@link implementationDescription.impl.ImplementationDescriptionImpl <em>Implementation Description</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.ImplementationDescriptionImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getImplementationDescription()
         * @generated
         */
        EClass IMPLEMENTATION_DESCRIPTION = eINSTANCE.getImplementationDescription();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPLEMENTATION_DESCRIPTION__NAME = eINSTANCE.getImplementationDescription_Name();

        /**
         * The meta object literal for the '<em><b>Include Software Components</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPLEMENTATION_DESCRIPTION__INCLUDE_SOFTWARE_COMPONENTS = eINSTANCE.getImplementationDescription_IncludeSoftwareComponents();

        /**
         * The meta object literal for the '{@link implementationDescription.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.SoftwareComponentImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getSoftwareComponent()
         * @generated
         */
        EClass SOFTWARE_COMPONENT = eINSTANCE.getSoftwareComponent();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOFTWARE_COMPONENT__NAME = eINSTANCE.getSoftwareComponent_Name();

        /**
         * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOFTWARE_COMPONENT__REPOSITORY = eINSTANCE.getSoftwareComponent_Repository();

        /**
         * The meta object literal for the '<em><b>Execution Requirement</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOFTWARE_COMPONENT__EXECUTION_REQUIREMENT = eINSTANCE.getSoftwareComponent_ExecutionRequirement();

        /**
         * The meta object literal for the '{@link implementationDescription.impl.DeviceRequirementImpl <em>Device Requirement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.DeviceRequirementImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getDeviceRequirement()
         * @generated
         */
        EClass DEVICE_REQUIREMENT = eINSTANCE.getDeviceRequirement();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEVICE_REQUIREMENT__TYPE = eINSTANCE.getDeviceRequirement_Type();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEVICE_REQUIREMENT__PARAMETER = eINSTANCE.getDeviceRequirement_Parameter();

        /**
         * The meta object literal for the '{@link implementationDescription.impl.SoftwareConfigurationRequirementImpl <em>Software Configuration Requirement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.SoftwareConfigurationRequirementImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getSoftwareConfigurationRequirement()
         * @generated
         */
        EClass SOFTWARE_CONFIGURATION_REQUIREMENT = eINSTANCE.getSoftwareConfigurationRequirement();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOFTWARE_CONFIGURATION_REQUIREMENT__PARAMETER = eINSTANCE.getSoftwareConfigurationRequirement_Parameter();

        /**
         * The meta object literal for the '{@link implementationDescription.impl.HWSWParemeterImpl <em>HWSW Paremeter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.HWSWParemeterImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getHWSWParemeter()
         * @generated
         */
        EClass HWSW_PAREMETER = eINSTANCE.getHWSWParemeter();

        /**
         * The meta object literal for the '{@link implementationDescription.impl.SoftwareExecutionParemeterImpl <em>Software Execution Paremeter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.SoftwareExecutionParemeterImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getSoftwareExecutionParemeter()
         * @generated
         */
        EClass SOFTWARE_EXECUTION_PAREMETER = eINSTANCE.getSoftwareExecutionParemeter();

        /**
         * The meta object literal for the '{@link implementationDescription.impl.ExecutionParameterImpl <em>Execution Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.ExecutionParameterImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getExecutionParameter()
         * @generated
         */
        EClass EXECUTION_PARAMETER = eINSTANCE.getExecutionParameter();

        /**
         * The meta object literal for the '{@link implementationDescription.impl.ExecutionRequirementImpl <em>Execution Requirement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.ExecutionRequirementImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getExecutionRequirement()
         * @generated
         */
        EClass EXECUTION_REQUIREMENT = eINSTANCE.getExecutionRequirement();

        /**
         * The meta object literal for the '{@link implementationDescription.impl.RepositoryImpl <em>Repository</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.RepositoryImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getRepository()
         * @generated
         */
        EClass REPOSITORY = eINSTANCE.getRepository();

        /**
         * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REPOSITORY__URL = eINSTANCE.getRepository_Url();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REPOSITORY__VERSION = eINSTANCE.getRepository_Version();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REPOSITORY__TYPE = eINSTANCE.getRepository_Type();

        /**
         * The meta object literal for the '{@link implementationDescription.impl.RepositoryTypeImpl <em>Repository Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.RepositoryTypeImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getRepositoryType()
         * @generated
         */
        EClass REPOSITORY_TYPE = eINSTANCE.getRepositoryType();

        /**
         * The meta object literal for the '{@link implementationDescription.impl.GitRepositoryTypeImpl <em>Git Repository Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see implementationDescription.impl.GitRepositoryTypeImpl
         * @see implementationDescription.impl.ImplementationDescriptionPackageImpl#getGitRepositoryType()
         * @generated
         */
        EClass GIT_REPOSITORY_TYPE = eINSTANCE.getGitRepositoryType();

    }

} //ImplementationDescriptionPackage
