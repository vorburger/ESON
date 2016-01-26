/*
 * #%L
 * org.eclipse.emf.eson
 * %%
 * Copyright (C) 2015 - 2016 Michael Vorburger
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.generators;

import java.util.ServiceConfigurationError;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

import com.google.inject.Inject;

/**
 * An IGenerator which delegates to other IGenerator listed in a
 * META-INF/services/org.eclipse.xtext.generator.IGenerator on the classpath of
 * the project of the input Resource being generated, or via the Eclipse plugin
 * system.
 * 
 * @author Michael Vorburger, based on ClassLoader magic tips from Stefan Oehme
 */
public class DelegatingGenerator implements IGenerator {
	private static final Logger logger = Logger.getLogger(DelegatingGenerator.class);

	// TODO Finish working Integration Test org.eclipse.emf.eson.generators.tests.GeneratorsTest

	// TODO look-up plug-in registered generators, using code like https://github.com/TemenosDS/com.temenos.ds.op/blob/master/base/plugins-ui/com.temenos.ds.op.xtext.ui/src/com/temenos/ds/op/xtext/generator/ui/PluginsGeneratorsProvider.java
	// TODO but should that code be here in core? That belongs into UI to avoid the dependency... I think we'll need an IGeneratorsProvider-like concept, see https://github.com/TemenosDS/com.temenos.ds.op/blob/master/base/plugins-ui/com.temenos.ds.op.xtext.ui/src/com/temenos/ds/op/xtext/generator/ui/IGeneratorsProvider.java 
	
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

	protected void invokeGeneratorsAndHandleErrors(Resource input, IFileSystemAccess fsa, Iterable<Object> generators, String errorMessagePrefix) {
		try {
			// NOTE: We MUST use Object instead of IGenerator here due to ClassLoader issues
			for (Object generator : generators) {
				try {
					doGenerateUsingReflection(generator, input, fsa);
				} catch (RuntimeException e) {
					logger.error("Caught exception from doGenerate() of " + errorMessagePrefix + generator.toString() + " for URI: " + input.getURI(), e);
					throw e;
				}
			}
		} catch (ServiceConfigurationError e) {
			logger.error("Caught exception when iterating over ServiceLoader", e);
			throw e;			
		}
	}

	/**
	 * Assuming generator is an IGenerator, do generator.doGenerate(input, fsa)
	 * using reflection instead of strong typing, in order to work around CL
	 * PITA.
	 */
	protected void doGenerateUsingReflection(Object generator, Resource input, IFileSystemAccess fsa) {
		try {
			generator.getClass().getMethods()[0].invoke(generator, input, fsa);
		} catch (ReflectiveOperationException e) {
			logger.error("Caught exception during doGenerateUsingReflection", e);
			throw new RuntimeException(e);
		}
	}

	protected Iterable<Object> getGenerators(ClassLoader classLoader) {
		try {
			// TODO Perhaps this should be cached?
			return ReflectiveServiceLoader.load("org.eclipse.xtext.generator.IGenerator", classLoader);
		} catch (ReflectiveServiceLoaderException e) {
			logger.error("Caught exception when obtaining project runtime classpath generators", e);
			throw new RuntimeException(e);
		}
	}

}
