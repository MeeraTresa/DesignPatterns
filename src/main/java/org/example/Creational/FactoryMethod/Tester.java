package org.example.Creational.FactoryMethod;

public class Tester {
    public static void runTest(){
        PriusEngineFactory priusEngineFactory = new PriusEngineFactory();
        System.out.println(priusEngineFactory.orderEngine("MyPrius"));
    }
}
