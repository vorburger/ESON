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
package org.eclipse.emf.eson.builder.resync.tests;

import javax.inject.Inject;

import org.eclipse.emf.eson.EFactoryUiInjectorProvider;
import org.eclipse.emf.eson.eFactory.Factory;
import org.eclipse.emf.eson.eFactory.Feature;
import org.eclipse.emf.eson.resource.EFactoryResource;
import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.DocumentPartitioner;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.junit.Test;
import org.junit.runner.RunWith;

import testmodel.SingleRequired;
import testmodel.TestModel;

import com.google.common.base.Preconditions;
import com.google.inject.Injector;

/**
 * Tests the "re-sychronization" of changes to the derived "real" EObjects to
 * the source EFactory model at the UI (XtextEditor) integration level. This is
 * similar to the more lower level BuilderResyncTest, but works at the
 * XtextDocument level, so this one makes sure that the IWriteAccess stuff & Co.
 * we have to use work as they should in EFactoryAdapter.
 * 
 * @see BuilderResyncTest
 * @see org.eclipse.xtext.util.concurrent.IWriteAccess
 * 
 * @author Michael Vorburger
 */
@RunWith(XtextRunner.class)
@InjectWith(EFactoryUiInjectorProvider.class)
public class UIResyncTest extends AbstractXtextTests {

	@Inject Injector injector;
	@Inject XtextDocument document;
	@Inject DocumentPartitioner partitioner; 
	
	@Override
	public void setUp() throws Exception {
		super.setUp();
		setInjector(injector);
		disableSerializerTest();
	}

	@Test
	public void testDocumentChangesWhenModifyingDerrivedEObject() throws Exception {
		XtextResource resource = load("BuilderResyncTests/1TestModelWithNameProperty.efactory");
		assertEquals("use testmodel.* \n\nTestModel {\n	name: \"test\"\n	singleRequired: SingleRequired { }\n}\n", document.get());

		TestModel testModel = getTestModel(resource);
		assertEquals("test", testModel.getName());
		testModel.setName("tested");

		assertEquals("use testmodel.* \n\nTestModel {\n	name: \"tested\"\n	singleRequired: SingleRequired { }\n}\n", document.get());
	}

	/**
	 * Tests that the NodeFixer correctly spaces out (indents) new features
	 * added programmatically (incl. e.g. via Properties sheet).
	 * 
	 * Also see
	 * {@link BuilderResyncTest#testNewFeaturesAreNotGluedToEachOther()}.
	 */
	@Test
	public void testNewFeaturesAreNotGluedToEachOther() throws Exception {
		XtextResource resource = load("res/BuilderResyncTests/3TestModelWithNoSpace.eson");
		
		TestModel testModel = getTestModel(resource);
		SingleRequired singleReq = testModel.getSingleRequired();
		singleReq.setParentAttribute(true);
		singleReq.setParentReference(testModel);

		String expectedDSL = readFileIntoString("res/BuilderResyncTests/3TestModelWithNoSpaceEXPECTED.eson");
		XtextResource expectedResource = getResourceAndExpect(getAsStream(expectedDSL), 0);
		dumpExampleFeature(expectedResource);
		dumpExampleFeature(resource);
		
		assertEquals(expectedDSL, document.get());		
	}

	protected void dumpExampleFeature(XtextResource resource) {
		Factory eFactory = (Factory) resource.getContents().get(0);
		Feature feature = (Feature) eFactory.getRoot().getFeatures().get(0);
		INode node = NodeModelUtils.findActualNodeFor(feature);
		String text = NodeModelUtils.compactDump(node, true);
		// Even if we don't dump this text to stdout, compactDump is very useful
		// because it detects inconsistencies in the Node model which the
		// NodeFixer may have caused by throwing exceptions.
		System.out.println(text);
	}

	protected XtextResource load(String testModelResourceName) throws Exception {
		String text = readFileIntoString(testModelResourceName);
		XtextResource resource = getResourceAndExpect(getAsStream(text), 0);

		document.set(text);
		document.setInput(resource);
		partitioner.connect(document);
		document.setDocumentPartitioner(partitioner);
		return resource;
	}	

	protected TestModel getTestModel(XtextResource resource) {
		TestModel testModel = EFactoryResource.getEFactoryEObject(resource, TestModel.class);
		assertNotNull(testModel);
		Preconditions.checkNotNull(testModel);
		return testModel;
	}


}
