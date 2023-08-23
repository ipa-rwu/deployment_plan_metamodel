package de.fraunhofer.ipa.deployment.standalone.java.app;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import de.fraunhofer.ipa.deployment.ImplementationDescriptionStandaloneSetup;
import de.fraunhofer.ipa.deployment.PlanStandaloneSetup;
import de.fraunhofer.ipa.targetEnvironment.DeviceStandaloneSetup;
import de.fraunhofer.ipa.targetEnvironment.TargetEnvironmentStandaloneSetup;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Aborting: no path to EMF resource provided!");
            return;
        }

        // register cross reference DSL
        TargetEnvironmentStandaloneSetup.doSetup();
        DeviceStandaloneSetup.doSetup();
        ImplementationDescriptionStandaloneSetup.doSetup();

        // register main DSL
        Injector injector = new PlanStandaloneSetup().createInjectorAndDoEMFRegistration();
        Main main = injector.getInstance(Main.class);

        // process inputs
        List<File> inputs = new ArrayList<>();

        for(String m : args) {
            Path path = Paths.get(m);
            if(!Files.exists(path)) {
                System.err.printf("Aborting: %s doesn't exist. You can provide a folder or files", m);
                return;
            }
            if(Files.isDirectory(path)) {
                File directoryPath = new File(m);
                inputs.addAll(List.of(directoryPath.listFiles()));
            }
            inputs.add(new File(m));
        }
        main.runGenerator(inputs);
    }

    @Inject
    private Provider<ResourceSet> resourceSetProvider;

    @Inject
    private IResourceValidator validator;

    @Inject
    private GeneratorDelegate generator;

    @Inject
    private JavaIoFileSystemAccess fileAccess;

    protected void runGenerator(List<File> files) {
        List<File> resourceFiles = new ArrayList<>();
        List<File> planFileList = new ArrayList<>();
        for(File f : files) {
            if(f.getName().toLowerCase().endsWith(".plan")) {
                planFileList.add(f);
                }
            }
        if(planFileList.size() == 0) {
            System.err.printf("Aborting: There is no \"plan model (.plan)\"\n");
            return;
            }
        if(planFileList.size() > 1 ) {
           System.err.printf("Aborting: There are more than one \"plan model (.plan)\"\n");
           return;
           }
        File planFile = planFileList.get(0);
        resourceFiles.add(planFile);
        System.out.printf("Plan model file name: %s\n", planFile.getName());
        System.out.printf("Plan model file path: %s\n", planFile.getAbsolutePath());

        List<File> tarEnvFilesList = new ArrayList<>();
        for(File f : files) {
            if(f.getName().toLowerCase().endsWith(".tarEnv".toLowerCase())) {
                tarEnvFilesList.add(f);
                }
            }
        if(tarEnvFilesList.size() == 0) {
            System.err.printf("Aborting: There is no \"plan model (.plan)\"\n");
            return;
            }

        resourceFiles.add(tarEnvFilesList.get(0));
        System.out.printf("Plan model file name: %s\n", tarEnvFilesList.get(0).getName());
        System.out.printf("Plan model file path: %s\n", tarEnvFilesList.get(0).getAbsolutePath());

        for(File f : files) {
            if(f.getName().toLowerCase().endsWith(".dev".toLowerCase())) {
                resourceFiles.add(f);
                }
            }

        for(File f : files) {
            if(f.getName().toLowerCase().endsWith(".impl".toLowerCase())) {
                resourceFiles.add(f);
                }
            }

           ResourceSet set = resourceSetProvider.get();

           Resource planResource = set.getResource(URI.createFileURI(planFile.getAbsolutePath()), true);
           List<Resource> all_resources = new ArrayList<Resource>();
           all_resources.add(planResource);

           for(File f: resourceFiles) {
               Resource other = set.getResource(URI.createFileURI(f.getAbsolutePath()), true);
               all_resources.add(other);
            }

           // Validate all resources
           for (Resource r: all_resources) {
               List<Issue> list = validator.validate(r, CheckMode.ALL, CancelIndicator.NullImpl);
               if (!list.isEmpty()) {
                   for (Issue issue : list) {
                       System.err.println(issue);
                   }
                   return;
               }
           }

            // Configure and start the generator
            fileAccess.setOutputPath("src-gen/");
            GeneratorContext context = new GeneratorContext();
            context.setCancelIndicator(CancelIndicator.NullImpl);
            generator.generate(planResource, fileAccess, context);

            System.out.println("Code generation finished.");
    }

}
