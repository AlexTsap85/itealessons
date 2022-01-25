package lection3;

import java.util.*;

public class HomeWork34 {
    public static void main(String[] args){
        String initial = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        initial = in.nextLine();
        int length = initial.length();
        for (int i=0; i<length; i=i+2){
            char a = initial.charAt(i);
            if (Character.isWhitespace(a))
                i=i-1;
            System.out.print(a);
        }
    }
}
