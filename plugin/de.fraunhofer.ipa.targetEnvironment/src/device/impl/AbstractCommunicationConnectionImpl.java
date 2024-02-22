/**
 */
package device.impl;

import de.fraunhofer.ipa.deployment.util.impl.AbstractResourceImpl;

import device.AbstractCommunicationConnection;
import device.DevicePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Communication Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractCommunicationConnectionImpl extends AbstractResourceImpl implements AbstractCommunicationConnection {
    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected AbstractCommunicationConnectionImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return DevicePackage.Literals.ABSTRACT_COMMUNICATION_CONNECTION;
  }

} //AbstractCommunicationConnectionImpl
