/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.util.RunTimeType
import deploymentPlan.AbstractComputationAssignment
import deploymentPlan.AbstractDeploymentPlan
import deploymentPlan.ConfigSoftwareComponent
import deploymentPlan.DeploymentPlan
import deploymentPlan.ImplementationAssignment
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import java.util.stream.Collectors
import jakarta.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */



class PlanGenerator extends AbstractGenerator {

    @Inject
    extension RepoInstallCompiler

    @Inject
    extension DockerFileCompiler

    @Inject
    extension GitHubWorkflowCompiler

    @Inject
    extension AnsibleCompiler ansibleCompiler

    @Inject
    extension DockerComposeCompiler

    @Inject
    extension DeploymentHelper

    @Inject
    extension DeploymentDocumentCompiler docCompiler

    @Inject
    extension DocMakefileCompiler docMakefileCompiler

    @Inject
    extension GitLabCICompiler

    @Inject
    extension LocalDockerBuilder

    public var NamingHelper naming = new NamingHelper

    def DockerfilePath(String assignmentFolderPath){
        return String.format("%s/Dockerfile", assignmentFolderPath)
    }

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val plans = resource.allContents.toIterable.filter(AbstractDeploymentPlan)
        generateFiles(plans.toList, fsa)

    }

    def generateFiles(List<AbstractDeploymentPlan> plans, IFileSystemAccess2 fsa){
      for(plan: plans){
        naming.relativePlanFolderPath = plan.name
        generateWorkflow(plan, fsa, naming)
        generateAnsible(plan, fsa, naming)
        var assignments = plan.realize.realizations
        for (assignment : assignments){
            System.out.println(String.format("generate dockerfile:%s", assignment.name))
            generateDockerFile(assignment, plan, fsa, naming)
            generateRosInstall(assignment, plan, fsa, naming)
        }
        generateDockerComposeFile(assignments, fsa, naming)
        generateDocuments(plan, fsa)
      }
    }


      def generateRosInstall(AbstractComputationAssignment assignment, AbstractDeploymentPlan plan, IFileSystemAccess2 fsa, NamingHelper namingHelper) {
        if(assignment instanceof ImplementationAssignment)
        {
            System.out.println("generateRosInstall")

            var scs = assignment.softwareComponents
            var impls = scs.map[it as ConfigSoftwareComponent].stream.map[component].collect(Collectors.toList())
            fsa.generateFile(
                    namingHelper.getReposFile(assignment.name, assignment.executedBy.name),
                (plan as DeploymentPlan).RepoInstallCompiler(impls)
            )
        }
      }

        def generateDockerFile(AbstractComputationAssignment assignment, AbstractDeploymentPlan plan, IFileSystemAccess2 fsa, NamingHelper namingHelper) {
            if(assignment.runtimeType === null || assignment.runtimeType.type == RunTimeType.CONTAINER){
            fsa.generateFile(namingHelper.getRelativeDockerfilePath(assignment.name),
                assignment.dockerFileCompiler(namingHelper)
                )
            }
        }

        def generateWorkflow(AbstractDeploymentPlan plan, IFileSystemAccess2 fsa, NamingHelper namingHelper) {
            fsa.generateFile(
                namingHelper.getGithubReuseableWorkflowPath,
                ReusableWorkflow)
            fsa.generateFile(
                namingHelper.getGithubWorkflowPath(plan.name),
                plan.gitHubWorkflowCompiler(
                    namingHelper.absoluteDefaultGithubReuseableWorkflowPath, namingHelper)
            )
        }

        def generateGitlabCI(AbstractDeploymentPlan plan, IFileSystemAccess2 fsa, NamingHelper namingHelper) {
            fsa.generateFile(
                namingHelper.gitlabRuleTemplatePath,
                gitlabRuleTemplate)
            fsa.generateFile(
                namingHelper.gitlabJobTemplatePath,
                gitlabJobTemplate)
            fsa.generateFile(
                namingHelper.getGitlabCI,
                plan.gitlabCICompiler(namingHelper)
            )
        }

        def generateLocalDockerBuilder(AbstractDeploymentPlan plan, IFileSystemAccess2 fsa, NamingHelper namingHelper) {
            fsa.generateFile(
                namingHelper.getLocalDockerBuilderFilePath,
                plan.localDockerBuilder(namingHelper)
            )
        }

        def generateDockerComposeFile(List<AbstractComputationAssignment> assignments, IFileSystemAccess2 fsa, NamingHelper namingHelper) {
          var assPerExecutors = collectAssignmentPerExecutor(assignments)
            assPerExecutors.forEach[compDev, assignmentList|
                fsa.generateFile(
                namingHelper.getCyclonConfigPath(compDev.name),
                cycloneDDSConfig)
            fsa.generateFile(
                    namingHelper.getDockerComposePath(compDev.name),
                assignmentList.dockerComposeCompiler(compDev))]
        }


        def generateAnsible(AbstractDeploymentPlan plan, IFileSystemAccess2 fsa, NamingHelper namingHelper) {
            var ansibleNaming = new AnsibleNamingHelper
            ansibleNaming.relativeAnsibleFolderPath = plan.name
            fsa.generateFile(
                ansibleNaming.getConfigFilePath,
                ansibleCompiler.ansibleConfig
                )
            fsa.generateFile(
                ansibleNaming.getInventoryFilePath,
                ansibleCompiler.inventory(plan.deployTo)
                )
            fsa.generateFile(
                ansibleNaming.playbookFilePath,
                ansibleCompiler.playbook(plan, ansibleNaming)
                )
            fsa.generateFile(
                ansibleNaming.playbookDeployFilesPath,
                ansibleCompiler.playbook_deploy_files(plan, ansibleNaming)
                )
            fsa.generateFile(
                ansibleNaming.playbookStartComponentsFilePath,
                ansibleCompiler.playbook_start_components(plan, ansibleNaming)
                )
            fsa.generateFile(
                ansibleNaming.getTaskMainFilePath(ansibleNaming.taskCommonFolderPath),
                ansibleCompiler.taskRunCommonTasks(ansibleNaming)
                )
            fsa.generateFile(
              ansibleNaming.taskInstallDockerFilePath,
              ansibleCompiler.taskCheckInstallDocker
                )
            fsa.generateFile(
                ansibleNaming.getTaskMainFilePath(ansibleNaming.gettaskDeployFilesFolderPath),
                ansibleCompiler.taskDeployFiles(namingHelper)
                )
            fsa.generateFile(
                ansibleNaming.taskCheckSudoFilePath,
                ansibleCompiler.taskCheckSudo
                )
            fsa.generateFile(
                ansibleNaming.gitignorePath,
                ansibleCompiler.gitignore
                )
            fsa.generateFile(
                ansibleNaming.getTaskMainFilePath(ansibleNaming.taskStartApplicationFolderPath),
                ansibleCompiler.taskStartApplication(namingHelper)
                )
            fsa.generateFile(
                ansibleNaming.getTaskMainFilePath(ansibleNaming.taskStartComponentFolderPath),
                ansibleCompiler.taskStartComponents(plan, namingHelper)
                )
        }

      def generateDocuments(AbstractDeploymentPlan plan, IFileSystemAccess2 fsa) {
        var docNaming = new DocumentNamingHelper
        docNaming.relativeDocumentFolderPath = plan.name
        docNaming.docFiles
                fsa.generateFile(
            docNaming.makeBatPath,
            docCompiler.makeBat
          )
                fsa.generateFile(
            docNaming.makefilePath,
            docMakefileCompiler.makefile
          )
                fsa.generateFile(
            docNaming.mainIndexPath,
            docCompiler.mainIndex(docNaming.getDocFiles)
          )
                fsa.generateFile(
            docNaming.confPyPath,
            docCompiler.confPy(plan.name)
          )
                fsa.generateFile(
            docNaming.ansibleDocumentPath,
            docCompiler.ansibleInstruction(plan.deployTo, docNaming.ansibleDocumentName)
          )
                fsa.generateFile(
            String.format("%s/.gitkeep", docNaming.templateFolderPath), ""
          )
                fsa.generateFile(
            String.format("%s/.gitkeep", docNaming.staticFolderPath), ""
          )
                fsa.generateFile(
            docNaming.localBuildScriptPath,
            docCompiler.localBuildScript
          )
                fsa.generateFile(
            docNaming.ansibleDocumentPath,
            docCompiler.ansibleInstruction(plan.deployTo, docNaming.ansibleDocumentName)
          )
                fsa.generateFile(
            docNaming.targetEnvConfigFilePath,
            docCompiler.targetEnvriomentDescription(plan.deployTo, docNaming.targetEnvConfigFileName)
          )

          generateOverviewDocum(plan, fsa, docNaming)
          runSubprocess(new ArrayList<String>(Arrays.asList("chmod", "777", docNaming.localBuildScriptPath)));
            }

        def generateOverviewDocum(AbstractDeploymentPlan plan, IFileSystemAccess2 fsa, DocumentNamingHelper docNaming){
            fsa.generateFile(
            docNaming.overviewFilePath,
            docCompiler.deploymentIntroduction(plan, docNaming.overviewFileName, null)
      )
  }
}
