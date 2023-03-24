package org.example.Structural.Decorator;

public class Tester {
    public static void runTest(){
        Component obj = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        System.out.println(obj.operation());
    }
}
