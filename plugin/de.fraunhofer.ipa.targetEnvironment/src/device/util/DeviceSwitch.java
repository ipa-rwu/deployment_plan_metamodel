/**
 */
package device.util;

import de.fraunhofer.ipa.deployment.util.AbstractComputationResource;
import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.AbstractResource;
import de.fraunhofer.ipa.deployment.util.Description;
import de.fraunhofer.ipa.deployment.util.PropertyAttribute;
import de.fraunhofer.ipa.deployment.util.PropertySelection;
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
                if (result == null) result = caseAbstractDeviceType(deviceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.DEVICE_RESOURCE: {
                DeviceResource deviceResource = (DeviceResource)theEObject;
                T result = caseDeviceResource(deviceResource);
                if (result == null) result = caseResource(deviceResource);
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
                if (result == null) result = caseAbstractConnectionProperty(connectionProperty);
                if (result == null) result = caseAbstractProperty(connectionProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.COMPUTATION_DEVICE_TYPE: {
                ComputationDeviceType computationDeviceType = (ComputationDeviceType)theEObject;
                T result = caseComputationDeviceType(computationDeviceType);
                if (result == null) result = caseDeviceType(computationDeviceType);
                if (result == null) result = caseAbstractDeviceType(computationDeviceType);
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
                if (result == null) result = casePropertyAttribute(interfaceNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(interfaceNetworkProperty);
                if (result == null) result = caseAbstractProperty(interfaceNetworkProperty);
                if (result == null) result = caseAbstractConnectionProperty(interfaceNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ADDRESS_NETWORK_PROPERTY: {
                AddressNetworkProperty addressNetworkProperty = (AddressNetworkProperty)theEObject;
                T result = caseAddressNetworkProperty(addressNetworkProperty);
                if (result == null) result = casePropertyAttribute(addressNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(addressNetworkProperty);
                if (result == null) result = caseAbstractProperty(addressNetworkProperty);
                if (result == null) result = caseAbstractConnectionProperty(addressNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.MAC_ADDRESS_NETWORK_PROPERTY: {
                MacAddressNetworkProperty macAddressNetworkProperty = (MacAddressNetworkProperty)theEObject;
                T result = caseMacAddressNetworkProperty(macAddressNetworkProperty);
                if (result == null) result = casePropertyAttribute(macAddressNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(macAddressNetworkProperty);
                if (result == null) result = caseAbstractProperty(macAddressNetworkProperty);
                if (result == null) result = caseAbstractConnectionProperty(macAddressNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.PORT_NETWORK_PROPERTY: {
                PortNetworkProperty portNetworkProperty = (PortNetworkProperty)theEObject;
                T result = casePortNetworkProperty(portNetworkProperty);
                if (result == null) result = casePropertyAttribute(portNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(portNetworkProperty);
                if (result == null) result = caseAbstractProperty(portNetworkProperty);
                if (result == null) result = caseAbstractConnectionProperty(portNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.IDENTITY_NAME_NETWORK_PROPERTY: {
                IdentityNameNetworkProperty identityNameNetworkProperty = (IdentityNameNetworkProperty)theEObject;
                T result = caseIdentityNameNetworkProperty(identityNameNetworkProperty);
                if (result == null) result = casePropertyAttribute(identityNameNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(identityNameNetworkProperty);
                if (result == null) result = caseAbstractProperty(identityNameNetworkProperty);
                if (result == null) result = caseAbstractConnectionProperty(identityNameNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.GATEWAY_NETWORK_PROPERTY: {
                GatewayNetworkProperty gatewayNetworkProperty = (GatewayNetworkProperty)theEObject;
                T result = caseGatewayNetworkProperty(gatewayNetworkProperty);
                if (result == null) result = casePropertyAttribute(gatewayNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(gatewayNetworkProperty);
                if (result == null) result = caseAbstractProperty(gatewayNetworkProperty);
                if (result == null) result = caseAbstractConnectionProperty(gatewayNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.SUBNET_MASK_NETWORK_PROPERTY: {
                SubnetMaskNetworkProperty subnetMaskNetworkProperty = (SubnetMaskNetworkProperty)theEObject;
                T result = caseSubnetMaskNetworkProperty(subnetMaskNetworkProperty);
                if (result == null) result = casePropertyAttribute(subnetMaskNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(subnetMaskNetworkProperty);
                if (result == null) result = caseAbstractProperty(subnetMaskNetworkProperty);
                if (result == null) result = caseAbstractConnectionProperty(subnetMaskNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.DNS_SERVER_NETWORK_PROPERTY: {
                DNSServerNetworkProperty dnsServerNetworkProperty = (DNSServerNetworkProperty)theEObject;
                T result = caseDNSServerNetworkProperty(dnsServerNetworkProperty);
                if (result == null) result = casePropertySelection(dnsServerNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(dnsServerNetworkProperty);
                if (result == null) result = caseAbstractProperty(dnsServerNetworkProperty);
                if (result == null) result = caseAbstractConnectionProperty(dnsServerNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.USB_CONNECTION: {
                UsbConnection usbConnection = (UsbConnection)theEObject;
                T result = caseUsbConnection(usbConnection);
                if (result == null) result = caseAbstractCommunicationConnection(usbConnection);
                if (result == null) result = caseAbstractResource(usbConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.DEVICE_VOLUME_USB_PROPERTY: {
                DeviceVolumeUsbProperty deviceVolumeUsbProperty = (DeviceVolumeUsbProperty)theEObject;
                T result = caseDeviceVolumeUsbProperty(deviceVolumeUsbProperty);
                if (result == null) result = casePropertySelection(deviceVolumeUsbProperty);
                if (result == null) result = caseAbstractUsbProperty(deviceVolumeUsbProperty);
                if (result == null) result = caseAbstractProperty(deviceVolumeUsbProperty);
                if (result == null) result = caseAbstractConnectionProperty(deviceVolumeUsbProperty);
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
            case DevicePackage.NAME_OPERATING_SYSTEM_PROPERTY: {
                NameOperatingSystemProperty nameOperatingSystemProperty = (NameOperatingSystemProperty)theEObject;
                T result = caseNameOperatingSystemProperty(nameOperatingSystemProperty);
                if (result == null) result = casePropertyAttribute(nameOperatingSystemProperty);
                if (result == null) result = caseAbstractProperty(nameOperatingSystemProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.PROCESSOR_RESOUCE: {
                ProcessorResouce processorResouce = (ProcessorResouce)theEObject;
                T result = caseProcessorResouce(processorResouce);
                if (result == null) result = caseAbstractComputationResource(processorResouce);
                if (result == null) result = caseAbstractResource(processorResouce);
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
                if (result == null) result = caseAbstractConnectionProperty(abstractNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_USB_PROPERTY: {
                AbstractUsbProperty abstractUsbProperty = (AbstractUsbProperty)theEObject;
                T result = caseAbstractUsbProperty(abstractUsbProperty);
                if (result == null) result = caseAbstractConnectionProperty(abstractUsbProperty);
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
            case DevicePackage.ABSTRAC_PROCESSOR_PROPERTY: {
                AbstracProcessorProperty abstracProcessorProperty = (AbstracProcessorProperty)theEObject;
                T result = caseAbstracProcessorProperty(abstracProcessorProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_DEVICE_TYPE: {
                AbstractDeviceType abstractDeviceType = (AbstractDeviceType)theEObject;
                T result = caseAbstractDeviceType(abstractDeviceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_CONNECTION_PROPERTY: {
                AbstractConnectionProperty abstractConnectionProperty = (AbstractConnectionProperty)theEObject;
                T result = caseAbstractConnectionProperty(abstractConnectionProperty);
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
     * Returns the result of interpreting the object as an instance of '<em>Mac Address Network Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mac Address Network Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMacAddressNetworkProperty(MacAddressNetworkProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Port Network Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Port Network Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePortNetworkProperty(PortNetworkProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Name Network Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Name Network Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityNameNetworkProperty(IdentityNameNetworkProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gateway Network Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gateway Network Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGatewayNetworkProperty(GatewayNetworkProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subnet Mask Network Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subnet Mask Network Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubnetMaskNetworkProperty(SubnetMaskNetworkProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DNS Server Network Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DNS Server Network Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDNSServerNetworkProperty(DNSServerNetworkProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Usb Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Usb Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUsbConnection(UsbConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Volume Usb Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Volume Usb Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeviceVolumeUsbProperty(DeviceVolumeUsbProperty object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Abstract Usb Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Usb Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractUsbProperty(AbstractUsbProperty object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Abstract Device Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Device Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDeviceType(AbstractDeviceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Connection Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Connection Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractConnectionProperty(AbstractConnectionProperty object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Property Selection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Selection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertySelection(PropertySelection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Computation Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Computation Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractComputationResource(AbstractComputationResource object) {
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
