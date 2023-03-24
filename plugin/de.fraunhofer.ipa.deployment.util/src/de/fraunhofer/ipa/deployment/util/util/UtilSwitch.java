/**
 */
package de.fraunhofer.ipa.deployment.util.util;

import de.fraunhofer.ipa.deployment.util.*;

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
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage
 * @generated
 */
public class UtilSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UtilPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UtilSwitch() {
        if (modelPackage == null) {
            modelPackage = UtilPackage.eINSTANCE;
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
        case UtilPackage.DESCRIPTION: {
            Description description = (Description) theEObject;
            T result = caseDescription(description);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_VALUE: {
            PropertyValue propertyValue = (PropertyValue) theEObject;
            T result = casePropertyValue(propertyValue);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_VALUE_INT: {
            PropertyValueInt propertyValueInt = (PropertyValueInt) theEObject;
            T result = casePropertyValueInt(propertyValueInt);
            if (result == null)
                result = casePropertyValue(propertyValueInt);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_VALUE_DOUBLE: {
            PropertyValueDouble propertyValueDouble = (PropertyValueDouble) theEObject;
            T result = casePropertyValueDouble(propertyValueDouble);
            if (result == null)
                result = casePropertyValue(propertyValueDouble);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_VALUE_STRING: {
            PropertyValueString propertyValueString = (PropertyValueString) theEObject;
            T result = casePropertyValueString(propertyValueString);
            if (result == null)
                result = casePropertyValue(propertyValueString);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_TYPE: {
            PropertyType propertyType = (PropertyType) theEObject;
            T result = casePropertyType(propertyType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.ABSTRACT_PROPERTY: {
            AbstractProperty abstractProperty = (AbstractProperty) theEObject;
            T result = caseAbstractProperty(abstractProperty);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.ABSTRACT_RESOUCE_TYPE: {
            AbstractResouceType abstractResouceType = (AbstractResouceType) theEObject;
            T result = caseAbstractResouceType(abstractResouceType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROCESSOR_ARCHITECTURE: {
            ProcessorArchitecture processorArchitecture = (ProcessorArchitecture) theEObject;
            T result = caseProcessorArchitecture(processorArchitecture);
            if (result == null)
                result = caseAbstractResouceType(processorArchitecture);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.ABSTRACT_COMMUNICATION_TYPE: {
            AbstractCommunicationType abstractCommunicationType = (AbstractCommunicationType) theEObject;
            T result = caseAbstractCommunicationType(abstractCommunicationType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.COMMUNICATION_TYPE: {
            CommunicationType communicationType = (CommunicationType) theEObject;
            T result = caseCommunicationType(communicationType);
            if (result == null)
                result = caseAbstractCommunicationType(communicationType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.NETWORK_COMMUNICATION_TYPE: {
            NetworkCommunicationType networkCommunicationType = (NetworkCommunicationType) theEObject;
            T result = caseNetworkCommunicationType(networkCommunicationType);
            if (result == null)
                result = caseAbstractCommunicationType(networkCommunicationType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.ETHERNET_COMMUNICATION_TYPE: {
            EthernetCommunicationType ethernetCommunicationType = (EthernetCommunicationType) theEObject;
            T result = caseEthernetCommunicationType(ethernetCommunicationType);
            if (result == null)
                result = caseNetworkCommunicationType(ethernetCommunicationType);
            if (result == null)
                result = caseAbstractCommunicationType(ethernetCommunicationType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.WLAN_COMMUNICATION_TYPE: {
            WlanCommunicationType wlanCommunicationType = (WlanCommunicationType) theEObject;
            T result = caseWlanCommunicationType(wlanCommunicationType);
            if (result == null)
                result = caseNetworkCommunicationType(wlanCommunicationType);
            if (result == null)
                result = caseAbstractCommunicationType(wlanCommunicationType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.AVAILABLE_RESOUCE: {
            AvailableResouce availableResouce = (AvailableResouce) theEObject;
            T result = caseAvailableResouce(availableResouce);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.OPERTING_SYSTEM_TYPE: {
            OpertingSystemType opertingSystemType = (OpertingSystemType) theEObject;
            T result = caseOpertingSystemType(opertingSystemType);
            if (result == null)
                result = caseAbstractResouceType(opertingSystemType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.LINUX_OPERTING_SYSTEM_TYPE: {
            LinuxOpertingSystemType linuxOpertingSystemType = (LinuxOpertingSystemType) theEObject;
            T result = caseLinuxOpertingSystemType(linuxOpertingSystemType);
            if (result == null)
                result = caseOpertingSystemType(linuxOpertingSystemType);
            if (result == null)
                result = caseAbstractResouceType(linuxOpertingSystemType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.MAC_OS_OPERTING_SYSTEM_TYPE: {
            MacOSOpertingSystemType macOSOpertingSystemType = (MacOSOpertingSystemType) theEObject;
            T result = caseMacOSOpertingSystemType(macOSOpertingSystemType);
            if (result == null)
                result = caseOpertingSystemType(macOSOpertingSystemType);
            if (result == null)
                result = caseAbstractResouceType(macOSOpertingSystemType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROCESSOR_ARCHITECTURE_TYPE: {
            ProcessorArchitectureType processorArchitectureType = (ProcessorArchitectureType) theEObject;
            T result = caseProcessorArchitectureType(processorArchitectureType);
            if (result == null)
                result = caseAbstractResouceType(processorArchitectureType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROCESSOR_ARCHITECTURE_VALUE: {
            ProcessorArchitectureValue processorArchitectureValue = (ProcessorArchitectureValue) theEObject;
            T result = caseProcessorArchitectureValue(processorArchitectureValue);
            if (result == null)
                result = casePropertyValue(processorArchitectureValue);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.X86_PROCESSOR_ARCHITECTURE: {
            X86ProcessorArchitecture x86ProcessorArchitecture = (X86ProcessorArchitecture) theEObject;
            T result = caseX86ProcessorArchitecture(x86ProcessorArchitecture);
            if (result == null)
                result = caseProcessorArchitectureValue(x86ProcessorArchitecture);
            if (result == null)
                result = casePropertyValue(x86ProcessorArchitecture);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.ARM64_PROCESSOR_ARCHITECTURE: {
            Arm64ProcessorArchitecture arm64ProcessorArchitecture = (Arm64ProcessorArchitecture) theEObject;
            T result = caseArm64ProcessorArchitecture(arm64ProcessorArchitecture);
            if (result == null)
                result = caseProcessorArchitectureValue(arm64ProcessorArchitecture);
            if (result == null)
                result = casePropertyValue(arm64ProcessorArchitecture);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.ABSTRACT_IMPLEMENTATION: {
            AbstractImplementation abstractImplementation = (AbstractImplementation) theEObject;
            T result = caseAbstractImplementation(abstractImplementation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET: {
            AbstractComputationAssignmentTarget abstractComputationAssignmentTarget = (AbstractComputationAssignmentTarget) theEObject;
            T result = caseAbstractComputationAssignmentTarget(abstractComputationAssignmentTarget);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_KIND: {
            PropertyKind propertyKind = (PropertyKind) theEObject;
            T result = casePropertyKind(propertyKind);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.ATTRIBUTE_KIND: {
            AttributeKind attributeKind = (AttributeKind) theEObject;
            T result = caseAttributeKind(attributeKind);
            if (result == null)
                result = casePropertyKind(attributeKind);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.MAXIMUM_KIND: {
            MaximumKind maximumKind = (MaximumKind) theEObject;
            T result = caseMaximumKind(maximumKind);
            if (result == null)
                result = casePropertyKind(maximumKind);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.MINIMUM_KIND: {
            MinimumKind minimumKind = (MinimumKind) theEObject;
            T result = caseMinimumKind(minimumKind);
            if (result == null)
                result = casePropertyKind(minimumKind);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.SELECTION_KIND: {
            SelectionKind selectionKind = (SelectionKind) theEObject;
            T result = caseSelectionKind(selectionKind);
            if (result == null)
                result = casePropertyKind(selectionKind);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.RANGE_KIND: {
            RangeKind rangeKind = (RangeKind) theEObject;
            T result = caseRangeKind(rangeKind);
            if (result == null)
                result = casePropertyKind(rangeKind);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_ATTRIBUTE: {
            PropertyAttribute propertyAttribute = (PropertyAttribute) theEObject;
            T result = casePropertyAttribute(propertyAttribute);
            if (result == null)
                result = caseAbstractProperty(propertyAttribute);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_MAXIMUN: {
            PropertyMaximun propertyMaximun = (PropertyMaximun) theEObject;
            T result = casePropertyMaximun(propertyMaximun);
            if (result == null)
                result = caseAbstractProperty(propertyMaximun);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_MINIMUM: {
            PropertyMinimum propertyMinimum = (PropertyMinimum) theEObject;
            T result = casePropertyMinimum(propertyMinimum);
            if (result == null)
                result = caseAbstractProperty(propertyMinimum);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_SELECTION: {
            PropertySelection propertySelection = (PropertySelection) theEObject;
            T result = casePropertySelection(propertySelection);
            if (result == null)
                result = caseAbstractProperty(propertySelection);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY_RANGE: {
            PropertyRange propertyRange = (PropertyRange) theEObject;
            T result = casePropertyRange(propertyRange);
            if (result == null)
                result = caseAbstractProperty(propertyRange);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROPERTY: {
            Property property = (Property) theEObject;
            T result = caseProperty(property);
            if (result == null)
                result = caseAbstractProperty(property);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.RESOURCE_TYPE: {
            ResourceType resourceType = (ResourceType) theEObject;
            T result = caseResourceType(resourceType);
            if (result == null)
                result = caseAbstractResouceType(resourceType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyValue(PropertyValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property Value Int</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Value Int</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyValueInt(PropertyValueInt object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property Value Double</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Value Double</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyValueDouble(PropertyValueDouble object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property Value String</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Value String</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyValueString(PropertyValueString object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyType(PropertyType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Processor Architecture</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Architecture</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorArchitecture(ProcessorArchitecture object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Communication Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Communication Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractCommunicationType(AbstractCommunicationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Communication Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Communication Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommunicationType(CommunicationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Network Communication Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Network Communication Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNetworkCommunicationType(NetworkCommunicationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ethernet Communication Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ethernet Communication Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEthernetCommunicationType(EthernetCommunicationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wlan Communication Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wlan Communication Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWlanCommunicationType(WlanCommunicationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Available Resouce</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Available Resouce</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAvailableResouce(AvailableResouce object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operting System Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operting System Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOpertingSystemType(OpertingSystemType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linux Operting System Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linux Operting System Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinuxOpertingSystemType(LinuxOpertingSystemType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mac OS Operting System Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mac OS Operting System Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMacOSOpertingSystemType(MacOSOpertingSystemType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor Architecture Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Architecture Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorArchitectureType(ProcessorArchitectureType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor Architecture Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Architecture Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorArchitectureValue(ProcessorArchitectureValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>X86 Processor Architecture</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>X86 Processor Architecture</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseX86ProcessorArchitecture(X86ProcessorArchitecture object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Arm64 Processor Architecture</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Arm64 Processor Architecture</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArm64ProcessorArchitecture(Arm64ProcessorArchitecture object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Property Kind</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Kind</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyKind(PropertyKind object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Property Maximun</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Maximun</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyMaximun(PropertyMaximun object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property Minimum</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Minimum</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyMinimum(PropertyMinimum object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Property Range</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Range</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertyRange(PropertyRange object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceType(ResourceType object) {
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

} //UtilSwitch
