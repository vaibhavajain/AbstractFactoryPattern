package com.design.abstractfactory;

import com.design.abstractfactory.product.Button;
import com.design.abstractfactory.product.CheckBox;

public interface AbstractFactory {
	Button createButton();

	CheckBox createCheckBox();
}
