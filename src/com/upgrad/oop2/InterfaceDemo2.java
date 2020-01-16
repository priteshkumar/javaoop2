package com.upgrad.oop2;

interface CiopsV1 {

    void configureJob();

    //void doBuild();
    void display();

    static void showresults() {
        System.out.println("show ciops results");
    }

    default void showlog() {
        System.out.println("show ciops log");
    }
}


interface PackageArtifacts {

    void createPackage();

    void display();

    default void showlog() {
        System.out.println("show package log");
    }
}


public class InterfaceDemo2 implements CiopsV1, PackageArtifacts {

    public void configureJob() {
        System.out.println("configure cijob");
    }

    public void display() {
        System.out.println("display interfacedemo results");
    }

    public void createPackage() {
        System.out.println("create deb package");
    }

    //implement showlog method can call interface specific method
    public void showlog() {
        CiopsV1.super.showlog();
        PackageArtifacts.super.showlog();
    }

    public static void main(String[] args) {
        InterfaceDemo2 inDemo2 = new InterfaceDemo2();
        inDemo2.display();
        inDemo2.configureJob();
        inDemo2.createPackage();

        //call static method of interface via Interface_name.method()
        CiopsV1.showresults();

        //call interface default method
        inDemo2.showlog();

    }
}
