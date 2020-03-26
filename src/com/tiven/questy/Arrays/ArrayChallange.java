package com.tiven.questy.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallange {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers;

        myIntegers = getIntegers(10);
        printIntegers(myIntegers);
        System.out.println("---------------------\nNow we well sort these \n -------------------------------");
        myIntegers = sortIntegers(myIntegers);
        int[] sortArray = Arrays.copyOf(myIntegers,myIntegers.length);
        printIntegers(sortArray);
        printIntegers(myIntegers);


    }

    public static void printIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is equal to " + array[i]);

        }
    }

    public static int[] getIntegers(int size) {
        int[] values = new int[size];
        System.out.println("Enter " + size + " integer values. \r");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }
        return values;

    }

    public static int[] sortIntegers(int[] array) {
        //bubble sort
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }
        return array;
    }
}
