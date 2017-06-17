/*
 * Copyright © PING AN INSURANCE (GROUP) COMPANY OF CHINA ，LTD. All Rights Reserved
 */
package com.wuju.designpattern.adapterpattern;

import java.util.Map;

/**
 * @author dongdaiming911@pingan.com
 * @date 2017年6月17日
 */
public class DriverAdapter implements DBDriver {
	
	private MysqlDriver mysqlDriver = new MysqlDriver();
	private OracleDriver oracleDriver = new OracleDriver();

	@Override
	public void connect(Map<String, Object> conf) {
		if(conf.get("driver.class").equals("mysql.driver")) {
			mysqlDriver.connectToMysql(conf);
		} else if(conf.get("driver.class").equals("oracle.driver")) {
			oracleDriver.connectToOracle(conf);
		}
	}

}
