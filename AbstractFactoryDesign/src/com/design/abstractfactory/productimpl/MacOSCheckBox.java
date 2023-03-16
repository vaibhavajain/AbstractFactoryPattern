package com.design.abstractfactory.productimpl;

import com.design.abstractfactory.product.CheckBox;

public class MacOSCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("..you just created a macos checkbox");

	}

}
