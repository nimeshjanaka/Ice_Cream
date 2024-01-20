package Mediator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class IceCreamOrderMediatorImpl implements IceCreamOrderMediator{

    private List<IceCreamCustomer> customers;
    private List<IceCreamShop> shops;

    public IceCreamOrderMediatorImpl() {
        this.customers = new ArrayList<>();
        this.shops = new ArrayList<>();
    }

    public void addCustomer(IceCreamCustomer customer) {
        customers.add(customer);
    }

    public void addShop(IceCreamShop shop) {
        shops.add(shop);
    }

    @Override
    public void placeOrder(IceCreamOrder order, IceCreamCustomer customer) {
        // Mediator coordinates the order placement between customer and shop
        System.out.println(customer.getName() + " is placing an order...");
        for (IceCreamShop shop : shops) {
            shop.receiveOrder(order);
        }
    }
}
