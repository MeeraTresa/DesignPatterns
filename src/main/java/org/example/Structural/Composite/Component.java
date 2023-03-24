package org.example.Structural.Composite;

public interface Component {
    void printDescription();
    void addChild(Component component);
    void removeChild(Component component);
    Component getChild(int i);
}
