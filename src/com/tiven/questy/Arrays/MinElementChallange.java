package com.tiven.questy.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallange {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many numbers you want to eneter ? \r");
        int size = scanner.nextInt();
        int[] userArray = readIntegers(size);
        printIntegers(userArray);
        reverse(userArray);
        printIntegers(userArray);
        System.out.println("The minimun is " + findMin(userArray));


    }

    public static void printIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is equal to " + array[i]);

        }
        System.out.println("--------------------------------");
    }

    public static int[] readIntegers(int size) {
        int[] values = new int[size];
        System.out.println("Enter " + size + " integer values. \r");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }
        return values;

    }

    public static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static void reverse(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length -1- i];
            array[array.length -1 - i] = temp;

        }
    }

}
