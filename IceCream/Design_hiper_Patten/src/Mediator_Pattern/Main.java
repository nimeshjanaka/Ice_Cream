package Mediator_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create the mediator
        IceCreamOrderMediator mediator = new IceCreamOrderMediatorImpl();

        // Create customers and shops
        IceCreamCustomer customer1 = new IceCreamCustomer("Customer 1");
        IceCreamCustomer customer2 = new IceCreamCustomer("Customer 2");
        IceCreamShop shop1 = new IceCreamShop();
        IceCreamShop shop2 = new IceCreamShop();

        // Register customers and shops with the mediator
        ((IceCreamOrderMediatorImpl) mediator).addCustomer(customer1);
        ((IceCreamOrderMediatorImpl) mediator).addCustomer(customer2);
        ((IceCreamOrderMediatorImpl) mediator).addShop(shop1);
        ((IceCreamOrderMediatorImpl) mediator).addShop(shop2);

        // Set the mediator for customers and shops
        customer1.setMediator(mediator);
        customer2.setMediator(mediator);
        shop1.setMediator(mediator);
        shop2.setMediator(mediator);

        // Customers place orders
        customer1.placeOrder(new IceCreamOrder("Chocolate Ice Cream"));
        customer2.placeOrder(new IceCreamOrder("Vanilla Ice Cream"));
    }
}
