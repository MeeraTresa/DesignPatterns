package org.example.Behavioral.ChainOfResponsibility;

public class ConcreteHandler3 implements Handler{
    private Handler successor;
    @Override
    public void handleRequest(String request) {
        System.out.println("Request came to R3...");
        if(request.equalsIgnoreCase("R3")){
            System.out.println(this.getClass().getName() + "=>This one is mine !!");
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
