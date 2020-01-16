package com.upgrad.oop2;

interface Series {
    String name = "iSeries";
    int getNext();
    void reset();
    void setStart(int x);
}


class ByTwo implements Series {
    protected int start;
    protected int val;

    public ByTwo() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val = val + 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class ByThree extends ByTwo implements Series {

    public int getNext() {
        val = val + 3;
        return val;
    }
}

public class Simulation {
    public static void main(String[] args) {
        Series iRef;
        ByTwo s1 = new ByTwo();
        s1.setStart(2);

        //interface reference points to s1 object
        iRef = s1;
        for (int i = 0; i < 5; i++) {
            System.out.print(iRef.getNext() + " ");
        }

        System.out.println();
        ByThree s2 = new ByThree();
        s2.setStart(1);

        iRef = s2;
        for (int i = 0; i < 5; i++) {
            System.out.print(iRef.getNext() + " ");
        }

        System.out.println();
    }
}