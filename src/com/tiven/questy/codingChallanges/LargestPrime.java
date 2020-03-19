package com.tiven.questy.codingChallanges;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                number = number / i;
                i--;

            }
        }


        return number;


    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {

            if (number % i == 0) return false;

        }
        return true;
    }
}
