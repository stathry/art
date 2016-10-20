/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.facadepattern;

/**
 * @author dongdaiming@deppon.com 2016年10月20日
 */
public class ServiceFacade {

	private Service1 service1;
	private Service2 service2;

	public void m1() {
		service1.m1();
	}

	public void m2() {
		service2.m2();
	}

	public ServiceFacade() {
		super();
	}

	/**
	 * @param service1
	 * @param service2
	 */
	public ServiceFacade(Service1 service1, Service2 service2) {
		super();
		this.service1 = service1;
		this.service2 = service2;
	}

}
