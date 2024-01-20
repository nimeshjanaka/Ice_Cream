package Composite_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create individual flavors
        IceCreamComponent chocolateFlavor = new FlavorLeaf("Chocolate");
        IceCreamComponent vanillaFlavor = new FlavorLeaf("Vanilla");
        IceCreamComponent strawberryFlavor = new FlavorLeaf("Strawberry");

        // Create a combo with a combination of flavors
        ComboComposite comboIceCream = new ComboComposite();
        comboIceCream.addComponent(chocolateFlavor);
        comboIceCream.addComponent(vanillaFlavor);
        comboIceCream.addComponent(strawberryFlavor);

        // Display the individual flavors and the combo
        System.out.println("Individual Flavors:");
        chocolateFlavor.display();
        vanillaFlavor.display();
        strawberryFlavor.display();

        System.out.println("\nCombo Ice Cream:");
        comboIceCream.display();
    }
}
