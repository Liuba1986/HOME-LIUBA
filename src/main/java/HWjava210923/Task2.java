package HWjava210923;

import java.util.Random;
import java.util.Scanner;

//Задание №2
// Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
// Введенное пользователем число сохраняется в переменную n.
// Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
// Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
// Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n;

        do {
            System.out.print("Введите размер массива (натуральное число больше 3): ");
            n = scanner.nextInt();
        } while (n <= 3);

        int[] array = new int[n];
        int[] evenArray = new int[n];
        int evenCount = 0;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                evenArray[evenCount] = array[i];
                evenCount++;
            }
        }
        System.out.println();

        if (evenCount > 0) {
            System.out.print("Массив из чётных элементов: ");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(evenArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("В исходном массиве нет чётных элементов.");
        }
    }
}