/**
 */
package deployPlanWithRosModel.util;

import deployPlanWithRosModel.*;

import deploymentPlan.AbstarctConfigSoftwareComponent;
import deploymentPlan.AbstractComputationAssignment;
import deploymentPlan.AbstractConfigExecutionParameter;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage
 * @generated
 */
public class DeployPlanWithRosModelAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DeployPlanWithRosModelPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeployPlanWithRosModelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DeployPlanWithRosModelPackage.eINSTANCE;
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
    protected DeployPlanWithRosModelSwitch<Adapter> modelSwitch =
        new DeployPlanWithRosModelSwitch<Adapter>() {
            @Override
            public Adapter caseRospackageImplementation(RospackageImplementation object) {
                return createRospackageImplementationAdapter();
            }
            @Override
            public Adapter caseConfigRosParameter(ConfigRosParameter object) {
                return createConfigRosParameterAdapter();
            }
            @Override
            public Adapter caseConfigRosSoftwareComponent(ConfigRosSoftwareComponent object) {
                return createConfigRosSoftwareComponentAdapter();
            }
            @Override
            public Adapter caseAbstractComputationAssignment(AbstractComputationAssignment object) {
                return createAbstractComputationAssignmentAdapter();
            }
            @Override
            public Adapter caseAbstractConfigExecutionParameter(AbstractConfigExecutionParameter object) {
                return createAbstractConfigExecutionParameterAdapter();
            }
            @Override
            public Adapter caseAbstarctConfigSoftwareComponent(AbstarctConfigSoftwareComponent object) {
                return createAbstarctConfigSoftwareComponentAdapter();
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
     * Creates a new adapter for an object of class '{@link deployPlanWithRosModel.RospackageImplementation <em>Rospackage Implementation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deployPlanWithRosModel.RospackageImplementation
     * @generated
     */
    public Adapter createRospackageImplementationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deployPlanWithRosModel.ConfigRosParameter <em>Config Ros Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deployPlanWithRosModel.ConfigRosParameter
     * @generated
     */
    public Adapter createConfigRosParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deployPlanWithRosModel.ConfigRosSoftwareComponent <em>Config Ros Software Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deployPlanWithRosModel.ConfigRosSoftwareComponent
     * @generated
     */
    public Adapter createConfigRosSoftwareComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.AbstractComputationAssignment <em>Abstract Computation Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.AbstractComputationAssignment
     * @generated
     */
    public Adapter createAbstractComputationAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.AbstractConfigExecutionParameter <em>Abstract Config Execution Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.AbstractConfigExecutionParameter
     * @generated
     */
    public Adapter createAbstractConfigExecutionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link deploymentPlan.AbstarctConfigSoftwareComponent <em>Abstarct Config Software Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see deploymentPlan.AbstarctConfigSoftwareComponent
     * @generated
     */
    public Adapter createAbstarctConfigSoftwareComponentAdapter() {
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

} //DeployPlanWithRosModelAdapterFactory
