/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.github.stathry.art.designpattern.abstractfactory;

/**
 * @author dongdaiming@deppon.com
 * 2016年10月11日
 */
public interface Factory {

	public EProduct getEProduct(int type);
	public Color getColor(String code);
}
