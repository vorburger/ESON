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
 * @Initial Contribution : Girish Kumar
 */
package org.eclipse.emf.eson.eFactory.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emf.eson.eFactory.EFactoryFactory;
import org.eclipse.emf.eson.eFactory.EFactoryPackage;
import org.eclipse.emf.eson.eFactory.MultiValue;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eson.eFactory.MultiValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiValueItemProvider extends ValueItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiValueItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(EFactoryPackage.Literals.MULTI_VALUE__VALUES);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns MultiValue.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/MultiValue"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_MultiValue_type");
    }
    

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(MultiValue.class)) {
            case EFactoryPackage.MULTI_VALUE__VALUES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createValue()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createNewObject()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createMultiValue()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createReference()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createEnumAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createStringAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createIntegerAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createDoubleAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createDateAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createNullAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createBooleanAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (EFactoryPackage.Literals.MULTI_VALUE__VALUES,
                 EFactoryFactory.eINSTANCE.createContainment()));
    }

}
