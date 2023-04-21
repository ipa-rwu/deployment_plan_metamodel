/**
 */
package targetEnvironment.util;

import de.fraunhofer.ipa.deployment.util.Description;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import targetEnvironment.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see targetEnvironment.TargetEnvironmentPackage
 * @generated
 */
public class TargetEnvironmentAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TargetEnvironmentPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetEnvironmentAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TargetEnvironmentPackage.eINSTANCE;
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
    protected TargetEnvironmentSwitch<Adapter> modelSwitch =
        new TargetEnvironmentSwitch<Adapter>() {
            @Override
            public Adapter caseTargetEnvironment(TargetEnvironment object) {
                return createTargetEnvironmentAdapter();
            }
            @Override
            public Adapter caseTargetDeployEnviroment(TargetDeployEnviroment object) {
                return createTargetDeployEnviromentAdapter();
            }
            @Override
            public Adapter caseConfigConnection(ConfigConnection object) {
                return createConfigConnectionAdapter();
            }
            @Override
            public Adapter caseConnectedDevice(ConnectedDevice object) {
                return createConnectedDeviceAdapter();
            }
            @Override
            public Adapter caseConfigConnectionProperty(ConfigConnectionProperty object) {
                return createConfigConnectionPropertyAdapter();
            }
            @Override
            public Adapter caseComputationDeviceInstance(ComputationDeviceInstance object) {
                return createComputationDeviceInstanceAdapter();
            }
            @Override
            public Adapter caseDeviceInstance(DeviceInstance object) {
                return createDeviceInstanceAdapter();
            }
            @Override
            public Adapter caseConfigDeviceProperty(ConfigDeviceProperty object) {
                return createConfigDevicePropertyAdapter();
            }
            @Override
            public Adapter caseAbstractDeviceInstance(AbstractDeviceInstance object) {
                return createAbstractDeviceInstanceAdapter();
            }
            @Override
            public Adapter caseAbstractConfigProperty(AbstractConfigProperty object) {
                return createAbstractConfigPropertyAdapter();
            }
            @Override
            public Adapter caseDescription(Description object) {
                return createDescriptionAdapter();
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
     * Creates a new adapter for an object of class '{@link targetEnvironment.TargetEnvironment <em>Target Environment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see targetEnvironment.TargetEnvironment
     * @generated
     */
    public Adapter createTargetEnvironmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link targetEnvironment.TargetDeployEnviroment <em>Target Deploy Enviroment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see targetEnvironment.TargetDeployEnviroment
     * @generated
     */
    public Adapter createTargetDeployEnviromentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link targetEnvironment.ConfigConnection <em>Config Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see targetEnvironment.ConfigConnection
     * @generated
     */
    public Adapter createConfigConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link targetEnvironment.ConnectedDevice <em>Connected Device</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see targetEnvironment.ConnectedDevice
     * @generated
     */
    public Adapter createConnectedDeviceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link targetEnvironment.ConfigConnectionProperty <em>Config Connection Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see targetEnvironment.ConfigConnectionProperty
     * @generated
     */
    public Adapter createConfigConnectionPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link targetEnvironment.ComputationDeviceInstance <em>Computation Device Instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see targetEnvironment.ComputationDeviceInstance
     * @generated
     */
    public Adapter createComputationDeviceInstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link targetEnvironment.DeviceInstance <em>Device Instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see targetEnvironment.DeviceInstance
     * @generated
     */
    public Adapter createDeviceInstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link targetEnvironment.ConfigDeviceProperty <em>Config Device Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see targetEnvironment.ConfigDeviceProperty
     * @generated
     */
    public Adapter createConfigDevicePropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link targetEnvironment.AbstractDeviceInstance <em>Abstract Device Instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see targetEnvironment.AbstractDeviceInstance
     * @generated
     */
    public Adapter createAbstractDeviceInstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link targetEnvironment.AbstractConfigProperty <em>Abstract Config Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see targetEnvironment.AbstractConfigProperty
     * @generated
     */
    public Adapter createAbstractConfigPropertyAdapter() {
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

} //TargetEnvironmentAdapterFactory
