package State_Pattern;

public class OrderContext {

    private OrderState orderState;

    public OrderContext() {
        // Initialize with the default state
        this.orderState = new OrderedState();
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void processOrder() {
        orderState.processOrder(this);
    }
}
