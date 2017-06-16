/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.template;

/**
 * @author dongdaiming@deppon.com 2016年10月12日
 */
public abstract class Game {

	public abstract void request();

	public abstract void check();
	
	public abstract void biz();

	public abstract void response();

	public final void execute() {
		request();
		check();
		biz();
		response();
	}

}
