/*
 * #%L
 * org.eclipse.emf.eson.tests
 * %%
 * Copyright (C) 2015 Michael Vorburger
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.builder.tests;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.eson.tests.util.ESONWithTestmodelAndDynamicECoreInjectorProvider;
import org.eclipse.emf.eson.tests.util.ResourceProvider;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ESONWithTestmodelAndDynamicECoreInjectorProvider.class)
public class SimplestDynamicECoreTest {

	// TODO Support for an ESON with 'use' (soon 'import' ?) instead of FQN
	static final String ESON = "res/BuilderTests/SimplestDynamicEcore.eson";
	
	@Inject ResourceProvider provider;

	@Test public void testSimplest() throws Exception {
		EList<EObject> contents = provider.load("model/TestModel.ecore", true);
		EPackage ePackage = (EPackage) contents.get(0);
		assertEquals("testmodel", ePackage.getName());
		// Do NOT DumpIndexUtil.dumpXtextIndex(ePackage.eResource()); as that does not work yet for *.ecore as this stage (later below on an *.eson it works - and dumps the *.ecore as well)

		@SuppressWarnings("unused") EList<EObject> content = provider.load(ESON, false);
		// DEBUG: DumpIndexUtil.dumpXtextIndex(content.get(0).eResource());

		EObject em = provider.loadModel(ESON, EObject.class);
		assertEquals("TestModel", em.eClass().getName());
// NOTE Even this cannot work, as it mixes the dynamic and static style.. see main problem, below.
//		assertEquals("abc", em.eGet(TestmodelPackage.Literals.TEST_MODEL__NAME));

// TODO Should this be made to work? Can it? How?? ;-)
//		TestModel m = provider.loadModel("res/BuilderTests/Simplest.eson", TestModel.class);
//		assertEquals("abc", m.getName());
	}
}
