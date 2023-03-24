package org.example.Behavioral.Command;

public interface Invoker {
    void setCommand(Command command);
    void invoke();
}
