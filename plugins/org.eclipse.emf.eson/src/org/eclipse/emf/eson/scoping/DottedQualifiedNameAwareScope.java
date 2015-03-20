/**
 * <copyright>
 *
 * Copyright (c) 2014 Michael Vorburger and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Sebastian Benz - Initial API and implementation
 *
 * </copyright>
 *
 * 
 */
package org.eclipse.emf.eson.scoping;

import java.util.Collections;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

public class DottedQualifiedNameAwareScope extends AbstractScope {

	public DottedQualifiedNameAwareScope(IScope parent, boolean ignoreCase) {
		super(parent, ignoreCase);
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		IEObjectDescription singleElement = super.getSingleElement(name);
		if (singleElement != null) {
			return singleElement;
		}
		QualifiedName mergedName = mergeTwoLastSegments(name);
		if (mergedName == null) {
			return null;
		}
		return getSingleElement(mergedName);
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		Iterable<IEObjectDescription> elements = super.getElements(name);
		if (elements.iterator().hasNext()) {
			return elements;
		}
		QualifiedName mergedName = mergeTwoLastSegments(name);
		if (mergedName == null) {
			return elements;
		}
		return getElements(mergedName);
	}

	protected QualifiedName mergeTwoLastSegments(QualifiedName name) {
		if (name.getSegmentCount() <= 1) {
			return null;
		}
		String mergedSegments = name.getSegment(name.getSegmentCount() - 2) + '.' + name.getLastSegment();
		return name.skipLast(2).append(mergedSegments);
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		return Collections.emptyList();
	}

}
