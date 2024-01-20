package Observe_Pattern;

public interface OrderSubject {

    void registerObserver(OrderObserver observer);

    void removeObserver(OrderObserver observer);

    void notifyObservers();
}
