package org.example.Behavioral.Command;

public class Client {
    private String helloMessage = "Hello World !";
    private String goodbyeMessage = "Goodbye World !";
    private Menu applicationMenu = new Menu();
    public Menu getApplicationMenu(){
        return applicationMenu;
    }
    public void runSetUp(){
        MenuItem hello = new MenuItem();
        MenuItem goodBye = new MenuItem();
        Command sayHello = new ConcreteCommand();

    }
}
