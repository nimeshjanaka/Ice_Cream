package Observe_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Order implements OrderSubject{

    private int orderId;
    private OrderStatus orderStatus;
    private List<OrderObserver> observers;

    public Order(int orderId) {
        this.orderId = orderId;
        this.orderStatus = OrderStatus.ORDERED;
        this.observers = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    // Method to update the order status and notify observers
    public void updateOrderStatus(OrderStatus newStatus) {
        this.orderStatus = newStatus;
        notifyObservers();
    }

    // Observer registration methods
    @Override
    public void registerObserver(OrderObserver observer) {

    }

    @Override
    public void removeObserver(OrderObserver observer) {

    }

    // Notify observers of the order status change
    @Override
    public void notifyObservers() {

    }
}
