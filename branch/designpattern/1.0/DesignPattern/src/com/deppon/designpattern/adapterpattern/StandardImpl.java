/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.adapterpattern;

/**
 * @author dongdaiming@deppon.com
 * 2016年10月20日
 */
public class StandardImpl implements Standard {

	@Override
	public void request() {
		System.out.println("standard request");
	}

}
