package com.github.stathry.art.designpattern.observerpattern;

/**
 * TODO
 * Created by dongdaiming on 2018-07-31 18:08
 */
public interface Observer<T> {

    void update(T arg);

    Subject getSubject();
}
