package Composite_Pattern;

public class FlavorLeaf implements IceCreamComponent{

    private String flavorName;

    public FlavorLeaf(String flavorName) {
        this.flavorName = flavorName;
    }

    @Override
    public void display() {
        System.out.println("Flavor: " + flavorName);
    }
}
