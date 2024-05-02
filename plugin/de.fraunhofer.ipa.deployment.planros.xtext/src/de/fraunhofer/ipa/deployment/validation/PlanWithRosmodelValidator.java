/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;


import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Extension;

import com.google.inject.Inject;

import de.fraunhofer.ipa.deployment.utils.PlanWithRosmodelUtils;
import deployPlanWithRosModel.ConfigRosParameter;
import deployPlanWithRosModel.ConfigRosSoftwareComponent;
import deployPlanWithRosModel.DeployPlanWithRosModelPackage;
import deployPlanWithRosModel.DeployRossystemPlan;
import deployPlanWithRosModel.RossystemImplementationAssignment;
import deploymentPlan.AbstractDeploymentPlan;
import ros.Parameter;
import system.Component;
import system.RosNode;
import system.RosParameter;
import system.System;
import targetEnvironment.impl.ConfigConnectionPropertyImpl;
import targetEnvironment.impl.ConfigDevicePropertyImpl;
/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class PlanWithRosmodelValidator extends AbstractPlanWithRosmodelValidator {

  @Inject
  @Extension
  private PlanWithRosmodelUtils _utils;

  public static final String INVALID_NAME = "invalidName";
  public static final String UNDEFINED_ELE = "undfinedElement";
  public static final String INVALID_REF = "invalidReference";



  // Check if there are components defined under ConfigRosSoftwareComponent don't belong to TargetRossystem
  @Check
  public void checkLimitInDefinedTargetRossystem(ConfigRosSoftwareComponent configured_comp) {
    DeployRossystemPlan plan = (DeployRossystemPlan) configured_comp.eContainer().eContainer().eContainer();
    if(plan.getTargetRossystem() != null) {
      List<Component> all_components = new ArrayList<Component>();
      _utils.getAllComponentsFromSystem(plan.getTargetRossystem(), all_components);
      Component ros_comp = configured_comp.getComponent();
      if(!all_components.contains(ros_comp)) {
        String comp_name = "";
        if (ros_comp instanceof System) {
          comp_name = ((System) ros_comp).getName();
      } else if (ros_comp instanceof RosNode) {
        comp_name = ((RosNode) ros_comp).getName();
      }
        var msg = String.format("%s doesn't belong to Rossystem: %s",
            comp_name, plan.getTargetRossystem().getName());
              error(msg,
                DeployPlanWithRosModelPackage.Literals.CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT,
                INVALID_NAME);
      }
    }
  }

    // Check if define all components belong to TargetRossystem in the plan
    @Check
    public void checkConfigAllComponentFromTopSystem(DeployRossystemPlan plan) {
      if(plan.getTargetRossystem() != null) {
        List<Component>  defined_components = plan.getRealize().getRealizations()
          .stream()
          .map(RossystemImplementationAssignment.class::cast)
          .map(RossystemImplementationAssignment::getSoftwareComponents)
          .flatMap(List::stream)
          .map(ConfigRosSoftwareComponent::getComponent)
          .collect(Collectors.toList());

        List<Component> pending_components = new ArrayList<Component>();
        _utils.getAllComponentsFromSystem(plan.getTargetRossystem(), pending_components);

          if(defined_components.size()>0) {
              for (Component component : defined_components) {
                // Remove all component within defined subsystem
          if(component instanceof System) {
            List<Component> children = new ArrayList<Component>();
            _utils.getAllComponentsFromSystem((System) component, children);
            if(children.size()>0) {
              pending_components.removeAll(children);
            }
          }
          // If a node is defined, user has to define all component in the system where the node belong
          if(component instanceof RosNode) {
            if (component.eContainer()  instanceof System) {
              pending_components.remove((System) component.eContainer());
            }
          }
        }
              pending_components.removeAll(defined_components);
          }

            if(pending_components.size() > 0) {
              List<String> names = new ArrayList<String>();
              var msg = String.format("Please config: \n");

              for (Component component : pending_components) {
          if (component instanceof System) {
            System component_sys = (System) component;
            List<Component> children = new ArrayList<Component>();
            _utils.getAllComponentsFromSystem(component_sys, children);
            msg = String.format("%sReferenced system: %s%s;\n", msg,
                component_sys.getName(),
                children.isEmpty() ? "" : " or Components within this system: " + _utils.getComponentNames(component_sys).toString()
                );
          }
          if (component instanceof RosNode) {
            System component_sys = (System) component.eContainer();
            List<Component> children = new ArrayList<Component>();
            _utils.getAllComponentsFromSystem(component_sys, children);
            Set<Component> common_comps = _utils.findCommonElements(children, defined_components);
            msg = String.format("%sReferenced RosNode: %s %s or only define System: %s;\n", msg,
                    ((RosNode) component).getName(), common_comps.isEmpty() ? "" : "and remove Components: " + common_comps.toString(),
                    component_sys.getName());
          }
        }
                error(msg,
                    DeployPlanWithRosModelPackage.Literals.DEPLOY_ROSSYSTEM_PLAN__TARGET_ROSSYSTEM,
                    UNDEFINED_ELE);
            }
        }
      }


  @Check
  public void checkIfDefineEmptySystemParamter(ConfigRosSoftwareComponent comp) {
    Component target_component = comp.getComponent();
    List<System> all_include_systems = new ArrayList<System>();
    if(target_component instanceof System) {
      _utils.getAllSystem((System) target_component, all_include_systems);
    }

    List<Parameter> params = all_include_systems.stream()
        .map(System::getParameter)
        .flatMap(List::stream)
        .filter(p -> p.getValue() == null)
        .collect(Collectors.toList());
       if(params.size() > 0) {
         var refsysparams = comp.getExecutionConfiguration().stream()
         .map(ConfigRosParameter.class::cast)
         .map(ConfigRosParameter::getRefSysParam)
         .filter(Objects::nonNull)
         .collect(Collectors.toList());
         params.removeAll(refsysparams);
         if(params.size() > 0) {
         var msg = String.format("Please define %s under \"executionConfiguration\" as refSysParam",
             params.stream().map(Parameter::getName).collect(Collectors.toList()).toString());
         error(msg,
          DeployPlanWithRosModelPackage.Literals.CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT,
          UNDEFINED_ELE);
         }
        }
  }

  @Check
  public void checkIfDefineEmptyRosParamter(ConfigRosSoftwareComponent comp) {
    Component target_component = comp.getComponent();
    if(target_component instanceof RosNode) {
      List<RosParameter> params=  ((RosNode) target_component).getRosparameters()
     .stream()
     .filter(p -> p.getValue() == null
              || _utils.checkParameterValueEmpty(p.getValue())
              || _utils.checkParameterStructEmpty(p.getValue()))
          .collect(Collectors.toList());
      if(params.size() > 0) {
             var rosparams = comp.getExecutionConfiguration().stream()
             .map(ConfigRosParameter.class::cast)
             .map(ConfigRosParameter::getRefNodeParam)
             .filter(Objects::nonNull)
             .collect(Collectors.toList());
             params.removeAll(rosparams);
             if(params.size() > 0) {
             var msg = String.format("Please define %s under \"executionConfiguration\" as refNodeParam:",
                 params.stream().map(RosParameter::getName).collect(Collectors.toList()).toString());
             error(msg,
              DeployPlanWithRosModelPackage.Literals.CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT,
              UNDEFINED_ELE);
             }
            }
    }
  }

  @Check
  public void checkIfMapParamToTarEnv(ConfigRosParameter config_param) {
    ConfigRosSoftwareComponent comp = (ConfigRosSoftwareComponent) config_param.eContainer();
    AbstractDeploymentPlan plan = (AbstractDeploymentPlan) comp.eContainer().eContainer().eContainer().eContainer();
    var targetenv = plan.getDeployTo();

    var property = config_param.getTo();
    if(property instanceof ConfigDevicePropertyImpl) {
          if(!targetenv.getIncludeDevice().contains(property.eContainer())) {
            error(String.format("Cannot reference to %s", ((ConfigDevicePropertyImpl) property).toString()),
              DeployPlanWithRosModelPackage.Literals.CONFIG_ROS_PARAMETER__TO,
              INVALID_REF);
            }
      }

    if(property instanceof ConfigConnectionPropertyImpl) {
      if(targetenv.equals(property.eContainer().eContainer().eContainer())) {
            error(String.format("Cannot reference to %s", ((ConfigConnectionPropertyImpl) property).toString()),
              DeployPlanWithRosModelPackage.Literals.CONFIG_ROS_PARAMETER__TO,
              INVALID_REF);
            }
      }

  }
}
