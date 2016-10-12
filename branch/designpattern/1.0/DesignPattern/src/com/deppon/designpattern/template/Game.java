/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.template;

/**
 * @author dongdaiming@deppon.com 2016年10月12日
 */
public abstract class Game {

	public abstract void init();

	public abstract void play();

	public abstract void destory();

	public final void execute() {
		init();
		play();
		destory();
	}

}
