package org.example.Structural.Composite;

import java.text.DecimalFormat;

public class Leaf implements Component{
    private String description;
    private Double price;

    public Leaf(String description, Double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println(description + " : " + fmt.format(price));
    }

    @Override
    public void addChild(Component component) {

    }

    @Override
    public void removeChild(Component component) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }
}
