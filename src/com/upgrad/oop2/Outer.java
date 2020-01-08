package com.upgrad.oop2;

public class Outer {
    private int[] nary;

    public Outer(int[] n){
        this.nary = n;
    }

    class Arrayops{
        public int getMin(){
            int n = nary.length;
            int min = nary[0];
            for (int i=0;i < n;i++){
                if (min > nary[i]){
                    min = nary[i];
                }
            }

            return min;
        }

        public int getMax(){
            int n = nary.length;
            int max = nary[0];
            for (int i=0;i < n;i++){
                if (max < nary[i]){
                     max = nary[i];
                }
            }

            return max;
        }
    }

    public void displayMinMax(){
        Arrayops ops = new Arrayops();
        System.out.println("Min value is: " + ops.getMin());
        System.out.println("Max value is: " + ops.getMax());
    }

    public static void main(String[] args){
        int[] nums = {32,23,-3,40,-9,93,7,90};
        Outer ob = new Outer(nums);
        ob.displayMinMax();
    }
}
