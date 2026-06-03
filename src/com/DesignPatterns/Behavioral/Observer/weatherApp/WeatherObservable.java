package com.DesignPatterns.Behavioral.Observer.weatherApp;

public interface WeatherObservable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    void setWeatherReading(float temperature, float humidity, float pressure);
}
