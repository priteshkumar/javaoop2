package com.upgrad.oop2;

class Datastructure {
    private static final int SIZE = 15;
    private int[] array = new int[SIZE];

    public Datastructure(){
        for(int i=0;i < SIZE;i++){
            array[i] = i + 1;
        }
    }

    private class DataIter {
        private int nextIndex = 0;
        public boolean hasNext(){
            return (nextIndex < SIZE);
        }

        public int nextValue(){
            nextIndex = nextIndex + 2;
            return Integer.valueOf(array[nextIndex-2]);
        }

    }

    public void printEven(){
        DataIter diter = new DataIter();
        while(diter.hasNext()){
            System.out.print(diter.nextValue() + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        Datastructure ds = new Datastructure();
        ds.printEven();

    }

}
