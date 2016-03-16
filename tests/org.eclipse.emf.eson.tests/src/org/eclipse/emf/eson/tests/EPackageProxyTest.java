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
package org.eclipse.emf.eson.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eson.tests.util.GlobalEPackageRegistryStateRestorer;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import testmodel.TestmodelFactory;
import testmodel.TestmodelPackage;
import testmodel.impl.TestmodelPackageImpl;
import testmodel.testsubmodel.TestsubmodelPackage;
import testmodel.testsubmodelWithTraditionalURI.TestsubmodelWithTraditionalURIPackage;

/**
 * Test to learn about EPackage.Registry and EMF Proxy resolution for EPackage.
 *
 * @author Michael Vorburger
 */
@RunWith(XtextRunner.class)
@InjectWith(GlobalEPackageRegistryStateRestorer.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // should not matter thanks to GlobalEPackageRegistryStateRestorer, but just to be sure
public class EPackageProxyTest {

	// TODO For this test to work, it would need a custom per-test-method classloader mechanism, 
	// such as powermock's, so that TestsubmodelPackage.eINSTANCE gets reset between tests,
	// @see http://stackoverflow.com/questions/11829817/reset-class-static-variable-during-unit-test
	// http://vanillajava.blogspot.ch/2011/07/java-secret-loading-and-unloading.html

	// Must use TestmodelPackage instead of XtextPackage
	// because XtextPackage is in org.eclipse.xtext.junit4.GlobalRegistries.initializeDefaults()
	
	@Test
	public void test1_AutoRegistryInitOnAccessOfNonConstantEINSTANCEField() {
		// Given that the the Testmodel is not yet registered in the Registry 
		assertNull(EPackage.Registry.INSTANCE.get(TestmodelPackage.eNS_URI));
		assertNull(EPackage.Registry.INSTANCE.getEPackage(TestmodelPackage.eNS_URI));
		// When we access a Literal, which implicitly does the init()
		assertEquals("TestModel", TestmodelPackage.Literals.TEST_MODEL.getName());
		// Then expect Testmodel to now be registered in the Registry
		assertNotNull(EPackage.Registry.INSTANCE.get(TestmodelPackage.eNS_URI));
		assertNotNull(EPackage.Registry.INSTANCE.getEPackage(TestmodelPackage.eNS_URI));
	}
	
	@Test
	public void test1b_runTest1_again() {
		test1_AutoRegistryInitOnAccessOfNonConstantEINSTANCEField();
	}

	@Test
	public void test2_NoInitWhenOnlyAccessingConstantOnInterfaceSuchAsPackageNsURI() {
		// Given that the the Testmodel is not yet registered in the Registry 
		assertNull(EPackage.Registry.INSTANCE.get(TestmodelPackage.eNS_URI));
		assertNull(EPackage.Registry.INSTANCE.getEPackage(TestmodelPackage.eNS_URI));
		// When access a constant static (interface) field (which in Java DOT do the init()
		assertEquals("testmodel", TestmodelPackage.eNS_URI);
		// Then expect that the, non simple constant, field eINSTANCE = XtextPackageImpl.init() has not run, yet, no still nothing in the Registry
		assertNull(EPackage.Registry.INSTANCE.get(TestmodelPackage.eNS_URI));
	}

	@Test
	public void test3_verifyRegisterTestmodelPackageDescriptor() {
		// Given that the the Testmodel is not yet registered in the Registry 
		assertNull(EPackage.Registry.INSTANCE.get(TestmodelPackage.eNS_URI));
		assertNull(EPackage.Registry.INSTANCE.getEPackage(TestmodelPackage.eNS_URI));
		// When we register the Descriptor
		registerTestmodelPackageDescriptor();
		// Then the Registry does not contain a real *Impl, yet (just a Descriptor)
		assertFalse(EPackage.Registry.INSTANCE.get(TestmodelPackage.eNS_URI) instanceof TestmodelPackageImpl);
		
		// When we getEPackage(), instead of Map get()
		assertNotNull(EPackage.Registry.INSTANCE.getEPackage(TestmodelPackage.eNS_URI));
		// Then the Registry contains a real *Impl (because it resolved the Descriptor)
		assertTrue(EPackage.Registry.INSTANCE.get(TestmodelPackage.eNS_URI) instanceof TestmodelPackageImpl);
	}
	
	private void registerTestmodelPackageDescriptor() {
		EPackage.Registry.INSTANCE.put(TestmodelPackage.eNS_URI, new EPackage.Descriptor() {
			// NOTE This is "lazy" - only actually happens when called (later), not during the put()
			public EPackage getEPackage() {
				return TestmodelPackage.eINSTANCE;
			}
			public EFactory getEFactory() {
				return TestmodelFactory.eINSTANCE;
			}
		});
	}

	@Test
	public void test4_nsTestModelPackageEPackageProxyResolution() {
		registerTestmodelPackageDescriptor();
		testEPackage(TestmodelPackage.eNS_URI, "testmodel.impl.TestmodelPackageImpl");
	}

	@Test
	public void test5_nsTestsubmodelPackageEPackageProxyResolution() {
		registerTestmodelPackageDescriptor();
		testEPackage(TestsubmodelPackage.eNS_URI, "testmodel.testsubmodel.impl.TestsubmodelPackageImpl");
	}

	@Test
	public void test6_nsTestsubmodelWithTraditionalURIPackageEPackageProxyResolution() {
		registerTestmodelPackageDescriptor();
		testEPackage(TestsubmodelWithTraditionalURIPackage.eNS_URI, "testmodel.testsubmodelWithTraditionalURI.impl.TestsubmodelWithTraditionalURIPackageImpl");
	}

	protected void testEPackage(String stringNsURI, String expectedEPackageImplInstanceClassName) {
		EObject proxyEPackage = getEPackageProxy(stringNsURI);
		EPackage resolvedEPackage = (EPackage) EcoreUtil.resolve(proxyEPackage, (ResourceSet) null);
		assertTrue(!resolvedEPackage.eIsProxy());
		assertEquals(stringNsURI, resolvedEPackage.getNsURI());
		// Important: Make sure it's the Java instance is actually of the correct (sub) type of EPackage..
		assertEquals(expectedEPackageImplInstanceClassName, resolvedEPackage.getClass().getName());
	}

	@Test
	public void test7_TestModelPackageEPackageProxyResolution() {
		testEPackage(TestmodelPackage.eINSTANCE);
	}

	@Test
	public void test8_TestsubmodelPackageEPackageProxyResolution() {
		testEPackage(TestsubmodelPackage.eINSTANCE);
	}

	@Test
	public void test9_TestsubmodelWithTraditionalURIPackageEPackageProxyResolution() {
		testEPackage(TestsubmodelWithTraditionalURIPackage.eINSTANCE);
	}

	protected void testEPackage(EPackage someEPackage) {
		{
			URI uri = EcoreUtil.getURI(someEPackage); // TOOD or EcoreUtil2.getNormalizedURI(), or EcoreUtil2.getPlatformResourceOrNormalizedURI() ?
			InternalEObject proxyEPackage = (InternalEObject) EcoreFactory.eINSTANCE.createEPackage();
			proxyEPackage.eSetProxyURI(uri);
	
			EObject reResolvedEPackage = EcoreUtil.resolve(proxyEPackage, (ResourceSet) null);
			assertTrue(!reResolvedEPackage.eIsProxy());
			assertEquals(someEPackage, reResolvedEPackage);
		}		
		{
			EPackage proxyEPackage = getEPackageProxy(someEPackage.getNsURI());
			EObject reResolvedEPackage = EcoreUtil.resolve(proxyEPackage, (ResourceSet) null);
			assertTrue(!reResolvedEPackage.eIsProxy());
			// Important: Make sure it's the Java instance is actually of the correct (sub) type of EPackage..
			// THIS IS NOT POSSIBLE USING PROXY :(
			assertEquals(someEPackage, reResolvedEPackage);
		}
	}

	// TODO mv into org.eclipse.emf.eson.util.EPackageRegistry
	protected EPackage getEPackageProxy(String nsURI) {
		EPackage proxyEPackage = EcoreFactory.eINSTANCE.createEPackage();
		URI uri = URI.createURI(nsURI);
		uri = uri.appendFragment("/"); // Hah! This is needed..
		((InternalEObject) proxyEPackage).eSetProxyURI(uri);
		return proxyEPackage;
	}
}
