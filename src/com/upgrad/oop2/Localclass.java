package com.upgrad.oop2;
import java.util.Arrays;

public class Localclass {

    public static void main(String[] args){

        class Bitout{
            int numBits;

            public Bitout(int n){
                if (n < 1) n = 1;
                if (n > 64) n = 64;
                numBits = n;
            }

            void show(long val){
                long mask = 1;
                mask <<= numBits -1;
                int spacer = 8 - (numBits % 8);
                for (;mask != 0;mask >>>=1){
                    if ((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if (spacer %8 == 0){
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }

        for (byte b=0; b < 10;b++){
            Bitout byteval = new Bitout(8);
            System.out.print(b + " in binary: ");
            byteval.show(b);
        }

        for (short b = 255; b < 265; b++) {
            Bitout byteval = new Bitout(16);
            System.out.print(b + " in binary: ");
            byteval.show(b);
        }

        int[] ary = {31, 23, 47, 20};
        Arrays.sort(ary);
        for (int value : ary) {
            System.out.print(value + " ");
        }
    }
}
