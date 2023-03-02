/**
 */
package base.impl;

import base.BaseFactory;
import base.BasePackage;
import base.Description;
import base.PropertyValue;
import base.PropertyValueDouble;
import base.PropertyValueInt;
import base.PropertyValueString;

import device.DevicePackage;
import device.impl.DevicePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasePackageImpl extends EPackageImpl implements BasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueStringEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see base.BasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl() {
		super(eNS_URI, BaseFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackage init() {
		if (isInited) return (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasePackageImpl theBasePackage = registeredBasePackage instanceof BasePackageImpl ? (BasePackageImpl)registeredBasePackage : new BasePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DevicePackage.eNS_URI);
		DevicePackageImpl theDevicePackage = (DevicePackageImpl)(registeredPackage instanceof DevicePackageImpl ? registeredPackage : DevicePackage.eINSTANCE);

		// Create package meta-data objects
		theBasePackage.createPackageContents();
		theDevicePackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();
		theDevicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValue() {
		return propertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValueInt() {
		return propertyValueIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValueInt_Value() {
		return (EAttribute)propertyValueIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValueDouble() {
		return propertyValueDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValueDouble_Value() {
		return (EAttribute)propertyValueDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValueString() {
		return propertyValueStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValueString_Value() {
		return (EAttribute)propertyValueStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactory getBaseFactory() {
		return (BaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		descriptionEClass = createEClass(DESCRIPTION);

		propertyValueEClass = createEClass(PROPERTY_VALUE);

		propertyValueIntEClass = createEClass(PROPERTY_VALUE_INT);
		createEAttribute(propertyValueIntEClass, PROPERTY_VALUE_INT__VALUE);

		propertyValueDoubleEClass = createEClass(PROPERTY_VALUE_DOUBLE);
		createEAttribute(propertyValueDoubleEClass, PROPERTY_VALUE_DOUBLE__VALUE);

		propertyValueStringEClass = createEClass(PROPERTY_VALUE_STRING);
		createEAttribute(propertyValueStringEClass, PROPERTY_VALUE_STRING__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		propertyValueIntEClass.getESuperTypes().add(this.getPropertyValue());
		propertyValueDoubleEClass.getESuperTypes().add(this.getPropertyValue());
		propertyValueStringEClass.getESuperTypes().add(this.getPropertyValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(descriptionEClass, Description.class, "Description", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyValueIntEClass, PropertyValueInt.class, "PropertyValueInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValueInt_Value(), theXMLTypePackage.getInt(), "value", null, 1, 1, PropertyValueInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueDoubleEClass, PropertyValueDouble.class, "PropertyValueDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValueDouble_Value(), theXMLTypePackage.getDouble(), "value", null, 1, 1, PropertyValueDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueStringEClass, PropertyValueString.class, "PropertyValueString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValueString_Value(), ecorePackage.getEString(), "value", null, 1, 1, PropertyValueString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BasePackageImpl
