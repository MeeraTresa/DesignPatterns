package org.example.Structural.Composite;

public class BuildOrder {
    public static Component getOrder(){
        Composite order = new Composite("Order");
        order.addChild(new Leaf("Crispy Onion rings", 5.50));
        order.addChild(new Leaf("French fries", 4.50));
        Composite cheeseBurger = new Composite("Cheese Burger");
        cheeseBurger.addChild(new Leaf("Lettuce", 1.90));
        cheeseBurger.addChild(new Leaf("Bun", 3.50));
        cheeseBurger.addChild(new Leaf("Chicken patty", 6.50));
        order.addChild(cheeseBurger);
        return  order;
    }
}
