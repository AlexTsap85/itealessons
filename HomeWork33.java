package lection3;

import java.util.Scanner;

public class HomeWork33 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = "", b = "";
        System.out.println("Введите слово или вразу:");
        a = in.nextLine();
        System.out.println("Введите еще слово или вразу:");
        b = in.nextLine();
        int compare = a.compareToIgnoreCase(b);
        if (compare == 0)
            System.out.println("''" +a + "'' равно ''" +b+ "''");
        else
            System.out.println("''" +a + "'' не равно ''" +b+ "''");
    }
}