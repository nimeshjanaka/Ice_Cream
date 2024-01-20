package User;

import Flavor.Flavor;
import IceCream.IceCream;
import Toppings.Toppings;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Flavor (assuming you have a Flavor class)
        Flavor chocolateFlavor = new Flavor(1, "Chocolate");

        // Create an instance of Toppings (assuming you have a Toppings class)
        Toppings sprinklesTopping = new Toppings(1, "Sprinkles");

        // Create an instance of IceCream
        IceCream iceCream = new IceCream(1, chocolateFlavor, List.of(sprinklesTopping));

        // Create a list of IceCream to set as favorites
        List<IceCream> favoritesList = new ArrayList<>();
        favoritesList.add(iceCream);

        // Create an instance of User and set values
        User user = new User(1, "Jack", favoritesList);

        // Print the User details
        System.out.println(user);
    }

}
