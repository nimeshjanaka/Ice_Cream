package Decorator_Pattern;

// Concrete decorator class representing a syrup
public class SyrupDecorator extends IceCreamDecorator{

    private String syrup;

    public SyrupDecorator(IceCream iceCream, String syrup) {
        super(iceCream);
    }

    @Override
    public String makeIceCream() {
        return super.makeIceCream() + " with " + syrup + " syrup";
    }
}
