package org.example.Structural.Proxy;

public class Proxy implements Subject{
    private Subject realSubject;
    @Override
    public void doOperation() {
        realSubject.doOperation();
    }
}
