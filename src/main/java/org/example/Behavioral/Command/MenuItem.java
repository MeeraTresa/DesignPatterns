package org.example.Behavioral.Command;

public class MenuItem implements Invoker{
    Command command;
    @Override
    public void setCommand(Command command) {
        command = command;
    }

    @Override
    public void invoke() {
        command.execute();
    }
}
