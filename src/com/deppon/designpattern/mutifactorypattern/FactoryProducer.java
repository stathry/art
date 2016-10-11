/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.mutifactorypattern;

/**
 * @author dongdaiming@deppon.com
 * 2016年10月11日
 */
public class FactoryProducer implements Factory{
	
	private Factory eProductFactory = new EProductFactory();
	private Factory colorFactory = new ColorFactory();

	@Override
	public EProduct getEProduct(int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String code) {
		// TODO Auto-generated method stub
		return null;
	}

}
