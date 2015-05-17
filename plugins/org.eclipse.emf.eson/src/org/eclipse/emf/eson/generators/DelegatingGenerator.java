/*
 * #%L
 * org.eclipse.emf.eson
 * %%
 * Copyright (C) 2015 Michael Vorburger
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.generators;

import java.util.ServiceLoader;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;

/**
 * An IGenerator which delegates to other IGenerator listed in a
 * META-INF/services/org.eclipse.xtext.generator.IGenerator on the classpath of
 * the project of the input Resource being generated.
 * 
 * TODO Also support looking up generators from other plug-ins using an
 * extension point instead of only the run-time classpath? See à la
 * com.temenos.ds.op.xtext.generator.ui.IGeneratorsProvider, and
 * com.temenos.ds.op.xtext.generator.ui.PluginsGeneratorsProvider.
 * 
 * @author Michael Vorburger, based on ClassLoader magic tips from Stefan Oehme
 */
public class DelegatingGenerator implements IGenerator {
	private static final Logger logger = Logger.getLogger(DelegatingGenerator.class);

	// TODO Integration Test!! @see com.temenos.ds.op.xtext.generator.tests.MultiGeneratorXtextBuilderParticipantTest

	protected @Inject JdtBasedClassLoaderProvider classLoaderProvider;
	
	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		ClassLoader classLoader = getClassLoader(input);
		Iterable<IGenerator> generators = getGenerators(classLoader);
		for (IGenerator generator : generators) {
			try {
 				generator.doGenerate(input, fsa);
			} catch (Exception e) {
				logger.error("Caught exception from doGenerate() of " + generator.toString() + " for URI: " + input.getURI(), e);
			}
		}
	}

	protected ServiceLoader<IGenerator> getGenerators(ClassLoader classLoader) {
		return ServiceLoader.load(IGenerator.class, classLoader); // TODO Perhaps this should be cached?
	}

	// originally inspired by / stolen from org.eclipse.xtext.common.types.access.ClasspathTypeProviderFactory.getClassLoader(ResourceSet)
	public ClassLoader getClassLoader(Resource resource) {
		ResourceSet resourceSet = resource.getResourceSet(); 
		if (resourceSet instanceof XtextResourceSet) {
			XtextResourceSet xtextResourceSet = (XtextResourceSet) resourceSet;
			Object ctx = xtextResourceSet.getClasspathURIContext();
			if (ctx != null) {
				// NEW, added by Michael Vorburger (TODO Isn't there an existing helper in Xtext that does this?)
				if (ctx instanceof IJavaProject) {
					IJavaProject javaProject = (IJavaProject) ctx;
					Class<?> modelClass = resource.getContents().get(1).getClass(); // TODO harden this.. check if it's an ESON Resource, obtain first non-Factory instance 
					ClassLoader delegatingClassLoader = new DelegatingClassLoader(IGenerator.class.getClassLoader(), modelClass.getClassLoader());
					classLoaderProvider.setParentClassLoader(delegatingClassLoader);
					return classLoaderProvider.createClassLoaderForJavaProject(javaProject); // TODO Perhaps this should be cached?
				}
		        if (ctx instanceof Class<?>) {
		            return ((Class<?>)ctx).getClassLoader();
		        }
		        if (!(ctx instanceof ClassLoader)) {
		        	return ctx.getClass().getClassLoader();
		        }
		        return (ClassLoader) ctx;
			}
		}
		throw new IllegalArgumentException("Cannot obtain a ClassLoader for this ResourceSet: " + resourceSet.toString());
	}

}
