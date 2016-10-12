/**
 * Copyright 2012-2016 Deppon Co., Ltd.
 */
package com.deppon.designpattern.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author dongdaiming@deppon.com
 * 2016年10月12日
 */
public class FactoryProducerTest {

	/**
	 * Test method for {@link com.deppon.designpattern.abstractfactory.FactoryProducer#getEProduct(int)}.
	 */
	@Test
	public void testGetEProduct() {
		System.out.println(new FactoryProducer().getEProduct(1));
	}

	/**
	 * Test method for {@link com.deppon.designpattern.abstractfactory.FactoryProducer#getColor(java.lang.String)}.
	 */
	@Test
	public void testGetColor() {
		System.out.println(new FactoryProducer().getColor("GREEN"));
	}

}
