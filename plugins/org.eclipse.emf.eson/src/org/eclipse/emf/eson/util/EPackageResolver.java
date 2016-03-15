/*
 * #%L
 * org.eclipse.emf.eson
 * %%
 * Copyright (C) 2009 - 2014 Sebastian Benz & Michael Vorburger
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.util;

import java.util.List;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Singleton;

@Singleton
public class EPackageResolver {

	/**
	 * We've seen a corner case (DS-6421) where there is no EMF ECore model gen.
	 * code, in the case of another Xtext lang. which "overloaded" Xbase, but doesn't have
	 * ANY grammar rules or terminals of it's own.
	 * 
	 * @return EPackage for nsURI, or null if there was a lookup problem.
	 */
	protected @Nullable EPackage getPackageFromRegistry(@NonNull String nsURI) {
		try {
			return EPackage.Registry.INSTANCE.getEPackage(nsURI);
		} catch (WrappedException e) {
			return null;
		}
	}

	/**
	 * All known EPackages.
	 * @return Iterable of EPackage, WITHOUT ANY null ENTRIES!
	 */
	public Iterable<EPackage> getAllRegisteredEPackages() {
		// copy due to potential CME while resolving EPackages
		List<String> packageUris = Lists.newArrayList(EPackage.Registry.INSTANCE.keySet());
		Iterable<String> packageUrisWithoutAnyNulls = Iterables.filter(packageUris, Predicates.notNull());
		Iterable<EPackage> packagesMaybeWithNull = Iterables.transform(packageUrisWithoutAnyNulls,
				new Function<String, EPackage>() {
					// @since Luna (Eclipse 4.4), @NonNull here leads to:
					// "Illegal redefinition of parameter uri, inherited method from Function<String,EPackage> does not constrain this parameter"
					// so we have to make this handstand here instead:
					public EPackage apply(@Nullable String uri) {
						if (uri == null)
							throw new IllegalArgumentException();
						return getPackageFromRegistry(uri);
					}
				});
		Iterable<EPackage> packagesWithoutAnyNulls = Iterables.filter(packagesMaybeWithNull, Predicates.notNull());
		return packagesWithoutAnyNulls;
	}
}
