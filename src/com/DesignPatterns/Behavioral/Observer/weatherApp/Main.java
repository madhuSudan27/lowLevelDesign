package com.DesignPatterns.Behavioral.Observer.weatherApp;

public class Main {
    public static void main(String[] args) {

        Observer samsungMobileObserver = new MobileObserver();
        Observer macBookObserver = new ComputerObserver();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(samsungMobileObserver);
        weatherStation.addObserver(macBookObserver);

//        weatherStation.setWeatherReading(22.3F,45,45);
//        weatherStation.removeObserver(samsungMobileObserver);
//        weatherStation.setWeatherReading(28.3F,45,45);


        PullWeatherStation pullWeatherStation = new PullWeatherStation();

        PullMobileObserver pullMobileObserver = new PullMobileObserver(pullWeatherStation);
        pullWeatherStation.setWeatherReading(22.3F,45,45);



    }
}
