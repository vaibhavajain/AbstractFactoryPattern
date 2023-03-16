package com.design.abstractfactory.productimpl;

import com.design.abstractfactory.product.CheckBox;

public class WindowsCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("..you just created a windows checkbox");

	}

}
