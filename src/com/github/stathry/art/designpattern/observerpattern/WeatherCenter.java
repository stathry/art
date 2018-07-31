package com.github.stathry.art.designpattern.observerpattern;

import java.util.HashSet;
import java.util.Set;

/**
 * WeatherCenter
 * Created by dongdaiming on 2018-07-31 18:13
 */
public class WeatherCenter implements Subject<WeatherInfo> {

    private WeatherInfo weatherInfo;
    private Set<Observer> observers = new HashSet<>();
    @Override
    public Boolean registerObserver(Observer observer) {
        return observers.add(observer);
    }

    @Override
    public Boolean removeObserver(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(weatherInfo);
        }
    }

    @Override
    public void change(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
        System.out.println("weatherInfo is changed, " + weatherInfo);
        notifyAllObservers();
    }
}
