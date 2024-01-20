package Command_Pattern;

// Concrete command class for placing an ice cream order
public class PlaceOrderCommand implements Command{

    private IceCreamReceiver iceCreamReceiver;

    public PlaceOrderCommand(IceCreamReceiver iceCreamReceiver) {
        this.iceCreamReceiver = iceCreamReceiver;
    }

    @Override
    public void execute() {

    }
}
