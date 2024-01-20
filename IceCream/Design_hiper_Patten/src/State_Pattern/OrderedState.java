package State_Pattern;

public class OrderedState implements OrderState{

    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order is in the 'Ordered' state. Processing order...");
        // Additional logic for processing an ordered order
        context.setOrderState(new PreparingState());
    }
}
