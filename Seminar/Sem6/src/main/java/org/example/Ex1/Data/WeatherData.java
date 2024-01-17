package Seminar6.Ex1.Data;

import Seminar6.Ex1.Observer.Observable;
import Seminar6.Ex1.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
    private List<Observer> observers;
    private int temperature;
    private int humidity;
    private float airPressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void setMeasurements(int temperature, int humidity, float airPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = airPressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.humidity, this.airPressure);
        }
    }
}
