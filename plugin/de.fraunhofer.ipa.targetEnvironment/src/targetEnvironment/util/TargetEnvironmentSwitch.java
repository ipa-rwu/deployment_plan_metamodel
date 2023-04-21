/**
 */
package targetEnvironment.util;

import de.fraunhofer.ipa.deployment.util.Description;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import targetEnvironment.*;

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
 * @see targetEnvironment.TargetEnvironmentPackage
 * @generated
 */
public class TargetEnvironmentSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TargetEnvironmentPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetEnvironmentSwitch() {
        if (modelPackage == null) {
            modelPackage = TargetEnvironmentPackage.eINSTANCE;
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
            case TargetEnvironmentPackage.TARGET_ENVIRONMENT: {
                TargetEnvironment targetEnvironment = (TargetEnvironment)theEObject;
                T result = caseTargetEnvironment(targetEnvironment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT: {
                TargetDeployEnviroment targetDeployEnviroment = (TargetDeployEnviroment)theEObject;
                T result = caseTargetDeployEnviroment(targetDeployEnviroment);
                if (result == null) result = caseDescription(targetDeployEnviroment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TargetEnvironmentPackage.CONFIG_CONNECTION: {
                ConfigConnection configConnection = (ConfigConnection)theEObject;
                T result = caseConfigConnection(configConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TargetEnvironmentPackage.CONNECTED_DEVICE: {
                ConnectedDevice connectedDevice = (ConnectedDevice)theEObject;
                T result = caseConnectedDevice(connectedDevice);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY: {
                ConfigConnectionProperty configConnectionProperty = (ConfigConnectionProperty)theEObject;
                T result = caseConfigConnectionProperty(configConnectionProperty);
                if (result == null) result = caseAbstractConfigProperty(configConnectionProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TargetEnvironmentPackage.COMPUTATION_DEVICE_INSTANCE: {
                ComputationDeviceInstance computationDeviceInstance = (ComputationDeviceInstance)theEObject;
                T result = caseComputationDeviceInstance(computationDeviceInstance);
                if (result == null) result = caseAbstractDeviceInstance(computationDeviceInstance);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TargetEnvironmentPackage.DEVICE_INSTANCE: {
                DeviceInstance deviceInstance = (DeviceInstance)theEObject;
                T result = caseDeviceInstance(deviceInstance);
                if (result == null) result = caseAbstractDeviceInstance(deviceInstance);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY: {
                ConfigDeviceProperty configDeviceProperty = (ConfigDeviceProperty)theEObject;
                T result = caseConfigDeviceProperty(configDeviceProperty);
                if (result == null) result = caseAbstractConfigProperty(configDeviceProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE: {
                AbstractDeviceInstance abstractDeviceInstance = (AbstractDeviceInstance)theEObject;
                T result = caseAbstractDeviceInstance(abstractDeviceInstance);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TargetEnvironmentPackage.ABSTRACT_CONFIG_PROPERTY: {
                AbstractConfigProperty abstractConfigProperty = (AbstractConfigProperty)theEObject;
                T result = caseAbstractConfigProperty(abstractConfigProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Target Environment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Target Environment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTargetEnvironment(TargetEnvironment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Target Deploy Enviroment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Target Deploy Enviroment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTargetDeployEnviroment(TargetDeployEnviroment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Config Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Config Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfigConnection(ConfigConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connected Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connected Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectedDevice(ConnectedDevice object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Config Connection Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Config Connection Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfigConnectionProperty(ConfigConnectionProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Computation Device Instance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Computation Device Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComputationDeviceInstance(ComputationDeviceInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Device Instance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Device Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeviceInstance(DeviceInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Config Device Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Config Device Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfigDeviceProperty(ConfigDeviceProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Device Instance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Device Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDeviceInstance(AbstractDeviceInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Config Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Config Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractConfigProperty(AbstractConfigProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDescription(Description object) {
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

} //TargetEnvironmentSwitch
