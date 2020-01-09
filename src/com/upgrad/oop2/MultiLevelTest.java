package com.upgrad.oop2;

class TodShapev1 {
    private double width;
    private double height;

    public TodShapev1() {
        this(0, 0);
    }

    public TodShapev1(double x) {
        this(x, x);
    }

    public TodShapev1(double x, double y) {
        this.width = x;
        this.height = y;
    }

    public void showDim() {
        System.out.println("width: " + this.width + " height:" + this.height);
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }
}


class Trianglev1 extends TodShapev1 {
    private String style;

    public Trianglev1() {
        super();
        this.style = "None";
    }

    public Trianglev1(double x) {
        super(x);
        this.style = "Filled";
    }

    public Trianglev1(double x, double y, String s) {
        super(x, y);
        this.style = s;
    }

    public double area() {
        return (this.getWidth() * this.getHeight()) / 2;
    }

    public void showStyle() {
        System.out.println("Style: " + this.style);
    }

}

class ColorTrianglev1 extends Trianglev1 {
    private String color;

    public ColorTrianglev1() {
        super();
        this.color = "None";
    }

    public ColorTrianglev1(double x) {
        super();
        this.color = "White";
    }

    public ColorTrianglev1(double x, double y, String s, String c) {
        super(x, y, s);
        this.color = c;
    }

    public void showColor() {
        System.out.println("Color: " + this.color);
    }
}


public class MultiLevelTest {
    public static void main(String[] args) {
        System.out.println("this shows multilevel inheritance");
        ColorTrianglev1 c1 = new ColorTrianglev1();
        ColorTrianglev1 c2 = new ColorTrianglev1(2.0, 3.0, "Transparent", "Blue");

        c2.showColor();
        c2.showStyle();
        c2.showDim();

    }
}
