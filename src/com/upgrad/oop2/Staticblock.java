package com.upgrad.oop2;
import java.lang.Math;

public class Staticblock {
    static double rootof2;
    static double rootof3;

    static{

        System.out.println("inside static block");
        rootof2 = Math.sqrt(2.0);
        rootof3 = Math.sqrt(3.0);
    }

    public Staticblock(){
        System.out.println("Inside staticblock constructor");
    }

    public static void main(String[] args){
        Staticblock sb = new Staticblock();
        System.out.println("Square root of 2: " + Staticblock.rootof2);
        System.out.println("Square root of 2: " + sb.rootof3);
        System.out.println("Square root of 2: " + Staticblock.rootof3);
    }

}
