/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.template;

/**
 * @author dongdaiming@deppon.com 2016年10月12日
 */
public class LOL extends Game {

	@Override
	public void request() {
		System.out.println("lol request");
	}

	@Override
	public void check() {
		System.out.println("lol check");
	}

	@Override
	public void biz() {
		System.out.println("lol biz");
	}

	@Override
	public void response() {
		System.out.println("lol response");
	}

}
