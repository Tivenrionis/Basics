package com.tiven.questy.codingChallanges;


public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            int lastA = a % 10;
            int lastB = b % 10;
            int lastC = c % 10;

            return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);


        }

        return false;


    }

    public static boolean isValid(int a) {

        return a >= 10 && a <= 1000;


    }
}
