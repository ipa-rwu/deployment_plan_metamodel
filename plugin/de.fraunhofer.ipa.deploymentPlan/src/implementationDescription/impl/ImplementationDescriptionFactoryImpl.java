/**
 */
package implementationDescription.impl;

import implementationDescription.*;

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
public class ImplementationDescriptionFactoryImpl extends EFactoryImpl implements ImplementationDescriptionFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ImplementationDescriptionFactory init() {
        try {
            ImplementationDescriptionFactory theImplementationDescriptionFactory = (ImplementationDescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(ImplementationDescriptionPackage.eNS_URI);
            if (theImplementationDescriptionFactory != null) {
                return theImplementationDescriptionFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ImplementationDescriptionFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplementationDescriptionFactoryImpl() {
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
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION: return createImplementationDescription();
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT: return createSoftwareComponent();
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT: return createDeviceRequirement();
            case ImplementationDescriptionPackage.SOFTWARE_CONFIGURATION_REQUIREMENT: return createSoftwareConfigurationRequirement();
            case ImplementationDescriptionPackage.HWSW_PAREMETER: return createHWSWParemeter();
            case ImplementationDescriptionPackage.SOFTWARE_EXECUTION_PAREMETER: return createSoftwareExecutionParemeter();
            case ImplementationDescriptionPackage.EXECUTION_PARAMETER: return createExecutionParameter();
            case ImplementationDescriptionPackage.REPOSITORY: return createRepository();
            case ImplementationDescriptionPackage.GIT_REPOSITORY_TYPE: return createGitRepositoryType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplementationDescription createImplementationDescription() {
        ImplementationDescriptionImpl implementationDescription = new ImplementationDescriptionImpl();
        return implementationDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoftwareComponent createSoftwareComponent() {
        SoftwareComponentImpl softwareComponent = new SoftwareComponentImpl();
        return softwareComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceRequirement createDeviceRequirement() {
        DeviceRequirementImpl deviceRequirement = new DeviceRequirementImpl();
        return deviceRequirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoftwareConfigurationRequirement createSoftwareConfigurationRequirement() {
        SoftwareConfigurationRequirementImpl softwareConfigurationRequirement = new SoftwareConfigurationRequirementImpl();
        return softwareConfigurationRequirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HWSWParemeter createHWSWParemeter() {
        HWSWParemeterImpl hwswParemeter = new HWSWParemeterImpl();
        return hwswParemeter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoftwareExecutionParemeter createSoftwareExecutionParemeter() {
        SoftwareExecutionParemeterImpl softwareExecutionParemeter = new SoftwareExecutionParemeterImpl();
        return softwareExecutionParemeter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionParameter createExecutionParameter() {
        ExecutionParameterImpl executionParameter = new ExecutionParameterImpl();
        return executionParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Repository createRepository() {
        RepositoryImpl repository = new RepositoryImpl();
        return repository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GitRepositoryType createGitRepositoryType() {
        GitRepositoryTypeImpl gitRepositoryType = new GitRepositoryTypeImpl();
        return gitRepositoryType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplementationDescriptionPackage getImplementationDescriptionPackage() {
        return (ImplementationDescriptionPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ImplementationDescriptionPackage getPackage() {
        return ImplementationDescriptionPackage.eINSTANCE;
    }

} //ImplementationDescriptionFactoryImpl
