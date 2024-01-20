package Strategy_Pattern;

public class DigitalWalletPayment implements PaymentStrategy{

    private String walletId;

    public DigitalWalletPayment(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid LKR" + amount + " using Digital Wallet with ID " + walletId);
        // Additional logic specific to digital wallet payments
    }
}
