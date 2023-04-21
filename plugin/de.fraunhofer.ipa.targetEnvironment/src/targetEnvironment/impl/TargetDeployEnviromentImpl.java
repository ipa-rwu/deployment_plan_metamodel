/**
 */
package targetEnvironment.impl;

import base.impl.DescriptionImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import targetEnvironment.ConfigConnection;
import targetEnvironment.DeviceInstance;
import targetEnvironment.TargetDeployEnviroment;
import targetEnvironment.TargetEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Deploy Enviroment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.impl.TargetDeployEnviromentImpl#getName <em>Name</em>}</li>
 *   <li>{@link targetEnvironment.impl.TargetDeployEnviromentImpl#getIncludeDevice <em>Include Device</em>}</li>
 *   <li>{@link targetEnvironment.impl.TargetDeployEnviromentImpl#getConfigConnection <em>Config Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetDeployEnviromentImpl extends DescriptionImpl implements TargetDeployEnviroment {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getIncludeDevice() <em>Include Device</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncludeDevice()
     * @generated
     * @ordered
     */
    protected EList<DeviceInstance> includeDevice;

    /**
     * The cached value of the '{@link #getConfigConnection() <em>Config Connection</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigConnection()
     * @generated
     * @ordered
     */
    protected EList<ConfigConnection> configConnection;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TargetDeployEnviromentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetEnvironmentPackage.Literals.TARGET_DEPLOY_ENVIROMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DeviceInstance> getIncludeDevice() {
        if (includeDevice == null) {
            includeDevice = new EObjectContainmentEList<DeviceInstance>(DeviceInstance.class, this, TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__INCLUDE_DEVICE);
        }
        return includeDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConfigConnection> getConfigConnection() {
        if (configConnection == null) {
            configConnection = new EObjectContainmentEList<ConfigConnection>(ConfigConnection.class, this, TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__CONFIG_CONNECTION);
        }
        return configConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__INCLUDE_DEVICE:
                return ((InternalEList<?>)getIncludeDevice()).basicRemove(otherEnd, msgs);
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__CONFIG_CONNECTION:
                return ((InternalEList<?>)getConfigConnection()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__NAME:
                return getName();
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__INCLUDE_DEVICE:
                return getIncludeDevice();
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__CONFIG_CONNECTION:
                return getConfigConnection();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__NAME:
                setName((String)newValue);
                return;
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__INCLUDE_DEVICE:
                getIncludeDevice().clear();
                getIncludeDevice().addAll((Collection<? extends DeviceInstance>)newValue);
                return;
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__CONFIG_CONNECTION:
                getConfigConnection().clear();
                getConfigConnection().addAll((Collection<? extends ConfigConnection>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__INCLUDE_DEVICE:
                getIncludeDevice().clear();
                return;
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__CONFIG_CONNECTION:
                getConfigConnection().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__INCLUDE_DEVICE:
                return includeDevice != null && !includeDevice.isEmpty();
            case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT__CONFIG_CONNECTION:
                return configConnection != null && !configConnection.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //TargetDeployEnviromentImpl
