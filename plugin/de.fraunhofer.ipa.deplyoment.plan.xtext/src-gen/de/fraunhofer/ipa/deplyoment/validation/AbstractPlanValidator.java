/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deplyoment.validation;

import de.fraunhofer.ipa.deployment.validation.UtilValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractPlanValidator extends UtilValidator {

    @Override
    protected List<EPackage> getEPackages() {
        List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
        result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.ipa.fraunhofer.de/DeploymentPlan"));
        result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.ipa.fraunhofer.de/Util"));
        return result;
    }
}
