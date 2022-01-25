package lection1;
/*
Написать в (public static void main) методе код,
который переставит числа в переменных таким образом,
чтобы при выводе в консоль их последовательность оказалась возрастающей
 */
import java.util.Scanner;
import java.util.Arrays;

public class Range {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.print("Введите c: ");
        int c = in.nextInt();
        // тип[] имяПеременной - объявить переменную массива требуемого типа, {} - перечисляем значения элементов массива
        // метод Arrays.sort() позволяет сортировать элементы массива по возрастанию.
        int [] abcArray = {a, b, c};
        Arrays.sort(abcArray);
        System.out.println("Возрастающая последовательность: " + Arrays.toString(abcArray));
    }
}
