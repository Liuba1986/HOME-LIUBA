package lesson7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String hex="333";
        int decimal=Integer.parseInt(hex,16);
        System.out.println("Число " + hex + " в шестнадцатеричной системе равно " + decimal + " в десятичной системе.");

        int decimal2= 819;
        String hex2=Integer.toHexString(decimal2);
        System.out.println("Число " + decimal2 + " в шестнадцатеричной системе равно " + hex2 + " в десятичной системе.");

        String binary="101101";
        int decimal3 = Integer.parseInt(binary, 2);
        System.out.println("Число " + binary + " в двоичной системе равно " + decimal3 + " в десятичной системе.");

        int decimal4=124;
        String binary2 = Integer.toBinaryString(decimal4);
        System.out.println("Число " + decimal4 + " в десятичной системе равно " + binary2 + " в двоичной системе.");
    }

    }




