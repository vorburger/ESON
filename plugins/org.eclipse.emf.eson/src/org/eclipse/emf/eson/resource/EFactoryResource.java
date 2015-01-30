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
package org.eclipse.emf.eson.resource;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.eson.building.ModelBuilder;
import org.eclipse.emf.eson.building.ModelBuilderException;
import org.eclipse.emf.eson.eFactory.NewObject;
import org.eclipse.emf.eson.serialization.EFactoryAdapter;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IWriteAccess;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class EFactoryResource extends DerivedStateAwareResource {
	private static final Logger logger = Logger.getLogger(EFactoryDerivedStateComputer.class);

	@Inject private ModelBuilder builder;
	@Inject private Provider<EFactoryAdapter> eFactoryAdapterProvider;
	
	protected IWriteAccess<XtextResource> documentWriteAccess;
	
	public boolean isBuilt() {
		return getBuilder().isBuilt();
	}
	
	public NewObject getEFactoryNewObject(EObject eObject) {
		if (builder == null) {
			return null;
		}
		if (!builder.isBuilt())
			return null;
		try {
			return builder.getSource(eObject);
		} catch (ModelBuilderException e) {
			return null;
		}
	}

	public NewObject getExistingEFactoryNewObject(EObject eObject) {
		NewObject newObject = getEFactoryNewObject(eObject);
		if (newObject == null) {
			throw new IllegalArgumentException(eObject.toString());
		}
		return newObject ;
	}
	
	public Optional<EObject> getEFactoryEObject(NewObject nObject) throws ModelBuilderException {
		ModelBuilder _builder = getBuilder();
		if (_builder.isBuilt())
			return Optional.of(_builder.getBuilt(nObject));
		else
			return Optional.absent();
	}

	// package-private, as only used by EFactoryDerivedStateComputer
	ModelBuilder getBuilder() throws IllegalStateException {
		// written in this weird style just to satisfy Eclipse' slightly dumb null check
		final ModelBuilder _builder = builder;
		if (_builder != null) {
			return _builder;
		} else {
			throw new IllegalStateException("EFactoryResource is missing @Injected ModelBuilder?!");
		}
	}
	
	public org.eclipse.emf.eson.eFactory.Factory getEFactoryFactory() {
		if (getContents().isEmpty()) {
			return null;
		}
		return (org.eclipse.emf.eson.eFactory.Factory) getContents().get(0);
	}

	public void setWriteAccess(IWriteAccess<XtextResource> xtextDocument) {
		this.documentWriteAccess = xtextDocument;
	}

	// package-private, as only used by EFactoryDerivedStateComputer
	Provider<IWriteAccess<XtextResource>> getWriteAccessProvider() {
		return new Provider<IWriteAccess<XtextResource>>() {
			public IWriteAccess<XtextResource> get() {
				if (documentWriteAccess == null)
					// throw new IllegalStateException("setWriteAccess(IWriteAccess<XtextResource>) should have been called by org.eclipse.emf.eson.ui.editor.EFactoryXtextDocument.setInput(XtextResource), but wasnt't (yet) - how come?");
					return new XtextResourceDirectAccess(EFactoryResource.this);
				return documentWriteAccess;
			}
		};
	}

	/**
	 * The "back synchronization" is done by the EFactoryAdapter we add here.
	 * In the special case of an empty resource to which the first root EObject is added, as illustrated by the
	 * org.eclipse.emf.eson.builder.resync.tests.BuilderResyncTest.testCreateCompletelyNew(),
	 * we need this handling. 
	 */
	@Override
	public void attached(EObject eObject) {
		super.attached(eObject);
		if (contents.size() > 1 && contents.get(1).equals(eObject)) {
			EFactoryAdapter adapter = eFactoryAdapterProvider.get();
			adapter.setWriteAccessProvider(getWriteAccessProvider());
			if (getEFactoryNewObject(eObject) == null) {
				adapter.setRootNewObject(eObject);
			}
			eObject.eAdapters().add(adapter);
		}
	}

	public void putEObjectNewObjectPair(EObject eObject, NewObject newObject) {
		builder.putEObjectNewObjectPair(eObject, newObject);
	}

	public static EObject getEFactoryEObject(Resource r) {
		if (!(r instanceof EFactoryResource)) {
			logger.warn("EMF Resource is not an EFactoryResource (caller should not even have invoked this method): " + r.getURI().toString());
			return null;
		}
		final EFactoryResource eFactoryResource = (EFactoryResource) r;
		if (!eFactoryResource.isBuilt())
			return null;
		org.eclipse.emf.eson.eFactory.Factory factory = eFactoryResource.getEFactoryFactory();
		if (factory == null)
			return null;
		try {
			return eFactoryResource.getEFactoryEObject(factory.getRoot()).orNull();
		} catch (ModelBuilderException e) {
			return null;
		}
	}

	public static <T> T getEFactoryEObject(Resource r, Class<T> clazz) {
		EObject object = getEFactoryEObject(r);
		if (object == null)
			return null;
		if (!clazz.isInstance(object)) {
			final URI rURI = object.eResource().getURI();
			throw new IllegalArgumentException("EObject built by EFactory in resource '"
					+ rURI + "' is of type '"
					+ object.getClass().getName() + "' and not '"
					+ clazz.getName() + "'");
		}
		return clazz.cast(object);
	}
}
