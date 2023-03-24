package org.example.DesignPrinciples;

public class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
        return  this.height*this.width;
    }
    public static final void setDimensions(Rectangle r, int w, int h){
        r.setHeight(h);
        r.setWidth(w);
        System.out.println(r.getArea());
        System.out.println(w*h);
        assert r.getArea() == w*h;
    }
}
