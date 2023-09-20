package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.utils.PlanWithRosmodelUtils
import java.util.ArrayList
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import java.util.TreeMap
import java.util.stream.Collectors
import ros.Node
import ros.Package
import ros.impl.PackageImpl
import system.InterfaceReference
import system.RosNode
import system.System
import system.impl.RosPublisherReferenceImpl

class PkgInfo{
   String name
   RepoInfo repo

   def setName(String name){
    this.name = name
   }

   def getName(){
    return this.name
   }

   def setRepo(RepoInfo repo){
    this.repo = repo
   }


   def getRepo(){
    return this.repo
   }

   override toString(){
    if (this.repo !== null){
      return String.format("pkg name: %s, repo info: %s", this.name, this.repo.print)
    }
      else
      String.format("pkg name: %s, repo info: null", this.name)
   }
}

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

  def getPkgInfoFromSystemLaunfile(System rossystem){
    var packLists = new LinkedHashSet
    var List<System> all_include_systems = new ArrayList
    utils.getAllSystem(rossystem, all_include_systems);

    var launchs = all_include_systems.stream
                .filter[it.fromFile !== null]
                .map[fromFile]
                .collect(Collectors.toList())
    java.lang.System.out.printf("System %s Get launches: %s\n", rossystem.name, launchs.toString)
    for(launch : launchs){
      val pkg = new PkgInfo =>[
        name = launch.name.split("/").get(0)
        if(launch.fromGitRepo !== null)
          repo = getRepoInfo(launch.fromGitRepo)
        else
          repo = null
      ]
      packLists.add(pkg)
    }
    java.lang.System.out.println("launch files in")
    packLists.forEach[java.lang.System.out.printf("%s\n", it.toString)]
    return packLists
  }

  def getPkgInfoFromSystemNodes(System sys){
    var rospkgs = getRosPackagesFromSystemWithoutDuplicate(sys)
    var packLists = new LinkedHashSet
    for(pkg_impl : rospkgs){
      val pkg = new PkgInfo =>[
        name = pkg_impl.name
        if(pkg_impl.fromGitRepo !== null)
          repo = getRepoInfo(pkg_impl.fromGitRepo)
        else
          repo = null
      ]
      packLists.add(pkg)
    }

    return packLists
  }

  def getPacakgeFromRosNode (RosNode object){
    var pkgsList = new ArrayList()
    var fromNode = object.from
    pkgsList.add(getPackakge(fromNode))
    return pkgsList
  }

  def getPackakge(Node object){
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

  def getRepoInfo(String fromGitRepo){
    val repo_info = new RepoInfo
//      define version
    if(fromGitRepo.indexOf(":", fromGitRepo.indexOf(":") + 1) > 1) {
        var url = fromGitRepo.substring(0,fromGitRepo.lastIndexOf(':'))
        if(!url.substring(url.length -4).equals(".git")){
          url = String.format("%s.git", url)
        }
        repo_info.updateInfo(
            url.substring(url.lastIndexOf("/") + 1).replace(".git",""),
            'git',
            url,
            fromGitRepo.substring(fromGitRepo.lastIndexOf(':')+ 1)
        )
    }
    else {
      var url = fromGitRepo
        if(!url.substring(url.length -4).equals(".git")){
          url = String.format("%s.git", url)
        }
        repo_info.updateInfo(
          fromGitRepo.substring(fromGitRepo.lastIndexOf("/") + 1).replace(".git",""),
          'git',
          url,
          null
        )
    }
    return repo_info
  }

  def getRepoinfosFromRossystemIncludeLaunchFile(System sys, OSInfo os, String rosdistro){
    // get all package from nodes
    var pkgLists = getPkgInfoFromSystemNodes(sys)
    // get all package from launch file
    pkgLists.addAll(getPkgInfoFromSystemLaunfile(sys))
    java.lang.System.out.printf("-----Repo info from rossystem: %s-----\n", sys.name)
    java.lang.System.out.println("-----------------------------------")
    java.lang.System.out.println("-----------------------------------")
    java.lang.System.out.println("-----Repo info defined by user-----")
    pkgLists.forEach[java.lang.System.out.println(it.toString)]
    java.lang.System.out.println("-----------------------------------")

    java.lang.System.out.println("-----Repo info from dhelp (released)-----")
    var released_repoInfos = getReleaseInfo(pkgLists.map[name].toList, rosdistro)
    released_repoInfos.forEach[java.lang.System.out.println(it.print)]
    java.lang.System.out.println("-----------------------------------")

    var Map<String, RepoInfo> map = new TreeMap
    for(pkg: pkgLists){
      if(pkg.repo!==null){
        // compare with released package list
        // not match leased info, use repo info defined by user
        if(!compareWithRelease(released_repoInfos, pkg.repo)){
          map.putIfAbsent(pkg.repo.name, pkg.repo)
          }else{
            pkg.repo.released = pkg.name
            pkg.repo = released_repoInfos.stream.filter[it.name == pkg.name].collect(Collectors.toList).get(0)
            map.putIfAbsent(pkg.repo.name, pkg.repo)
            }
        }
        // if user didn't define repo info, use released
        else{
          var findReleasedRepo = released_repoInfos.stream.filter[it.name == pkg.name].collect(Collectors.toList)
          if(findReleasedRepo.size > 0){
            pkg.repo = findReleasedRepo.get(0)
            map.putIfAbsent(pkg.repo.name, pkg.repo)
            }
          }
      }
      map.values
      .filter[it.accessible == false]
      .forEach[it.accessible = checkRepoAccessible(it.url)]
    java.lang.System.out.println("------Final repo info: -----------")
    map.values.toList.forEach[java.lang.System.out.printf("%s\n", it.print)]
    java.lang.System.out.println("-----------------------------------")
    return map.values.toList
  }

// if fromFile has fromRepo
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
                else if(!compareWithRelease(repoInfos, getRepoInfo(pkg.fromGitRepo))){
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
    map.values.toList.forEach[it.accessible = checkRepoAccessible(it.url)]
//    map.values.toList.forEach[java.lang.System.out.printf("%s", it.print)]
    return map.values.toList
  }

  def compareWithRelease(List<RepoInfo> repoInfos, RepoInfo taget_repo){
    var same = false
    for(repoInfo: repoInfos){
      if(repoInfo.url.replace(".git","").equals(taget_repo.url.replace(".git",""))){
        if(taget_repo.version === null || repoInfo.version.equals(taget_repo.version)){
            same = true
        }
      }
    }
    return same
  }
}
