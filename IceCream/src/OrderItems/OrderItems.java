package OrderItems;

public class OrderItems {

    private String iceCream;
    private int qty;

    public OrderItems(String iceCream, int qty) {
        this.iceCream = iceCream;
        this.qty = qty;
    }

    public String getIceCream() {
        return iceCream;
    }

    public void setIceCream(String iceCream) {
        this.iceCream = iceCream;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderItems{" +
                "iceCream='" + iceCream + '\'' +
                ", qty=" + qty +
                '}';
    }
}
