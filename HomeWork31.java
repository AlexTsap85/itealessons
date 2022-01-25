package lection3;

import java.util.Scanner;

public class HomeWork31 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String line = "", reverse = "";

        System.out.println("Введите слово: ");
        line = in.nextLine();

        int length = line.length();
        for (int i=length-1;i>=0;i--)
            reverse = reverse + line.charAt(i);
        if (line.equals(reverse))
            System.out.println("Введен палиндром.");
        else
            System.out.println("Введен не палиндром.");

    }
}