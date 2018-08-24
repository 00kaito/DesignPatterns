package pl.designpatterns;

import pl.designpatterns.notify.InternetNews;
import pl.designpatterns.notify.RadioNews;
import pl.designpatterns.notify.TvNews;
import pl.designpatterns.weather.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("New temperature - notify only internet news:");
        weatherForecast.changeWeatherInfo(18, 1007);



    }
}
