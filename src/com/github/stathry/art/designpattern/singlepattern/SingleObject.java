/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.github.stathry.art.designpattern.singlepattern;

/**
 * @author dongdaiming@163.com
 * 2016年10月12日
 */
public class SingleObject {

	private SingleObject instance;

	private SingleObject() {
	}

	/**
	 * @return the instance
	 */
	public SingleObject getInstance() {
		if(instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}
	
	
}
