package org.example.Behavioral.ChainOfResponsibility;

public class Client {
    public static void runTest() {
        Handler H1 = new ConcreteHandler1();
        Handler H2 = new ConcreteHandler2();
        Handler H3 = new ConcreteHandler3();
        H1.setSuccessor(H2);
        H2.setSuccessor(H3);
        System.out.println("Sending R1");
        H1.handleRequest("R1");
        System.out.println("Sending R2");
        H1.handleRequest("R2");
        System.out.println("Sending R3");
        H1.handleRequest("R3");
        System.out.println("Sending RX...");
        H1.handleRequest("RX");
    }
}
