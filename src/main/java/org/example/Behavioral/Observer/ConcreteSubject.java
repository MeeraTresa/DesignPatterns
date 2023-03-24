package org.example.Behavioral.Observer;

import java.util.ArrayList;

/**
 * Stores the state of interest to ConcreteObserver objects
 * Sends notification to its observers when its state changes
 */
public class ConcreteSubject implements Subject {
    private String subjectState;
    private ArrayList<Observer> observers = new ArrayList<>();
    public String getSubjectState(){
        return subjectState;
    }
    public void setSubjectState(String subjectState){
        this.subjectState = subjectState;
        notifyObservers();
    }

    public void showSubjectState(){
        System.out.println(this.getClass().getName()+" subject's state is " + subjectState);
    }
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.update();
        }
    }
}
