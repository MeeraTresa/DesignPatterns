package org.example.Creational.FactoryMethod;

public class PriusEngineFactory extends EngineFactory{
    @Override
    Engine createEngine() {
        System.out.println("Creating Engine ");
        return new Hybrid();
    }
}
