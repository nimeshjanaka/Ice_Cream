package Observe_Pattern;

public class OrderStatusObserver implements OrderObserver{

    private String observerName;

    public OrderStatusObserver(String observerName) {
        this.observerName = observerName;
    }

    // Update method to be called when the order status changes
    @Override
    public void update(OrderSubject subject) {
        if (subject instanceof Order) {
            Order order = (Order) subject;
            System.out.println("Observer " + observerName + " - Order " + order.getOrderId() +
                    " status updated: " + order.getOrderStatus());
        }
    }
}
