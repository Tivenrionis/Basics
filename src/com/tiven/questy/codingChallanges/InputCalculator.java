package com.tiven.questy.codingChallanges;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage()
    {

        int sum = 0;
        double avg =0;
        int count=0;
        boolean hasNextInt;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum = sum + scanner.nextInt();
                count++;
                avg = (double) sum/count;

            } else {
                System.out.println(String.format("SUM = %s AVG = %s",sum, Math.round(avg)));
               break;

            }

        }
        scanner.close();




    }
}
