package com.tiven.questy.codingChallanges;

public class MinutesToYearDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            System.out.println(String.format("%s min = %s y and %s d", minutes, (int) minutes / 525600, (minutes % 525600) / 1440));

        }

    }
}
