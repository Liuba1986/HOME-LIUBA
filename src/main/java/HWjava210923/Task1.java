package HWjava210923;
//Задание №1
// Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
// Не используйте дополнительный массив для хранения результатов.
public class Task1 {
    public static void main(String[] args) {
        // Создаем исходный массив строк
        String[] arr = {"Привет", "это", "мир"};

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (String s : arr) {
            System.out.print(s + " ");
        }

        // Меняем местами элементы в массиве без дополнительного массива
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }

        // Выводим измененный массив
        System.out.println("\nМассив после изменения:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
