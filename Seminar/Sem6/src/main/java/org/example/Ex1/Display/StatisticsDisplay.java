package Seminar6.Ex1.Display;

import Seminar6.Ex1.Observer.Observer;
import Seminar6.Ex1.Data.WeatherData;

public class StatisticsDisplay implements Display, Observer {
    private WeatherData weatherData;
    private int temperature;
    private int humidity;
    private float airPressure;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        // a different display could be used here, this is just for testing
        System.out.println("Statistics Conditions:" + (temperature + 1) + " " + (humidity + 1) + " " + (airPressure + 1));
    }

    @Override
    public void update(int temperature, int humidity, float airPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = airPressure;
        display();
    }
}
