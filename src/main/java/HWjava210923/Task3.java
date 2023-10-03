package HWjava210923;

import java.util.Random;

//Задание №3
//  Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//  Определите какой элемент является в этом массиве максимальным и
//  сообщите индекс его последнего вхождения в массив.
public class Task3 {


        public static void main(String[] args) {
            // Создаем массив из 12 случайных целых чисел
            int[] array = new int[12];
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(31) - 15; // Генерируем числа из отрезка [-15;15]
            }

            // Ищем максимальный элемент и его индекс последнего вхождения
            int maxElement = array[0];
            int lastIndex = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i] >= maxElement) {
                    maxElement = array[i];
                    lastIndex = i;
                }
            }

            // Выводим результаты
            System.out.println("Массив случайных чисел:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Максимальный элемент: " + maxElement);
            System.out.println("Индекс последнего вхождения максимального элемента: " + lastIndex);
        }
    }

