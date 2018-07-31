/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.github.stathry.art.designpattern.template;

/**
 * @author dongdaiming@deppon.com 2016年10月12日
 */
public class DNF extends Game {

	@Override
	public void request() {
		System.out.println("dnf request");
	}

	@Override
	public void check() {
		System.out.println("dnf check");
	}

	@Override
	public void biz() {
		System.out.println("dnf biz");
	}

	@Override
	public void response() {
		System.out.println("dnf response");
	}

}
