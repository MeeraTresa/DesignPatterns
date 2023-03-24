package org.example.Behavioral.Command;

public class ConcreteCommand implements Command{
    private Receiver receiver;
    @Override
    public void execute() {
        receiver.doAction();
    }

    @Override
    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
