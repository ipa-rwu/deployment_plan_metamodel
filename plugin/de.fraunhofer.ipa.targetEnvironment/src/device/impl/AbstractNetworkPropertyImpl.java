/**
 */
package device.impl;

import de.fraunhofer.ipa.deployment.util.impl.PropertyAttributeImpl;

import device.AbstractNetworkProperty;
import device.DevicePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Network Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractNetworkPropertyImpl extends PropertyAttributeImpl implements AbstractNetworkProperty {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractNetworkPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DevicePackage.Literals.ABSTRACT_NETWORK_PROPERTY;
    }

} //AbstractNetworkPropertyImpl
