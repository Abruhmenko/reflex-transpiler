/*
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import ru.iaie.reflexold.ui.internal.ReflexoldActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ReflexOldExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(ReflexoldActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		ReflexoldActivator activator = ReflexoldActivator.getInstance();
		return activator != null ? activator.getInjector(ReflexoldActivator.RU_IAIE_REFLEXOLD_REFLEXOLD) : null;
	}

}
