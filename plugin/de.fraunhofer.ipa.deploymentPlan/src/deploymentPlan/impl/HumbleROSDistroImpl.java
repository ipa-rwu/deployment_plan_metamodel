/**
 */
package deploymentPlan.impl;

import deploymentPlan.DeploymentPlanPackage;
import deploymentPlan.HumbleROSDistro;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Humble ROS Distro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.HumbleROSDistroImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link deploymentPlan.impl.HumbleROSDistroImpl#getDistro <em>Distro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HumbleROSDistroImpl extends MinimalEObjectImpl.Container implements HumbleROSDistro {
    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = "2";
    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;
    /**
     * The default value of the '{@link #getDistro() <em>Distro</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistro()
     * @generated
     * @ordered
     */
    protected static final String DISTRO_EDEFAULT = "humble";
    /**
     * The cached value of the '{@link #getDistro() <em>Distro</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistro()
     * @generated
     * @ordered
     */
    protected String distro = DISTRO_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HumbleROSDistroImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeploymentPlanPackage.Literals.HUMBLE_ROS_DISTRO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDistro() {
        return distro;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DeploymentPlanPackage.HUMBLE_ROS_DISTRO__VERSION:
                return getVersion();
            case DeploymentPlanPackage.HUMBLE_ROS_DISTRO__DISTRO:
                return getDistro();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DeploymentPlanPackage.HUMBLE_ROS_DISTRO__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
            case DeploymentPlanPackage.HUMBLE_ROS_DISTRO__DISTRO:
                return DISTRO_EDEFAULT == null ? distro != null : !DISTRO_EDEFAULT.equals(distro);
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
        result.append(" (version: ");
        result.append(version);
        result.append(", distro: ");
        result.append(distro);
        result.append(')');
        return result.toString();
    }

} //HumbleROSDistroImpl
