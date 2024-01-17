package Seminar6.Ex1.Display;

import Seminar6.Ex1.Observer.Observer;
import Seminar6.Ex1.Data.WeatherData;

public class CurrentConditionDisplay implements Display, Observer {
    private WeatherData weatherData;
    private int temperature;
    private int humidity;
    private float airPressure;

    public CurrentConditionDisplay(WeatherData weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions:" + temperature +" " + humidity +" " + airPressure);
    }

    @Override
    public void update(int temperature, int humidity, float airPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = airPressure;
        display();
    }
}
