package lection3;

import java.util.Scanner;

public class HomeWork32 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = "", b = "";
        System.out.println("Введите слово или вразу:");
        a = in.nextLine();
        System.out.println("Введите еще слово или вразу:");
        b = in.nextLine();
        System.out.println(String.join(" ",a, b));
    }
}
