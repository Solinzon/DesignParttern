package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者，气象局
 */
public class WeatherBureau implements IObservable {
    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void notifyAllObervers(Object o) {
        for (IObserver observer : observers) {
            observer.onUpdate((String) o);
        }
    }

    @Override
    public void subscrib(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }
}
