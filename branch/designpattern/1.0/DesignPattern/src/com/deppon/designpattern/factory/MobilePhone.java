/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.factory;

/**
 * @author dongdaiming@deppon.com
 * 2016年10月11日
 */
public class MobilePhone implements EProduct {

	@Override
	public void usb() {
		System.out.println("MobilePhone usb running!");
	}

}
