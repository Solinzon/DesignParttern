package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的被观察者
 */
public interface IObservable {
    void notifyAllObervers(Object o);
    void subscrib(IObserver observer);
    void remove(IObserver observer);

}
