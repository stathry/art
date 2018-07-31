package com.github.stathry.art.designpattern.observerpattern;

import org.junit.Test;

import java.util.Random;

/**
 * TODO
 * Created by dongdaiming on 2018-07-31 19:40
 */
public class TestObserverPattern {

    @Test
    public void testWeatherObserver() throws InterruptedException {
        Subject subject = new WeatherCenter();
        Observer<WeatherInfo> cat = new CatPlayer(subject);
        Observer<WeatherInfo> dog = new DogPlayer(subject);
        subject.registerObserver(cat);
        subject.registerObserver(dog);

        WeatherInfo weatherInfo;
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            weatherInfo = new WeatherInfo(random.nextInt(60), random.nextInt(10), random.nextInt(200));
            subject.change(weatherInfo);
            Thread.sleep(3000);
        }
    }
}
