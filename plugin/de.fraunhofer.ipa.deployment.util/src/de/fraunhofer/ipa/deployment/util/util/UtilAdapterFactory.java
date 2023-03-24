/**
 */
package de.fraunhofer.ipa.deployment.util.util;

import de.fraunhofer.ipa.deployment.util.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage
 * @generated
 */
public class UtilAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UtilPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UtilAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = UtilPackage.eINSTANCE;
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
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UtilSwitch<Adapter> modelSwitch = new UtilSwitch<Adapter>() {
        @Override
        public Adapter caseDescription(Description object) {
            return createDescriptionAdapter();
        }

        @Override
        public Adapter casePropertyValue(PropertyValue object) {
            return createPropertyValueAdapter();
        }

        @Override
        public Adapter casePropertyValueInt(PropertyValueInt object) {
            return createPropertyValueIntAdapter();
        }

        @Override
        public Adapter casePropertyValueDouble(PropertyValueDouble object) {
            return createPropertyValueDoubleAdapter();
        }

        @Override
        public Adapter casePropertyValueString(PropertyValueString object) {
            return createPropertyValueStringAdapter();
        }

        @Override
        public Adapter casePropertyType(PropertyType object) {
            return createPropertyTypeAdapter();
        }

        @Override
        public Adapter caseAbstractProperty(AbstractProperty object) {
            return createAbstractPropertyAdapter();
        }

        @Override
        public Adapter caseAbstractResouceType(AbstractResouceType object) {
            return createAbstractResouceTypeAdapter();
        }

        @Override
        public Adapter caseProcessorArchitecture(ProcessorArchitecture object) {
            return createProcessorArchitectureAdapter();
        }

        @Override
        public Adapter caseAbstractCommunicationType(AbstractCommunicationType object) {
            return createAbstractCommunicationTypeAdapter();
        }

        @Override
        public Adapter caseCommunicationType(CommunicationType object) {
            return createCommunicationTypeAdapter();
        }

        @Override
        public Adapter caseNetworkCommunicationType(NetworkCommunicationType object) {
            return createNetworkCommunicationTypeAdapter();
        }

        @Override
        public Adapter caseEthernetCommunicationType(EthernetCommunicationType object) {
            return createEthernetCommunicationTypeAdapter();
        }

        @Override
        public Adapter caseWlanCommunicationType(WlanCommunicationType object) {
            return createWlanCommunicationTypeAdapter();
        }

        @Override
        public Adapter caseAvailableResouce(AvailableResouce object) {
            return createAvailableResouceAdapter();
        }

        @Override
        public Adapter caseOpertingSystemType(OpertingSystemType object) {
            return createOpertingSystemTypeAdapter();
        }

        @Override
        public Adapter caseLinuxOpertingSystemType(LinuxOpertingSystemType object) {
            return createLinuxOpertingSystemTypeAdapter();
        }

        @Override
        public Adapter caseMacOSOpertingSystemType(MacOSOpertingSystemType object) {
            return createMacOSOpertingSystemTypeAdapter();
        }

        @Override
        public Adapter caseProcessorArchitectureType(ProcessorArchitectureType object) {
            return createProcessorArchitectureTypeAdapter();
        }

        @Override
        public Adapter caseProcessorArchitectureValue(ProcessorArchitectureValue object) {
            return createProcessorArchitectureValueAdapter();
        }

        @Override
        public Adapter caseX86ProcessorArchitecture(X86ProcessorArchitecture object) {
            return createX86ProcessorArchitectureAdapter();
        }

        @Override
        public Adapter caseArm64ProcessorArchitecture(Arm64ProcessorArchitecture object) {
            return createArm64ProcessorArchitectureAdapter();
        }

        @Override
        public Adapter caseAbstractImplementation(AbstractImplementation object) {
            return createAbstractImplementationAdapter();
        }

        @Override
        public Adapter caseAbstractComputationAssignmentTarget(AbstractComputationAssignmentTarget object) {
            return createAbstractComputationAssignmentTargetAdapter();
        }

        @Override
        public Adapter casePropertyKind(PropertyKind object) {
            return createPropertyKindAdapter();
        }

        @Override
        public Adapter caseAttributeKind(AttributeKind object) {
            return createAttributeKindAdapter();
        }

        @Override
        public Adapter caseMaximumKind(MaximumKind object) {
            return createMaximumKindAdapter();
        }

        @Override
        public Adapter caseMinimumKind(MinimumKind object) {
            return createMinimumKindAdapter();
        }

        @Override
        public Adapter caseSelectionKind(SelectionKind object) {
            return createSelectionKindAdapter();
        }

        @Override
        public Adapter caseRangeKind(RangeKind object) {
            return createRangeKindAdapter();
        }

        @Override
        public Adapter casePropertyAttribute(PropertyAttribute object) {
            return createPropertyAttributeAdapter();
        }

        @Override
        public Adapter casePropertyMaximun(PropertyMaximun object) {
            return createPropertyMaximunAdapter();
        }

        @Override
        public Adapter casePropertyMinimum(PropertyMinimum object) {
            return createPropertyMinimumAdapter();
        }

        @Override
        public Adapter casePropertySelection(PropertySelection object) {
            return createPropertySelectionAdapter();
        }

        @Override
        public Adapter casePropertyRange(PropertyRange object) {
            return createPropertyRangeAdapter();
        }

        @Override
        public Adapter caseProperty(Property object) {
            return createPropertyAdapter();
        }

        @Override
        public Adapter caseResourceType(ResourceType object) {
            return createResourceTypeAdapter();
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
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.Description <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.Description
     * @generated
     */
    public Adapter createDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertyValue <em>Property Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValue
     * @generated
     */
    public Adapter createPropertyValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertyValueInt <em>Property Value Int</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValueInt
     * @generated
     */
    public Adapter createPropertyValueIntAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertyValueDouble <em>Property Value Double</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValueDouble
     * @generated
     */
    public Adapter createPropertyValueDoubleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertyValueString <em>Property Value String</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertyValueString
     * @generated
     */
    public Adapter createPropertyValueStringAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertyType <em>Property Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertyType
     * @generated
     */
    public Adapter createPropertyTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AbstractProperty <em>Abstract Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AbstractProperty
     * @generated
     */
    public Adapter createAbstractPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AbstractResouceType <em>Abstract Resouce Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AbstractResouceType
     * @generated
     */
    public Adapter createAbstractResouceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.ProcessorArchitecture <em>Processor Architecture</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.ProcessorArchitecture
     * @generated
     */
    public Adapter createProcessorArchitectureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AbstractCommunicationType <em>Abstract Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AbstractCommunicationType
     * @generated
     */
    public Adapter createAbstractCommunicationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.CommunicationType <em>Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.CommunicationType
     * @generated
     */
    public Adapter createCommunicationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.NetworkCommunicationType <em>Network Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.NetworkCommunicationType
     * @generated
     */
    public Adapter createNetworkCommunicationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.EthernetCommunicationType <em>Ethernet Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.EthernetCommunicationType
     * @generated
     */
    public Adapter createEthernetCommunicationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.WlanCommunicationType <em>Wlan Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.WlanCommunicationType
     * @generated
     */
    public Adapter createWlanCommunicationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AvailableResouce <em>Available Resouce</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AvailableResouce
     * @generated
     */
    public Adapter createAvailableResouceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.OpertingSystemType <em>Operting System Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.OpertingSystemType
     * @generated
     */
    public Adapter createOpertingSystemTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.LinuxOpertingSystemType <em>Linux Operting System Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.LinuxOpertingSystemType
     * @generated
     */
    public Adapter createLinuxOpertingSystemTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.MacOSOpertingSystemType <em>Mac OS Operting System Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.MacOSOpertingSystemType
     * @generated
     */
    public Adapter createMacOSOpertingSystemTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType <em>Processor Architecture Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType
     * @generated
     */
    public Adapter createProcessorArchitectureTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue <em>Processor Architecture Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue
     * @generated
     */
    public Adapter createProcessorArchitectureValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.X86ProcessorArchitecture <em>X86 Processor Architecture</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.X86ProcessorArchitecture
     * @generated
     */
    public Adapter createX86ProcessorArchitectureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.Arm64ProcessorArchitecture <em>Arm64 Processor Architecture</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.Arm64ProcessorArchitecture
     * @generated
     */
    public Adapter createArm64ProcessorArchitectureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AbstractImplementation <em>Abstract Implementation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AbstractImplementation
     * @generated
     */
    public Adapter createAbstractImplementationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget <em>Abstract Computation Assignment Target</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget
     * @generated
     */
    public Adapter createAbstractComputationAssignmentTargetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertyKind <em>Property Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertyKind
     * @generated
     */
    public Adapter createPropertyKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AttributeKind <em>Attribute Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AttributeKind
     * @generated
     */
    public Adapter createAttributeKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.MaximumKind <em>Maximum Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.MaximumKind
     * @generated
     */
    public Adapter createMaximumKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.MinimumKind <em>Minimum Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.MinimumKind
     * @generated
     */
    public Adapter createMinimumKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.SelectionKind <em>Selection Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.SelectionKind
     * @generated
     */
    public Adapter createSelectionKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.RangeKind <em>Range Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.RangeKind
     * @generated
     */
    public Adapter createRangeKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertyAttribute <em>Property Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertyAttribute
     * @generated
     */
    public Adapter createPropertyAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertyMaximun <em>Property Maximun</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertyMaximun
     * @generated
     */
    public Adapter createPropertyMaximunAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertyMinimum <em>Property Minimum</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertyMinimum
     * @generated
     */
    public Adapter createPropertyMinimumAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertySelection <em>Property Selection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertySelection
     * @generated
     */
    public Adapter createPropertySelectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.PropertyRange <em>Property Range</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.PropertyRange
     * @generated
     */
    public Adapter createPropertyRangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.ResourceType <em>Resource Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.ResourceType
     * @generated
     */
    public Adapter createResourceTypeAdapter() {
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

} //UtilAdapterFactory
