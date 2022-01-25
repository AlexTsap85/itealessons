package lection3;

import java.util.ArrayList;
import java.util.List;
public class HomeWork35 {
    static void check (String str, String search) {
        int a = 0;
        char b = ' ';
        int[] c = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i < str.length(); i++) {
            b = str.charAt(i);
            ++c[b];
        }
        for (int i = 0; i < search.length(); i++) {
            b = search.charAt(i);
            if (c[b] >= 1)
                a = 1;
        }
        if (a == 1)
            System.out.println(str);
    }

    public static void main(String[] args) {
        List < String > list = new ArrayList < String > ();
        list.add("rabbit");
        list.add("bribe");
        list.add("dog");
        System.out.print("The given strings are: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("The given word is: bib");
        System.out.println();
        System.out.println("The strings containing all the letters of the given word are: ");
        for (int j = 0; j < list.size(); j++) {
            check(list.get(j), "bbi");
        }
    }
}
