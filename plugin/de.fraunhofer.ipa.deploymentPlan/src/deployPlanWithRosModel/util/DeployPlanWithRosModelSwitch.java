/**
 */
package deployPlanWithRosModel.util;

import deployPlanWithRosModel.*;

import deploymentPlan.AbstarctConfigSoftwareComponent;
import deploymentPlan.AbstractComputationAssignment;
import deploymentPlan.AbstractConfigExecutionParameter;
import deploymentPlan.AbstractDeploymentPlan;

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
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage
 * @generated
 */
public class DeployPlanWithRosModelSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DeployPlanWithRosModelPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeployPlanWithRosModelSwitch() {
        if (modelPackage == null) {
            modelPackage = DeployPlanWithRosModelPackage.eINSTANCE;
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
            case DeployPlanWithRosModelPackage.DEPLOYMENT_PLAN_WITH_ROS_MODEL: {
                DeploymentPlanWithRosModel deploymentPlanWithRosModel = (DeploymentPlanWithRosModel)theEObject;
                T result = caseDeploymentPlanWithRosModel(deploymentPlanWithRosModel);
                if (result == null) result = caseAbstractDeploymentPlan(deploymentPlanWithRosModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT: {
                RossystemAssignment rossystemAssignment = (RossystemAssignment)theEObject;
                T result = caseRossystemAssignment(rossystemAssignment);
                if (result == null) result = caseAbstractComputationAssignment(rossystemAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeployPlanWithRosModelPackage.ROSPACKAGE_IMPLEMENTATION: {
                RospackageImplementation rospackageImplementation = (RospackageImplementation)theEObject;
                T result = caseRospackageImplementation(rospackageImplementation);
                if (result == null) result = caseAbstractComputationAssignment(rospackageImplementation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER: {
                ConfigRosParameter configRosParameter = (ConfigRosParameter)theEObject;
                T result = caseConfigRosParameter(configRosParameter);
                if (result == null) result = caseAbstractConfigExecutionParameter(configRosParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DeployPlanWithRosModelPackage.CONFIG_ROS_SOFTWARE_COMPONENT: {
                ConfigRosSoftwareComponent configRosSoftwareComponent = (ConfigRosSoftwareComponent)theEObject;
                T result = caseConfigRosSoftwareComponent(configRosSoftwareComponent);
                if (result == null) result = caseAbstarctConfigSoftwareComponent(configRosSoftwareComponent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Deployment Plan With Ros Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Deployment Plan With Ros Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeploymentPlanWithRosModel(DeploymentPlanWithRosModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rossystem Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rossystem Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRossystemAssignment(RossystemAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rospackage Implementation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rospackage Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRospackageImplementation(RospackageImplementation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Config Ros Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Config Ros Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfigRosParameter(ConfigRosParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Config Ros Software Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Config Ros Software Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfigRosSoftwareComponent(ConfigRosSoftwareComponent object) {
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

} //DeployPlanWithRosModelSwitch
