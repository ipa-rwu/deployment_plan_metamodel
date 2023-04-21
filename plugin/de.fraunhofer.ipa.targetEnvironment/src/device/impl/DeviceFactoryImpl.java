/**
 */
package device.impl;

import device.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceFactoryImpl extends EFactoryImpl implements DeviceFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DeviceFactory init() {
        try {
            DeviceFactory theDeviceFactory = (DeviceFactory)EPackage.Registry.INSTANCE.getEFactory(DevicePackage.eNS_URI);
            if (theDeviceFactory != null) {
                return theDeviceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DeviceFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case DevicePackage.DEVICE_SET: return createDeviceSet();
            case DevicePackage.DEVICE_TYPE: return createDeviceType();
            case DevicePackage.DEVICE_PROPERTY: return createDeviceProperty();
            case DevicePackage.COMMUNICATION_CONNECTION: return createCommunicationConnection();
            case DevicePackage.ATTRIBUTE_KIND: return createAttributeKind();
            case DevicePackage.MAXIMUM_KIND: return createMaximumKind();
            case DevicePackage.MINIMUM_KIND: return createMinimumKind();
            case DevicePackage.SELECTION_KIND: return createSelectionKind();
            case DevicePackage.RANGE_KIND: return createRangeKind();
            case DevicePackage.CONNECTION_PROPERTY: return createConnectionProperty();
            case DevicePackage.COMPUTATION_DEVICE_TYPE: return createComputationDeviceType();
            case DevicePackage.NETWORK_CONNECTION: return createNetworkConnection();
            case DevicePackage.INTERFACE_NETWORK_PROPERTY: return createInterfaceNetworkProperty();
            case DevicePackage.ADDRESS_NETWORK_PROPERTY: return createAddressNetworkProperty();
            case DevicePackage.MAC_NETWORK_PROPERTY: return createMacNetworkProperty();
            case DevicePackage.DEVICE_TYPE_REF: return createDeviceTypeRef();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceSet createDeviceSet() {
        DeviceSetImpl deviceSet = new DeviceSetImpl();
        return deviceSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceType createDeviceType() {
        DeviceTypeImpl deviceType = new DeviceTypeImpl();
        return deviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceProperty createDeviceProperty() {
        DevicePropertyImpl deviceProperty = new DevicePropertyImpl();
        return deviceProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommunicationConnection createCommunicationConnection() {
        CommunicationConnectionImpl communicationConnection = new CommunicationConnectionImpl();
        return communicationConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeKind createAttributeKind() {
        AttributeKindImpl attributeKind = new AttributeKindImpl();
        return attributeKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaximumKind createMaximumKind() {
        MaximumKindImpl maximumKind = new MaximumKindImpl();
        return maximumKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinimumKind createMinimumKind() {
        MinimumKindImpl minimumKind = new MinimumKindImpl();
        return minimumKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SelectionKind createSelectionKind() {
        SelectionKindImpl selectionKind = new SelectionKindImpl();
        return selectionKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangeKind createRangeKind() {
        RangeKindImpl rangeKind = new RangeKindImpl();
        return rangeKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionProperty createConnectionProperty() {
        ConnectionPropertyImpl connectionProperty = new ConnectionPropertyImpl();
        return connectionProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComputationDeviceType createComputationDeviceType() {
        ComputationDeviceTypeImpl computationDeviceType = new ComputationDeviceTypeImpl();
        return computationDeviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkConnection createNetworkConnection() {
        NetworkConnectionImpl networkConnection = new NetworkConnectionImpl();
        return networkConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterfaceNetworkProperty createInterfaceNetworkProperty() {
        InterfaceNetworkPropertyImpl interfaceNetworkProperty = new InterfaceNetworkPropertyImpl();
        return interfaceNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressNetworkProperty createAddressNetworkProperty() {
        AddressNetworkPropertyImpl addressNetworkProperty = new AddressNetworkPropertyImpl();
        return addressNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MacNetworkProperty createMacNetworkProperty() {
        MacNetworkPropertyImpl macNetworkProperty = new MacNetworkPropertyImpl();
        return macNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceTypeRef createDeviceTypeRef() {
        DeviceTypeRefImpl deviceTypeRef = new DeviceTypeRefImpl();
        return deviceTypeRef;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DevicePackage getDevicePackage() {
        return (DevicePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DevicePackage getPackage() {
        return DevicePackage.eINSTANCE;
    }

} //DeviceFactoryImpl
