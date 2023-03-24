package org.example.Behavioral.Observer;

public class Tester {
    public static void runTest(){
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver optimist = new Optimist(subject);
        ConcreteObserver pessimist = new Pessimist(subject);
        optimist.showState();
        pessimist.showState();
        subject.setSubjectState("The price of gas is at $5 per gallon");
        optimist.showState();
        pessimist.showState();




    }
}
