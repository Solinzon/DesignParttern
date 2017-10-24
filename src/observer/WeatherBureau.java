package observer;

/**
 * 具体的被观察者，气象局
 */
public class WeatherBureau implements IObservable{
    @Override
    public void notifyAllObervers(Object o) {
        for (IObserver observer: observers) {
            observer.onUpdate((String)o);
        }
    }

    @Override
    public void subscrib(IObserver observer) {
        observers.add(observer);
    }
}
