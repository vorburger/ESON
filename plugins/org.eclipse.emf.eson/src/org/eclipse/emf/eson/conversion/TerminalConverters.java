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
package org.eclipse.emf.eson.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractIDValueConverter;

import com.google.inject.Inject;

public class TerminalConverters extends AbstractDeclarativeValueConverterService {

	@Inject
	private AbstractIDValueConverter idValueConverter;
	
	@ValueConverter(rule = "ID")
	public IValueConverter<String> ID() {
		return idValueConverter;
	}
	
	@ValueConverter(rule = "ID_WITHDOT")
	public IValueConverter<String> ID_WITHDOT() {
		return idValueConverter;
	}

}
