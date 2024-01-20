package Strategy_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create instances of PaymentStrategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("4800257714850008");
        PaymentStrategy digitalWalletPayment = new DigitalWalletPayment("7071");

        // Create instances of PaymentContext with different strategies
        PaymentContext creditCardContext = new PaymentContext(creditCardPayment);
        PaymentContext walletContext = new PaymentContext(digitalWalletPayment);

        // Perform payments using different strategies
        creditCardContext.processPayment(4000.00);
        walletContext.processPayment(1500.00);
    }
}
