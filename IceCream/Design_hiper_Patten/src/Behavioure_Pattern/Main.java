package Behavioure_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create Ice Cream Shop (subject)
        IceCreamSubject iceCreamShop = new IceCreamShopSubject();

        // Create Ice Cream Customers (observers)
        IceCreamObserver customer1 = new IceCreamCustomerObserver("Customer 1");
        IceCreamObserver customer2 = new IceCreamCustomerObserver("Customer 2");

        // Customers subscribe to the Ice Cream Shop
        iceCreamShop.addObserver(customer1);
        iceCreamShop.addObserver(customer2);

        // Ice Cream Shop introduces new flavors and launches promotions
        ((IceCreamShopSubject) iceCreamShop).introduceNewFlavor("Mint Chocolate Chip");
        ((IceCreamShopSubject) iceCreamShop).launchPromotion("Buy One Get One Free");

        // Customers receive notifications
    }
}
