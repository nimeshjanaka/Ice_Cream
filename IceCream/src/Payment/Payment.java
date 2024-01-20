package Payment;

import Status.Status;

import java.util.List;

public class Payment {

    private int paymentId;
    private double amount;
    private List<Status> paymentStatus;
    private int loyaltyPoints;

    public Payment(int paymentId, double amount, List<Status> paymentStatus, int loyaltyPoints) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Status> getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(List<Status> paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", paymentStatus=" + paymentStatus +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }
}
