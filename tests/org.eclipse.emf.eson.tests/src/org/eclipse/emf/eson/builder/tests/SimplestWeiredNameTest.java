/*
 * #%L
 * org.eclipse.emf.eson.tests
 * %%
 * Copyright (C) 2013 - 2015 Michael Vorburger
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
import org.eclipse.emf.eson.tests.util.DumpIndexUtil;
import org.eclipse.emf.eson.tests.util.ESONWithTestmodelAndDynamicECoreInjectorProvider;
import org.eclipse.emf.eson.tests.util.ResourceProvider;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ESONWithTestmodelAndDynamicECoreInjectorProvider.class) // NOT just ESONWithTestmodelInjectorProvider
public class SimplestWeiredNameTest {

	@Inject ResourceProvider provider;

	// see also SimplestDynamicECoreTest - this is written in the same style
	
	@Test public void testNormallyNamedEClassWithWeirdoAndAttributeName() throws Exception {
		check("model/TestModelWithDotInNames.ecore",
				"res/BuilderTests/SimplestWithWeiredNamesWithDots1.eson", 
				"NormallyNamed");
	}

	@Test public void testWeirdoNamedEClassAndAttributeName() throws Exception {
		check("model/TestModelWithDotInNames.ecore",
				"res/BuilderTests/SimplestWithWeiredNamesWithDots2.eson", 
				"WEIRDO.NAMED");
	}
	
	protected void check(String ecorePath, String esonPath, String expectedEClassName) throws Exception {
		provider.load(ecorePath, false /* do NOT validate, as the weird names with dot violate ECore validation */);
		// Do NOT DumpIndexUtil.dumpXtextIndex(ePackage.eResource()); as that does not work yet for *.ecore as this stage (later below on an *.eson it works - and dumps the *.ecore as well)

		// DEBUG:
		EList<EObject> content = provider.load(esonPath, false);
		DumpIndexUtil.dumpXtextIndex(content.get(0).eResource());

		EObject em = provider.loadModel(esonPath, EObject.class);
		assertEquals(expectedEClassName, em.eClass().getName());
		String strangelyNameAttributeValue = (String) em.eGet(em.eClass().getEAllAttributes().get(0));
		assertEquals("hello", strangelyNameAttributeValue);
	}
}
