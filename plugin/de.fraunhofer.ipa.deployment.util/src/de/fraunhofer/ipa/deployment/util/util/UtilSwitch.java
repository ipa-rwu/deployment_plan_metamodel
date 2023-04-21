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
        case UtilPackage.ABSTRACT_COMMUNICATION_TYPE: {
            AbstractCommunicationType abstractCommunicationType = (AbstractCommunicationType) theEObject;
            T result = caseAbstractCommunicationType(abstractCommunicationType);
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
        case UtilPackage.ABSTRACT_RESOURCE: {
            AbstractResource abstractResource = (AbstractResource) theEObject;
            T result = caseAbstractResource(abstractResource);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.ABSTRACT_RUNTIME_ENVIROMENT: {
            AbstractRuntimeEnviroment abstractRuntimeEnviroment = (AbstractRuntimeEnviroment) theEObject;
            T result = caseAbstractRuntimeEnviroment(abstractRuntimeEnviroment);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.OPERTING_SYSTEM_RESOUCE_TYPE: {
            OpertingSystemResouceType opertingSystemResouceType = (OpertingSystemResouceType) theEObject;
            T result = caseOpertingSystemResouceType(opertingSystemResouceType);
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
        case UtilPackage.DESCRIPTION: {
            Description description = (Description) theEObject;
            T result = caseDescription(description);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.RESOURCE: {
            Resource resource = (Resource) theEObject;
            T result = caseResource(resource);
            if (result == null)
                result = caseAbstractResource(resource);
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
        case UtilPackage.LINUX_OPERTING_SYSTEM: {
            LinuxOpertingSystem linuxOpertingSystem = (LinuxOpertingSystem) theEObject;
            T result = caseLinuxOpertingSystem(linuxOpertingSystem);
            if (result == null)
                result = caseOpertingSystemResouceType(linuxOpertingSystem);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.MAC_OS_OPERTING_SYSTEM: {
            MacOSOpertingSystem macOSOpertingSystem = (MacOSOpertingSystem) theEObject;
            T result = caseMacOSOpertingSystem(macOSOpertingSystem);
            if (result == null)
                result = caseOpertingSystemResouceType(macOSOpertingSystem);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.PROCESSOR_RESOUCE_TYPE: {
            ProcessorResouceType processorResouceType = (ProcessorResouceType) theEObject;
            T result = caseProcessorResouceType(processorResouceType);
            if (result == null)
                result = caseAbstractResouceType(processorResouceType);
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
        case UtilPackage.PROCESSOR_ARCHITECTURE_VALUE: {
            ProcessorArchitectureValue processorArchitectureValue = (ProcessorArchitectureValue) theEObject;
            T result = caseProcessorArchitectureValue(processorArchitectureValue);
            if (result == null)
                result = casePropertyValue(processorArchitectureValue);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.LINUX_DISTRIBUTION_VALUE: {
            LinuxDistributionValue linuxDistributionValue = (LinuxDistributionValue) theEObject;
            T result = caseLinuxDistributionValue(linuxDistributionValue);
            if (result == null)
                result = casePropertyValue(linuxDistributionValue);
            if (result == null)
                result = caseOpertingSystemName(linuxDistributionValue);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.UBUNTU_VERSION_VALUE: {
            UbuntuVersionValue ubuntuVersionValue = (UbuntuVersionValue) theEObject;
            T result = caseUbuntuVersionValue(ubuntuVersionValue);
            if (result == null)
                result = casePropertyValue(ubuntuVersionValue);
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
        case UtilPackage.CONTAINER_RUNTIME: {
            ContainerRuntime containerRuntime = (ContainerRuntime) theEObject;
            T result = caseContainerRuntime(containerRuntime);
            if (result == null)
                result = caseAbstractRuntimeEnviroment(containerRuntime);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case UtilPackage.OPERTING_SYSTEM_NAME: {
            OpertingSystemName opertingSystemName = (OpertingSystemName) theEObject;
            T result = caseOpertingSystemName(opertingSystemName);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Operting System Resouce Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operting System Resouce Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOpertingSystemResouceType(OpertingSystemResouceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linux Operting System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linux Operting System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinuxOpertingSystem(LinuxOpertingSystem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mac OS Operting System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mac OS Operting System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMacOSOpertingSystem(MacOSOpertingSystem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Processor Resouce Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Resouce Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessorResouceType(ProcessorResouceType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Container Runtime</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Container Runtime</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContainerRuntime(ContainerRuntime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operting System Name</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operting System Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOpertingSystemName(OpertingSystemName object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linux Distribution Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linux Distribution Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinuxDistributionValue(LinuxDistributionValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ubuntu Version Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ubuntu Version Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUbuntuVersionValue(UbuntuVersionValue object) {
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
