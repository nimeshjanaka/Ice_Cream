package Chain_OF_Responsibility_Pattern;

public class OrderProcessingHandler implements OrderHandler{

    private OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleOrder(Order order) {
        // Perform order processing logic
        System.out.println("Processing order #" + order.getOrderId() + " with total amount LKR" + order.getTotalAmount());
        if (nextHandler != null) {
            nextHandler.handleOrder(order);
        }
    }
}
