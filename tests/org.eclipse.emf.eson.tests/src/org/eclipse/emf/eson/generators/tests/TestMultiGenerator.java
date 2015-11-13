package org.eclipse.emf.eson.generators.tests;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

/**
 * Example IMultiGenerator, for Tests.
 * 
 * @author Michael Vorburger
 */
public class TestMultiGenerator implements IGenerator {

	// TODO Test @Inject - make sure it's language specific
	
    @Override
    public void doGenerate(Resource input, IFileSystemAccess fsa) {
        fsa.generateFile(input.getURI().lastSegment() + ".txt", "hello, world: " + input.getURI().toString());
    }

}