package com.github.stathry.art.designpattern.observerpattern;

/**
 * DogPlayer
 * Created by dongdaiming on 2018-07-31 18:22
 */
public class DogPlayer implements Observer<WeatherInfo>,Player {

    private int temperature;
    private Subject subject;

    public DogPlayer(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void update(WeatherInfo arg) {
        this.temperature = arg.getTemperature();
        play();
    }

    @Override
    public Subject getSubject() {
        return subject;
    }

    @Override
    public void play() {
        if(temperature > 25) {
            System.out.println("temperature is " + temperature + ", the dog can't play.");
        } else {
            System.out.println("temperature is " + temperature + ", the dog is playing.");
        }
    }
}
