/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.proxypattern;

/**
 * @author dongdaiming@deppon.com 2016年10月20日
 */
public class ProxyTicketService implements TicketService {

	private TicketService ticketService;

	/**
	 * @param ticketService
	 */
	public ProxyTicketService(TicketService ticketService) {
		super();
		this.ticketService = ticketService;
	}

	public ProxyTicketService() {
		super();
	}

	@Override
	public void buy() {
		System.out.println("before something");
		ticketService.buy();
		System.out.println("after something");
	}

}
