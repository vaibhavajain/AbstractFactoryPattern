package com.design.abstractfactory.factoryimpl;

import com.design.abstractfactory.AbstractFactory;
import com.design.abstractfactory.product.Button;
import com.design.abstractfactory.product.CheckBox;
import com.design.abstractfactory.productimpl.WindowsButton;
import com.design.abstractfactory.productimpl.WindowsCheckBox;

public class WindowsFactory implements AbstractFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WindowsCheckBox();
	}

}
