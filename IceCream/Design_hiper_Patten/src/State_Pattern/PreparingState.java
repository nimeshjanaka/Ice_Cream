package State_Pattern;

public class PreparingState implements OrderState{
    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order is in the 'Preparing' state. Preparing items...");
        // Additional logic for processing a preparing order
        context.setOrderState(new OutForDeliveryState());
    }
}
