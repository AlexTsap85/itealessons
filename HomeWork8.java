package lection2;

import java.util.Random;

public class HomeWork8 {
    public static void main (String[] args){
        int [] array = new int[8];
        Random generator = new Random();
        int b;

        for (int i=0; i<8; i++) {
            b = generator.nextInt(10);
            if (b % 2 == 0)
                b = b;
            else b = 0;
            array [i] = b;
            System.out.print(" " +array[i]);
        }
    }
}