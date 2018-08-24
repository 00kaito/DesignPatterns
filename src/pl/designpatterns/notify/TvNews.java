package pl.designpatterns.notify;

import pl.designpatterns.weather.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TV news - - temperature info: " + weatherForecast.getTemperature());
    }
}
