package org.example.Creational.FactoryMethod;

public class TeslaEngineFactory extends EngineFactory{
    @Override
    public Engine createEngine(){
        return new Electric();
    }

}
