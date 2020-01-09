package com.upgrad.oop2;

class TodShape {
    private double width;
    private double height;

    public TodShape() {
        this(0.0, 0.0);
    }

    public TodShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    protected double getWidth() {
        return this.width;
    }

    protected double getHeight() {
        return this.height;
    }

    protected void setWidth(double width) {
        this.width = width;
    }

    protected void setHeight(double height) {
        this.height = height;
    }

    public void showDim() {
        System.out.println("2dshape width : " + this.width +
                "  2dshape height: " + this.height);
    }

}


class Triangle extends TodShape {

    private String style;

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double calcArea() {
        return ((this.getWidth() * this.getHeight()) / 2.0);
    }


}


public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("this code shows ineritance");
        System.out.println("rebuild..");
        Triangle t1 = new Triangle();
        t1.setWidth(2.0);
        t1.setHeight(3.0);
        t1.setStyle("Filled");
        t1.showDim();
        System.out.println(t1.calcArea());

    }
}