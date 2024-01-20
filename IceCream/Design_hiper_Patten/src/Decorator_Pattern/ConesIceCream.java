package Decorator_Pattern;

// Concrete component class representing a cones ice cream
public class ConesIceCream implements IceCream{
    @Override
    public String makeIceCream() {
        return "Vanilla Ice Cream";
    }
}
