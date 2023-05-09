/**
 */
package deploymentPlan.util;

import deploymentPlan.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see deploymentPlan.DeploymentPlanPackage
 * @generated
 */
public class DeploymentPlanAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DeploymentPlanPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeploymentPlanAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DeploymentPlanPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeploymentPlanSwitch<Adapter> modelSwitch =
        new DeploymentPlanSwitch<Adapter>() {
            @Override
            public Adapter casePlan(Plan object) {
                return createPlanAdapter();
            }
            @Override
            public Adapter caseDeploymentPlan(DeploymentPlan object) {
                return createDeploymentPlanAdapter();
            }
            @Override
            public Adapter caseRealization(Realization object) {
                return createRealizationAdapter();
            }
            @Override
            public Adapter caseImplementationAssignment(ImplementationAssignment object) {
                return createImplementationAssignmentAdapter();
            }
            @Override
            public Adapter caseConfigExecutionParameter(ConfigExecutionParameter object) {
                return createConfigExecutionParameterAdapter();
            }
            @Override
            public Adapter caseMiddleware(Middleware object) {
                return createMiddlewareAdapter();
            }
            @Override
            public Adapter caseConfigSoftwareComponent(ConfigSoftwareComponent object) {
                return createConfigSoftwareComponentAdapter();
            }
            @Override
            public Adapter caseAbstractRealization(AbstractRealization object) {
                return createAbstractRealizationAdapter();
            }
            @Override
            public Adapter caseAbstractConfigExecutionParameter(AbstractConfigExecutionParameter object) {
                return createAbstractConfigExecutionParameterAdapter();
            }
            @Override
            public Adapter caseAbstractComputationAssignment(AbstractComputationAssignment object) {
                return createAbstractComputationAssignmentAdapter();
            }
            @Override
            public Adapter caseAbstractDeploymentPlan(AbstractDeploymentPlan object) {
                return createAbstractDeploymentPlanAdapter();
            }
            @Override
            public Adapter caseAbstarctConfigSoftwareComponent(AbstarctConfigSoftwareComponent object) {
                return createAbstarctConfigSoftwareComponentAdapter();
            }
            @Override
            public Adapter caseRosMiddleware(RosMiddleware object) {
                return createRosMiddlewareAdapter();
            }
            @Override
            public Adapter caseAbstractRuntime(AbstractRuntime object) {
                return createAbstractRuntimeAdapter();
            }
            @Override
            public Adapter caseContainerRuntime(ContainerRuntime object) {
                return createContainerRuntimeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.Plan <em>Plan</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.Plan
     * @generated
     */
    public Adapter createPlanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.DeploymentPlan <em>Deployment Plan</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.DeploymentPlan
     * @generated
     */
    public Adapter createDeploymentPlanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.Realization <em>Realization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.Realization
     * @generated
     */
    public Adapter createRealizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.ImplementationAssignment <em>Implementation Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.ImplementationAssignment
     * @generated
     */
    public Adapter createImplementationAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.ConfigExecutionParameter <em>Config Execution Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.ConfigExecutionParameter
     * @generated
     */
    public Adapter createConfigExecutionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.Middleware <em>Middleware</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.Middleware
     * @generated
     */
    public Adapter createMiddlewareAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.ConfigSoftwareComponent <em>Config Software Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.ConfigSoftwareComponent
     * @generated
     */
    public Adapter createConfigSoftwareComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.AbstractRealization <em>Abstract Realization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.AbstractRealization
     * @generated
     */
    public Adapter createAbstractRealizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.AbstractConfigExecutionParameter <em>Abstract Config Execution Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.AbstractConfigExecutionParameter
     * @generated
     */
    public Adapter createAbstractConfigExecutionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.AbstractComputationAssignment <em>Abstract Computation Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.AbstractComputationAssignment
     * @generated
     */
    public Adapter createAbstractComputationAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.AbstractDeploymentPlan <em>Abstract Deployment Plan</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.AbstractDeploymentPlan
     * @generated
     */
    public Adapter createAbstractDeploymentPlanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.AbstarctConfigSoftwareComponent <em>Abstarct Config Software Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.AbstarctConfigSoftwareComponent
     * @generated
     */
    public Adapter createAbstarctConfigSoftwareComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.RosMiddleware <em>Ros Middleware</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.RosMiddleware
     * @generated
     */
    public Adapter createRosMiddlewareAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.AbstractRuntime <em>Abstract Runtime</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.AbstractRuntime
     * @generated
     */
    public Adapter createAbstractRuntimeAdapter() {
        return null;
    }

                /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.ContainerRuntime <em>Container Runtime</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.ContainerRuntime
     * @generated
     */
    public Adapter createContainerRuntimeAdapter() {
        return null;
    }

                /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //DeploymentPlanAdapterFactory
