package org.example.Behavioral.Observer;

public class Optimist extends ConcreteObserver{
    public Optimist(ConcreteSubject subject) {
        super(subject);
    }
    public void update(){
        if(subject.getSubjectState().equalsIgnoreCase("The price of gas is at $5 per gallon")){
            observerState = "Great ! It's time to go green";
        }else{
            observerState = ":-)";
        }
    }
}
