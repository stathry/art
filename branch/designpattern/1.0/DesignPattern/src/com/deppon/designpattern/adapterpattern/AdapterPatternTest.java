/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.adapterpattern;

import org.junit.Test;

/**
 * @author dongdaiming@deppon.com 2016年10月20日
 */
public class AdapterPatternTest {

	@Test
	public void testSpecific() {
		Specific specific = new Specific();
		Standard standard = new Adapter(specific);
		standard.request();
	}

	@Test
	public void testStandard() {
		Standard standard = new StandardImpl();
		standard.request();
	}
}
