/*
 * Copyright © PING AN INSURANCE (GROUP) COMPANY OF CHINA ，LTD. All Rights Reserved
 */
package com.github.stathry.art.designpattern.adapterpattern;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author dongdaiming911@pingan.com
 * @date 2017年6月17日
 */
public class DriverAdapterTest {

	/**
	 * Test method for {@link DriverAdapter#connect(java.util.Map)}.
	 */
	@Test
	public void testConnectToMysql() {
		Map<String, Object> conf = new HashMap<>();
		conf.put("driver.class", "mysql.driver");
		DBDriver driver = new DriverAdapter();
		driver.connect(conf);
	}
	
	@Test
	public void testConnectToOracle() {
		Map<String, Object> conf = new HashMap<>();
		conf.put("driver.class", "oracle.driver");
		DBDriver driver = new DriverAdapter();
		driver.connect(conf);
	}

}
