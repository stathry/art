package com.github.stathry.art.designpattern.observerpattern;

/**
 * TODO
 * Created by dongdaiming on 2018-07-31 18:05
 */
public interface Subject<T> {

    Boolean registerObserver(Observer observer);

    Boolean removeObserver(Observer observer);

    void notifyAllObservers();

    void change(T t);
}
