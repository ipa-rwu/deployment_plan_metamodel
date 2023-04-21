/**
 */
package implementationDescription.util;

import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;
import de.fraunhofer.ipa.deployment.util.AbstractImplementation;
import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.Property;

import implementationDescription.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see implementationDescription.ImplementationDescriptionPackage
 * @generated
 */
public class ImplementationDescriptionAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ImplementationDescriptionPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplementationDescriptionAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ImplementationDescriptionPackage.eINSTANCE;
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
    protected ImplementationDescriptionSwitch<Adapter> modelSwitch =
        new ImplementationDescriptionSwitch<Adapter>() {
            @Override
            public Adapter caseExecutionRequirement(ExecutionRequirement object) {
                return createExecutionRequirementAdapter();
            }
            @Override
            public Adapter caseImplementationDescription(ImplementationDescription object) {
                return createImplementationDescriptionAdapter();
            }
            @Override
            public Adapter caseSoftwareComponent(SoftwareComponent object) {
                return createSoftwareComponentAdapter();
            }
            @Override
            public Adapter caseDeviceRequirement(DeviceRequirement object) {
                return createDeviceRequirementAdapter();
            }
            @Override
            public Adapter caseSoftwareConfigurationRequirement(SoftwareConfigurationRequirement object) {
                return createSoftwareConfigurationRequirementAdapter();
            }
            @Override
            public Adapter caseHWSWParemeter(HWSWParemeter object) {
                return createHWSWParemeterAdapter();
            }
            @Override
            public Adapter caseSoftwareExecutionParemeter(SoftwareExecutionParemeter object) {
                return createSoftwareExecutionParemeterAdapter();
            }
            @Override
            public Adapter caseExecutionProperty(ExecutionProperty object) {
                return createExecutionPropertyAdapter();
            }
            @Override
            public Adapter caseRepository(Repository object) {
                return createRepositoryAdapter();
            }
            @Override
            public Adapter caseRepositoryType(RepositoryType object) {
                return createRepositoryTypeAdapter();
            }
            @Override
            public Adapter caseGitRepositoryType(GitRepositoryType object) {
                return createGitRepositoryTypeAdapter();
            }
            @Override
            public Adapter caseAbstractImplementation(AbstractImplementation object) {
                return createAbstractImplementationAdapter();
            }
            @Override
            public Adapter caseAbstractComputationAssignmentTarget(AbstractComputationAssignmentTarget object) {
                return createAbstractComputationAssignmentTargetAdapter();
            }
            @Override
            public Adapter caseAbstractProperty(AbstractProperty object) {
                return createAbstractPropertyAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
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
     * Creates a new adapter for an object of class '{@link implementationDescription.ExecutionRequirement <em>Execution Requirement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.ExecutionRequirement
     * @generated
     */
    public Adapter createExecutionRequirementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link implementationDescription.ImplementationDescription <em>Implementation Description</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.ImplementationDescription
     * @generated
     */
    public Adapter createImplementationDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link implementationDescription.SoftwareComponent <em>Software Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.SoftwareComponent
     * @generated
     */
    public Adapter createSoftwareComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link implementationDescription.DeviceRequirement <em>Device Requirement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.DeviceRequirement
     * @generated
     */
    public Adapter createDeviceRequirementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link implementationDescription.SoftwareConfigurationRequirement <em>Software Configuration Requirement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.SoftwareConfigurationRequirement
     * @generated
     */
    public Adapter createSoftwareConfigurationRequirementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link implementationDescription.HWSWParemeter <em>HWSW Paremeter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.HWSWParemeter
     * @generated
     */
    public Adapter createHWSWParemeterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link implementationDescription.SoftwareExecutionParemeter <em>Software Execution Paremeter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.SoftwareExecutionParemeter
     * @generated
     */
    public Adapter createSoftwareExecutionParemeterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link implementationDescription.ExecutionProperty <em>Execution Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.ExecutionProperty
     * @generated
     */
    public Adapter createExecutionPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link implementationDescription.Repository <em>Repository</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.Repository
     * @generated
     */
    public Adapter createRepositoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link implementationDescription.RepositoryType <em>Repository Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.RepositoryType
     * @generated
     */
    public Adapter createRepositoryTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link implementationDescription.GitRepositoryType <em>Git Repository Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see implementationDescription.GitRepositoryType
     * @generated
     */
    public Adapter createGitRepositoryTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AbstractImplementation <em>Abstract Implementation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AbstractImplementation
     * @generated
     */
    public Adapter createAbstractImplementationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget <em>Abstract Computation Assignment Target</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget
     * @generated
     */
    public Adapter createAbstractComputationAssignmentTargetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.AbstractProperty <em>Abstract Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.AbstractProperty
     * @generated
     */
    public Adapter createAbstractPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fraunhofer.ipa.deployment.util.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fraunhofer.ipa.deployment.util.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
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

} //ImplementationDescriptionAdapterFactory
