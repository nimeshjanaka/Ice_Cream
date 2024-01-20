package Toppings;

import Flavor.Flavor;
import IceCream.IceCream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Flavor (assuming you have a Flavor class)
        Flavor chocolateFlavor = new Flavor(1, "Chocolate");
        Flavor vanillaFlavor = new Flavor(1, "Vanilla");
        Flavor Strawberry = new Flavor(1, "Strawberry");
        Flavor MintChocolateChip = new Flavor(1, "Rocky Road");
        Flavor ButterPecan = new Flavor(1, "Rocky Road");
        Flavor ChocolateChipCookieDough = new Flavor(1, "Pistachio");

        // Create an instance of IceCream
//        IceCream iceCream = new IceCream(1, chocolateFlavor, (List<Toppings>) new ArrayList<>());
//        IceCream iceCream1 = new IceCream(2, vanillaFlavor, (List<Toppings>) new ArrayList<>());
//        IceCream iceCream2 = new IceCream(3, Strawberry, (List<Toppings>) new ArrayList<>());
//        IceCream iceCream3 = new IceCream(4, MintChocolateChip, (List<Toppings>) new ArrayList<>());
//        IceCream iceCream4 = new IceCream(5, ButterPecan, (List<Toppings>) new ArrayList<>());
//        IceCream iceCream5 = new IceCream(6, ChocolateChipCookieDough, (List<Toppings>) new ArrayList<>());

        // Create an instance of Toppings and set values
        Toppings sprinklesTopping = new Toppings(1, "Sprinkles");
        Toppings sprinklesTopping1 = new Toppings(1, "Hot Fudge");
        Toppings sprinklesTopping2 = new Toppings(1, "Strawberry Sauce or Syrup");
        Toppings sprinklesTopping3 = new Toppings(1, "Pineapple Sauce or Syrup");
        Toppings sprinklesTopping4 = new Toppings(1, "Cherry Sauce or Syrup");
        Toppings sprinklesTopping5 = new Toppings(1, "Honey");

        // Print the Toppings details
        System.out.println(sprinklesTopping);
        System.out.println(sprinklesTopping1);
        System.out.println(sprinklesTopping2);
        System.out.println(sprinklesTopping3);
        System.out.println(sprinklesTopping4);
        System.out.println(sprinklesTopping5);
    }
}


