package Decorator_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create a basic ice cream
        IceCream conesIceCream = new ConesIceCream();

        // Add toppings and syrups using decorators
        IceCream iceCreamWithToppings = new ToppingsDecorator(conesIceCream, "Chocolate Chips");
        IceCream iceCreamWithToppingsAndSyrup = new SyrupDecorator(iceCreamWithToppings, "salted butter caramel");

        // Display the final ice cream
        System.out.println("Final Ice Cream: " + iceCreamWithToppingsAndSyrup.makeIceCream());
    }
}
