package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.utils.PlanWithRosmodelUtils
import java.util.ArrayList
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import java.util.TreeMap
import java.util.stream.Collectors
import ros.Node
import ros.impl.PackageImpl
import system.InterfaceReference
import system.RosNode
import system.System
import system.impl.RosPublisherReferenceImpl

class DeploymentHelperWithRosmodel extends DeploymentHelper{

  var PlanWithRosmodelUtils utils = new PlanWithRosmodelUtils

  def getRosPackagesFromSystem(System rossystem){
    var pkgsList = new LinkedHashSet
    var List<System> all_include_systems = new ArrayList
    utils.getAllSystem(rossystem, all_include_systems);
    var components =  all_include_systems.stream
                    .map[components]
                    .collect(Collectors.toList)
                    .flatten
                    .toList
    var rosnodes = components.stream
                    .filter[it instanceof RosNode]
                    .map[it as RosNode].collect(Collectors.toList())
    for(rosnode : rosnodes){
        pkgsList.addAll(getPacakgeFromRosNode(rosnode))
    }
    //todo: get pkg from fromfile in rossystem
    return pkgsList
  }

    def getPacakgeFromRosNode (RosNode object){
        var pkgsList = new ArrayList()
        var fromNode = object.from
        pkgsList.add(getPacakge(fromNode))
        return pkgsList
    }

    def getPacakge(Node object){
        return object.eContainer.eContainer as PackageImpl
    }

    def getPacakge(InterfaceReference object){
        if(object instanceof RosPublisherReferenceImpl)
        return (object as RosPublisherReferenceImpl).from.eContainer.eContainer.eContainer as PackageImpl
    }

  def getRosPackagesFromSystemWithoutDuplicate(System rossystem){
      var pkgsList = getRosPackagesFromSystem(rossystem)
      var Map<String, PackageImpl> map = new TreeMap
      for (pkgimpl : pkgsList) {
           if (!map.containsKey(pkgimpl.name)) {
                map.put(pkgimpl.name, pkgimpl)
           }
      }
      return map.values().toList
  }


  def getRepoinfosFromRossystem(System sys, OSInfo os, String rosdistro){
    var pkgLists = getRosPackagesFromSystemWithoutDuplicate(sys)
    var repoInfos = getReleaseInfo(pkgLists.map[name].toList, rosdistro)
    var Map<String, RepoInfo> map = new TreeMap
    for(pkg: pkgLists){
        if (pkg.fromGitRepo!==null){
            var repo_info = getRepoInfo(pkg.fromGitRepo)
            if(repo_info!==null){
//              check if Package already released
                var res = checkIfPackageRelease(pkg.name, rosdistro, os.name, os.version)
                if(!res.booleanResult){
                   map.putIfAbsent(repo_info.name, repo_info)
                }
//             check if repo info defined in .ros matches released info
                else if(!compareWithRelease(repoInfos, pkg)){
                       map.putIfAbsent(repo_info.name, repo_info)
                    }
                    else{
                        repo_info.released = pkg.name
                        repo_info = repoInfos.stream.filter[it.name == pkg.name].collect(Collectors.toList).get(0)
                        map.putIfAbsent(repo_info.name, repo_info)
                    }
            }
            else{
                repo_info.released = pkg.name
                repo_info = repoInfos.stream.filter[it.name == pkg.name].collect(Collectors.toList).get(0)
                map.putIfAbsent(repo_info.name, repo_info)
            }
        }
    }
    java.lang.System.out.printf("After System [%s]: ", sys.name)
    map.values.toList.forEach[java.lang.System.out.printf("%s", it.print)]
    return map.values.toList
  }

  def compareWithRelease(List<RepoInfo> repoInfos, PackageImpl pkg){
    var same = false
    var pkgRepoInfo = getRepoInfo(pkg.fromGitRepo)
    for(repoInfo: repoInfos){
        if(repoInfo.name == pkg.name){
            if(repoInfo.url.replace(".git","").equals(pkgRepoInfo.url.replace(".git",""))){
              if(pkgRepoInfo.version === null || repoInfo.version.equals(pkgRepoInfo.version)){
                  same = true
                  return same
              }
            }

        }
    }
    return same
  }
}
