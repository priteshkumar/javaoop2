package com.upgrad.oop2;

interface SeriesTwo {
    void setStart(int x);

    int getTwoNext();
}

interface SeriesThree extends SeriesTwo {
    int getThreeNext();
}


/*class implementing a subclassed interface has to implement
all methods in the interface hierarchy
 */
public class InterfaceDemo3 implements SeriesThree {
    private int start;
    private int val;

    public void setStart(int x) {
        start = val = 0;
    }

    //if below interface method was not implemented would result in compile error
    public int getTwoNext() {
        val = val + 2;
        return val;
    }

    public int getThreeNext() {
        val = val + 3;
        return val;
    }

    public static void main(String[] args) {
        SeriesThree iRef = new InterfaceDemo3();
        iRef.setStart(20);

        for (int i = 0; i < 10; i++) {
            System.out.print(iRef.getTwoNext() + " ");
        }
        System.out.println();
    }
}