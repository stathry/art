/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.adapterpattern;

/**
 * @author dongdaiming@deppon.com 2016年10月20日
 */
public class Adapter implements Standard {

	private Specific specific;

	/**
	 * @param specific
	 */
	public Adapter(Specific specific) {
		super();
		this.specific = specific;
	}

	public Adapter() {
		super();
	}
	

	@Override
	public void request() {
		specific.specificRequest();
	}

}
