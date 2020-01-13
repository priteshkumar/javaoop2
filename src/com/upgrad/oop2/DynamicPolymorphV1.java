package com.upgrad.oop2;

class Shape {

    private String name;
    private int sides;

    public Shape(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }

    public String getDetails() {
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter is " + this.perimeter());
        return "Shape: " + name + "\n" + "Sides: " + this.sides + "\n";
    }

    public double perimeter() {
        System.out.println("calculate " + this.name + " perimeter");
        double ar = this.perimeter();
        return ar;
    }
}


class TriangleV1 extends Shape {

    private double a;
    private double b;
    private double c;
    private String style;

    public TriangleV1(String style, double a, double b, double c) {
        super("Triangle", 3);
        this.a = a;
        this.b = b;
        this.c = c;
        this.style = style;
    }

    public double perimeter() {
        return (this.a + this.b + this.c);
    }

    public String getDetails() {
        String TriangleDetail = super.getDetails();
        TriangleDetail += "Sides: " + this.a + "," + this.b + "," + this.c + "\n";
        TriangleDetail += "Style: " + this.style;
        return TriangleDetail;
    }
}


class RectangleV1 extends Shape {
    private double width;
    private double height;

    public RectangleV1(double width, double height) {
        super("Rectangle", 4);
        this.width = width;
        this.height = height;
    }

    public double perimeter() {
        return ((2 * this.width) + (2 * this.height));
    }

    public String getDetails() {
        return super.getDetails();
    }
}


public class DynamicPolymorphV1 {
    public static void main(String[] args) {

        Shape s1 = new TriangleV1("Filled", 3, 5, 7);
        Shape s2 = new RectangleV1(3, 4);

        System.out.println(s1.getDetails());
        System.out.println("Printing perimeter: " + s1.perimeter());

        System.out.println(s2.getDetails());
        System.out.println("Printing perimeter: " + s2.perimeter());

    }
}
