package HWjava210923;

import java.util.Random;

//Задание №4.
// Создайте массив из 8 случайных целых чисел из отрезка [1;10]
// Выведите массив на экран в строку
// Замените каждый элемент с нечётным индексом на ноль
// Снова выведете массив на экран на отдельной строке
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();

        // Заполняем массив случайными целыми числами от 1 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        // Выводим массив на экран в строку
        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Заменяем каждый элемент с нечётным индексом на ноль
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        // Выводим изменённый массив на экран на отдельной строке
        System.out.println("\nМассив после замены нечётных элементов на ноль: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
