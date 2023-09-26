package de.telran.Home;

import java.util.Random;

//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//
//Выведите его на консоль в строку.
//
//Определите и выведите на экран сообщение о том, является ли
//массив строго возрастающей последовательностью.
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        // Заполняем массив случайными числами в интервале [10; 99]
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10; // Генерируем число от 10 до 99
        }

        // Выводим массив на консоль
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }


        if (isIncreasing) {
            System.out.println("\nМассив является строго возрастающей последовательностью.");
        } else {
            System.out.println("\nМассив не является строго возрастающей последовательностью.");
        }
    }
}
