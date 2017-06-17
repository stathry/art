/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.wuju.designpattern.facadepattern;

import javax.annotation.Resource;

/**
 * @author dongdaiming@deppon.com 2016年10月20日
 */
public class ServiceFacade {

	@Resource
	private Service1 service1;
	@Resource
	private Service2 service2;

	public Service1 getService1() {
		return service1;
	}

	public Service2 getService2() {
		return service2;
	}

}
