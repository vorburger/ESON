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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.ecore.EcoreQualifiedNameProvider;

/**
 * An EcoreQualifiedNameProvider which does not export EStructuralFeature
 * (EAttribute/EReference), only EPackage/EClassifier (EClass). This is used
 * to test that ESON can still correct find the structural features from the
 * class (including in the 'typeless' syntax), even if these are not exported.
 * 
 * @author Michael Vorburger
 */
public class NoEStructuralFeatureEcoreQualifiedNameProvider extends EcoreQualifiedNameProvider {

    @Override
    protected String name(EStructuralFeature eStructuralFeature) {
        return null; // Intentionally returning 'null' here.
    }

    // Following @Override as seen in org.eclipse.xtext.ecore.NsURIQualifiedNameProvider;
    // required so that this implementation and its parent class' Cache don't get mixed up.
    @Override
    protected String getCacheKey() {
        return "fqnNoEStructuralFeature";
    }

}
