package HWjava210923;

import java.util.Random;

//Задание №7.
// Создайте массив из 5 случайных целых чисел из интервала [10;99]
// Выведите его на консоль в строку.
// Определите и выведите на экран сообщение о том, является ли
// массив строго возрастающей последовательностью (каждый элемент строго больше предыдущего)
public class Task7 {
    public static void main(String[] args) {
        // Создаем массив из 5 случайных целых чисел в интервале [10, 99]
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(90) + 10; // Генерируем число от 10 до 99
        }

        // Выводим массив на консоль
        System.out.print("Массив: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Переходим на новую строку

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < 5; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        // Выводим сообщение о результате
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
