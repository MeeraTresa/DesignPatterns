package org.example.Structural.Composite;

import java.util.ArrayList;

public class Composite implements Component{
    private ArrayList<Component> children = new ArrayList<>();
    private String description;
    Composite(String description){
        this.description = description;
    }
    @Override
    public void printDescription() {
        System.out.println(description);
        for(Component c: children){
            c.printDescription();
        }
    }

    @Override
    public void addChild(Component component) {
        children.add(component);
    }

    @Override
    public void removeChild(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }
}
