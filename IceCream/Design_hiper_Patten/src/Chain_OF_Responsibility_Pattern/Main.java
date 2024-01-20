package Chain_OF_Responsibility_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create instances of handler classes
        OrderValidationHandler validationHandler = new OrderValidationHandler();
        OrderProcessingHandler processingHandler = new OrderProcessingHandler();

        // Set up the chain of responsibility
        validationHandler.setNextHandler(processingHandler);

        // Create an order
        Order order1 = new Order(1, 5200.00);
        Order order2 = new Order(2, 32000.00);

        // Process orders through the chain
        validationHandler.handleOrder(order1);
        System.out.println("------------");
        validationHandler.handleOrder(order2);
    }
}
