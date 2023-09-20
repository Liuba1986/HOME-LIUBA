package de.telran.HW;

public class HW {

    public static int daysToEmptyBankAccount(int N) {
        int days = 0;
        while (N > 1) {
            int maxDivisor = 1;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    maxDivisor = i;
                }
            }
            N -= maxDivisor;
            days++;
        }
        return days + 1;
    }


}
