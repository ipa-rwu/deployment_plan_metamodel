/**
 */
package implementationDescription.util;

import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;
import de.fraunhofer.ipa.deployment.util.AbstractImplementation;
import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.Property;

import implementationDescription.*;

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
 * @see implementationDescription.ImplementationDescriptionPackage
 * @generated
 */
public class ImplementationDescriptionSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ImplementationDescriptionPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplementationDescriptionSwitch() {
        if (modelPackage == null) {
            modelPackage = ImplementationDescriptionPackage.eINSTANCE;
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
            case ImplementationDescriptionPackage.EXECUTION_REQUIREMENT: {
                ExecutionRequirement executionRequirement = (ExecutionRequirement)theEObject;
                T result = caseExecutionRequirement(executionRequirement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION: {
                ImplementationDescription implementationDescription = (ImplementationDescription)theEObject;
                T result = caseImplementationDescription(implementationDescription);
                if (result == null) result = caseAbstractImplementation(implementationDescription);
                if (result == null) result = caseAbstractComputationAssignmentTarget(implementationDescription);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT: {
                SoftwareComponent softwareComponent = (SoftwareComponent)theEObject;
                T result = caseSoftwareComponent(softwareComponent);
                if (result == null) result = caseAbstractComputationAssignmentTarget(softwareComponent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT: {
                DeviceRequirement deviceRequirement = (DeviceRequirement)theEObject;
                T result = caseDeviceRequirement(deviceRequirement);
                if (result == null) result = caseExecutionRequirement(deviceRequirement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ImplementationDescriptionPackage.SOFTWARE_CONFIGURATION_REQUIREMENT: {
                SoftwareConfigurationRequirement softwareConfigurationRequirement = (SoftwareConfigurationRequirement)theEObject;
                T result = caseSoftwareConfigurationRequirement(softwareConfigurationRequirement);
                if (result == null) result = caseExecutionRequirement(softwareConfigurationRequirement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ImplementationDescriptionPackage.HWSW_PAREMETER: {
                HWSWParemeter hwswParemeter = (HWSWParemeter)theEObject;
                T result = caseHWSWParemeter(hwswParemeter);
                if (result == null) result = caseExecutionProperty(hwswParemeter);
                if (result == null) result = caseProperty(hwswParemeter);
                if (result == null) result = caseAbstractProperty(hwswParemeter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ImplementationDescriptionPackage.SOFTWARE_EXECUTION_PAREMETER: {
                SoftwareExecutionParemeter softwareExecutionParemeter = (SoftwareExecutionParemeter)theEObject;
                T result = caseSoftwareExecutionParemeter(softwareExecutionParemeter);
                if (result == null) result = caseExecutionProperty(softwareExecutionParemeter);
                if (result == null) result = caseProperty(softwareExecutionParemeter);
                if (result == null) result = caseAbstractProperty(softwareExecutionParemeter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ImplementationDescriptionPackage.EXECUTION_PROPERTY: {
                ExecutionProperty executionProperty = (ExecutionProperty)theEObject;
                T result = caseExecutionProperty(executionProperty);
                if (result == null) result = caseProperty(executionProperty);
                if (result == null) result = caseAbstractProperty(executionProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ImplementationDescriptionPackage.REPOSITORY: {
                Repository repository = (Repository)theEObject;
                T result = caseRepository(repository);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ImplementationDescriptionPackage.REPOSITORY_TYPE: {
                RepositoryType repositoryType = (RepositoryType)theEObject;
                T result = caseRepositoryType(repositoryType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ImplementationDescriptionPackage.GIT_REPOSITORY_TYPE: {
                GitRepositoryType gitRepositoryType = (GitRepositoryType)theEObject;
                T result = caseGitRepositoryType(gitRepositoryType);
                if (result == null) result = caseRepositoryType(gitRepositoryType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Execution Requirement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Execution Requirement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExecutionRequirement(ExecutionRequirement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Implementation Description</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implementation Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImplementationDescription(ImplementationDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Software Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Software Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoftwareComponent(SoftwareComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Device Requirement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Device Requirement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeviceRequirement(DeviceRequirement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Software Configuration Requirement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Software Configuration Requirement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoftwareConfigurationRequirement(SoftwareConfigurationRequirement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HWSW Paremeter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HWSW Paremeter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHWSWParemeter(HWSWParemeter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Software Execution Paremeter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Software Execution Paremeter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoftwareExecutionParemeter(SoftwareExecutionParemeter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Execution Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Execution Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExecutionProperty(ExecutionProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepository(Repository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Repository Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Repository Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepositoryType(RepositoryType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Git Repository Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Git Repository Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGitRepositoryType(GitRepositoryType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Implementation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractImplementation(AbstractImplementation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Computation Assignment Target</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Computation Assignment Target</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractComputationAssignmentTarget(AbstractComputationAssignmentTarget object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractProperty(AbstractProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProperty(Property object) {
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

} //ImplementationDescriptionSwitch
