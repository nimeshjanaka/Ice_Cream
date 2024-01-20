package Behavioure_Pattern;

public class IceCreamCustomerObserver implements IceCreamObserver{

    private String name;

    public IceCreamCustomerObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
