/**
 */
package deployPlanWithRosModel.impl;

import de.fraunhofer.ipa.deployment.util.UtilPackage;

import deployPlanWithRosModel.ConfigRosParameter;
import deployPlanWithRosModel.ConfigRosSoftwareComponent;
import deployPlanWithRosModel.DeployPlanWithRosModelFactory;
import deployPlanWithRosModel.DeployPlanWithRosModelPackage;
import deployPlanWithRosModel.DeployRossystemPlan;
import deployPlanWithRosModel.RossystemImplementationAssignment;
import deploymentPlan.DeploymentPlanPackage;

import device.DevicePackage;

import implementationDescription.ImplementationDescriptionPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import primitives.PrimitivesPackage;

import ros.RosPackage;

import system.RossystemPackage;

import targetEnvironment.TargetEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeployPlanWithRosModelPackageImpl extends EPackageImpl implements DeployPlanWithRosModelPackage {
    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass rossystemImplementationAssignmentEClass = null;

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass configRosParameterEClass = null;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    private EClass configRosSoftwareComponentEClass = null;

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deployRossystemPlanEClass = null;

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
   * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
    private DeployPlanWithRosModelPackageImpl() {
    super(eNS_URI, DeployPlanWithRosModelFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DeployPlanWithRosModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
    public static DeployPlanWithRosModelPackage init() {
    if (isInited) return (DeployPlanWithRosModelPackage)EPackage.Registry.INSTANCE.getEPackage(DeployPlanWithRosModelPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredDeployPlanWithRosModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    DeployPlanWithRosModelPackageImpl theDeployPlanWithRosModelPackage = registeredDeployPlanWithRosModelPackage instanceof DeployPlanWithRosModelPackageImpl ? (DeployPlanWithRosModelPackageImpl)registeredDeployPlanWithRosModelPackage : new DeployPlanWithRosModelPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    DeploymentPlanPackage.eINSTANCE.eClass();
    DevicePackage.eINSTANCE.eClass();
    ImplementationDescriptionPackage.eINSTANCE.eClass();
    RosPackage.eINSTANCE.eClass();
    PrimitivesPackage.eINSTANCE.eClass();
    RossystemPackage.eINSTANCE.eClass();
    TargetEnvironmentPackage.eINSTANCE.eClass();
    UtilPackage.eINSTANCE.eClass();
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDeployPlanWithRosModelPackage.createPackageContents();

    // Initialize created meta-data
    theDeployPlanWithRosModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDeployPlanWithRosModelPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DeployPlanWithRosModelPackage.eNS_URI, theDeployPlanWithRosModelPackage);
    return theDeployPlanWithRosModelPackage;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getRossystemImplementationAssignment() {
    return rossystemImplementationAssignmentEClass;
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getRossystemImplementationAssignment_SoftwareComponents() {
    return (EReference)rossystemImplementationAssignmentEClass.getEStructuralFeatures().get(0);
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getConfigRosParameter() {
    return configRosParameterEClass;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigRosParameter_RefNodeParam() {
    return (EReference)configRosParameterEClass.getEStructuralFeatures().get(0);
  }

                                /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigRosParameter_RefSysParam() {
    return (EReference)configRosParameterEClass.getEStructuralFeatures().get(1);
  }

        /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getConfigRosParameter_To() {
    return (EReference)configRosParameterEClass.getEStructuralFeatures().get(2);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getConfigRosParameter_Value() {
    return (EReference)configRosParameterEClass.getEStructuralFeatures().get(3);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EClass getConfigRosSoftwareComponent() {
    return configRosSoftwareComponentEClass;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EReference getConfigRosSoftwareComponent_Component() {
    return (EReference)configRosSoftwareComponentEClass.getEStructuralFeatures().get(0);
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployRossystemPlan() {
    return deployRossystemPlanEClass;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployRossystemPlan_TargetRossystem() {
    return (EReference)deployRossystemPlanEClass.getEStructuralFeatures().get(0);
  }

        /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public DeployPlanWithRosModelFactory getDeployPlanWithRosModelFactory() {
    return (DeployPlanWithRosModelFactory)getEFactoryInstance();
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
    rossystemImplementationAssignmentEClass = createEClass(ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT);
    createEReference(rossystemImplementationAssignmentEClass, ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS);

    configRosParameterEClass = createEClass(CONFIG_ROS_PARAMETER);
    createEReference(configRosParameterEClass, CONFIG_ROS_PARAMETER__REF_NODE_PARAM);
    createEReference(configRosParameterEClass, CONFIG_ROS_PARAMETER__REF_SYS_PARAM);
    createEReference(configRosParameterEClass, CONFIG_ROS_PARAMETER__TO);
    createEReference(configRosParameterEClass, CONFIG_ROS_PARAMETER__VALUE);

    configRosSoftwareComponentEClass = createEClass(CONFIG_ROS_SOFTWARE_COMPONENT);
    createEReference(configRosSoftwareComponentEClass, CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT);

    deployRossystemPlanEClass = createEClass(DEPLOY_ROSSYSTEM_PLAN);
    createEReference(deployRossystemPlanEClass, DEPLOY_ROSSYSTEM_PLAN__TARGET_ROSSYSTEM);
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
    DeploymentPlanPackage theDeploymentPlanPackage = (DeploymentPlanPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPlanPackage.eNS_URI);
    RossystemPackage theRossystemPackage = (RossystemPackage)EPackage.Registry.INSTANCE.getEPackage(RossystemPackage.eNS_URI);
    RosPackage theRosPackage = (RosPackage)EPackage.Registry.INSTANCE.getEPackage(RosPackage.eNS_URI);
    TargetEnvironmentPackage theTargetEnvironmentPackage = (TargetEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(TargetEnvironmentPackage.eNS_URI);
    UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    rossystemImplementationAssignmentEClass.getESuperTypes().add(theDeploymentPlanPackage.getAbstractComputationAssignment());
    configRosParameterEClass.getESuperTypes().add(theDeploymentPlanPackage.getAbstractConfigExecutionParameter());
    configRosSoftwareComponentEClass.getESuperTypes().add(theDeploymentPlanPackage.getAbstarctConfigSoftwareComponent());
    deployRossystemPlanEClass.getESuperTypes().add(theDeploymentPlanPackage.getAbstractDeploymentPlan());

    // Initialize classes, features, and operations; add parameters
    initEClass(rossystemImplementationAssignmentEClass, RossystemImplementationAssignment.class, "RossystemImplementationAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRossystemImplementationAssignment_SoftwareComponents(), this.getConfigRosSoftwareComponent(), null, "softwareComponents", null, 1, -1, RossystemImplementationAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configRosParameterEClass, ConfigRosParameter.class, "ConfigRosParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigRosParameter_RefNodeParam(), theRossystemPackage.getRosParameter(), null, "refNodeParam", null, 0, 1, ConfigRosParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigRosParameter_RefSysParam(), theRosPackage.getParameter(), null, "refSysParam", null, 0, 1, ConfigRosParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigRosParameter_To(), theTargetEnvironmentPackage.getAbstractConfigProperty(), null, "to", null, 0, 1, ConfigRosParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfigRosParameter_Value(), theUtilPackage.getPropertyValue(), null, "value", null, 0, 1, ConfigRosParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configRosSoftwareComponentEClass, ConfigRosSoftwareComponent.class, "ConfigRosSoftwareComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigRosSoftwareComponent_Component(), theRossystemPackage.getComponent(), null, "component", null, 1, 1, ConfigRosSoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deployRossystemPlanEClass, DeployRossystemPlan.class, "DeployRossystemPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeployRossystemPlan_TargetRossystem(), theRossystemPackage.getSystem(), null, "targetRossystem", null, 0, 1, DeployRossystemPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DeployPlanWithRosModelPackageImpl
