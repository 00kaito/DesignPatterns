package pl.designpatterns.notify;

import pl.designpatterns.weather.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet news - temperature info: " + weatherForecast.getTemperature());
    }
}
