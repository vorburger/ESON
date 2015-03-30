/*
 * #%L
 * org.eclipse.emf.eson.ui
 * %%
 * Copyright (C) 2013 - 2014 Michael Vorburger and others
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.ui.outline;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eson.eFactory.EFactoryPackage;
import org.eclipse.emf.eson.eFactory.impl.ContainmentImpl;
import org.eclipse.emf.eson.eFactory.impl.FactoryImpl;
import org.eclipse.emf.eson.eFactory.impl.FeatureImpl;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

/**
 * Outline.
 * 
 * @author Michael Vorburger
 */
public class EFactoryOutlineTreeProvider extends DefaultOutlineTreeProvider {
	private static final Logger logger = Logger.getLogger(EFactoryOutlineTreeProvider.class);

	@Override
	protected void createNode(IOutlineNode parent, EObject modelElement) {
		EClass eClass = modelElement.eClass();
		if (eClass != null) {
			switch (eClass.getClassifierID()) {
			case EFactoryPackage.FACTORY:
				// Get the rootObject from the Factory
				createNode(parent, ((FactoryImpl) modelElement).getRoot());
				break;
			case EFactoryPackage.PACKAGE_IMPORT:
			case EFactoryPackage.NAMESPACE_IMPORT:
			case EFactoryPackage.ANNOTATION:
			case EFactoryPackage.CUSTOM_NAME_MAPPING:
				// Skip these model elements from creation of outline node
				break;
			case EFactoryPackage.FEATURE:
				// Create Node for the value of the Feature
				createNode(parent, ((FeatureImpl) modelElement).getValue());
				break;
			// case EFactoryPackage.VALUE:
			case EFactoryPackage.MULTI_VALUE:
				// Create Children for the MultiValued element
				createChildren(parent, modelElement);
				break;
			case EFactoryPackage.REFERENCE:
			case EFactoryPackage.ATTRIBUTE:
			case EFactoryPackage.ENUM_ATTRIBUTE:
			case EFactoryPackage.STRING_ATTRIBUTE:
			case EFactoryPackage.INTEGER_ATTRIBUTE:
			case EFactoryPackage.DOUBLE_ATTRIBUTE:
			case EFactoryPackage.DATE_ATTRIBUTE:
			case EFactoryPackage.NULL_ATTRIBUTE:
			case EFactoryPackage.BOOLEAN_ATTRIBUTE:
				// Skip these model elements from creation of outline node
				break;
			case EFactoryPackage.CONTAINMENT:
				// Create Node for the value of the Containment
				createNode(parent, ((ContainmentImpl) modelElement).getValue());
				break;
			default:
				// Create Node for NewObjectImpl by calling super method
				// case EFactoryPackage.NEW_OBJECT:
				super.createNode(parent, modelElement);
			}
		} else {
			logger.warn("CreateNode Method cannot recognize the eClass for the given modelElement:" + modelElement);
		}
	}

}
