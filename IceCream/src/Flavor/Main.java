package Flavor;

public class Main {
    public static void main(String[] args){

        Flavor flavor1 = new Flavor(1, "");
        Flavor flavor2 = new Flavor(2, "");
        Flavor flavor3 = new Flavor(3, "");
        Flavor flavor4 = new Flavor(4, "");
        Flavor flavor5 = new Flavor(5, "");
        Flavor flavor6 = new Flavor(6, "");

        //set the ice cream flavor id and flavors
        flavor1.setFlavorId(1);
        flavor1.setFlavorName("Vanilla");

        flavor2.setFlavorId(2);
        flavor2.setFlavorName("Chocolate");

        flavor3.setFlavorId(3);
        flavor3.setFlavorName("Strawberry");

        flavor4.setFlavorId(4);
        flavor4.setFlavorName("Rocky Road");

        flavor5.setFlavorId(5);
        flavor5.setFlavorName("Coffee");

        flavor6.setFlavorId(6);
        flavor6.setFlavorName("Pistachio");

        //print the flavors
        System.out.println(flavor1);
        System.out.println(flavor2);
        System.out.println(flavor3);
        System.out.println(flavor4);
        System.out.println(flavor5);
        System.out.println(flavor6);

    }
}
