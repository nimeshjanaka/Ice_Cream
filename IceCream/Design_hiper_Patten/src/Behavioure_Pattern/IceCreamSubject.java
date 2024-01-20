package Behavioure_Pattern;

public interface IceCreamSubject {

    void addObserver(IceCreamObserver observer);
    void removeObserver(IceCreamObserver observer);
    void notifyObservers(String message);
}
