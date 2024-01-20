package Strategy_Pattern;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to perform payment using the selected strategy
    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
