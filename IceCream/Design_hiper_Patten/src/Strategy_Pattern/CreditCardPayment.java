package Strategy_Pattern;

public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid LKR" + amount + " using Credit Card ending with " + cardNumber);
        // Additional logic specific to credit card payments
    }
}
