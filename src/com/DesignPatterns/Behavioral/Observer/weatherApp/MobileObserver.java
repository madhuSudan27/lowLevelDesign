package com.DesignPatterns.Behavioral.Observer.weatherApp;

public class MobileObserver implements Observer{
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Current temperature :- " + weatherData.getTemperature()
        + "\n Current humidity :- " + weatherData.getHumidity()
        + "\n Current pressure :- "+ weatherData.getPressure());
    }
}
