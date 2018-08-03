/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.github.stathry.art.designpattern.factorypattern;

/**
 * @author dongdaiming@deppon.com 2016年10月11日
 */
public class EProductTest {

	public static void main(String[] args) {
		EProduct notebook = EProductFactory.getEProduct(EProduct.TYPE_NOTEBOOK);
		EProduct mobilePhoe = EProductFactory.getEProduct(EProduct.TYPE_MOBILEPHONE);
		EProduct pad = EProductFactory.getEProduct(EProduct.TYPE_PAD);
		notebook.usb();
		mobilePhoe.usb();
		pad.usb();
	}
}
