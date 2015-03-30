/*
 * #%L
 * org.eclipse.emf.eson.ui
 * %%
 * Copyright (C) 2009 - 2014 Sebastian Benz, Michael Vorburger and others
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.ui.labeling;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eson.eFactory.EFactoryPackage;
import org.eclipse.emf.eson.eFactory.NewObject;
import org.eclipse.emf.eson.ui.internal.EFactoryActivator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

public class EFactoryLabelProvider extends DefaultEObjectLabelProvider {

//	@Inject
//	protected EFactoryLabelProvider(AdapterFactory adapterFactory) {
//		super(new AdapterFactoryLabelProvider(adapterFactory));
//	}
	
	@Override
	protected Object doGetText(Object element) {
		StringBuilder text = new StringBuilder();

		if (element instanceof NewObject) {
			NewObject newObject = (NewObject) element;
			String className = newObject.getEClass().getName();
			text.append(className);

			String name = newObject.getName();
			if (name != null) {
				text.append(" ").append(name);
			}
		} else {
			return super.doGetText(element);
		}

		return text.toString();
	}

	@Override
	public Image getImage(Object element) {
		String imageURL = null;
		if (element instanceof EObject) {
			EObject eObject = (EObject) element;
			switch (eObject.eContainer().eClass().getClassifierID()) {
			case EFactoryPackage.FACTORY:
				imageURL = "icons/RootObject.gif";
				break;
			case EFactoryPackage.CONTAINMENT:
				imageURL = "icons/Component.gif";
				break;
			}
		}
		if (imageURL != null) {
			ImageDescriptor imageDescriptorFromPlugin = AbstractUIPlugin.imageDescriptorFromPlugin(EFactoryActivator
					.getInstance().getBundle().getSymbolicName(), imageURL);
			return imageDescriptorFromPlugin.createImage();
		}
		return super.getImage(element);
	}
}

