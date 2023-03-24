/**
 */
package device.util;

import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.AbstractResouceType;
import de.fraunhofer.ipa.deployment.util.Description;
import de.fraunhofer.ipa.deployment.util.Property;
import de.fraunhofer.ipa.deployment.util.PropertyAttribute;

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
            case DevicePackage.DEVICE_PROPERTY: {
                DeviceProperty deviceProperty = (DeviceProperty)theEObject;
                T result = caseDeviceProperty(deviceProperty);
                if (result == null) result = caseProperty(deviceProperty);
                if (result == null) result = caseAbstractProperty(deviceProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.COMMUNICATION_CONNECTION: {
                CommunicationConnection communicationConnection = (CommunicationConnection)theEObject;
                T result = caseCommunicationConnection(communicationConnection);
                if (result == null) result = caseAbstractCommunicationConnection(communicationConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.CAPABILITY_KIND: {
                CapabilityKind capabilityKind = (CapabilityKind)theEObject;
                T result = caseCapabilityKind(capabilityKind);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ATTRIBUTE_KIND: {
                AttributeKind attributeKind = (AttributeKind)theEObject;
                T result = caseAttributeKind(attributeKind);
                if (result == null) result = caseCapabilityKind(attributeKind);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.MAXIMUM_KIND: {
                MaximumKind maximumKind = (MaximumKind)theEObject;
                T result = caseMaximumKind(maximumKind);
                if (result == null) result = caseCapabilityKind(maximumKind);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.MINIMUM_KIND: {
                MinimumKind minimumKind = (MinimumKind)theEObject;
                T result = caseMinimumKind(minimumKind);
                if (result == null) result = caseCapabilityKind(minimumKind);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.SELECTION_KIND: {
                SelectionKind selectionKind = (SelectionKind)theEObject;
                T result = caseSelectionKind(selectionKind);
                if (result == null) result = caseCapabilityKind(selectionKind);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.RANGE_KIND: {
                RangeKind rangeKind = (RangeKind)theEObject;
                T result = caseRangeKind(rangeKind);
                if (result == null) result = caseCapabilityKind(rangeKind);
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
            case DevicePackage.CAPABILITY_TYPE: {
                CapabilityType capabilityType = (CapabilityType)theEObject;
                T result = caseCapabilityType(capabilityType);
                if (result == null) result = caseAbstractResouceType(capabilityType);
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
            case DevicePackage.ABSTRACT_COMMUNICATION_CONNECTION: {
                AbstractCommunicationConnection abstractCommunicationConnection = (AbstractCommunicationConnection)theEObject;
                T result = caseAbstractCommunicationConnection(abstractCommunicationConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.NETWORK_CONNECTION: {
                NetworkConnection networkConnection = (NetworkConnection)theEObject;
                T result = caseNetworkConnection(networkConnection);
                if (result == null) result = caseAbstractCommunicationConnection(networkConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_NETWORK_PROPERTY: {
                AbstractNetworkProperty abstractNetworkProperty = (AbstractNetworkProperty)theEObject;
                T result = caseAbstractNetworkProperty(abstractNetworkProperty);
                if (result == null) result = casePropertyAttribute(abstractNetworkProperty);
                if (result == null) result = caseAbstractDeviceConfig(abstractNetworkProperty);
                if (result == null) result = caseAbstractProperty(abstractNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.INTERFACE_NETWORK_PROPERTY: {
                InterfaceNetworkProperty interfaceNetworkProperty = (InterfaceNetworkProperty)theEObject;
                T result = caseInterfaceNetworkProperty(interfaceNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(interfaceNetworkProperty);
                if (result == null) result = casePropertyAttribute(interfaceNetworkProperty);
                if (result == null) result = caseAbstractDeviceConfig(interfaceNetworkProperty);
                if (result == null) result = caseAbstractProperty(interfaceNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ADDRESS_NETWORK_PROPERTY: {
                AddressNetworkProperty addressNetworkProperty = (AddressNetworkProperty)theEObject;
                T result = caseAddressNetworkProperty(addressNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(addressNetworkProperty);
                if (result == null) result = casePropertyAttribute(addressNetworkProperty);
                if (result == null) result = caseAbstractDeviceConfig(addressNetworkProperty);
                if (result == null) result = caseAbstractProperty(addressNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.MAC_NETWORK_PROPERTY: {
                MacNetworkProperty macNetworkProperty = (MacNetworkProperty)theEObject;
                T result = caseMacNetworkProperty(macNetworkProperty);
                if (result == null) result = caseAbstractNetworkProperty(macNetworkProperty);
                if (result == null) result = casePropertyAttribute(macNetworkProperty);
                if (result == null) result = caseAbstractDeviceConfig(macNetworkProperty);
                if (result == null) result = caseAbstractProperty(macNetworkProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_DEVICE_CONFIG: {
                AbstractDeviceConfig abstractDeviceConfig = (AbstractDeviceConfig)theEObject;
                T result = caseAbstractDeviceConfig(abstractDeviceConfig);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.DEVICE_TYPE_REF: {
                DeviceTypeRef deviceTypeRef = (DeviceTypeRef)theEObject;
                T result = caseDeviceTypeRef(deviceTypeRef);
                if (result == null) result = caseAbstractDeviceType(deviceTypeRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DevicePackage.ABSTRACT_DEVICE_TYPE: {
                AbstractDeviceType abstractDeviceType = (AbstractDeviceType)theEObject;
                T result = caseAbstractDeviceType(abstractDeviceType);
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
    public T caseDeviceProperty(DeviceProperty object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Capability Kind</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capability Kind</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCapabilityKind(CapabilityKind object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Kind</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Kind</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributeKind(AttributeKind object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Maximum Kind</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Maximum Kind</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaximumKind(MaximumKind object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Minimum Kind</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Minimum Kind</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMinimumKind(MinimumKind object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Selection Kind</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Selection Kind</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSelectionKind(SelectionKind object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Range Kind</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Range Kind</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRangeKind(RangeKind object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Capability Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capability Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCapabilityType(CapabilityType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Abstract Device Config</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Device Config</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDeviceConfig(AbstractDeviceConfig object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeviceTypeRef(DeviceTypeRef object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Abstract Resouce Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Resouce Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractResouceType(AbstractResouceType object) {
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
