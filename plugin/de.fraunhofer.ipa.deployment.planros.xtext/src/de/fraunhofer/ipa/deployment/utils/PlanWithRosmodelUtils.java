package de.fraunhofer.ipa.deployment.utils;

import java.util.List;
import java.util.stream.Collectors;

import ros.ParameterInteger;
import ros.ParameterString;
import ros.ParameterStruct;
import ros.ParameterValue;
import system.System;

public class PlanWithRosmodelUtils {
  public void getAllSystem(System sys, List<System> all_systems) {
      // stop at null
    all_systems.add(sys);
    List<System> children = sys.getComponents().stream()
        .filter(it -> it instanceof System)
        .map(System.class::cast)
        .collect(Collectors.toList());
      children.addAll(sys.getComponents().stream()
          .filter(it -> it instanceof System)
          .map(System.class::cast)
          .map(System::getComponents)
          .filter(it -> it instanceof System)
          .map(System.class::cast)
          .collect(Collectors.toList()));
    if(children.size() == 0) {
      return;
    }
    if(children.size() > 0) {
      if(children.contains(sys)) {
        throw new RuntimeException(String.format("Error: %s refernces to itself", sys.toString()));
      }

      all_systems.addAll(children);
      for (System child : children) {
        getAllSystem(child, all_systems);
      }
        return;

    }
      return;
  }

  public Boolean checkParameterValueEmpty(ParameterValue value) {
    if(value instanceof ParameterInteger && ((ParameterInteger) value).getValue() == null) {
      return true;
    }

    if(value instanceof ParameterString && ((ParameterString) value).getValue().equals("")) {
      return true;
    }

    return false;
  }

  public Boolean checkParameterStructEmpty(ParameterValue value) {
    if(value instanceof ParameterStruct) {
      var test = ((ParameterStruct) value).getValue()
            .stream()
            .filter(it -> checkParameterValueEmpty(it.getValue()))
            .collect(Collectors.toList());
      return true;
    }
    return false;
  }
}
