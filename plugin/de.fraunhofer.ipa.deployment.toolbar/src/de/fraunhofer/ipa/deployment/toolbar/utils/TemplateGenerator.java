package de.fraunhofer.ipa.deployment.toolbar.utils;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

public class TemplateGenerator extends AbstractGenerator {

  @Override
  public void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
//    if (input instanceof Machine){
//      fsa.generateFile(((Machine) input).getName(), "hello");
//    }
  }

}
