package com.DesignPatterns.Behavioral.Observer.weatherApp;

public class PullMobileObserver implements PullObserver{

    private final PullWeatherStation weatherStation;

    PullMobileObserver(PullWeatherStation weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.addObserver((PullObserver) this);
    }

    @Override
    public void update() {
       WeatherData weatherData =  weatherStation.getWeatherData();
       System.out.println("inside Pull MobileObserver");
        System.out.println("Current temperature :- " + weatherData.getTemperature()
                + "\n Current humidity :- " + weatherData.getHumidity()
                + "\n Current pressure :- "+ weatherData.getPressure());

    }
}
