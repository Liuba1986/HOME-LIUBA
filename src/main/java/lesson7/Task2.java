package lesson7;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово(четное количество букв):");
        String word1 = scanner.next();

        System.out.println("Введите первое слово(четное количество букв):");
        String word2 = scanner.next();

        int halfWord1 = word1.length() / 2;
        int halfWord2 = word2.length() / 2;

        String result = word1.substring(0, halfWord1) + word2.substring(halfWord2);

        System.out.println("Результат: " + result);

        scanner.close();




    }

}
