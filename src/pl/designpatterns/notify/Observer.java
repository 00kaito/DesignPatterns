package pl.designpatterns.notify;

import pl.designpatterns.weather.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
