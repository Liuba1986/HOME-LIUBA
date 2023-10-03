package HWjava210923;

import java.util.Scanner;

//Задание №6.
// Напишите программу, которая определит, сколько слов Вы ввели с консоли.
//
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Количество слов в введенной строке: " + wordCount);

        scanner.close();
    }

    // Функция для подсчета количества слов в строке
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }
}
