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
            public Adapter caseDeviceResource(DeviceResource object) {
                return createDeviceResourceAdapter();
            }
            @Override
            public Adapter caseCommunicationConnection(CommunicationConnection object) {
                return createCommunicationConnectionAdapter();
            }
            @Override
            public Adapter caseConnectionProperty(ConnectionProperty object) {
                return createConnectionPropertyAdapter();
            }
            @Override
            public Adapter caseComputationDeviceType(ComputationDeviceType object) {
                return createComputationDeviceTypeAdapter();
            }
            @Override
            public Adapter caseNetworkConnection(NetworkConnection object) {
                return createNetworkConnectionAdapter();
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
            public Adapter caseMacAddressNetworkProperty(MacAddressNetworkProperty object) {
                return createMacAddressNetworkPropertyAdapter();
            }
            @Override
            public Adapter casePortNetworkProperty(PortNetworkProperty object) {
                return createPortNetworkPropertyAdapter();
            }
            @Override
            public Adapter caseIdentityNameNetworkProperty(IdentityNameNetworkProperty object) {
                return createIdentityNameNetworkPropertyAdapter();
            }
            @Override
            public Adapter caseGatewayNetworkProperty(GatewayNetworkProperty object) {
                return createGatewayNetworkPropertyAdapter();
            }
            @Override
            public Adapter caseSubnetMaskNetworkProperty(SubnetMaskNetworkProperty object) {
                return createSubnetMaskNetworkPropertyAdapter();
            }
            @Override
            public Adapter caseDNSServerNetworkProperty(DNSServerNetworkProperty object) {
                return createDNSServerNetworkPropertyAdapter();
            }
            @Override
            public Adapter caseUsbConnection(UsbConnection object) {
                return createUsbConnectionAdapter();
            }
            @Override
            public Adapter caseDeviceVolumeUsbProperty(DeviceVolumeUsbProperty object) {
                return createDeviceVolumeUsbPropertyAdapter();
            }
            @Override
            public Adapter caseContainer(Container object) {
                return createContainerAdapter();
            }
            @Override
            public Adapter caseNameOperatingSystemProperty(NameOperatingSystemProperty object) {
                return createNameOperatingSystemPropertyAdapter();
            }
            @Override
            public Adapter caseProcessorResouce(ProcessorResouce object) {
                return createProcessorResouceAdapter();
            }
            @Override
            public Adapter caseArchitectureProcessorProperty(ArchitectureProcessorProperty object) {
                return createArchitectureProcessorPropertyAdapter();
            }
            @Override
            public Adapter caseCoreProcessorProperty(CoreProcessorProperty object) {
                return createCoreProcessorPropertyAdapter();
            }
            @Override
            public Adapter caseAbstractNetworkProperty(AbstractNetworkProperty object) {
                return createAbstractNetworkPropertyAdapter();
            }
            @Override
            public Adapter caseAbstractUsbProperty(AbstractUsbProperty object) {
                return createAbstractUsbPropertyAdapter();
            }
            @Override
            public Adapter caseAbstractCommunicationConnection(AbstractCommunicationConnection object) {
                return createAbstractCommunicationConnectionAdapter();
            }
            @Override
            public Adapter caseAbstractRuntimeEnviroment(AbstractRuntimeEnviroment object) {
                return createAbstractRuntimeEnviromentAdapter();
            }
            @Override
            public Adapter caseAbstracProcessorProperty(AbstracProcessorProperty object) {
                return createAbstracProcessorPropertyAdapter();
            }
            @Override
            public Adapter caseAbstractDeviceType(AbstractDeviceType object) {
                return createAbstractDeviceTypeAdapter();
            }
            @Override
            public Adapter caseAbstractConnectionProperty(AbstractConnectionProperty object) {
                return createAbstractConnectionPropertyAdapter();
            }
            @Override
            public Adapter caseDescription(Description object) {
                return createDescriptionAdapter();
            }
            @Override
            public Adapter caseAbstractResource(AbstractResource object) {
                return createAbstractResourceAdapter();
            }
            @Override
            public Adapter caseResource(Resource object) {
                return createResourceAdapter();
            }
            @Override
            public Adapter caseAbstractProperty(AbstractProperty object) {
                return createAbstractPropertyAdapter();
            }
            @Override
            public Adapter casePropertyAttribute(PropertyAttribute object) {
                return createPropertyAttributeAdapter();
            }
            @Override
            public Adapter casePropertySelection(PropertySelection object) {
                return createPropertySelectionAdapter();
            }
            @Override
            public Adapter caseAbstractComputationResource(AbstractComputationResource object) {
                return createAbstractComputationResourceAdapter();
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
     * Creates a new adapter for an object of class '{@link device.DeviceResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.DeviceResource
     * @generated
     */
    public Adapter createDeviceResourceAdapter() {
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
     * Creates a new adapter for an object of class '{@link device.MacAddressNetworkProperty <em>Mac Address Network Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.MacAddressNetworkProperty
     * @generated
     */
    public Adapter createMacAddressNetworkPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.PortNetworkProperty <em>Port Network Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.PortNetworkProperty
     * @generated
     */
    public Adapter createPortNetworkPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.IdentityNameNetworkProperty <em>Identity Name Network Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.IdentityNameNetworkProperty
     * @generated
     */
    public Adapter createIdentityNameNetworkPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.GatewayNetworkProperty <em>Gateway Network Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.GatewayNetworkProperty
     * @generated
     */
    public Adapter createGatewayNetworkPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.SubnetMaskNetworkProperty <em>Subnet Mask Network Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.SubnetMaskNetworkProperty
     * @generated
     */
    public Adapter createSubnetMaskNetworkPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.DNSServerNetworkProperty <em>DNS Server Network Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.DNSServerNetworkProperty
     * @generated
     */
    public Adapter createDNSServerNetworkPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.UsbConnection <em>Usb Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.UsbConnection
     * @generated
     */
    public Adapter createUsbConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.DeviceVolumeUsbProperty <em>Volume Usb Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.DeviceVolumeUsbProperty
     * @generated
     */
    public Adapter createDeviceVolumeUsbPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.Container <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.Container
     * @generated
     */
    public Adapter createContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.NameOperatingSystemProperty <em>Name Operating System Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.NameOperatingSystemProperty
     * @generated
     */
    public Adapter createNameOperatingSystemPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.ProcessorResouce <em>Processor Resouce</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.ProcessorResouce
     * @generated
     */
    public Adapter createProcessorResouceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.ArchitectureProcessorProperty <em>Architecture Processor Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.ArchitectureProcessorProperty
     * @generated
     */
    public Adapter createArchitectureProcessorPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.CoreProcessorProperty <em>Core Processor Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.CoreProcessorProperty
     * @generated
     */
    public Adapter createCoreProcessorPropertyAdapter() {
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
     * Creates a new adapter for an object of class '{@link device.AbstractUsbProperty <em>Abstract Usb Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.AbstractUsbProperty
     * @generated
     */
    public Adapter createAbstractUsbPropertyAdapter() {
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
     * Creates a new adapter for an object of class '{@link device.AbstractRuntimeEnviroment <em>Abstract Runtime Enviroment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.AbstractRuntimeEnviroment
     * @generated
     */
    public Adapter createAbstractRuntimeEnviromentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link device.AbstracProcessorProperty <em>Abstrac Processor Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.AbstracProcessorProperty
     * @generated
     */
    public Adapter createAbstracProcessorPropertyAdapter() {
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
     * Creates a new adapter for an object of class '{@link device.AbstractConnectionProperty <em>Abstract Connection Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see device.AbstractConnectionProperty
     * @generated
     */
    public Adapter createAbstractConnectionPropertyAdapter() {
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
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AbstractResource <em>Abstract Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AbstractResource
     * @generated
     */
    public Adapter createAbstractResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.Resource
     * @generated
     */
    public Adapter createResourceAdapter() {
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
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AbstractComputationResource <em>Abstract Computation Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AbstractComputationResource
     * @generated
     */
    public Adapter createAbstractComputationResourceAdapter() {
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
