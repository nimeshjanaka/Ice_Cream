package Decorator_Pattern;

// Concrete decorator class representing a topping
public class ToppingsDecorator extends IceCreamDecorator{

    private String topping;

    public ToppingsDecorator(IceCream iceCream, String topping) {
        super(iceCream);
    }

    @Override
    public String makeIceCream() {
        return super.makeIceCream() + " with " + topping;
    }
}
