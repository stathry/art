/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.mutifactorypattern;

/**
 * @author dongdaiming@deppon.com 2016年10月11日
 */
public class EProductFactory implements Factory {

	@Override
	public EProduct getEProduct(int type) {
		EProduct product = null;

		switch (type) {
		case EProduct.TYPE_NOTEBOOK:
			product = new Notebook();
			break;
		case EProduct.TYPE_MOBILEPHONE:
			product = new MobilePhone();
			break;
		default:
			product = null;
			break;
		}

		return product;
	}

	@Override
	public Color getColor(String code) {
		return null;
	}
}
