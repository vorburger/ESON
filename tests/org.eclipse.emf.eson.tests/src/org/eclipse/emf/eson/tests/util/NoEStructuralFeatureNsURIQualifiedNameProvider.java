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
import org.eclipse.xtext.ecore.NsURIQualifiedNameProvider;

/**
 * See {@link NoEStructuralFeatureEcoreQualifiedNameProvider}.
 * 
 * @author Michael Vorburger
 */
public class NoEStructuralFeatureNsURIQualifiedNameProvider extends NsURIQualifiedNameProvider {

    @Override
    protected String name(EStructuralFeature eStructuralFeature) {
        return null; // Intentionally returning 'null' here.
    }

    @Override
    protected String getCacheKey() {
        return "nsURIfqnNoEStructuralFeature";
    }

}
