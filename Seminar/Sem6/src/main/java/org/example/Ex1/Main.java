package Seminar6.Ex1;

import Seminar6.Ex1.Display.CurrentConditionDisplay;
import Seminar6.Ex1.Data.WeatherData;
import Seminar6.Ex1.Display.ForecastDisplay;
import Seminar6.Ex1.Display.StatisticsDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionsDisplay = new
                CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // Simulate changes in weather data
        weatherData.setMeasurements(75, 60, 30.4f);
        weatherData.setMeasurements(80, 65, 29.2f);
        weatherData.setMeasurements(72, 55, 29.5f);
    }
}
