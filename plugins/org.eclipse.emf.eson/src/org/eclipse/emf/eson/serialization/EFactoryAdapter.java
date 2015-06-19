/*
 * #%L
 * org.eclipse.emf.eson
 * %%
 * Copyright (C) 2013 - 2014 Michael Vorburger
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.serialization;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.eson.building.NameAccessor;
import org.eclipse.emf.eson.eFactory.EFactoryFactory;
import org.eclipse.emf.eson.eFactory.Factory;
import org.eclipse.emf.eson.eFactory.Feature;
import org.eclipse.emf.eson.eFactory.MultiValue;
import org.eclipse.emf.eson.eFactory.NewObject;
import org.eclipse.emf.eson.eFactory.Value;
import org.eclipse.emf.eson.resource.EFactoryResource;
import org.eclipse.emf.eson.util.ESONUtil;

import com.google.common.primitives.Ints;

/**
 * EMF Adapter (Observer) which gets notified by the observed derived "real"
 * EObjects so that it can "re-sychronize" changes made to them to the source
 * EFactory model.
 * 
 * This is in the serialization package because, while it has nothing to do with
 * Serialization per se, it can use a lot of the infrastructure in this package.
 * Serialization is actually simply a more "coarse grained" (entire NewObject,
 * not just individual features of [possibly sub-] NewObjects) application of
 * the same "re-sychronization" requirement.
 * 
 * @author Michael Vorburger
 */
public class EFactoryAdapter extends EContentAdapter {
	private static Logger logger = Logger.getLogger(EFactoryAdapter.class);

	protected NameAccessor nameAccessor = new NameAccessor();
	
	@Override
	public boolean isAdapterForType(Object type) {
		return type == EFactoryAdapter.class;
	}
	
	@Override
	public void notifyChanged(final Notification msg) {
		super.notifyChanged(msg); // MUST do first

		if (msg.isTouch())
			return;

		final Object notifier = msg.getNotifier();
		if (notifier instanceof EObject) {
			EObject object = (EObject) notifier;
			if (!isSource(object)) {
				handleObjectModification(object, msg);
			}
		} else if (notifier instanceof EFactoryResource) {
			EFactoryResource resource = (EFactoryResource) notifier;
			handleResourceModification(resource, msg);
		}
	}

	protected void handleResourceModification(EFactoryResource resource, Notification msg) {
		switch (msg.getEventType()) {
			case Notification.ADD: {
				Object newValue = msg.getNewValue();
				if (newValue instanceof EObject) {
					EObject newObject = (EObject) newValue; 
					setRootNewObject(newObject, resource);
				}
				break;
			}
		}
	}

	protected void handleObjectModification(EObject object, Notification msg) {
		NewObject newObject = getChangedNewObject(object);
		Resource resource = newObject.eResource();
		
		Feature factoryFeature = getChangedFactoryFeature(msg, newObject);
		if (factoryFeature == null) {
			// The NewObject doesn't have a dedicated name Feature, so try to set name property of NewObject
			if (handledAsNameChange(msg, object, newObject, resource)) {
				return;
			} else {
				factoryFeature = newFactoryFeature(msg, newObject);
			}
		}
		
		switch (msg.getEventType()) {
			case Notification.SET :
				setOrRemoveSingleValue(factoryFeature, msg, resource);
				break;
			case Notification.ADD :
				addListValue(factoryFeature, msg, resource);
				break;
			case Notification.REMOVE :
				removeListValue(factoryFeature, msg, resource);
				break;
			case Notification.MOVE :
				moveListValue(factoryFeature, msg, resource);
				break;
			case Notification.ADD_MANY :
				addManyListValues(factoryFeature, msg, resource);
				break;
			case Notification.REMOVE_MANY :
				removeManyListValues(factoryFeature, msg, resource);
				break;
			default:
				logger.error("EFactoryAdapter did not (know how to) handle notification: " + msg.toString());
		}
	}

	protected boolean isSource(EObject obj) {
		return ESONUtil.isSource(obj);
	}

	protected boolean handledAsNameChange(final Notification msg, final EObject eNotifier, NewObject newObject, Resource resource) {
		if (msg.getEventType() != Notification.SET  &&  msg.getEventType() != Notification.UNSET)
			return false;
		EAttribute nameAttribute = nameAccessor.getNameAttribute(newObject);
		if (nameAttribute != null && nameAttribute.equals(msg.getFeature())) {
			String newName = msg.getNewStringValue();
			newObject.setName(newName);
			return true;
		} else
			return false;
	}

	protected void setOrRemoveSingleValue(Feature factoryFeature, final Notification msg, Resource resource) {
		if (factoryFeature.getEFeature().isMany())
			// Notification.SET should never happen for lists
			throw new IllegalArgumentException(); 
		if (msg.getNewValue() != null)
			setSingleValue(factoryFeature, msg, resource);
		else
			removeSingleValueFeature(factoryFeature, msg, resource);
	}
	
