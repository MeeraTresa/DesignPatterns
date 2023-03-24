package org.example.Behavioral.Command;



public interface Command {
    void execute();
    void setReceiver(Receiver receiver);
}
