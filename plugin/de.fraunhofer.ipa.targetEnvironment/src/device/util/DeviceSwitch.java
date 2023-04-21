/**
 */
package device.util;

import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.AbstractResource;
import de.fraunhofer.ipa.deployment.util.Description;
import de.fraunhofer.ipa.deployment.util.PropertyAttribute;
import de.fraunhofer.ipa.deployment.util.Resource;

import device.*;

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
 * @see device.DevicePackage
 * @generated
 */
public class DeviceSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DevicePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceSwitch() {
        if (modelPackage == null) {
            modelPackage = DevicePackage.eINSTANCE;
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
            case DevicePackage.DEVICE_SET: {
                DeviceSet deviceSet = (DeviceSet)theEObject;
                T result = caseDeviceSet(deviceSet);
                if (result == null) result = caseDescription(deviceSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.DEVICE_TYPE: {
                DeviceType deviceType = (DeviceType)theEObject;
                T result = caseDeviceType(deviceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.DEVICE_RESOURCE: {
                DeviceResource deviceResource = (DeviceResource)theEObject;
                T result = caseDeviceResource(deviceResource);
                if (result == null) result = caseResource(deviceResource);
                if (result == null) result = caseAbstractComputationDeviceResource(deviceResource);
                if (result == null) result = caseAbstractResource(deviceResource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.COMMUNICATION_CONNECTION: {
                CommunicationConnection communicationConnection = (CommunicationConnection)theEObject;
                T result = caseCommunicationConnection(communicationConnection);
                if (result == null) result = caseAbstractCommunicationConnection(communicationConnection);
                if (result == null) result = caseAbstractResource(communicationConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.CONNECTION_PROPERTY: {
                ConnectionProperty connectionProperty = (ConnectionProperty)theEObject;
                T result = caseConnectionProperty(connectionProperty);
                if (result == null) result = casePropertyAttribute(connectionProperty);
                if (result == null) result = caseAbstractProperty(connectionProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.COMPUTATION_DEVICE_TYPE: {
                ComputationDeviceType computationDeviceType = (ComputationDeviceType)theEObject;
                T result = caseComputationDeviceType(computationDeviceType);
                if (result == null) result = caseDeviceType(computationDeviceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.NETWORK_CONNECTION: {
                NetworkConnection networkConnection = (NetworkConnection)theEObject;
                T result = caseNetworkConnection(networkConnection);
                if (result == null) result = caseAbstractCommunicationConnection(networkConnection);
                if (result == null) result = caseAbstractResource(networkConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.INTERFACE_NETWORK_PROPERTY: {
                InterfaceNetworkProperty interfaceNetworkProperty = (InterfaceNetworkProperty)theEObject;
                T result = caseInterfaceNetworkProperty(interfaceNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(interfaceNetworkProperty);
                if (result == null) result = casePropertyAttribute(interfaceNetworkProperty);
                if (result == null) result = caseAbstractProperty(interfaceNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ADDRESS_NETWORK_PROPERTY: {
                AddressNetworkProperty addressNetworkProperty = (AddressNetworkProperty)theEObject;
                T result = caseAddressNetworkProperty(addressNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(addressNetworkProperty);
                if (result == null) result = casePropertyAttribute(addressNetworkProperty);
                if (result == null) result = caseAbstractProperty(addressNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.MAC_NETWORK_PROPERTY: {
                MacNetworkProperty macNetworkProperty = (MacNetworkProperty)theEObject;
                T result = caseMacNetworkProperty(macNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(macNetworkProperty);
                if (result == null) result = casePropertyAttribute(macNetworkProperty);
                if (result == null) result = caseAbstractProperty(macNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.CONTAINER: {
                Container container = (Container)theEObject;
                T result = caseContainer(container);
                if (result == null) result = caseAbstractRuntimeEnviroment(container);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.OPERATING_SYSTEM_RESOUCE: {
                OperatingSystemResouce operatingSystemResouce = (OperatingSystemResouce)theEObject;
                T result = caseOperatingSystemResouce(operatingSystemResouce);
                if (result == null) result = caseAbstractResource(operatingSystemResouce);
                if (result == null) result = caseAbstractComputationDeviceResource(operatingSystemResouce);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.NAME_OPERATING_SYSTEM_PROPERTY: {
                NameOperatingSystemProperty nameOperatingSystemProperty = (NameOperatingSystemProperty)theEObject;
                T result = caseNameOperatingSystemProperty(nameOperatingSystemProperty);
                if (result == null) result = caseAbstractOperatingSystemProperty(nameOperatingSystemProperty);
                if (result == null) result = casePropertyAttribute(nameOperatingSystemProperty);
                if (result == null) result = caseAbstractProperty(nameOperatingSystemProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.VERSION_OPERATING_SYSTEM_PROPERTY: {
                VersionOperatingSystemProperty versionOperatingSystemProperty = (VersionOperatingSystemProperty)theEObject;
                T result = caseVersionOperatingSystemProperty(versionOperatingSystemProperty);
                if (result == null) result = caseAbstractOperatingSystemProperty(versionOperatingSystemProperty);
                if (result == null) result = casePropertyAttribute(versionOperatingSystemProperty);
                if (result == null) result = caseAbstractProperty(versionOperatingSystemProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.PROCESSOR_RESOUCE: {
                ProcessorResouce processorResouce = (ProcessorResouce)theEObject;
                T result = caseProcessorResouce(processorResouce);
                if (result == null) result = caseAbstractResource(processorResouce);
                if (result == null) result = caseAbstractComputationDeviceResource(processorResouce);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ARCHITECTURE_PROCESSOR_PROPERTY: {
                ArchitectureProcessorProperty architectureProcessorProperty = (ArchitectureProcessorProperty)theEObject;
                T result = caseArchitectureProcessorProperty(architectureProcessorProperty);
                if (result == null) result = casePropertyAttribute(architectureProcessorProperty);
                if (result == null) result = caseAbstracProcessorProperty(architectureProcessorProperty);
                if (result == null) result = caseAbstractProperty(architectureProcessorProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.CORE_PROCESSOR_PROPERTY: {
                CoreProcessorProperty coreProcessorProperty = (CoreProcessorProperty)theEObject;
                T result = caseCoreProcessorProperty(coreProcessorProperty);
                if (result == null) result = casePropertyAttribute(coreProcessorProperty);
                if (result == null) result = caseAbstracProcessorProperty(coreProcessorProperty);
                if (result == null) result = caseAbstractProperty(coreProcessorProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_NETWORK_PROPERTY: {
                AbstractNetworkProperty abstractNetworkProperty = (AbstractNetworkProperty)theEObject;
                T result = caseAbstractNetworkProperty(abstractNetworkProperty);
                if (result == null) result = casePropertyAttribute(abstractNetworkProperty);
                if (result == null) result = caseAbstractProperty(abstractNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_COMMUNICATION_CONNECTION: {
                AbstractCommunicationConnection abstractCommunicationConnection = (AbstractCommunicationConnection)theEObject;
                T result = caseAbstractCommunicationConnection(abstractCommunicationConnection);
                if (result == null) result = caseAbstractResource(abstractCommunicationConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_RUNTIME_ENVIROMENT: {
                AbstractRuntimeEnviroment abstractRuntimeEnviroment = (AbstractRuntimeEnviroment)theEObject;
                T result = caseAbstractRuntimeEnviroment(abstractRuntimeEnviroment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_OPERATING_SYSTEM_PROPERTY: {
                AbstractOperatingSystemProperty abstractOperatingSystemProperty = (AbstractOperatingSystemProperty)theEObject;
                T result = caseAbstractOperatingSystemProperty(abstractOperatingSystemProperty);
                if (result == null) result = casePropertyAttribute(abstractOperatingSystemProperty);
                if (result == null) result = caseAbstractProperty(abstractOperatingSystemProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_COMPUTATION_DEVICE_RESOURCE: {
                AbstractComputationDeviceResource abstractComputationDeviceResource = (AbstractComputationDeviceResource)theEObject;
                T result = caseAbstractComputationDeviceResource(abstractComputationDeviceResource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRAC_PROCESSOR_PROPERTY: {
                AbstracProcessorProperty abstracProcessorProperty = (AbstracProcessorProperty)theEObject;
                T result = caseAbstracProcessorProperty(abstracProcessorProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeviceSet(DeviceSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeviceType(DeviceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeviceResource(DeviceResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Communication Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Communication Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommunicationConnection(CommunicationConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connection Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectionProperty(ConnectionProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Computation Device Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Computation Device Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComputationDeviceType(ComputationDeviceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Network Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Network Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNetworkConnection(NetworkConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface Network Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface Network Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterfaceNetworkProperty(InterfaceNetworkProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Address Network Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Address Network Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddressNetworkProperty(AddressNetworkProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mac Network Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mac Network Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMacNetworkProperty(MacNetworkProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContainer(Container object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Network Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Network Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractNetworkProperty(AbstractNetworkProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Communication Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Communication Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractCommunicationConnection(AbstractCommunicationConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Runtime Enviroment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Runtime Enviroment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractRuntimeEnviroment(AbstractRuntimeEnviroment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operating System Resouce</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operating System Resouce</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperatingSystemResouce(OperatingSystemResouce object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Operating System Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Operating System Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractOperatingSystemProperty(AbstractOperatingSystemProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Computation Device Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Computation Device Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractComputationDeviceResource(AbstractComputationDeviceResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Name Operating System Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Name Operating System Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNameOperatingSystemProperty(NameOperatingSystemProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Version Operating System Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Version Operating System Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVersionOperatingSystemProperty(VersionOperatingSystemProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor Resouce</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Resouce</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorResouce(ProcessorResouce object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Architecture Processor Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Architecture Processor Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArchitectureProcessorProperty(ArchitectureProcessorProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Core Processor Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Core Processor Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCoreProcessorProperty(CoreProcessorProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstrac Processor Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstrac Processor Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstracProcessorProperty(AbstracProcessorProperty object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Abstract Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractResource(AbstractResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResource(Resource object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Property Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyAttribute(PropertyAttribute object) {
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

} //DeviceSwitch
