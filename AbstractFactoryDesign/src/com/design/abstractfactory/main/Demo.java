package com.design.abstractfactory.main;

import com.design.abstractfactory.AbstractFactory;
import com.design.abstractfactory.factoryimpl.MacOSFactory;
import com.design.abstractfactory.factoryimpl.WindowsFactory;

public class Demo {
	public static void main(String[] args) {
		Application app = configureApp();
		app.paint();
	}

	private static Application configureApp() {
		Application app;
		AbstractFactory abs;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			abs = new MacOSFactory();
		} else {
			abs = new WindowsFactory();
		}
		app = new Application(abs);
		return app;
	}
}
