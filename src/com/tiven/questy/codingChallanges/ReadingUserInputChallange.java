package com.tiven.questy.codingChallanges;

import java.util.Scanner;

public class ReadingUserInputChallange {

    public static void userInput() {
        int sum = 0;
        int countTen = 1;
        boolean hasNextInt;
        Scanner scanner = new Scanner(System.in);

        while (countTen != 11) {
            System.out.println("Enter number " + countTen);
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum = sum + scanner.nextInt();
                countTen++;
            } else {
                System.out.println("Invalid Input,\nTry again");
                scanner.next();
            }

        }
        System.out.println("The sum is : " + sum);
        scanner.close();


    }
}
