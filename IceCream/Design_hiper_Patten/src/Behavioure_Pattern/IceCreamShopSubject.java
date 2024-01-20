package Behavioure_Pattern;

import java.util.ArrayList;
import java.util.List;

public class IceCreamShopSubject implements IceCreamSubject{

    private List<IceCreamObserver> observers = new ArrayList<>();

    public void introduceNewFlavor(String flavor) {
        System.out.println("New flavor introduced: " + flavor);
        notifyObservers("New flavor introduced: " + flavor);
    }

    public void launchPromotion(String promotion) {
        System.out.println("New promotion launched: " + promotion);
        notifyObservers("New promotion launched: " + promotion);
    }

    @Override
    public void addObserver(IceCreamObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IceCreamObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (IceCreamObserver observer : observers) {
            observer.update(message);
        }
    }
}