	protected void setRootNewObject(EObject eObject, EFactoryResource resource) {
		Factory factory = resource.getEFactoryFactory();
		if (factory == null)
			throw new IllegalStateException();
		FactoryBuilder2 factoryBuilder = new FactoryBuilder2(resource);
		NewObjectBuilder builder = NewObjectBuilder.context(factory, factoryBuilder);
		NewObject newObject = builder.build(eObject);
		factory.setRoot(newObject);
	}
	
	protected void setSingleValue(Feature factoryFeature, final Notification msg, Resource resource) {
		Value value = getNewValue(factoryFeature, msg, msg.getNewValue());
		factoryFeature.setValue(value);
	}

	protected Value getNewValue(Feature factoryFeature, Notification msg, Object newValue) {
		EFactoryResource resource = getEFactoryResource(msg);
		IFactoryBuilder factoryBuilder = new FactoryBuilder2(resource);
		EStructuralFeature eFeature = factoryFeature.getEFeature();
		return FeatureBuilderFactory.createValue(eFeature, factoryBuilder, newValue);
	}

	protected void addListValue(Feature factoryFeature, final Notification msg, Resource resource) {
		Value value = getNewValue(factoryFeature, msg, msg.getNewValue());
		MultiValue multiValue = (MultiValue) factoryFeature.getValue();
		if(multiValue == null) {
			multiValue = EFactoryFactory.eINSTANCE.createMultiValue();
			factoryFeature.setValue(multiValue);
			multiValue.getValues().add(value);
		}
		else {
			multiValue.getValues().add(value);
		}
	}

	protected void addManyListValues(Feature factoryFeature, final Notification msg, Resource resource) {
		MultiValue multiValue = (MultiValue) factoryFeature.getValue();
		if(multiValue == null){
			multiValue = EFactoryFactory.eINSTANCE.createMultiValue();
			factoryFeature.setValue(multiValue);
		}
		Iterable<?> newValues = (Iterable<?>) msg.getNewValue();
		for (Object newValue : newValues) {
			final Value value = getNewValue(factoryFeature, msg, newValue);
			multiValue.getValues().add(value);
		}
	}

	protected void removeListValue(Feature factoryFeature, final Notification msg, Resource resource) {
		MultiValue multiValue = (MultiValue) factoryFeature.getValue();
		int indexToRemove = msg.getPosition();
		multiValue.getValues().remove(indexToRemove);
	}

	protected void removeManyListValues(Feature factoryFeature, final Notification msg, Resource resource) {
		MultiValue multiValue = (MultiValue) factoryFeature.getValue();
		int[] indexesToRemove = (int[]) msg.getNewValue();
		EList<Value> values = multiValue.getValues();
		listRemoveIndexes(values, indexesToRemove);
	}

	/**
	 * Removes all elements listed indexesToRemove from list.
	 * We cannot use a for loop directly, because they indices change.. 
	 * @see http://stackoverflow.com/questions/4950678/remove-multiple-elements-from-arraylist
	 */
	private void listRemoveIndexes(List<?> list, int[] indexesToRemove) {
		List<Integer> integersList = Ints.asList(indexesToRemove);
		Collections.sort(integersList, Collections.reverseOrder());
		for (int index : indexesToRemove) {
			list.remove(index);
		}
	}
	
	protected void moveListValue(Feature factoryFeature, final Notification msg, Resource resource) {
		MultiValue multiValue = (MultiValue) factoryFeature.getValue();
		int oldPosition = (Integer) msg.getOldValue(); // NOT getOldIntValue();
		int newPosition = msg.getPosition();
		multiValue.getValues().move(newPosition, oldPosition);
	}
	
	protected void removeSingleValueFeature(Feature factoryFeature, final Notification msg, Resource resource) {
		NewObject newObject = (NewObject) factoryFeature.eContainer();
		EList<Feature> newObjectFeatures = newObject.getFeatures();
		newObjectFeatures.remove(factoryFeature);
	}

	protected Feature getChangedFactoryFeature(Notification msg, NewObject newObject) {
		EStructuralFeature changedEFeature = (EStructuralFeature) msg.getFeature();
		EList<Feature> newObjectAllFeatures = newObject.getFeatures();
		for (Feature feature : newObjectAllFeatures) {
			if (changedEFeature.equals(feature.getEFeature())) {
				return feature;
			}
		}
		return null;
	}

	protected Feature newFactoryFeature(final Notification msg, final NewObject newObject) {
		Feature newFeature = EFactoryFactory.eINSTANCE.createFeature();
		EStructuralFeature changedEFeature = (EStructuralFeature) msg.getFeature();
		newFeature.setEFeature(changedEFeature);
		newObject.getFeatures().add(newFeature);
		return newFeature;
	}

	protected NewObject getChangedNewObject(EObject eNotifier) {
		return getEFactoryResource(eNotifier).getExistingEFactoryNewObject(eNotifier);
	}

	protected EFactoryResource getEFactoryResource(Notification msg) {
		final EObject eNotifier = (EObject) msg.getNotifier();
		return getEFactoryResource(eNotifier);
	}

	protected EFactoryResource getEFactoryResource(EObject eNotifier) {
		final Resource eNotifierResource = eNotifier.eResource();
		return (EFactoryResource) eNotifierResource;
	}

}
