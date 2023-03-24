/**
 */
package implementationDescription.impl;

import de.fraunhofer.ipa.deployment.util.UtilPackage;

import implementationDescription.DeviceRequirement;
import implementationDescription.ExecutionProperty;
import implementationDescription.ExecutionRequirement;
import implementationDescription.HWSWParemeter;
import implementationDescription.ImplementationDescription;
import implementationDescription.ImplementationDescriptionFactory;
import implementationDescription.ImplementationDescriptionPackage;
import implementationDescription.SoftwareComponent;
import implementationDescription.SoftwareConfigurationRequirement;
import implementationDescription.SoftwareExecutionParemeter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationDescriptionPackageImpl extends EPackageImpl implements ImplementationDescriptionPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass executionRequirementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass implementationDescriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass softwareComponentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deviceRequirementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass softwareConfigurationRequirementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hwswParemeterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass softwareExecutionParemeterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass executionPropertyEClass = null;

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
     * @see implementationDescription.ImplementationDescriptionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ImplementationDescriptionPackageImpl() {
        super(eNS_URI, ImplementationDescriptionFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ImplementationDescriptionPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ImplementationDescriptionPackage init() {
        if (isInited) return (ImplementationDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(ImplementationDescriptionPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredImplementationDescriptionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ImplementationDescriptionPackageImpl theImplementationDescriptionPackage = registeredImplementationDescriptionPackage instanceof ImplementationDescriptionPackageImpl ? (ImplementationDescriptionPackageImpl)registeredImplementationDescriptionPackage : new ImplementationDescriptionPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        UtilPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theImplementationDescriptionPackage.createPackageContents();

        // Initialize created meta-data
        theImplementationDescriptionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theImplementationDescriptionPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ImplementationDescriptionPackage.eNS_URI, theImplementationDescriptionPackage);
        return theImplementationDescriptionPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExecutionRequirement() {
        return executionRequirementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImplementationDescription() {
        return implementationDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImplementationDescription_Name() {
        return (EAttribute)implementationDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImplementationDescription_SoftwareDependency() {
        return (EAttribute)implementationDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getImplementationDescription_IncludeSoftwareComponent() {
        return (EReference)implementationDescriptionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSoftwareComponent() {
        return softwareComponentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSoftwareComponent_Name() {
        return (EAttribute)softwareComponentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSoftwareComponent_Path() {
        return (EAttribute)softwareComponentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSoftwareComponent_ExecutionRequirement() {
        return (EReference)softwareComponentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDeviceRequirement() {
        return deviceRequirementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDeviceRequirement_Type() {
        return (EAttribute)deviceRequirementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDeviceRequirement_Parameter() {
        return (EReference)deviceRequirementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSoftwareConfigurationRequirement() {
        return softwareConfigurationRequirementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSoftwareConfigurationRequirement_Parameter() {
        return (EReference)softwareConfigurationRequirementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHWSWParemeter() {
        return hwswParemeterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSoftwareExecutionParemeter() {
        return softwareExecutionParemeterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExecutionProperty() {
        return executionPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplementationDescriptionFactory getImplementationDescriptionFactory() {
        return (ImplementationDescriptionFactory)getEFactoryInstance();
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
        executionRequirementEClass = createEClass(EXECUTION_REQUIREMENT);

        implementationDescriptionEClass = createEClass(IMPLEMENTATION_DESCRIPTION);
        createEAttribute(implementationDescriptionEClass, IMPLEMENTATION_DESCRIPTION__NAME);
        createEAttribute(implementationDescriptionEClass, IMPLEMENTATION_DESCRIPTION__SOFTWARE_DEPENDENCY);
        createEReference(implementationDescriptionEClass, IMPLEMENTATION_DESCRIPTION__INCLUDE_SOFTWARE_COMPONENT);

        softwareComponentEClass = createEClass(SOFTWARE_COMPONENT);
        createEAttribute(softwareComponentEClass, SOFTWARE_COMPONENT__NAME);
        createEAttribute(softwareComponentEClass, SOFTWARE_COMPONENT__PATH);
        createEReference(softwareComponentEClass, SOFTWARE_COMPONENT__EXECUTION_REQUIREMENT);

        deviceRequirementEClass = createEClass(DEVICE_REQUIREMENT);
        createEAttribute(deviceRequirementEClass, DEVICE_REQUIREMENT__TYPE);
        createEReference(deviceRequirementEClass, DEVICE_REQUIREMENT__PARAMETER);

        softwareConfigurationRequirementEClass = createEClass(SOFTWARE_CONFIGURATION_REQUIREMENT);
        createEReference(softwareConfigurationRequirementEClass, SOFTWARE_CONFIGURATION_REQUIREMENT__PARAMETER);

        hwswParemeterEClass = createEClass(HWSW_PAREMETER);

        softwareExecutionParemeterEClass = createEClass(SOFTWARE_EXECUTION_PAREMETER);

        executionPropertyEClass = createEClass(EXECUTION_PROPERTY);
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
        UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        implementationDescriptionEClass.getESuperTypes().add(theUtilPackage.getAbstractImplementation());
        implementationDescriptionEClass.getESuperTypes().add(theUtilPackage.getAbstractComputationAssignmentTarget());
        softwareComponentEClass.getESuperTypes().add(theUtilPackage.getAbstractComputationAssignmentTarget());
        deviceRequirementEClass.getESuperTypes().add(this.getExecutionRequirement());
        softwareConfigurationRequirementEClass.getESuperTypes().add(this.getExecutionRequirement());
        hwswParemeterEClass.getESuperTypes().add(this.getExecutionProperty());
        softwareExecutionParemeterEClass.getESuperTypes().add(this.getExecutionProperty());
        executionPropertyEClass.getESuperTypes().add(theUtilPackage.getProperty());

        // Initialize classes, features, and operations; add parameters
        initEClass(executionRequirementEClass, ExecutionRequirement.class, "ExecutionRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(implementationDescriptionEClass, ImplementationDescription.class, "ImplementationDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getImplementationDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, ImplementationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImplementationDescription_SoftwareDependency(), ecorePackage.getEString(), "softwareDependency", null, 0, -1, ImplementationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getImplementationDescription_IncludeSoftwareComponent(), this.getSoftwareComponent(), null, "includeSoftwareComponent", null, 1, -1, ImplementationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(softwareComponentEClass, SoftwareComponent.class, "SoftwareComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSoftwareComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSoftwareComponent_Path(), ecorePackage.getEString(), "path", null, 1, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSoftwareComponent_ExecutionRequirement(), this.getExecutionRequirement(), null, "executionRequirement", null, 0, -1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(deviceRequirementEClass, DeviceRequirement.class, "DeviceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDeviceRequirement_Type(), ecorePackage.getEString(), "type", null, 1, 1, DeviceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDeviceRequirement_Parameter(), this.getHWSWParemeter(), null, "parameter", null, 0, -1, DeviceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(softwareConfigurationRequirementEClass, SoftwareConfigurationRequirement.class, "SoftwareConfigurationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSoftwareConfigurationRequirement_Parameter(), this.getSoftwareExecutionParemeter(), null, "parameter", null, 1, -1, SoftwareConfigurationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hwswParemeterEClass, HWSWParemeter.class, "HWSWParemeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(softwareExecutionParemeterEClass, SoftwareExecutionParemeter.class, "SoftwareExecutionParemeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(executionPropertyEClass, ExecutionProperty.class, "ExecutionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //ImplementationDescriptionPackageImpl
