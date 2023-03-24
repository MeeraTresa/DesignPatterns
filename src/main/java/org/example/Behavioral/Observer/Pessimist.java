package org.example.Behavioral.Observer;

public class Pessimist extends ConcreteObserver{
    public Pessimist(ConcreteSubject subject) {
        super(subject);
    }
    public void update(){
        if(subject.getSubjectState().equalsIgnoreCase("The price of gas is at $5 per gallon")){
            observerState = "This is the beginning of the end";
        }else{
            observerState = ":-(";
        }
    }
}
