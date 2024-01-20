package Mediator_Pattern;

public class IceCreamCustomer implements IceCreamColleague{

    private String name;
    private IceCreamOrderMediator mediator;

    public IceCreamCustomer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setMediator(IceCreamOrderMediator mediator) {
        this.mediator = mediator;
    }

    public void placeOrder(IceCreamOrder order) {
        mediator.placeOrder(order, this);
    }
}
