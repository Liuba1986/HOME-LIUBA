package de.telran.HW;

import static de.telran.HW.HW.daysToEmptyBankAccount;

public class Main {
    public static void main(String[] args) {
      HW hw = new HW();
        int N = 21;
        int result = daysToEmptyBankAccount(N);
        System.out.println(result);
    }


}
