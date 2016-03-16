package org.eclipse.emf.eson.tests.util;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;

import com.google.inject.Injector;

/**
 * IRegistryConfigurator which ensures that tests starts with an (almost, see
 * org.eclipse.xtext.junit4.GlobalRegistries.initializeDefaults()) empty
 * EPackage.Registry etc. and gets reset after each @Test to clear out
 * global state changes which the Test may have left behind.
 * 
 * @author Michael Vorburger
 */
public class GlobalEPackageRegistryStateRestorer implements IInjectorProvider, IRegistryConfigurator {

    protected GlobalStateMemento stateBeforeInjectorCreation;

	@Override
	public Injector getInjector() {
		if (stateBeforeInjectorCreation == null) {
			GlobalRegistries.clearGlobalRegistries(); // sic!
			stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		}
		return null;
	}

	@Override
	public void setupRegistry() {
	}

	@Override
	public void restoreRegistry() {
		stateBeforeInjectorCreation.restoreGlobalState();
	}

}
