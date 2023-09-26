package de.telran.Home;

import java.util.Random;
//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//
//Выведите массив на консоль в строку.
//
//Замените каждый элемент с нечетным индексом на ноль.
//
//Снова выведете массив на консоль в отдельной строке.

public class Task1 {
    public static void main(String[] args) {
        // Создаем массив из 8 случайных целых чисел из интервала [1;50]
        int[] array = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }

        // Выводим исходный массив на консоль в строку
        System.out.print("Исходный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переходим на новую строку

        // Заменяем каждый элемент с нечетным индексом на ноль
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        // Выводим измененный массив на консоль в отдельной строке
        System.out.print("Измененный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
