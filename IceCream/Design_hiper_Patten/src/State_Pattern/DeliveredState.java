package State_Pattern;

public class DeliveredState implements OrderState{
    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order is in the 'Delivered' state. Order delivered successfully.");
        // Additional logic for processing a delivered order
    }
}
