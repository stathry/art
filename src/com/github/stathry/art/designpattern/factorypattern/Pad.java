/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.github.stathry.art.designpattern.factorypattern;

/**
 * @author dongdaiming@deppon.com
 * 2016年10月11日
 */
public class Pad implements EProduct {

	@Override
	public void usb() {
		System.out.println("Pad usb running!");
	}

}
