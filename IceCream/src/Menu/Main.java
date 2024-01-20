package Menu;

import Flavor.Flavor;
import Toppings.Toppings;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // Create flavors
        Flavor chocolateFlavor = new Flavor(1, "Chocolate");
        Flavor vanillaFlavor = new Flavor(2, "Vanilla");

        // Create toppings
        Toppings sprinklesTopping = new Toppings(1, "Sprinkles");
        Toppings nutsTopping = new Toppings(2, "Nuts");

        // Create lists of flavors and toppings
        List<Flavor> flavorsList = new ArrayList<>();
        flavorsList.add(chocolateFlavor);
        flavorsList.add(vanillaFlavor);

        List<Toppings> toppingsList = new ArrayList<>();
        toppingsList.add(sprinklesTopping);
        toppingsList.add(nutsTopping);

        // Create an instance of the Menu class and set values
        Menu menu = new Menu(flavorsList, toppingsList);

        // Print the Menu details
        System.out.println(menu);
    }
}

