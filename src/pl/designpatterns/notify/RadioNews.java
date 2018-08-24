package pl.designpatterns.notify;

import pl.designpatterns.weather.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio news - temperature info: " + weatherForecast.getTemperature());
    }
}
