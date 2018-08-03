package com.github.stathry.art.designpattern.decoratorpattern;

/**
 * TODO
 * Created by dongdaiming on 2018-08-03 13:34
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        System.out.println("decorated before component method.");
        component.method();
        System.out.println("decorated after component method.");
    }
}
