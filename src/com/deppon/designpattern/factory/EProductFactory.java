/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.factory;

/**
 * @author dongdaiming@deppon.com
 * 2016年10月11日
 */
public class EProductFactory {

	public static EProduct getEProduct(int type) {
		EProduct product = null;
		
		switch (type) {
		case EProduct.TYPE_NOTEBOOK:
			product = new Notebook();
			break;
		case EProduct.TYPE_MOBILEPHONE:
			product = new MobilePhone();
			break;
		case EProduct.TYPE_PAD:
			product = new Pad();
			break;
		default:
			product = new Notebook();
			break;
		}
		
		return product;
	}
}
