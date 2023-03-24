/**
 */
package deploymentPlan.impl;

import de.fraunhofer.ipa.deployment.util.UtilPackage;

import deploymentPlan.AbstarctConfigSoftwareComponent;
import deploymentPlan.AbstractComputationAssignment;
import deploymentPlan.AbstractConfigExecutionParameter;
import deploymentPlan.AbstractDeploymentPlan;
import deploymentPlan.AbstractExecutionConfiguration;
import deploymentPlan.AbstractRealization;
import deploymentPlan.ConfigExecutionParameter;
import deploymentPlan.ConfigSoftwareComponent;
import deploymentPlan.DeploymentPlan;
import deploymentPlan.DeploymentPlanFactory;
import deploymentPlan.DeploymentPlanPackage;
import deploymentPlan.HumbleROSDistro;
import deploymentPlan.ImplementationAssignment;
import deploymentPlan.Middleware;
import deploymentPlan.NoeticROSDistro;
import deploymentPlan.Plan;
import deploymentPlan.ROSDistro;
import deploymentPlan.Realization;

import device.DevicePackage;

import implementationDescription.ImplementationDescriptionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
    private EClass abstractDeploymentPlanEClass = null;

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
    private EClass abstractRealizationEClass = null;

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
    private EClass abstractComputationAssignmentEClass = null;

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
    private EClass abstractConfigExecutionParameterEClass = null;

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
    private EClass abstractExecutionConfigurationEClass = null;

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
    private EClass rosDistroEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass humbleROSDistroEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass noeticROSDistroEClass = null;

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
    private EClass abstarctConfigSoftwareComponentEClass = null;

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
    public EClass getDeploymentPlan() {
        return deploymentPlanEClass;
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
    public EReference getAbstractRealization_Realization() {
        return (EReference)abstractRealizationEClass.getEStructuralFeatures().get(0);
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
    public EClass getAbstractComputationAssignment() {
        return abstractComputationAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractComputationAssignment_ExecutedBy() {
        return (EReference)abstractComputationAssignmentEClass.getEStructuralFeatures().get(0);
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
    public EReference getImplementationAssignment_SoftwareComponent() {
        return (EReference)implementationAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getImplementationAssignment_Middleware() {
        return (EReference)implementationAssignmentEClass.getEStructuralFeatures().get(1);
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
    public EClass getAbstractExecutionConfiguration() {
        return abstractExecutionConfigurationEClass;
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
    public EClass getROSDistro() {
        return rosDistroEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHumbleROSDistro() {
        return humbleROSDistroEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHumbleROSDistro_Version() {
        return (EAttribute)humbleROSDistroEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHumbleROSDistro_Distro() {
        return (EAttribute)humbleROSDistroEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNoeticROSDistro() {
        return noeticROSDistroEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNoeticROSDistro_Version() {
        return (EAttribute)noeticROSDistroEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNoeticROSDistro_Distro() {
        return (EAttribute)noeticROSDistroEClass.getEStructuralFeatures().get(1);
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

        abstractDeploymentPlanEClass = createEClass(ABSTRACT_DEPLOYMENT_PLAN);
        createEAttribute(abstractDeploymentPlanEClass, ABSTRACT_DEPLOYMENT_PLAN__NAME);
        createEReference(abstractDeploymentPlanEClass, ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO);
        createEReference(abstractDeploymentPlanEClass, ABSTRACT_DEPLOYMENT_PLAN__REALIZE);

        deploymentPlanEClass = createEClass(DEPLOYMENT_PLAN);

        abstractRealizationEClass = createEClass(ABSTRACT_REALIZATION);
        createEReference(abstractRealizationEClass, ABSTRACT_REALIZATION__REALIZATION);

        realizationEClass = createEClass(REALIZATION);

        abstractComputationAssignmentEClass = createEClass(ABSTRACT_COMPUTATION_ASSIGNMENT);
        createEReference(abstractComputationAssignmentEClass, ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY);

        implementationAssignmentEClass = createEClass(IMPLEMENTATION_ASSIGNMENT);
        createEReference(implementationAssignmentEClass, IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENT);
        createEReference(implementationAssignmentEClass, IMPLEMENTATION_ASSIGNMENT__MIDDLEWARE);

        abstractConfigExecutionParameterEClass = createEClass(ABSTRACT_CONFIG_EXECUTION_PARAMETER);

        configExecutionParameterEClass = createEClass(CONFIG_EXECUTION_PARAMETER);
        createEReference(configExecutionParameterEClass, CONFIG_EXECUTION_PARAMETER__FROM);
        createEReference(configExecutionParameterEClass, CONFIG_EXECUTION_PARAMETER__TO);
        createEReference(configExecutionParameterEClass, CONFIG_EXECUTION_PARAMETER__VALUE);

        abstractExecutionConfigurationEClass = createEClass(ABSTRACT_EXECUTION_CONFIGURATION);

        middlewareEClass = createEClass(MIDDLEWARE);

        rosDistroEClass = createEClass(ROS_DISTRO);

        humbleROSDistroEClass = createEClass(HUMBLE_ROS_DISTRO);
        createEAttribute(humbleROSDistroEClass, HUMBLE_ROS_DISTRO__VERSION);
        createEAttribute(humbleROSDistroEClass, HUMBLE_ROS_DISTRO__DISTRO);

        noeticROSDistroEClass = createEClass(NOETIC_ROS_DISTRO);
        createEAttribute(noeticROSDistroEClass, NOETIC_ROS_DISTRO__VERSION);
        createEAttribute(noeticROSDistroEClass, NOETIC_ROS_DISTRO__DISTRO);

        configSoftwareComponentEClass = createEClass(CONFIG_SOFTWARE_COMPONENT);
        createEReference(configSoftwareComponentEClass, CONFIG_SOFTWARE_COMPONENT__COMPONENT);

        abstarctConfigSoftwareComponentEClass = createEClass(ABSTARCT_CONFIG_SOFTWARE_COMPONENT);
        createEReference(abstarctConfigSoftwareComponentEClass, ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION);
        createEAttribute(abstarctConfigSoftwareComponentEClass, ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND);
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
        TargetEnvironmentPackage theTargetEnvironmentPackage = (TargetEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(TargetEnvironmentPackage.eNS_URI);
        ImplementationDescriptionPackage theImplementationDescriptionPackage = (ImplementationDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(ImplementationDescriptionPackage.eNS_URI);
        UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        deploymentPlanEClass.getESuperTypes().add(this.getAbstractDeploymentPlan());
        realizationEClass.getESuperTypes().add(this.getAbstractRealization());
        implementationAssignmentEClass.getESuperTypes().add(this.getAbstractComputationAssignment());
        configExecutionParameterEClass.getESuperTypes().add(this.getAbstractConfigExecutionParameter());
        rosDistroEClass.getESuperTypes().add(this.getMiddleware());
        humbleROSDistroEClass.getESuperTypes().add(this.getROSDistro());
        noeticROSDistroEClass.getESuperTypes().add(this.getROSDistro());
        configSoftwareComponentEClass.getESuperTypes().add(this.getAbstarctConfigSoftwareComponent());

        // Initialize classes, features, and operations; add parameters
        initEClass(planEClass, Plan.class, "Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPlan_Plan(), this.getAbstractDeploymentPlan(), null, "plan", null, 1, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractDeploymentPlanEClass, AbstractDeploymentPlan.class, "AbstractDeploymentPlan", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractDeploymentPlan_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractDeploymentPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractDeploymentPlan_DeployTo(), theTargetEnvironmentPackage.getTargetDeployEnviroment(), null, "deployTo", null, 1, 1, AbstractDeploymentPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractDeploymentPlan_Realize(), this.getAbstractRealization(), null, "realize", null, 1, 1, AbstractDeploymentPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(deploymentPlanEClass, DeploymentPlan.class, "DeploymentPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractRealizationEClass, AbstractRealization.class, "AbstractRealization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractRealization_Realization(), this.getAbstractComputationAssignment(), null, "realization", null, 0, -1, AbstractRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractComputationAssignmentEClass, AbstractComputationAssignment.class, "AbstractComputationAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractComputationAssignment_ExecutedBy(), theTargetEnvironmentPackage.getComputationDeviceInstance(), null, "executedBy", null, 1, 1, AbstractComputationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(implementationAssignmentEClass, ImplementationAssignment.class, "ImplementationAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getImplementationAssignment_SoftwareComponent(), this.getConfigSoftwareComponent(), null, "softwareComponent", null, 1, -1, ImplementationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getImplementationAssignment_Middleware(), this.getMiddleware(), null, "middleware", null, 0, -1, ImplementationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractConfigExecutionParameterEClass, AbstractConfigExecutionParameter.class, "AbstractConfigExecutionParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(configExecutionParameterEClass, ConfigExecutionParameter.class, "ConfigExecutionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConfigExecutionParameter_From(), theImplementationDescriptionPackage.getExecutionProperty(), null, "from", null, 1, 1, ConfigExecutionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConfigExecutionParameter_To(), theTargetEnvironmentPackage.getAbstractConfigProperty(), null, "to", null, 0, 1, ConfigExecutionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConfigExecutionParameter_Value(), theUtilPackage.getPropertyValue(), null, "value", null, 0, 1, ConfigExecutionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractExecutionConfigurationEClass, AbstractExecutionConfiguration.class, "AbstractExecutionConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(middlewareEClass, Middleware.class, "Middleware", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rosDistroEClass, ROSDistro.class, "ROSDistro", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(humbleROSDistroEClass, HumbleROSDistro.class, "HumbleROSDistro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHumbleROSDistro_Version(), ecorePackage.getEString(), "version", "2", 1, 1, HumbleROSDistro.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHumbleROSDistro_Distro(), ecorePackage.getEString(), "distro", "humble", 1, 1, HumbleROSDistro.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(noeticROSDistroEClass, NoeticROSDistro.class, "NoeticROSDistro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNoeticROSDistro_Version(), ecorePackage.getEString(), "version", "1", 1, 1, NoeticROSDistro.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNoeticROSDistro_Distro(), ecorePackage.getEString(), "distro", "noetic", 1, 1, NoeticROSDistro.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(configSoftwareComponentEClass, ConfigSoftwareComponent.class, "ConfigSoftwareComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConfigSoftwareComponent_Component(), theUtilPackage.getAbstractComputationAssignmentTarget(), null, "component", null, 1, 1, ConfigSoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstarctConfigSoftwareComponentEClass, AbstarctConfigSoftwareComponent.class, "AbstarctConfigSoftwareComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstarctConfigSoftwareComponent_ExecutionConfiguration(), this.getAbstractConfigExecutionParameter(), null, "executionConfiguration", null, 0, -1, AbstarctConfigSoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstarctConfigSoftwareComponent_StartCommand(), ecorePackage.getEString(), "startCommand", null, 0, -1, AbstarctConfigSoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //DeploymentPlanPackageImpl
