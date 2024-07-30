/**
 */
package implementationDescription.impl;

import implementationDescription.ImplementationDescriptionPackage;
import implementationDescription.Repository;
import implementationDescription.RepositoryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.impl.RepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link implementationDescription.impl.RepositoryImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link implementationDescription.impl.RepositoryImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
    /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
    protected static final String URL_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
    protected String url = URL_EDEFAULT;

    /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
    protected static final String VERSION_EDEFAULT = null;

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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
    protected RepositoryType type;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected RepositoryImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return ImplementationDescriptionPackage.Literals.REPOSITORY;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public String getUrl() {
    return url;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public void setUrl(String newUrl) {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ImplementationDescriptionPackage.REPOSITORY__URL, oldUrl, url));
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
    public void setVersion(String newVersion) {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ImplementationDescriptionPackage.REPOSITORY__VERSION, oldVersion, version));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public RepositoryType getType() {
    return type;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public NotificationChain basicSetType(RepositoryType newType, NotificationChain msgs) {
    RepositoryType oldType = type;
    type = newType;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImplementationDescriptionPackage.REPOSITORY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public void setType(RepositoryType newType) {
    if (newType != type) {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImplementationDescriptionPackage.REPOSITORY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImplementationDescriptionPackage.REPOSITORY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ImplementationDescriptionPackage.REPOSITORY__TYPE, newType, newType));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ImplementationDescriptionPackage.REPOSITORY__TYPE:
        return basicSetType(null, msgs);
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
      case ImplementationDescriptionPackage.REPOSITORY__URL:
        return getUrl();
      case ImplementationDescriptionPackage.REPOSITORY__VERSION:
        return getVersion();
      case ImplementationDescriptionPackage.REPOSITORY__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ImplementationDescriptionPackage.REPOSITORY__URL:
        setUrl((String)newValue);
        return;
      case ImplementationDescriptionPackage.REPOSITORY__VERSION:
        setVersion((String)newValue);
        return;
      case ImplementationDescriptionPackage.REPOSITORY__TYPE:
        setType((RepositoryType)newValue);
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
      case ImplementationDescriptionPackage.REPOSITORY__URL:
        setUrl(URL_EDEFAULT);
        return;
      case ImplementationDescriptionPackage.REPOSITORY__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case ImplementationDescriptionPackage.REPOSITORY__TYPE:
        setType((RepositoryType)null);
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
      case ImplementationDescriptionPackage.REPOSITORY__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case ImplementationDescriptionPackage.REPOSITORY__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case ImplementationDescriptionPackage.REPOSITORY__TYPE:
        return type != null;
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
    result.append(" (url: ");
    result.append(url);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //RepositoryImpl
