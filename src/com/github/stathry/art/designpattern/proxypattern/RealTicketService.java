/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.github.stathry.art.designpattern.proxypattern;

/**
 * @author dongdaiming@deppon.com 2016年10月20日
 */
public class RealTicketService implements TicketService {

	@Override
	public void buy() {
		System.out.println("RealTicketService buy");
	}

}
