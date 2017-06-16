/*
 * Copyright © PING AN INSURANCE (GROUP) COMPANY OF CHINA ，LTD. All Rights Reserved
 */
package com.deppon.designpattern.adapterpattern;

import java.util.Map;

/**
 * @author dongdaiming911@pingan.com
 * @date 2017年6月16日
 */
public interface DBDriver {
	
	public void connect(Map<String,Object> conf);

}
