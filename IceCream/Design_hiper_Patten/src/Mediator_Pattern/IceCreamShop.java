package Mediator_Pattern;

public class IceCreamShop implements IceCreamColleague{

    private IceCreamOrderMediator mediator;

    @Override
    public void setMediator(IceCreamOrderMediator mediator) {
        this.mediator = mediator;
    }

    public void receiveOrder(IceCreamOrder order) {
        System.out.println("Received an order from a customer: " + order.getDescription());
        // Additional logic for processing the order
    }
}
