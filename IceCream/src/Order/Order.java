package Order;

import OrderItems.OrderItems;
import Status.Status;
import Method.Method;

import java.util.List;

public class Order {

    private int orderId;
    private List<OrderItems> items;
    private List<Status> orderStatus;
    private List<Method> deliveryMethod;

    public Order(int orderId, List<OrderItems> items, List<Status> orderStatus, List<Method> deliveryMethod) {
        this.orderId = orderId;
        this.items = items;
        this.orderStatus = orderStatus;
        this.deliveryMethod = deliveryMethod;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<OrderItems> getItems() {
        return items;
    }

    public void setItems(List<OrderItems> items) {
        this.items = items;
    }

    public List<Status> getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(List<Status> orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Method> getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(List<Method> deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", items=" + items +
                ", orderStatus=" + orderStatus +
                ", deliveryMethod=" + deliveryMethod +
                '}';
    }
}
