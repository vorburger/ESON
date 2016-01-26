package org.eclipse.emf.eson.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Like java.util.ServiceLoader, but without requiring strongly typed java.lang.Class.
 * 
 * This is useful to work around ClassLoader (CL) issues.
 * 
 * @author Michael Vorburger
 */
public class ReflectiveServiceLoader implements Iterable<Object> {

	protected final List<Object> services;
	
	public ReflectiveServiceLoader(ArrayList<Object> newServices) {
		this.services = newServices;
	}

	public static Iterable<Object> load(String serviceInterfaceClassName, ClassLoader classLoader) throws ReflectiveServiceLoaderException {
		// TODO FIXME actually read this from resource on CP
		List<String> serviceImplementationClassNames = Arrays.asList("test.Generator");
				// Arrays.asList(//"org.eclipse.emf.eson.generators.ExampleXMLGenerator", 
						// "org.eclipse.emf.eson.generators.ExampleJSONGenerator", 
						// "org.eclipse.emf.eson.example.generator.Generator");
		
		ArrayList<Object> newServices = new ArrayList<Object>(serviceImplementationClassNames.size());
		for (String serviceImplementationClassName : serviceImplementationClassNames) {
			Class<?> serviceImplementationClass;
			try {
				serviceImplementationClass = classLoader.loadClass(serviceImplementationClassName);
				newServices.add(serviceImplementationClass.newInstance());
			} catch (ReflectiveOperationException e) {
				throw new ReflectiveServiceLoaderException("Could not load & instantiate: " + serviceImplementationClassName, e);
			}
		}
		return new ReflectiveServiceLoader(newServices);
	}

	@Override
	public Iterator<Object> iterator() {
		return services.iterator();
	}

}
