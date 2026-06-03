package com.DesignPatterns.Behavioral.Observer.weatherApp;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {

    private List<Observer> observers;
    private WeatherData weatherData;

    WeatherStation(){
        observers = new ArrayList<>();
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
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(weatherData);
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
