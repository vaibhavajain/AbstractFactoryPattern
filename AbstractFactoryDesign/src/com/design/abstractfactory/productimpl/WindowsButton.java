package com.design.abstractfactory.productimpl;

import com.design.abstractfactory.product.Button;

public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("..you just created a windows button");

	}

}
