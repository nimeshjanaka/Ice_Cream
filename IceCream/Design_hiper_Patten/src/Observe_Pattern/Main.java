package Observe_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order(1);

        // Create observers
        OrderObserver observer1 = new OrderStatusObserver("Observer Machine 1");
        OrderObserver observer2 = new OrderStatusObserver("Observer Machine 2");

        // Register observers with the order
        order.registerObserver(observer1);
        order.registerObserver(observer2);

        // Update the order status and notify observers
        order.updateOrderStatus(OrderStatus.PREPARING);

        // Remove an observer
        order.removeObserver(observer1);

        // Update the order status again and notify remaining observer
        order.updateOrderStatus(OrderStatus.OUT_FOR_DELIVERY);
    }
}
