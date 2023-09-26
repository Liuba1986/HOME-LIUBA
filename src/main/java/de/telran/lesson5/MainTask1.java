package de.telran.lesson5;

import org.jetbrains.annotations.NotNull;

/*
1 уровень сложности: Домашнее задание
№ 1

Создайте строку через new - I study Basic Java!

Напишите метод, который принимает в качестве параметра строку, передайте в
этот метод строку, которую создали в п.1

Распечатать пред-последний символ строки. Используем метод String.charAt().

Проверить, содержит ли ваша строка подстроку “Java”. Используем метод
String.contains().

Вырезать строку Java c помощью метода String.substring().

Заменить все символы “а” на “о”.

Преобразуйте строку к верхнему регистру.

Преобразуйте строку к нижнему регистру.
 */
public class MainTask1 {
    public static void main(String[] args) {


        String myString = new String("I study Basic Java!");
        penultimateCharacter(myString);
        System.out.println(myString.contains("Java"));
        System.out.println(myString.substring(0, 14));
        System.out.println(myString.replace("a", "o"));
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());
    }

 public static void penultimateCharacter(@NotNull String exampleString){
        char result=exampleString.charAt(exampleString.length()-1);
     System.out.println(result);
 }

}
