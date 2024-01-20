package State_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create an order context
        OrderContext orderContext = new OrderContext();

        // Process the order through different states
        orderContext.processOrder(); // OrderedState
        orderContext.processOrder(); // PreparingState
        orderContext.processOrder(); // OutForDeliveryState
        orderContext.processOrder(); // DeliveredState
    }
}
