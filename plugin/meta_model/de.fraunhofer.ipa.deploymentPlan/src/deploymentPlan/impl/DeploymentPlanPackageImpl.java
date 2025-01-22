/**
 */
package deploymentPlan.impl;

import de.fraunhofer.ipa.deployment.util.UtilPackage;

import deploymentPlan.AbstarctConfigSoftwareComponent;
import deploymentPlan.AbstractComputationAssignment;
import deploymentPlan.AbstractConfigExecutionParameter;
import deploymentPlan.AbstractDeploymentPlan;
import deploymentPlan.AbstractRealization;
import deploymentPlan.AbstractRuntime;
import deploymentPlan.ConfigExecutionParameter;
import deploymentPlan.ConfigSoftwareComponent;
import deploymentPlan.ContainerRuntime;
import deploymentPlan.DeploymentPlan;
import deploymentPlan.DeploymentPlanFactory;
import deploymentPlan.DeploymentPlanPackage;
import deploymentPlan.ImplementationAssignment;
import deploymentPlan.Middleware;
import deploymentPlan.Plan;
import deploymentPlan.ROSDistro;
import deploymentPlan.Realization;
import deploymentPlan.RosMiddleware;

import device.DevicePackage;

import implementationDescription.ImplementationDescriptionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import targetEnvironment.TargetEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentPlanPackageImpl extends EPackageImpl implements DeploymentPlanPackage {
    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass planEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass deploymentPlanEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass realizationEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass implementationAssignmentEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass configExecutionParameterEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass middlewareEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass configSoftwareComponentEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass abstractRealizationEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass abstractConfigExecutionParameterEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass abstractComputationAssignmentEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass abstractDeploymentPlanEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass abstarctConfigSoftwareComponentEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass rosMiddlewareEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass abstractRuntimeEClass = null;

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass containerRuntimeEClass = null;

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EEnum rosDistroEEnum = null;

    /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see deploymentPlan.DeploymentPlanPackage#eNS_URI
   * @see #init()
   * @generated
   */
    private DeploymentPlanPackageImpl() {
    super(eNS_URI, DeploymentPlanFactory.eINSTANCE);
  }
    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private static boolean isInited = false;

    /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link DeploymentPlanPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
    public static DeploymentPlanPackage init() {
    if (isInited) return (DeploymentPlanPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPlanPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredDeploymentPlanPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    DeploymentPlanPackageImpl theDeploymentPlanPackage = registeredDeploymentPlanPackage instanceof DeploymentPlanPackageImpl ? (DeploymentPlanPackageImpl)registeredDeploymentPlanPackage : new DeploymentPlanPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    DevicePackage.eINSTANCE.eClass();
    ImplementationDescriptionPackage.eINSTANCE.eClass();
    TargetEnvironmentPackage.eINSTANCE.eClass();
    UtilPackage.eINSTANCE.eClass();
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDeploymentPlanPackage.createPackageContents();

    // Initialize created meta-data
    theDeploymentPlanPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDeploymentPlanPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DeploymentPlanPackage.eNS_URI, theDeploymentPlanPackage);
    return theDeploymentPlanPackage;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getPlan() {
    return planEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getPlan_Plan() {
    return (EReference)planEClass.getEStructuralFeatures().get(0);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getDeploymentPlan() {
    return deploymentPlanEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getRealization() {
    return realizationEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getImplementationAssignment() {
    return implementationAssignmentEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getImplementationAssignment_SoftwareComponents() {
    return (EReference)implementationAssignmentEClass.getEStructuralFeatures().get(0);
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getConfigExecutionParameter() {
    return configExecutionParameterEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getConfigExecutionParameter_From() {
    return (EReference)configExecutionParameterEClass.getEStructuralFeatures().get(0);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getConfigExecutionParameter_To() {
    return (EReference)configExecutionParameterEClass.getEStructuralFeatures().get(1);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getConfigExecutionParameter_Value() {
    return (EReference)configExecutionParameterEClass.getEStructuralFeatures().get(2);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getMiddleware() {
    return middlewareEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getConfigSoftwareComponent() {
    return configSoftwareComponentEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getConfigSoftwareComponent_Component() {
    return (EReference)configSoftwareComponentEClass.getEStructuralFeatures().get(0);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getAbstractRealization() {
    return abstractRealizationEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getAbstractRealization_Realizations() {
    return (EReference)abstractRealizationEClass.getEStructuralFeatures().get(0);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getAbstractConfigExecutionParameter() {
    return abstractConfigExecutionParameterEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getAbstractComputationAssignment() {
    return abstractComputationAssignmentEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EAttribute getAbstractComputationAssignment_Name() {
    return (EAttribute)abstractComputationAssignmentEClass.getEStructuralFeatures().get(0);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getAbstractComputationAssignment_ExecutedBy() {
    return (EReference)abstractComputationAssignmentEClass.getEStructuralFeatures().get(1);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EAttribute getAbstractComputationAssignment_Version() {
    return (EAttribute)abstractComputationAssignmentEClass.getEStructuralFeatures().get(2);
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getAbstractComputationAssignment_RuntimeType() {
    return (EReference)abstractComputationAssignmentEClass.getEStructuralFeatures().get(4);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getAbstractComputationAssignment_Middleware() {
    return (EReference)abstractComputationAssignmentEClass.getEStructuralFeatures().get(3);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getAbstractDeploymentPlan() {
    return abstractDeploymentPlanEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EAttribute getAbstractDeploymentPlan_Name() {
    return (EAttribute)abstractDeploymentPlanEClass.getEStructuralFeatures().get(0);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getAbstractDeploymentPlan_DeployTo() {
    return (EReference)abstractDeploymentPlanEClass.getEStructuralFeatures().get(1);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getAbstractDeploymentPlan_Realize() {
    return (EReference)abstractDeploymentPlanEClass.getEStructuralFeatures().get(2);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getAbstarctConfigSoftwareComponent() {
    return abstarctConfigSoftwareComponentEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getAbstarctConfigSoftwareComponent_ExecutionConfiguration() {
    return (EReference)abstarctConfigSoftwareComponentEClass.getEStructuralFeatures().get(0);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EAttribute getAbstarctConfigSoftwareComponent_StartCommand() {
    return (EAttribute)abstarctConfigSoftwareComponentEClass.getEStructuralFeatures().get(1);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getRosMiddleware() {
    return rosMiddlewareEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EAttribute getRosMiddleware_Value() {
    return (EAttribute)rosMiddlewareEClass.getEStructuralFeatures().get(0);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getAbstractRuntime() {
    return abstractRuntimeEClass;
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EAttribute getAbstractRuntime_Type() {
    return (EAttribute)abstractRuntimeEClass.getEStructuralFeatures().get(0);
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getContainerRuntime() {
    return containerRuntimeEClass;
  }

                /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerRuntime_Registry() {
    return (EAttribute)containerRuntimeEClass.getEStructuralFeatures().get(0);
  }

                                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getContainerRuntime_OpertingSystemResource() {
    return (EReference)containerRuntimeEClass.getEStructuralFeatures().get(1);
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EEnum getROSDistro() {
    return rosDistroEEnum;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public DeploymentPlanFactory getDeploymentPlanFactory() {
    return (DeploymentPlanFactory)getEFactoryInstance();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private boolean isCreated = false;

    /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    planEClass = createEClass(PLAN);
    createEReference(planEClass, PLAN__PLAN);

    deploymentPlanEClass = createEClass(DEPLOYMENT_PLAN);

    realizationEClass = createEClass(REALIZATION);

    implementationAssignmentEClass = createEClass(IMPLEMENTATION_ASSIGNMENT);
    createEReference(implementationAssignmentEClass, IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS);

    configExecutionParameterEClass = createEClass(CONFIG_EXECUTION_PARAMETER);
    createEReference(configExecutionParameterEClass, CONFIG_EXECUTION_PARAMETER__FROM);
    createEReference(configExecutionParameterEClass, CONFIG_EXECUTION_PARAMETER__TO);
    createEReference(configExecutionParameterEClass, CONFIG_EXECUTION_PARAMETER__VALUE);

    middlewareEClass = createEClass(MIDDLEWARE);

    configSoftwareComponentEClass = createEClass(CONFIG_SOFTWARE_COMPONENT);
    createEReference(configSoftwareComponentEClass, CONFIG_SOFTWARE_COMPONENT__COMPONENT);

    abstractRealizationEClass = createEClass(ABSTRACT_REALIZATION);
    createEReference(abstractRealizationEClass, ABSTRACT_REALIZATION__REALIZATIONS);

    abstractConfigExecutionParameterEClass = createEClass(ABSTRACT_CONFIG_EXECUTION_PARAMETER);

    abstractComputationAssignmentEClass = createEClass(ABSTRACT_COMPUTATION_ASSIGNMENT);
    createEAttribute(abstractComputationAssignmentEClass, ABSTRACT_COMPUTATION_ASSIGNMENT__NAME);
    createEReference(abstractComputationAssignmentEClass, ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY);
    createEAttribute(abstractComputationAssignmentEClass, ABSTRACT_COMPUTATION_ASSIGNMENT__VERSION);
    createEReference(abstractComputationAssignmentEClass, ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE);
    createEReference(abstractComputationAssignmentEClass, ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE);

    abstractDeploymentPlanEClass = createEClass(ABSTRACT_DEPLOYMENT_PLAN);
    createEAttribute(abstractDeploymentPlanEClass, ABSTRACT_DEPLOYMENT_PLAN__NAME);
    createEReference(abstractDeploymentPlanEClass, ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO);
    createEReference(abstractDeploymentPlanEClass, ABSTRACT_DEPLOYMENT_PLAN__REALIZE);

    abstarctConfigSoftwareComponentEClass = createEClass(ABSTARCT_CONFIG_SOFTWARE_COMPONENT);
    createEReference(abstarctConfigSoftwareComponentEClass, ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION);
    createEAttribute(abstarctConfigSoftwareComponentEClass, ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND);

    rosMiddlewareEClass = createEClass(ROS_MIDDLEWARE);
    createEAttribute(rosMiddlewareEClass, ROS_MIDDLEWARE__VALUE);

    abstractRuntimeEClass = createEClass(ABSTRACT_RUNTIME);
    createEAttribute(abstractRuntimeEClass, ABSTRACT_RUNTIME__TYPE);

    containerRuntimeEClass = createEClass(CONTAINER_RUNTIME);
    createEAttribute(containerRuntimeEClass, CONTAINER_RUNTIME__REGISTRY);
    createEReference(containerRuntimeEClass, CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE);

    // Create enums
    rosDistroEEnum = createEEnum(ROS_DISTRO);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private boolean isInitialized = false;

    /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    ImplementationDescriptionPackage theImplementationDescriptionPackage = (ImplementationDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(ImplementationDescriptionPackage.eNS_URI);
    TargetEnvironmentPackage theTargetEnvironmentPackage = (TargetEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(TargetEnvironmentPackage.eNS_URI);
    UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    deploymentPlanEClass.getESuperTypes().add(this.getAbstractDeploymentPlan());
    realizationEClass.getESuperTypes().add(this.getAbstractRealization());
    implementationAssignmentEClass.getESuperTypes().add(this.getAbstractComputationAssignment());
    configExecutionParameterEClass.getESuperTypes().add(this.getAbstractConfigExecutionParameter());
    configSoftwareComponentEClass.getESuperTypes().add(this.getAbstarctConfigSoftwareComponent());
    rosMiddlewareEClass.getESuperTypes().add(this.getMiddleware());
    containerRuntimeEClass.getESuperTypes().add(this.getAbstractRuntime());

    // Initialize classes, features, and operations; add parameters
    initEClass(planEClass, Plan.class, "Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlan_Plan(), this.getAbstractDeploymentPlan(), null, "plan", null, 1, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentPlanEClass, DeploymentPlan.class, "DeploymentPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(implementationAssignmentEClass, ImplementationAssignment.class, "ImplementationAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplementationAssignment_SoftwareComponents(), this.getConfigSoftwareComponent(), null, "softwareComponents", null, 1, -1, ImplementationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configExecutionParameterEClass, ConfigExecutionParameter.class, "ConfigExecutionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigExecutionParameter_From(), theImplementationDescriptionPackage.getExecutionParameter(), null, "from", null, 1, 1, ConfigExecutionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigExecutionParameter_To(), theTargetEnvironmentPackage.getAbstractConfigProperty(), null, "to", null, 0, 1, ConfigExecutionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigExecutionParameter_Value(), theUtilPackage.getPropertyValue(), null, "value", null, 0, 1, ConfigExecutionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(middlewareEClass, Middleware.class, "Middleware", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(configSoftwareComponentEClass, ConfigSoftwareComponent.class, "ConfigSoftwareComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigSoftwareComponent_Component(), theUtilPackage.getAbstractComputationAssignmentTarget(), null, "component", null, 1, 1, ConfigSoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractRealizationEClass, AbstractRealization.class, "AbstractRealization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractRealization_Realizations(), this.getAbstractComputationAssignment(), null, "realizations", null, 0, -1, AbstractRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractConfigExecutionParameterEClass, AbstractConfigExecutionParameter.class, "AbstractConfigExecutionParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractComputationAssignmentEClass, AbstractComputationAssignment.class, "AbstractComputationAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractComputationAssignment_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractComputationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractComputationAssignment_ExecutedBy(), theTargetEnvironmentPackage.getComputationDeviceInstance(), null, "executedBy", null, 1, 1, AbstractComputationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractComputationAssignment_Version(), ecorePackage.getEString(), "version", null, 0, 1, AbstractComputationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractComputationAssignment_Middleware(), this.getMiddleware(), null, "middleware", null, 0, 1, AbstractComputationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractComputationAssignment_RuntimeType(), this.getAbstractRuntime(), null, "runtimeType", null, 0, 1, AbstractComputationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDeploymentPlanEClass, AbstractDeploymentPlan.class, "AbstractDeploymentPlan", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractDeploymentPlan_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractDeploymentPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractDeploymentPlan_DeployTo(), theTargetEnvironmentPackage.getTargetDeployEnviroment(), null, "deployTo", null, 1, 1, AbstractDeploymentPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractDeploymentPlan_Realize(), this.getAbstractRealization(), null, "realize", null, 1, 1, AbstractDeploymentPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstarctConfigSoftwareComponentEClass, AbstarctConfigSoftwareComponent.class, "AbstarctConfigSoftwareComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstarctConfigSoftwareComponent_ExecutionConfiguration(), this.getAbstractConfigExecutionParameter(), null, "executionConfiguration", null, 0, -1, AbstarctConfigSoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstarctConfigSoftwareComponent_StartCommand(), ecorePackage.getEString(), "startCommand", null, 0, -1, AbstarctConfigSoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rosMiddlewareEClass, RosMiddleware.class, "RosMiddleware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRosMiddleware_Value(), this.getROSDistro(), "value", null, 1, 1, RosMiddleware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractRuntimeEClass, AbstractRuntime.class, "AbstractRuntime", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractRuntime_Type(), theUtilPackage.getRunTimeType(), "type", null, 1, 1, AbstractRuntime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerRuntimeEClass, ContainerRuntime.class, "ContainerRuntime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContainerRuntime_Registry(), ecorePackage.getEString(), "registry", null, 0, 1, ContainerRuntime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerRuntime_OpertingSystemResource(), theUtilPackage.getOperatingSystemResouce(), null, "opertingSystemResource", null, 0, 2, ContainerRuntime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(rosDistroEEnum, ROSDistro.class, "ROSDistro");
    addEEnumLiteral(rosDistroEEnum, ROSDistro.HUMBLE);
    addEEnumLiteral(rosDistroEEnum, ROSDistro.NOETIC);
    addEEnumLiteral(rosDistroEEnum, ROSDistro.ROLLING);
    addEEnumLiteral(rosDistroEEnum, ROSDistro.GALACTIC);

    // Create resource
    createResource(eNS_URI);
  }

} //DeploymentPlanPackageImpl
