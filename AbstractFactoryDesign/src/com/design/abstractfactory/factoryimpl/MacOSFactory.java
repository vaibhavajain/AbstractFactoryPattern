package com.design.abstractfactory.factoryimpl;

import com.design.abstractfactory.AbstractFactory;
import com.design.abstractfactory.product.Button;
import com.design.abstractfactory.product.CheckBox;
import com.design.abstractfactory.productimpl.MacOSButton;
import com.design.abstractfactory.productimpl.MacOSCheckBox;

public class MacOSFactory implements AbstractFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new MacOSCheckBox();
	}

}
