/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.template;

/**
 * @author dongdaiming@deppon.com 2016年10月12日
 */
public class DNF extends Game {

	@Override
	public void init() {
		System.out.println("DNF INIT");
	}

	@Override
	public void play() {
		System.out.println("DNF PLAY");
	}

	@Override
	public void destory() {
		System.out.println("DNF DESTORY");
	}

}
