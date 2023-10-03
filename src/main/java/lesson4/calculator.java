package lesson4;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("vedite pervoe cislo = ");
        int num1 = scanner.nextInt();

        System.out.print("vedite vtoroe cislo = ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " + "+num2+" = "+getAddition(num1, num2));
        System.out.println(num1 + " - "+num2+" = "+getSubstraction(num1, num2));
        System.out.println(num1 + " * "+num2+" = "+getMultiplication(num1, num2));
        System.out.println(num1 + " / "+num2+" = "+getDivision(num1, num2));
    }
        private static int getAddition(int num1, int num2){
            return num1 + num2;
        }

            private static int getSubstraction(int num1, int num2){
                return num1 - num2;

        }
        private static int getMultiplication(int num1, int num2){
            return num1 * num2;

        }
        private static int getDivision(int num1, int num2){
            if(num2 == 0) return 0; /* proverca na delenie*/
            return num1 / num2;

        }


    }

