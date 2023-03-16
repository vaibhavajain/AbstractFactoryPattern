package com.design.abstractfactory.main;

import com.design.abstractfactory.AbstractFactory;
import com.design.abstractfactory.product.Button;
import com.design.abstractfactory.product.CheckBox;

public class Application {
	private Button button;
	private CheckBox checkBox;

	public Application(AbstractFactory absfactory) {
		this.button = absfactory.createButton();
		this.checkBox = absfactory.createCheckBox();
	}
	
	public void paint() {
		button.paint();
		checkBox.paint();
	}
}
