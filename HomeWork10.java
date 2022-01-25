package lection2;

public class HomeWork10 {
    public static void main (String[] args){
        int [] array = new int [4];

        for (int i=0; i< array.length; i++) {
            array [i] = (int)(Math.random() * 89) + 10;
            System.out.print(" " +array[i]);
        }
        System.out.println();
        for (int i=0; i< array.length; i++) {
            if (i>0){
                if (array[i-1]>=array[i]){
                    System.out.println("Массив не является строго растущей последовательностью.");
                    break;
                }
                if (i == array.length-1){
                    System.out.println("Массив является строго растущей последовательностью.");
                }
            }
        }
    }
}