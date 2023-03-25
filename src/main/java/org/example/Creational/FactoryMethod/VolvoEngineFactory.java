package org.example.Creational.FactoryMethod;

public class VolvoEngineFactory extends EngineFactory{
    @Override
    Engine createEngine() {
        return new Gas();
    }
}
