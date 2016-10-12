/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.template;

/**
 * @author dongdaiming@deppon.com
 * 2016年10月12日
 */
public class LOL extends Game {

	@Override
	public void init() {
		System.out.println("lol init");
	}

	@Override
	public void play() {
		System.out.println("lol play");	
	}

	@Override
	public void destory() {
		System.out.println("lol destory");
	}

}
