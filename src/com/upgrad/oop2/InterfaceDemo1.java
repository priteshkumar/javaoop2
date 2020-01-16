package com.upgrad.oop2;

interface Ciops {
    //variables inside interface are public static final
    String name = "Cifunctions";

    //methods are public abstract by default
    void configureJob();
    void runBuild();
    void configureSlave();

    //static mehthods inside interface should have body defined
    static void display() {
        System.out.println("interface display");
    }

    //default methods should have body defined
    default void showresults() {
        System.out.println("show interface results");
    }

}


public class InterfaceDemo1 implements Ciops {

    public void configureJob() {
        System.out.println("configure job");
    }

    public void runBuild() {
        System.out.println("do build");
    }

    public void configureSlave() {
        System.out.println("configure slave machine");
    }

    public static void main(String[] args) {
        InterfaceDemo1 inDemo = new InterfaceDemo1();
        inDemo.configureSlave();
        inDemo.configureJob();
        inDemo.runBuild();
    }
}
