package IceCream;

import Flavor.Flavor;
import Toppings.Toppings;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        System.out.println(getIceCream("1"));
        System.out.println(getIceCream2("2"));
    }

    public static IceCream getIceCream(String id){
        List<Flavor> fl = Arrays.asList(new Flavor(1, "Vanilla"),
                new Flavor(2, "Chocolate"));
        System.out.println(fl);

        Flavor flavor = new Flavor(1, "Name");
        flavor.setFlavorId(1);
        flavor.setFlavorName("Vanilla");
        flavor.setFlavorId(2);
        flavor.setFlavorName("Chocolate");
        return flavor;

    }

    public static IceCream getIceCream2(String id){
        List<Toppings> fl = Arrays.asList(new Toppings(1, "Apple Butter"),
                new Toppings(2, "Hot Fudge"));
        System.out.println(fl);

        Toppings toppings = new Toppings(1, "Name");
        toppings.setToppingsId(1);
        toppings.setToppingsName("Vanilla");
        toppings.setToppingsId(2);
        toppings.setToppingsName("Chocolate");
        return toppings;

    }
}


