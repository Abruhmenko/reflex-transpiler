/* * generated by Xtext 2.25.0 */package ru.iaie.reflexold;import com.google.inject.Injector;/** * Initialization support for running Xtext languages without Equinox extension registry. */public class ReflexOldStandaloneSetup extends ReflexOldStandaloneSetupGenerated {	private static ReflexOldStandaloneSetup INSTANCE;		public static Injector getInjector() {		if (INSTANCE == null) {			INSTANCE = new ReflexOldStandaloneSetup();		}		return INSTANCE.createInjectorAndDoEMFRegistration();	}}