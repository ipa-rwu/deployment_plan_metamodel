/**
 */
package deploymentPlan.util;

import deploymentPlan.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see deploymentPlan.DeploymentPlanPackage
 * @generated
 */
public class DeploymentPlanSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DeploymentPlanPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeploymentPlanSwitch() {
        if (modelPackage == null) {
            modelPackage = DeploymentPlanPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case DeploymentPlanPackage.PLAN: {
                Plan plan = (Plan)theEObject;
                T result = casePlan(plan);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.DEPLOYMENT_PLAN: {
                DeploymentPlan deploymentPlan = (DeploymentPlan)theEObject;
                T result = caseDeploymentPlan(deploymentPlan);
                if (result == null) result = caseAbstractDeploymentPlan(deploymentPlan);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.REALIZATION: {
                Realization realization = (Realization)theEObject;
                T result = caseRealization(realization);
                if (result == null) result = caseAbstractRealization(realization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT: {
                ImplementationAssignment implementationAssignment = (ImplementationAssignment)theEObject;
                T result = caseImplementationAssignment(implementationAssignment);
                if (result == null) result = caseAbstractComputationAssignment(implementationAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER: {
                ConfigExecutionParameter configExecutionParameter = (ConfigExecutionParameter)theEObject;
                T result = caseConfigExecutionParameter(configExecutionParameter);
                if (result == null) result = caseAbstractConfigExecutionParameter(configExecutionParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.MIDDLEWARE: {
                Middleware middleware = (Middleware)theEObject;
                T result = caseMiddleware(middleware);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.CONFIG_SOFTWARE_COMPONENT: {
                ConfigSoftwareComponent configSoftwareComponent = (ConfigSoftwareComponent)theEObject;
                T result = caseConfigSoftwareComponent(configSoftwareComponent);
                if (result == null) result = caseAbstarctConfigSoftwareComponent(configSoftwareComponent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.ABSTRACT_REALIZATION: {
                AbstractRealization abstractRealization = (AbstractRealization)theEObject;
                T result = caseAbstractRealization(abstractRealization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.ABSTRACT_CONFIG_EXECUTION_PARAMETER: {
                AbstractConfigExecutionParameter abstractConfigExecutionParameter = (AbstractConfigExecutionParameter)theEObject;
                T result = caseAbstractConfigExecutionParameter(abstractConfigExecutionParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT: {
                AbstractComputationAssignment abstractComputationAssignment = (AbstractComputationAssignment)theEObject;
                T result = caseAbstractComputationAssignment(abstractComputationAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN: {
                AbstractDeploymentPlan abstractDeploymentPlan = (AbstractDeploymentPlan)theEObject;
                T result = caseAbstractDeploymentPlan(abstractDeploymentPlan);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT: {
                AbstarctConfigSoftwareComponent abstarctConfigSoftwareComponent = (AbstarctConfigSoftwareComponent)theEObject;
                T result = caseAbstarctConfigSoftwareComponent(abstarctConfigSoftwareComponent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeploymentPlanPackage.ROS_MIDDLEWARE: {
                RosMiddleware rosMiddleware = (RosMiddleware)theEObject;
                T result = caseRosMiddleware(rosMiddleware);
                if (result == null) result = caseMiddleware(rosMiddleware);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Plan</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Plan</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePlan(Plan object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Deployment Plan</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Deployment Plan</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeploymentPlan(DeploymentPlan object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRealization(Realization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Implementation Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implementation Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImplementationAssignment(ImplementationAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Config Execution Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Config Execution Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfigExecutionParameter(ConfigExecutionParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Middleware</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Middleware</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMiddleware(Middleware object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Config Software Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Config Software Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfigSoftwareComponent(ConfigSoftwareComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Realization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Realization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractRealization(AbstractRealization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Config Execution Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Config Execution Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractConfigExecutionParameter(AbstractConfigExecutionParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Computation Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Computation Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractComputationAssignment(AbstractComputationAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Deployment Plan</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Deployment Plan</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDeploymentPlan(AbstractDeploymentPlan object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstarct Config Software Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstarct Config Software Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstarctConfigSoftwareComponent(AbstarctConfigSoftwareComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ros Middleware</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ros Middleware</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRosMiddleware(RosMiddleware object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //DeploymentPlanSwitch
