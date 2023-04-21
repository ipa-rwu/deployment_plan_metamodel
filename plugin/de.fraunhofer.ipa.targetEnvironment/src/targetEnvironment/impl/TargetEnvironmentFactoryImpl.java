/**
 */
package targetEnvironment.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targetEnvironment.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetEnvironmentFactoryImpl extends EFactoryImpl implements TargetEnvironmentFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TargetEnvironmentFactory init() {
        try {
            TargetEnvironmentFactory theTargetEnvironmentFactory = (TargetEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(TargetEnvironmentPackage.eNS_URI);
            if (theTargetEnvironmentFactory != null) {
                return theTargetEnvironmentFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TargetEnvironmentFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetEnvironmentFactoryImpl() {
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
            case TargetEnvironmentPackage.TARGET_ENVIRONMENT: return createTargetEnvironment();
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT: return createTargetDeployEnviroment();
            case TargetEnvironmentPackage.CONFIG_CONNECTION: return createConfigConnection();
            case TargetEnvironmentPackage.CONNECTED_DEVICE: return createConnectedDevice();
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY: return createConfigConnectionProperty();
            case TargetEnvironmentPackage.COMPUTATION_DEVICE_INSTANCE: return createComputationDeviceInstance();
            case TargetEnvironmentPackage.DEVICE_INSTANCE: return createDeviceInstance();
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY: return createConfigDeviceProperty();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetEnvironment createTargetEnvironment() {
        TargetEnvironmentImpl targetEnvironment = new TargetEnvironmentImpl();
        return targetEnvironment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetDeployEnviroment createTargetDeployEnviroment() {
        TargetDeployEnviromentImpl targetDeployEnviroment = new TargetDeployEnviromentImpl();
        return targetDeployEnviroment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigConnection createConfigConnection() {
        ConfigConnectionImpl configConnection = new ConfigConnectionImpl();
        return configConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectedDevice createConnectedDevice() {
        ConnectedDeviceImpl connectedDevice = new ConnectedDeviceImpl();
        return connectedDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigConnectionProperty createConfigConnectionProperty() {
        ConfigConnectionPropertyImpl configConnectionProperty = new ConfigConnectionPropertyImpl();
        return configConnectionProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComputationDeviceInstance createComputationDeviceInstance() {
        ComputationDeviceInstanceImpl computationDeviceInstance = new ComputationDeviceInstanceImpl();
        return computationDeviceInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceInstance createDeviceInstance() {
        DeviceInstanceImpl deviceInstance = new DeviceInstanceImpl();
        return deviceInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigDeviceProperty createConfigDeviceProperty() {
        ConfigDevicePropertyImpl configDeviceProperty = new ConfigDevicePropertyImpl();
        return configDeviceProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetEnvironmentPackage getTargetEnvironmentPackage() {
        return (TargetEnvironmentPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TargetEnvironmentPackage getPackage() {
        return TargetEnvironmentPackage.eINSTANCE;
    }

} //TargetEnvironmentFactoryImpl
