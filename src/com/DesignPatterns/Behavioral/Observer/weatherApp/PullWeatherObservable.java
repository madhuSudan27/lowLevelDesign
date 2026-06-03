package com.DesignPatterns.Behavioral.Observer.weatherApp;

public interface PullWeatherObservable {
    void addObserver(PullObserver observer);
    void removeObserver(PullObserver observer);
    void notifyObserver();
    void setWeatherReading(float temperature, float humidity, float pressure);
}
