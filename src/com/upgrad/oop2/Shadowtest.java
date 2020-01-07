package com.upgrad.oop2;

public class Shadowtest {
    public int x = 0;

    class Firstlevel {
        public int x = 1;
        void methodinFirstlevel(int x){
            System.out.println("x= " + x);
            System.out.println("this.x =  " + this.x);
            System.out.println("Shadowtest.this.x =  " + Shadowtest.this.x);
        }
    }

    private Firstlevel f1;

    public Shadowtest(){
        this.x = 23;
        this.f1 = new Firstlevel();
    }

    public void printXval(){
        this.f1.methodinFirstlevel(34);
    }

    public static void main(String[] args){
        Shadowtest test = new Shadowtest();
        test.printXval();
    }

}
