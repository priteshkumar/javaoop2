package com.upgrad.oop2;

import org.w3c.dom.css.Rect;

class Rectangle{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(){
        this(0,0,1,1);
    }

    public Rectangle(int width,int height){
        this(0,0,width,height); //calling constructor should be first statement
    }

    public Rectangle(int x,int y,int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getArea(){ return this.width * this.height;}
}


public class Muticonstruct {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        System.out.println(r1.getArea());

        Rectangle r2 = new Rectangle(3,4);
        System.out.println(r2.getArea());
    }
}
