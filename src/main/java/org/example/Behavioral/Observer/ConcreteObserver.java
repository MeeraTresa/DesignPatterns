package org.example.Behavioral.Observer;


/**
 * Maintains a reference to the Concrete Subject object
 * Stores the state that should stay consistent with the subject
 * implements the update interface to keep its state consistent with the subject
 */
public class ConcreteObserver implements Observer{
    protected String observerState;
    protected ConcreteSubject subject;
    public ConcreteObserver(ConcreteSubject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        //Do nothing
    }
    public void showState(){
        System.out.println(this.getClass().getName() + " observer's state" + observerState);
    }
}
