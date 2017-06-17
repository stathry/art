/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.wuju.designpattern.proxypattern;

import javax.annotation.Resource;

/**
 * @author dongdaiming@deppon.com 2016年10月20日
 */
public class ProxyTicketService implements TicketService {

	@Resource
	private TicketService ticketService;

	@Override
	public void buy() {
		System.out.println("before something");
		ticketService.buy();
		System.out.println("after something");
	}

}
