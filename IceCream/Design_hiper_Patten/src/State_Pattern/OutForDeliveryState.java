package State_Pattern;

public class OutForDeliveryState implements OrderState{
    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order is in the 'Out for Delivery' state. Out for delivery...");
        // Additional logic for processing an order out for delivery
        context.setOrderState(new DeliveredState());
    }
}
