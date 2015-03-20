/*
 * #%L
 * org.eclipse.emf.eson
 * %%
 * Copyright (C) 2009 - 2014 Sebastian Benz, Michael Vorburger and others
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eson.eFactory.PackageImport;
import org.eclipse.xtext.scoping.IScope;

import com.google.inject.Inject;

public class EFactoryScopeProvider extends EFactoryScopeProviderNG {

	@Inject
	private IEPackageScopeProvider ePackageScopeProvider;

	public IScope scope_PackageImport_ePackage(PackageImport packageImport, EReference eReference) {
		final IScope parent = delegateGetScope(packageImport, eReference);
		return ePackageScopeProvider.createEPackageScope(packageImport.eResource(), parent);
	}

//	@Override
//	public IScope scope_NewObject_eClass(NewObject factory, EReference eReference) {
//		final IScope parent = super.scope_NewObject_eClass(factory, eReference);
//		IScope scope = ePackageScopeProvider.createEClassScope(factory.eResource(), parent);
//		return scope;
//	}

	// Feature == Containment here, always, is it?
//	public IScope scope_NewObject_eClass(Feature feature, EReference eReference) {
//		if (feature.getEFeature() instanceof EReference) {
//			final IScope parent = delegateGetScope(feature, eReference);
//			return ePackageScopeProvider.createEClassScope(feature.eResource(), (EClass) feature.getEFeature().getEType(), parent);
//		} else
//			return IScope.NULLSCOPE;
//			
//	}

	public IScope scope_CustomNameMapping_eClass(EObject context, EReference eReference) {
		final IScope parent = delegateGetScope(context, eReference);
		return ePackageScopeProvider.createEClassScope(context.eResource(), parent);
	}

}
