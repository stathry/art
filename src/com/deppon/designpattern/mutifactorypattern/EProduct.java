/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.mutifactorypattern;

/**
 * @author dongdaiming@deppon.com
 * 2016年10月11日
 */
public interface EProduct {
	
	public static final int TYPE_NOTEBOOK = 1;
	public static final int TYPE_MOBILEPHONE = 2;
	public static final int TYPE_PAD = 3;

	public void usb();
	
}
