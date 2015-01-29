/*
 * #%L
 * org.eclipse.emf.eson
 * %%
 * Copyright (C) 2002 - 2014 Sebastian Benz, Michael Vorburger and others
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */
package org.eclipse.emf.eson.building;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnumLiteral;

public abstract class AbstractValueSwitch<T> {
	private static final Logger logger = Logger.getLogger(AbstractValueSwitch.class);

	protected abstract T caseString(String value);

	protected abstract T caseBoolean(Boolean value);

	protected abstract T caseEnum(EEnumLiteral value);

	protected abstract T caseInt(Integer value);

	protected abstract T caseShort(Short value);

	protected abstract T caseBigInteger(BigInteger value);

	protected abstract T caseBigDecimal(BigDecimal value);

	protected abstract T caseDouble(Double value);

	protected abstract T caseLong(Long value);

	protected abstract T caseDate(Date value);

	public T doSwitch(Class<?> clazz, Object value) throws IllegalArgumentException {
		try {
			return doSwitchUnsafe(clazz,value);
		} catch (RuntimeException e) {
			logger.warn("doSwitch() got a RuntimeException (probably ClassCastException or NumberFormatException) for clazz: " + clazz.toString() + ", value class: " + value.getClass().toString() + ", value: " + value.toString());
			return null;
		}
	}
	
	protected T doSwitchUnsafe(Class<?> clazz, Object value) throws IllegalArgumentException {
		if (clazz == long.class || clazz == Long.class) {
//			return caseLong(Long.valueOf(value.toString()));
//			if (value instanceof Long)
				return caseLong((Long) value);
//			else 
		}
		if (clazz == double.class || clazz == Double.class) {
//			return caseDouble(Double.valueOf(value.toString()));
			return caseDouble((Double) value);
		}
		if (clazz == BigDecimal.class) {
			return caseBigDecimal(new BigDecimal(value.toString()));
		}
		if (clazz == BigInteger.class) {
//			return caseBigInteger(new BigInteger(value.toString()));
			if (value instanceof Long)
				return caseBigInteger(BigInteger.valueOf((Long)value));
			else if (value instanceof BigInteger)
				return caseBigInteger((BigInteger) value);
		}
		if (clazz == short.class || clazz == Short.class) {
//			return caseShort(Short.valueOf(value.toString()));
			if (value instanceof Long)
				return caseShort(((Long) value).shortValue());
			else if (value instanceof Short)
				return caseShort((Short) value);
		}
		if (clazz == int.class || clazz == Integer.class) {
//			return caseInt(Integer.valueOf(value.toString()));
			if (value instanceof Long)
				return caseInt(((Long) value).intValue());
			else if (value instanceof Integer)
				return caseInt(((Integer) value));
		}
		if (value instanceof EEnumLiteral) {
			return caseEnum((EEnumLiteral) value);
		}
		if (Enumerator.class.isAssignableFrom(clazz)) {
			return caseEnum((Enumerator) value);
		}
		if (clazz == boolean.class || clazz == Boolean.class) {
//			return caseBoolean(Boolean.valueOf(value.toString()));
			if (value instanceof Boolean)
				return caseBoolean((Boolean) value);
			else // EFactoryJavaValidator et al currently rely on this working like this default fall back (not entirely correct, strictly speaking)
				return caseBoolean(Boolean.FALSE);
		}
		if (clazz == String.class) {
			// String.toString(), which just return this, may be faster than an explicit cast
			return caseString(value.toString());
		}
		if (clazz == Date.class) {
			return caseDate((Date) value);
		}
		throw new IllegalArgumentException("Unsupported attribute type: " + clazz.getName() + " for value: " + value.toString());
	}

	protected abstract T caseEnum(Enumerator value);

}
