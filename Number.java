package lection1;

/*
Написать в (public static void main) методе код, проверяющий и сообщающий в консоль,
является ли целое число записанное в переменную a, чётным либо нечётным
 */

import java.util.Scanner;

public class Number {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int a = in.nextInt();
        // оператор % возвращает остаток от деления.
        // если остаток от деления на 2 равно 0 - число четное, в ином случае - нечетное
        if (a % 2 ==0)
            System.out.println ("Число " + a + " - четное");
        else
            System.out.println ("Число " + a + " - нечетное");
    }
}
