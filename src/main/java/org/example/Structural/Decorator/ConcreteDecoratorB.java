package org.example.Structural.Decorator;

public class ConcreteDecoratorB extends  Decorator{
    private String addedState;
    ConcreteDecoratorB(Component component){
        super(component);
    }
    @Override
    public String operation(){
        addedState = super.operation();
        return addedBehavior(addedState);
    }

    private String addedBehavior(String in) {
        return "<h1>" + in + "</h1>";
    }
}
