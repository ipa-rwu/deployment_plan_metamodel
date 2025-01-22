/**
 */
package deployPlanWithRosModel;

import de.fraunhofer.ipa.deployment.util.PropertyValue;

import deploymentPlan.AbstractConfigExecutionParameter;

import ros.Parameter;
import system.RosParameter;

import targetEnvironment.AbstractConfigProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Ros Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.ConfigRosParameter#getRefNodeParam <em>Ref Node Param</em>}</li>
 *   <li>{@link deployPlanWithRosModel.ConfigRosParameter#getRefSysParam <em>Ref Sys Param</em>}</li>
 *   <li>{@link deployPlanWithRosModel.ConfigRosParameter#getTo <em>To</em>}</li>
 *   <li>{@link deployPlanWithRosModel.ConfigRosParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigRosParameter()
 * @model
 * @generated
 */
public interface ConfigRosParameter extends AbstractConfigExecutionParameter {
    /**
   * Returns the value of the '<em><b>Ref Node Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Node Param</em>' reference.
   * @see #setRefNodeParam(RosParameter)
   * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigRosParameter_RefNodeParam()
   * @model
   * @generated
   */
  RosParameter getRefNodeParam();

  /**
   * Sets the value of the '{@link deployPlanWithRosModel.ConfigRosParameter#getRefNodeParam <em>Ref Node Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Node Param</em>' reference.
   * @see #getRefNodeParam()
   * @generated
   */
  void setRefNodeParam(RosParameter value);

  /**
   * Returns the value of the '<em><b>Ref Sys Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Sys Param</em>' reference.
   * @see #setRefSysParam(Parameter)
   * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigRosParameter_RefSysParam()
   * @model
   * @generated
   */
  Parameter getRefSysParam();

  /**
   * Sets the value of the '{@link deployPlanWithRosModel.ConfigRosParameter#getRefSysParam <em>Ref Sys Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Sys Param</em>' reference.
   * @see #getRefSysParam()
   * @generated
   */
  void setRefSysParam(Parameter value);

        /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(AbstractConfigProperty)
   * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigRosParameter_To()
   * @model
   * @generated
   */
    AbstractConfigProperty getTo();

    /**
   * Sets the value of the '{@link deployPlanWithRosModel.ConfigRosParameter#getTo <em>To</em>}' reference.
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
   * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigRosParameter_Value()
   * @model containment="true"
   * @generated
   */
    PropertyValue getValue();

    /**
   * Sets the value of the '{@link deployPlanWithRosModel.ConfigRosParameter#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
    void setValue(PropertyValue value);

} // ConfigRosParameter
