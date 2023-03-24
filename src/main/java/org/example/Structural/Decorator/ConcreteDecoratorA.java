package org.example.Structural.Decorator;

public class ConcreteDecoratorA extends Decorator{
    private String addedState;
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        addedState = super.operation();
        return addedBehavior(addedState);
    }
    private String addedBehavior(String in){
        return "<em>" + addedState + "</em>";
    }
}
