/**
 */
package deploymentPlan.impl;

import deploymentPlan.*;

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
public class DeploymentPlanFactoryImpl extends EFactoryImpl implements DeploymentPlanFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DeploymentPlanFactory init() {
        try {
            DeploymentPlanFactory theDeploymentPlanFactory = (DeploymentPlanFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentPlanPackage.eNS_URI);
            if (theDeploymentPlanFactory != null) {
                return theDeploymentPlanFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DeploymentPlanFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeploymentPlanFactoryImpl() {
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
            case DeploymentPlanPackage.PLAN: return createPlan();
            case DeploymentPlanPackage.DEPLOYMENT_PLAN: return createDeploymentPlan();
            case DeploymentPlanPackage.REALIZATION: return createRealization();
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT: return createImplementationAssignment();
            case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER: return createConfigExecutionParameter();
            case DeploymentPlanPackage.HUMBLE_ROS_DISTRO: return createHumbleROSDistro();
            case DeploymentPlanPackage.NOETIC_ROS_DISTRO: return createNoeticROSDistro();
            case DeploymentPlanPackage.CONFIG_SOFTWARE_COMPONENT: return createConfigSoftwareComponent();
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT: return createAbstarctConfigSoftwareComponent();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Plan createPlan() {
        PlanImpl plan = new PlanImpl();
        return plan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeploymentPlan createDeploymentPlan() {
        DeploymentPlanImpl deploymentPlan = new DeploymentPlanImpl();
        return deploymentPlan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Realization createRealization() {
        RealizationImpl realization = new RealizationImpl();
        return realization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplementationAssignment createImplementationAssignment() {
        ImplementationAssignmentImpl implementationAssignment = new ImplementationAssignmentImpl();
        return implementationAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigExecutionParameter createConfigExecutionParameter() {
        ConfigExecutionParameterImpl configExecutionParameter = new ConfigExecutionParameterImpl();
        return configExecutionParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HumbleROSDistro createHumbleROSDistro() {
        HumbleROSDistroImpl humbleROSDistro = new HumbleROSDistroImpl();
        return humbleROSDistro;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoeticROSDistro createNoeticROSDistro() {
        NoeticROSDistroImpl noeticROSDistro = new NoeticROSDistroImpl();
        return noeticROSDistro;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigSoftwareComponent createConfigSoftwareComponent() {
        ConfigSoftwareComponentImpl configSoftwareComponent = new ConfigSoftwareComponentImpl();
        return configSoftwareComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstarctConfigSoftwareComponent createAbstarctConfigSoftwareComponent() {
        AbstarctConfigSoftwareComponentImpl abstarctConfigSoftwareComponent = new AbstarctConfigSoftwareComponentImpl();
        return abstarctConfigSoftwareComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeploymentPlanPackage getDeploymentPlanPackage() {
        return (DeploymentPlanPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DeploymentPlanPackage getPackage() {
        return DeploymentPlanPackage.eINSTANCE;
    }

} //DeploymentPlanFactoryImpl
