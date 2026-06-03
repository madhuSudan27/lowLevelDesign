package com.DesignPatterns.Behavioral.Observer.weatherApp;

import java.util.ArrayList;
import java.util.List;

public class PullWeatherStation implements PullWeatherObservable{
    private List<PullObserver> observers;
    private WeatherData weatherData;

    PullWeatherStation(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(PullObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PullObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(PullObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void setWeatherReading(float temperature, float humidity, float pressure) {
        weatherData = new WeatherData(temperature, humidity, pressure);
        notifyObserver();
    }

    public WeatherData getWeatherData(){
        return  weatherData;
    }
}
