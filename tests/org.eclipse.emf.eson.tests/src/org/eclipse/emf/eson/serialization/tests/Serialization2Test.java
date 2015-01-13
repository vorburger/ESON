/*
 * #%L
 * org.eclipse.emf.eson.tests
 * %%
 * Copyright (C) 2013 - 2014 Michael Vorburger
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.serialization.tests;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.eclipse.emf.eson.tests.util.ESONWithTestmodelInjectorProvider;
import org.eclipse.emf.eson.tests.util.ResourceProvider;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import testmodel.TestModel;

@RunWith(XtextRunner.class)
@InjectWith(ESONWithTestmodelInjectorProvider.class)
public class Serialization2Test {

	@Inject protected ResourceProvider resourceProvider;
	
	@Test public void testReferenceTestSimpleAlternative() throws Exception {
		TestModel testModel = resourceProvider.loadModel("res/SerializationTests/ReferenceTestSimple.efactory", TestModel.class);
		String oldSerializedText = SerializationUtils.toString(testModel.eResource());
		
		testModel.getReferenceTestContainer().get(0).getContainments().get(0).setName("target2");
		String newSerializedText = SerializationUtils.toString(testModel.eResource());
		
		assertEquals(oldSerializedText.replace("target1", "target2"), newSerializedText);
	}
}
