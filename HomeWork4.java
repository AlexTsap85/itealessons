package lection2;

import java.util.Scanner;

public class HomeWork4 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое положительное целое число: ");
        long a = in.nextInt();
        if (a>=1){
            System.out.print(a*(a+1)/2);
        }
        else
            System.out.println("Введено отрицательное число или ноль.");
    }
}
