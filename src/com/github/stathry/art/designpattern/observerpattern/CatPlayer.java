package com.github.stathry.art.designpattern.observerpattern;

/**
 * CatPlayer
 * Created by dongdaiming on 2018-07-31 18:22
 */
public class CatPlayer implements Observer<WeatherInfo>, Player {

    private int pressure;
    private Subject subject;
    public CatPlayer(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(WeatherInfo arg) {
        this.pressure = arg.getPressure();
        play();
    }

    @Override
    public Subject getSubject() {
        return subject;
    }

    @Override
    public void play() {
        if(pressure < 100) {
            System.out.println("pressure is " + pressure + ", the cat is playing.");
        } else {
            System.out.println("pressure is " + pressure + ", the cat can't play.");
        }
    }
}
