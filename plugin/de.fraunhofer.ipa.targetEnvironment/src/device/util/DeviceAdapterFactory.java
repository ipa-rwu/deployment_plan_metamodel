/**
 */
package device.util;

import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.AbstractResouceType;
import de.fraunhofer.ipa.deployment.util.Description;
import de.fraunhofer.ipa.deployment.util.Property;
import de.fraunhofer.ipa.deployment.util.PropertyAttribute;

import device.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see device.DevicePackage
 * @generated
 */
public class DeviceAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DevicePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DevicePackage.eINSTANCE;
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
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeviceSwitch<Adapter> modelSwitch =
        new DeviceSwitch<Adapter>() {
            @Override
            public Adapter caseDeviceSet(DeviceSet object) {
                return createDeviceSetAdapter();
            }
            @Override
            public Adapter caseDeviceType(DeviceType object) {
                return createDeviceTypeAdapter();
            }
            @Override
            public Adapter caseDeviceProperty(DeviceProperty object) {
                return createDevicePropertyAdapter();
            }
            @Override
            public Adapter caseCommunicationConnection(CommunicationConnection object) {
                return createCommunicationConnectionAdapter();
            }
            @Override
            public Adapter caseCapabilityKind(CapabilityKind object) {
                return createCapabilityKindAdapter();
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
            public Adapter caseConnectionProperty(ConnectionProperty object) {
                return createConnectionPropertyAdapter();
            }
            @Override
            public Adapter caseCapabilityType(CapabilityType object) {
                return createCapabilityTypeAdapter();
            }
            @Override
            public Adapter caseComputationDeviceType(ComputationDeviceType object) {
                return createComputationDeviceTypeAdapter();
            }
            @Override
            public Adapter caseAbstractCommunicationConnection(AbstractCommunicationConnection object) {
                return createAbstractCommunicationConnectionAdapter();
            }
            @Override
            public Adapter caseNetworkConnection(NetworkConnection object) {
                return createNetworkConnectionAdapter();
            }
            @Override
            public Adapter caseAbstractNetworkProperty(AbstractNetworkProperty object) {
                return createAbstractNetworkPropertyAdapter();
            }
            @Override
            public Adapter caseInterfaceNetworkProperty(InterfaceNetworkProperty object) {
                return createInterfaceNetworkPropertyAdapter();
            }
            @Override
            public Adapter caseAddressNetworkProperty(AddressNetworkProperty object) {
                return createAddressNetworkPropertyAdapter();
            }
            @Override
            public Adapter caseMacNetworkProperty(MacNetworkProperty object) {
                return createMacNetworkPropertyAdapter();
            }
            @Override
            public Adapter caseAbstractDeviceConfig(AbstractDeviceConfig object) {
                return createAbstractDeviceConfigAdapter();
            }
            @Override
            public Adapter caseDeviceTypeRef(DeviceTypeRef object) {
                return createDeviceTypeRefAdapter();
            }
            @Override
            public Adapter caseAbstractDeviceType(AbstractDeviceType object) {
                return createAbstractDeviceTypeAdapter();
            }
            @Override
            public Adapter caseDescription(Description object) {
                return createDescriptionAdapter();
            }
            @Override
            public Adapter caseAbstractProperty(AbstractProperty object) {
                return createAbstractPropertyAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter casePropertyAttribute(PropertyAttribute object) {
                return createPropertyAttributeAdapter();
            }
            @Override
            public Adapter caseAbstractResouceType(AbstractResouceType object) {
                return createAbstractResouceTypeAdapter();
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
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link device.DeviceSet <em>Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.DeviceSet
     * @generated
     */
    public Adapter createDeviceSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.DeviceType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.DeviceType
     * @generated
     */
    public Adapter createDeviceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.DeviceProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.DeviceProperty
     * @generated
     */
    public Adapter createDevicePropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.CommunicationConnection <em>Communication Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.CommunicationConnection
     * @generated
     */
    public Adapter createCommunicationConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.CapabilityKind <em>Capability Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.CapabilityKind
     * @generated
     */
    public Adapter createCapabilityKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.AttributeKind <em>Attribute Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.AttributeKind
     * @generated
     */
    public Adapter createAttributeKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.MaximumKind <em>Maximum Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.MaximumKind
     * @generated
     */
    public Adapter createMaximumKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.MinimumKind <em>Minimum Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.MinimumKind
     * @generated
     */
    public Adapter createMinimumKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.SelectionKind <em>Selection Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.SelectionKind
     * @generated
     */
    public Adapter createSelectionKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.RangeKind <em>Range Kind</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.RangeKind
     * @generated
     */
    public Adapter createRangeKindAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.ConnectionProperty <em>Connection Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.ConnectionProperty
     * @generated
     */
    public Adapter createConnectionPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.CapabilityType <em>Capability Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.CapabilityType
     * @generated
     */
    public Adapter createCapabilityTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.ComputationDeviceType <em>Computation Device Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.ComputationDeviceType
     * @generated
     */
    public Adapter createComputationDeviceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.AbstractCommunicationConnection <em>Abstract Communication Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.AbstractCommunicationConnection
     * @generated
     */
    public Adapter createAbstractCommunicationConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.NetworkConnection <em>Network Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.NetworkConnection
     * @generated
     */
    public Adapter createNetworkConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.AbstractNetworkProperty <em>Abstract Network Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.AbstractNetworkProperty
     * @generated
     */
    public Adapter createAbstractNetworkPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.InterfaceNetworkProperty <em>Interface Network Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.InterfaceNetworkProperty
     * @generated
     */
    public Adapter createInterfaceNetworkPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.AddressNetworkProperty <em>Address Network Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.AddressNetworkProperty
     * @generated
     */
    public Adapter createAddressNetworkPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.AbstractDeviceConfig <em>Abstract Device Config</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.AbstractDeviceConfig
     * @generated
     */
    public Adapter createAbstractDeviceConfigAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.DeviceTypeRef <em>Type Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.DeviceTypeRef
     * @generated
     */
    public Adapter createDeviceTypeRefAdapter() {
        return null;
    }

                /**
     * Creates a new adapter for an object of class '{@link device.AbstractDeviceType <em>Abstract Device Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.AbstractDeviceType
     * @generated
     */
    public Adapter createAbstractDeviceTypeAdapter() {
        return null;
    }

                /**
     * Creates a new adapter for an object of class '{@link device.MacNetworkProperty <em>Mac Network Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.MacNetworkProperty
     * @generated
     */
    public Adapter createMacNetworkPropertyAdapter() {
        return null;
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

} //DeviceAdapterFactory
