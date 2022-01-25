package lection2;

import java.util.Random;

public class HomeWork9 {
    public static void main (String[] args){
        int [] array = new int [12];

        for (int i=0; i< array.length; i++) {
            array [i] = (int)(Math.random() * 31) - 15;
            System.out.print(" " +array[i]);
        }
        System.out.println();
        int max = array[0], index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max ) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент в массиве: " + max + ", индекс его последнего вхождения в массив: " + index);
    }
}