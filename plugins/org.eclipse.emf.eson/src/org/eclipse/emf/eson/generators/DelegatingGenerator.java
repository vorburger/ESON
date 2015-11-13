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
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

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

	protected @Inject ClassLoaderProvider classLoaderProvider;
	
	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		delegateToProjectRuntimeClasspathGenerators(input, fsa);
		delegateToPluginGenerators(input, fsa);
	}

	protected void delegateToPluginGenerators(Resource input, IFileSystemAccess fsa) {
		// TODO Auto-generated method stub
	}

	protected void delegateToProjectRuntimeClasspathGenerators(Resource input, IFileSystemAccess fsa) {
		ClassLoader classLoader = classLoaderProvider.getClassLoader(input);
		invokeGeneratorsAndHandleErrors(input, fsa, getGenerators(classLoader), "project runtime classpath generator ");
	}

	protected void invokeGeneratorsAndHandleErrors(Resource input, IFileSystemAccess fsa, Iterable<IGenerator> generators, String errorMessagePrefix) {
		for (IGenerator generator : generators) {
			try {
 				generator.doGenerate(input, fsa);
			} catch (Exception e) {
				logger.error("Caught exception from doGenerate() of " + errorMessagePrefix + generator.toString() + " for URI: " + input.getURI(), e);
			}
		}
	}

	protected ServiceLoader<IGenerator> getGenerators(ClassLoader classLoader) {
		return ServiceLoader.load(IGenerator.class, classLoader); // TODO Perhaps this should be cached?
	}

}
