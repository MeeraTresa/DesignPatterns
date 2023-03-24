package org.example.Behavioral.ChainOfResponsibility;

public class ConcreteHandler1 implements Handler{
    private Handler successor;
    @Override
    public void handleRequest(String request) {
        System.out.println("R1 got the request...");
        if(request.equalsIgnoreCase("R1")){
            System.out.println(this.getClass().getName() + "=>This one is mine !");
        }else{
            if(successor != null)
                successor.handleRequest(request);
        }
    }

    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
