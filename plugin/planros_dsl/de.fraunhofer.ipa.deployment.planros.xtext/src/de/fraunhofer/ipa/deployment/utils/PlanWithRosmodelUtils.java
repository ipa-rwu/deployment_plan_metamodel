package de.fraunhofer.ipa.deployment.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ros.Node;
import ros.ParameterInteger;
import ros.ParameterString;
import ros.ParameterStruct;
import ros.ParameterValue;
import system.Component;
import system.RosNode;
import system.SubSystem;
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

  public void getAllNodesFromSystem(System sys, List<RosNode> all_nodes) {
      // stop at null
  List<System> child_systems = sys.getComponents().stream()
      .filter(it -> it instanceof System)
      .map(System.class::cast)
      .collect(Collectors.toList());
  List<RosNode> nodes = sys.getComponents().stream()
        .filter(it -> it instanceof RosNode)
        .map(RosNode.class::cast)
        .collect(Collectors.toList());
  all_nodes.addAll(nodes);
  if(child_systems.size() > 0) {
    for (System child : child_systems) {
      getAllNodesFromSystem(child, all_nodes);
      }
    }
  }


  public void getAllComponentsFromSystem(System sys, List<Component> all) {
      // stop at null
    all.addAll(sys.getComponents().stream()
        .filter(it -> it instanceof System || it instanceof RosNode)
        .collect(Collectors.toList()));
    List<SubSystem> child_systems = sys.getComponents().stream()
    .filter(it -> it instanceof SubSystem)
    .map(SubSystem.class::cast)
    .collect(Collectors.toList());
    if(child_systems.size() > 0) {
    for (SubSystem child : child_systems) {
      all.add(child.getSystem());
      getAllComponentsFromSystem(child.getSystem(), all);
      }
    }
  }

  public List<String> getSubSystemNamesInSystem(System sys) {
    List<Component> children = new ArrayList<Component>();
    getAllComponentsFromSystem(sys, children);

    List<String> names = new ArrayList<String>();
    names.addAll(children.stream()
        .filter(it -> it instanceof System)
        .map(System.class::cast)
        .map(System::getName)
        .toList());
    return names;
  }

  public List<String> getRosNodeNamesInSystem(System sys) {
    List<Component> children = new ArrayList<Component>();
    getAllComponentsFromSystem(sys, children);

    List<String> names = new ArrayList<String>();
    names.addAll(children.stream()
        .filter(it -> it instanceof RosNode)
        .map(RosNode.class::cast)
        .map(RosNode::getName)
        .toList());
    return names;
  }

  public List<String> getComponentNames(System sys) {
    List<Component> children = new ArrayList<Component>();

    List<String> names = getSubSystemNamesInSystem(sys);
    names.addAll(getRosNodeNamesInSystem(sys));
    return names;
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

  public <T> Set<T> findCommonElements(List<T> list1, List<T> list2) {
      // Create a HashSet to store unique common elements
      Set<T> commonElements = new HashSet<>();

      // Iterate over elements in list1
      for (T element : list1) {
          // If the element is present in list2, add it to the commonElements set
          if (list2.contains(element)) {
              commonElements.add(element);
          }
      }

      return commonElements;
  }
}
