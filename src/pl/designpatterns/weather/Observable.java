package pl.designpatterns.weather;

import pl.designpatterns.notify.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
