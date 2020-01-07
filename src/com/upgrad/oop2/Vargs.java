package com.upgrad.oop2;
import java.lang.Math;

class Point{

    private int x;
    private int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double calcDistOrigin(){
        double distOrigin = Math.sqrt((this.x * this.x) + (this.y * this.y));
        return distOrigin;
    }
}


public class Vargs {
    public static void main(String[] args){
        Point p1 = new Point(3,4);
        Point p2 = new Point(4,7);
        Point p3 = new Point(1,3);

        System.out.println("Total3PointDistance :  " + calcDistSum(p1,p2,p3));
        System.out.println("Total2PointDistance :  " + calcDistSum(p1,p2));
        System.out.println("Total2PointDistance :  " + calcDistSum(p2,p3));
    }

    public static double calcDistSum(Point... points){
        int plen = points.length;
        double totalDist=0.0;

        for (int i=0;i < plen;i++){
                totalDist += points[i].calcDistOrigin();
        }

        return totalDist;
    }
}
