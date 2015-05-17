/*
 * #%L
 * org.eclipse.emf.eson
 * %%
 * Copyright (C) 2015 Michael Vorburger
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.generators;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Optional;

/**
 * Utility with helper methods useful in IGenerator implementations.
 * 
 * @author Michael Vorburger
 */
public class GeneratorHelper {

	public <T extends EObject> Optional<T> getFirstRootContentOfType(Resource r, Class<T> klass) {
		EList<EObject> contents = r.getContents();
		for (EObject eObject : contents) {
			if (klass.isInstance(eObject)) {
				return Optional.of(klass.cast(eObject));
			}
		}
		return Optional.absent();
	}
	
}
