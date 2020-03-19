package com.tiven.questy.codingChallanges;

public class SumOdd {

    public static boolean isOdd(int i) {
        return i >= 0 && i % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) sum += i;

            }
        }
        else return -1;
        return sum;
    }
}
