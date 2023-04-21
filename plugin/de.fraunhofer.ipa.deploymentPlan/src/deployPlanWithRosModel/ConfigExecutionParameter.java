/**
 */
package deployPlanWithRosModel;

import de.fraunhofer.ipa.deployment.util.PropertyValue;

import deploymentPlan.AbstractConfigExecutionParameter;

import system.RosParameter;

import targetEnvironment.AbstractConfigProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Execution Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.ConfigExecutionParameter#getFrom <em>From</em>}</li>
 *   <li>{@link deployPlanWithRosModel.ConfigExecutionParameter#getTo <em>To</em>}</li>
 *   <li>{@link deployPlanWithRosModel.ConfigExecutionParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigExecutionParameter()
 * @model
 * @generated
 */
public interface ConfigExecutionParameter extends AbstractConfigExecutionParameter {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(RosParameter)
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigExecutionParameter_From()
     * @model required="true"
     * @generated
     */
    RosParameter getFrom();

    /**
     * Sets the value of the '{@link deployPlanWithRosModel.ConfigExecutionParameter#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(RosParameter value);

    /**
     * Returns the value of the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' reference.
     * @see #setTo(AbstractConfigProperty)
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigExecutionParameter_To()
     * @model required="true"
     * @generated
     */
    AbstractConfigProperty getTo();

    /**
     * Sets the value of the '{@link deployPlanWithRosModel.ConfigExecutionParameter#getTo <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' reference.
     * @see #getTo()
     * @generated
     */
    void setTo(AbstractConfigProperty value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(PropertyValue)
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigExecutionParameter_Value()
     * @model containment="true"
     * @generated
     */
    PropertyValue getValue();

    /**
     * Sets the value of the '{@link deployPlanWithRosModel.ConfigExecutionParameter#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(PropertyValue value);

} // ConfigExecutionParameter
