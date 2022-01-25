package lection2;

import java.util.Scanner;
public class HomeWork7 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Отгадайте загадку: Что это есть такое: синий, большой, с усами и полный зайцев?");
        System.out.println("Введите ответ:");
        String answer;
        Boolean stop;

        stop = false;
        for (int i = 1; i <=3; i++){
            if (stop == true)
                break;
            answer = in.nextLine();
            switch (answer) {
                case ("Троллейбус"):
                    System.out.println("Правильно!");
                    stop = true;
                    break;
                case ("Сдаюсь"):
                    System.out.println("Правильный ответ: Троллейбус \nИгра окончена!");
                    stop = true;
                    break;
                default:
                    System.out.println("Подумайте еще");
                    if (i==3)
                        System.out.println("Игра окончена!");
            }
        }
    }
}