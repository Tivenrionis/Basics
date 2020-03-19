package com.tiven.questy.codingChallanges;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        for (int i = first; i >= 1; i--) {

            if (second % i == 0 && first % i == 0) return i;
            //break;


        }

        return 0;

    }


}
