/*
 * Copyright © PING AN INSURANCE (GROUP) COMPANY OF CHINA ，LTD. All Rights Reserved
 */
package com.wuju.designpattern.adapterpattern;

import java.util.Map;

/**
 * @author dongdaiming911@pingan.com
 * @date 2017年6月16日
 */
public class MysqlDriver {

	public void connectToMysql(Map<String, Object> conf) {
		System.out.println("connect to mysql in conf.");
	}

}
