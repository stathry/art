/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.abstractfactorypattern;

/**
 * @author dongdaiming@deppon.com 2016年10月11日
 */
public class ColorFactory implements Factory {

	@Override
	public EProduct getEProduct(int type) {
		return null;
	}

	@Override
	public Color getColor(String code) {
		Color color = null;
		if ("GREEN".equalsIgnoreCase(code)) {
			color = new Green();
		} else if ("BLUE".equalsIgnoreCase(code)) {
			color = new Blue();
		} else {
			color = null;
		}
		return color;
	}
}
