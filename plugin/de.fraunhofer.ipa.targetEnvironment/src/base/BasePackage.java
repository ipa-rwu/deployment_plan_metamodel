/**
 */
package base;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ipa.fraunhofer.de/Base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link base.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.DescriptionImpl
	 * @see base.impl.BasePackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link base.impl.PropertyValueImpl <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.PropertyValueImpl
	 * @see base.impl.BasePackageImpl#getPropertyValue()
	 * @generated
	 */
	int PROPERTY_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.impl.PropertyValueIntImpl <em>Property Value Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.PropertyValueIntImpl
	 * @see base.impl.BasePackageImpl#getPropertyValueInt()
	 * @generated
	 */
	int PROPERTY_VALUE_INT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_INT__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Value Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_INT_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Value Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_INT_OPERATION_COUNT = PROPERTY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.PropertyValueDoubleImpl <em>Property Value Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.PropertyValueDoubleImpl
	 * @see base.impl.BasePackageImpl#getPropertyValueDouble()
	 * @generated
	 */
	int PROPERTY_VALUE_DOUBLE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_DOUBLE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Value Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_DOUBLE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Value Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_DOUBLE_OPERATION_COUNT = PROPERTY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.PropertyValueStringImpl <em>Property Value String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.PropertyValueStringImpl
	 * @see base.impl.BasePackageImpl#getPropertyValueString()
	 * @generated
	 */
	int PROPERTY_VALUE_STRING = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_STRING__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Value String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_STRING_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Value String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_STRING_OPERATION_COUNT = PROPERTY_VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link base.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see base.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for class '{@link base.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see base.PropertyValue
	 * @generated
	 */
	EClass getPropertyValue();

	/**
	 * Returns the meta object for class '{@link base.PropertyValueInt <em>Property Value Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value Int</em>'.
	 * @see base.PropertyValueInt
	 * @generated
	 */
	EClass getPropertyValueInt();

	/**
	 * Returns the meta object for the attribute '{@link base.PropertyValueInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see base.PropertyValueInt#getValue()
	 * @see #getPropertyValueInt()
	 * @generated
	 */
	EAttribute getPropertyValueInt_Value();

	/**
	 * Returns the meta object for class '{@link base.PropertyValueDouble <em>Property Value Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value Double</em>'.
	 * @see base.PropertyValueDouble
	 * @generated
	 */
	EClass getPropertyValueDouble();

	/**
	 * Returns the meta object for the attribute '{@link base.PropertyValueDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see base.PropertyValueDouble#getValue()
	 * @see #getPropertyValueDouble()
	 * @generated
	 */
	EAttribute getPropertyValueDouble_Value();

	/**
	 * Returns the meta object for class '{@link base.PropertyValueString <em>Property Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value String</em>'.
	 * @see base.PropertyValueString
	 * @generated
	 */
	EClass getPropertyValueString();

	/**
	 * Returns the meta object for the attribute '{@link base.PropertyValueString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see base.PropertyValueString#getValue()
	 * @see #getPropertyValueString()
	 * @generated
	 */
	EAttribute getPropertyValueString_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link base.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.DescriptionImpl
		 * @see base.impl.BasePackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '{@link base.impl.PropertyValueImpl <em>Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.PropertyValueImpl
		 * @see base.impl.BasePackageImpl#getPropertyValue()
		 * @generated
		 */
		EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

		/**
		 * The meta object literal for the '{@link base.impl.PropertyValueIntImpl <em>Property Value Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.PropertyValueIntImpl
		 * @see base.impl.BasePackageImpl#getPropertyValueInt()
		 * @generated
		 */
		EClass PROPERTY_VALUE_INT = eINSTANCE.getPropertyValueInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE_INT__VALUE = eINSTANCE.getPropertyValueInt_Value();

		/**
		 * The meta object literal for the '{@link base.impl.PropertyValueDoubleImpl <em>Property Value Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.PropertyValueDoubleImpl
		 * @see base.impl.BasePackageImpl#getPropertyValueDouble()
		 * @generated
		 */
		EClass PROPERTY_VALUE_DOUBLE = eINSTANCE.getPropertyValueDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE_DOUBLE__VALUE = eINSTANCE.getPropertyValueDouble_Value();

		/**
		 * The meta object literal for the '{@link base.impl.PropertyValueStringImpl <em>Property Value String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.PropertyValueStringImpl
		 * @see base.impl.BasePackageImpl#getPropertyValueString()
		 * @generated
		 */
		EClass PROPERTY_VALUE_STRING = eINSTANCE.getPropertyValueString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE_STRING__VALUE = eINSTANCE.getPropertyValueString_Value();

	}

} //BasePackage
