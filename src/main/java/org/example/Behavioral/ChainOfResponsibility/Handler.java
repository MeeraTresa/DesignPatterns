package org.example.Behavioral.ChainOfResponsibility;

public interface Handler {
    void handleRequest(String request);
    void setSuccessor(Handler successor);
}
