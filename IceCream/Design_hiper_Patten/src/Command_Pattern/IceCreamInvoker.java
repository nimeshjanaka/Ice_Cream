package Command_Pattern;

// Invoker class representing the entity that asks for the request to be performed
public class IceCreamInvoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
