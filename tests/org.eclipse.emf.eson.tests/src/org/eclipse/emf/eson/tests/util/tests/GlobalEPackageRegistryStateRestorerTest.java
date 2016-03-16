/*
 * #%L
 * org.eclipse.emf.eson
 * %%
 * Copyright (C) 2016 Michael Vorburger and others
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.tests.util.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.eson.tests.util.GlobalEPackageRegistryStateRestorer;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import testmodel.TestmodelPackage;

/**
 * Unit test for GlobalEPackageRegistryStateRestorer.
 * 
 * @author Michael Vorburger
 */
@RunWith(XtextRunner.class)
@InjectWith(GlobalEPackageRegistryStateRestorer.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GlobalEPackageRegistryStateRestorerTest {

	@Test
	public void test1_GlobalEPackageRegistryIsAlmostEmpty() {
		assertEquals(2, EPackage.Registry.INSTANCE.size());
	}

	@Test
	public void test2_polluteGlobalEPackageRegistryAndDontCleanItUp() {
		assertEquals("TestModel", TestmodelPackage.Literals.TEST_MODEL.getName());
		assertEquals(5, EPackage.Registry.INSTANCE.size());
	}

	@Test
	public void test3_VerifyGlobalEPackageRegistryIsAlmostEmptyAgain() {
		assertEquals(2, EPackage.Registry.INSTANCE.size());
	}

}
