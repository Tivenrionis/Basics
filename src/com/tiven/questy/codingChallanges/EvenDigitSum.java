package com.tiven.questy.codingChallanges;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number >= 0) {
            int lastDigit;
            int sum = 0;

            while (number != 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) sum += lastDigit;
                number = number / 10;

            }
            return sum;

        } else return -1;


    }
}
