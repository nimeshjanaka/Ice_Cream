package OrderItems;

public class Main {
    public static void main(String[] args){

        // Create an instance of OrderItems and set values
        OrderItems item1 = new OrderItems("Chocolate Sundae", 160);
        OrderItems item2 = new OrderItems("Vanilla Cone", 85);

        // Print the OrderItems details
        System.out.println(item1);
        System.out.println(item2);
    }
}

