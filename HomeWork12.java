package lection2;

public class HomeWork12 {
    public static void main(String[] args){
        double simpleAverage1=0.0, simpleAverage2=0.0;

        int [] array1 = new int [5];
        for (int i=0; i< array1.length; i++) {
            array1 [i] = (int)(Math.random()*5);
            System.out.print(" " +array1[i]);
            simpleAverage1+=(double) array1[i]/array1.length;
        }
        System.out.println();
        System.out.println("Среднее арифметическое элементов первого массива =" +simpleAverage1);
        System.out.println();
        int [] array2 = new int [5];
        for (int i=0; i< array2.length; i++) {
            array2 [i] = (int)(Math.random()*5);
            System.out.print(" " +array2[i]);
            simpleAverage2+=(double) array2[i]/array2.length;
        }
        System.out.println();
        System.out.println("Среднее арифметическое элементов второго массива =" +simpleAverage2);
        System.out.println();
        if (simpleAverage1>simpleAverage2)
            System.out.println("Среднее арифметическое элементов первого массива больше.");
        else {if (simpleAverage2>simpleAverage1)
            System.out.println("Среднее арифметическое элементов второго массива больше.");
        else
            System.out.println("Среднее арифметическое элементов массивов равны.");
        }
    }
}