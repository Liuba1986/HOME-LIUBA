package HWjava210923;

import java.util.Random;

//Задание №5.
// Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
// Выведите массивы на экран в двух отдельных строках
// Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
public class Task5 {
    public static void main(String[] args) {
        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();

        // Создаем два массива из 5 элементов каждый
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        // Заполняем массивы случайными числами в диапазоне [0; 5]
        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(6); // Генерируем случайное число от 0 до 5
            array2[i] = random.nextInt(6);
        }

        // Выводим массивы на экран
        System.out.print("Массив 1: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(); // Переход на новую строку

        System.out.print("Массив 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println(); // Переход на новую строку

        // Вычисляем средние арифметические значения для каждого массива
        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);

        // Сравниваем средние арифметические значения и выводим результат
        if (average1 > average2) {
            System.out.println("Среднее арифметическое в Массиве 1 больше.");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое в Массиве 2 больше.");
        } else {
            System.out.println("Средние арифметические в обоих массивах равны.");
        }
    }

    // Метод для вычисления среднего арифметического значения в массиве
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
