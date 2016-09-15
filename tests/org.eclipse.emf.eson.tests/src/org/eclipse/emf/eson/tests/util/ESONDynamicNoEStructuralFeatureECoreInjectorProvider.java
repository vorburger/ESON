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
package org.eclipse.emf.eson.tests.util;

import com.google.inject.Injector;

/**
 * Like ESONDynamicECoreInjectorProvider, but using
 * NoEStructuralFeatureEcoreSupport instead of EcoreSupport, so using
 * NoEStructuralFeatureEcoreQualifiedNameProvider instead of
 * EcoreQualifiedNameProvider.
 *
 * @see ESONDynamicECoreInjectorProvider
 * 
 * @author Michael Vorburger
 */
public class ESONDynamicNoEStructuralFeatureECoreInjectorProvider extends EFactoryInjectorProviderNG // NOT ESONWithTestmodelInjectorProvider, we do NOT want TestmodelPackageImpl.init() in this scenario  
{	// We're intentionally extends EFactoryInjectorProviderNG, note *NG, which is the variant with the new simplified Scope provider
	
	@Override
	protected Injector internalCreateInjector() {
	    new NoEStructuralFeatureEcoreSupport().registerServices(false);
		return super.internalCreateInjector();
	}
}
