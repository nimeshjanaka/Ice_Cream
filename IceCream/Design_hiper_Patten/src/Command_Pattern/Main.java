package Command_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create instances of the Command, Receiver, and Invoker
        IceCreamReceiver iceCreamReceiver = new IceCreamReceiver();
        Command placeOrderCommand = new PlaceOrderCommand(iceCreamReceiver);
        IceCreamInvoker iceCreamInvoker = new IceCreamInvoker();

        // Set the command and execute it
        iceCreamInvoker.setCommand(placeOrderCommand);
        iceCreamInvoker.executeCommand();
    }
}
