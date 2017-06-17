/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.wuju.designpattern.template;

/**
 * @author dongdaiming@deppon.com 2016年10月12日
 */
public class GameTest {

	public static void main(String[] args) {
		Game lol = new LOL();
		lol.execute();
		Game dnf = new DNF();
		dnf.execute();
	}
}
