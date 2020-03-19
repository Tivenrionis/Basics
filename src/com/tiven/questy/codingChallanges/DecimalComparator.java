package com.tiven.questy.codingChallanges;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        return (int) (first * 1000) == (int) (second * 1000);
    }

}
