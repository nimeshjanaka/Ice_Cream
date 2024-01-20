package Chain_OF_Responsibility_Pattern;

public class Order {

    private int orderId;
    private double totalAmount;

    public Order(int orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
