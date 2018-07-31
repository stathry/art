/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.github.stathry.art.designpattern.abstractfactory;

/**
 * @author dongdaiming@deppon.com
 * 2016年10月11日
 */
public class FactoryProducer implements Factory{
	
	private Factory eProductFactory = new EProductFactory();
	private Factory colorFactory = new ColorFactory();

	@Override
	public EProduct getEProduct(int type) {
		return eProductFactory.getEProduct(type);
	}

	@Override
	public Color getColor(String code) {
		return colorFactory.getColor(code);
	}

}
