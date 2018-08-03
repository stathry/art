package com.github.stathry.art.designpattern.decoratorpattern;

import org.junit.Test;

/**
 * DecoratorTest
 * Created by dongdaiming on 2018-08-03 13:36
 */
public class DecoratorTest {

    @Test
    public void test() {
        Component c = new ComponentA();
        Component dec = new Decorator(c);
        dec.method();
    }
}
