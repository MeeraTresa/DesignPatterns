package org.example.Creational.FactoryMethod;

public abstract class EngineFactory {
    public Engine orderEngine(String order){
        System.out.println("Ordering..."+order);
        return createEngine();
    }
    abstract Engine createEngine();

}
