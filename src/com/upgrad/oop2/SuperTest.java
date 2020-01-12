package com.upgrad.oop2;

class SuperV1 {
    protected String name;
    protected int version;

    {
        this.name = "Superv1";
        this.version = 0;
    }

    /*default no arg constructor can be added to avoid compile error
    when subclass doesnt invoke parameteried constructor
    */

    /*public SuperV1(){
        this(0);
    }*/

    public SuperV1(int version) {
        this.version = 23;
    }

    public void printName() {
        System.out.println(this.getClass().getName());
        System.out.println("Name: " + this.name);
    }
}


class SubclassV1 extends SuperV1 {
    private String description;

    {
        this.description = "subclass extends SuperV1";
    }

    public SubclassV1(String decsription, int version) {
        //no default constructor in superclass , use super(argumentlist)
        super(version);
        this.description = decsription;
    }

    public void printDescription() {
        System.out.println(this.getClass().getName());
        System.out.println(this.description);
    }
}


public class SuperTest {
    public static void main(String[] args) {
        SubclassV1 sb1 = new SubclassV1("subclass description", 1);
        sb1.printName();
        sb1.printDescription();

        SubclassV1 sb2 = new SubclassV1("subclass description", 2);
        sb1.printName();
        sb1.printDescription();
    }

}
