/**
 */
package implementationDescription;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see implementationDescription.ImplementationDescriptionPackage
 * @generated
 */
public interface ImplementationDescriptionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ImplementationDescriptionFactory eINSTANCE = implementationDescription.impl.ImplementationDescriptionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Implementation Description</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Implementation Description</em>'.
     * @generated
     */
    ImplementationDescription createImplementationDescription();

    /**
     * Returns a new object of class '<em>Software Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Software Component</em>'.
     * @generated
     */
    SoftwareComponent createSoftwareComponent();

    /**
     * Returns a new object of class '<em>Device Requirement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Device Requirement</em>'.
     * @generated
     */
    DeviceRequirement createDeviceRequirement();

    /**
     * Returns a new object of class '<em>Software Configuration Requirement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Software Configuration Requirement</em>'.
     * @generated
     */
    SoftwareConfigurationRequirement createSoftwareConfigurationRequirement();

    /**
     * Returns a new object of class '<em>HWSW Paremeter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>HWSW Paremeter</em>'.
     * @generated
     */
    HWSWParemeter createHWSWParemeter();

    /**
     * Returns a new object of class '<em>Software Execution Paremeter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Software Execution Paremeter</em>'.
     * @generated
     */
    SoftwareExecutionParemeter createSoftwareExecutionParemeter();

    /**
     * Returns a new object of class '<em>Execution Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Property</em>'.
     * @generated
     */
    ExecutionProperty createExecutionProperty();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ImplementationDescriptionPackage getImplementationDescriptionPackage();

} //ImplementationDescriptionFactory
