package Chain_OF_Responsibility_Pattern;

public class OrderValidationHandler implements OrderHandler{

    private OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleOrder(Order order) {
        // Perform order validation logic
        if (order.getTotalAmount() <= 100000.00) {
            System.out.println("Order #" + order.getOrderId() + " passed validation.");
            if (nextHandler != null) {
                nextHandler.handleOrder(order);
            }
        } else {
            System.out.println("Order #" + order.getOrderId() + " failed validation.");
        }
    }
}
