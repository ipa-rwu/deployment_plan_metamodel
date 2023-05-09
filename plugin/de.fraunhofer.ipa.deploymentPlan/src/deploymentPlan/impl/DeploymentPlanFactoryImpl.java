/**
 */
package deploymentPlan.impl;

import deploymentPlan.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
            case DeploymentPlanPackage.CONFIG_SOFTWARE_COMPONENT: return createConfigSoftwareComponent();
            case DeploymentPlanPackage.ROS_MIDDLEWARE: return createRosMiddleware();
            case DeploymentPlanPackage.CONTAINER_RUNTIME: return createContainerRuntime();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case DeploymentPlanPackage.ROS_DISTRO:
                return createROSDistroFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case DeploymentPlanPackage.ROS_DISTRO:
                return convertROSDistroToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
    public ConfigSoftwareComponent createConfigSoftwareComponent() {
        ConfigSoftwareComponentImpl configSoftwareComponent = new ConfigSoftwareComponentImpl();
        return configSoftwareComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RosMiddleware createRosMiddleware() {
        RosMiddlewareImpl rosMiddleware = new RosMiddlewareImpl();
        return rosMiddleware;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerRuntime createContainerRuntime() {
        ContainerRuntimeImpl containerRuntime = new ContainerRuntimeImpl();
        return containerRuntime;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ROSDistro createROSDistroFromString(EDataType eDataType, String initialValue) {
        ROSDistro result = ROSDistro.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertROSDistroToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
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
