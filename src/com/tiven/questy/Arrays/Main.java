package com.tiven.questy.Arrays;

import java.util.Scanner;

public class Main {
    //Array is a data structure
    //ArrayIndexOutOfBound exception is most common
    // indexed from 0





    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myVariable = new int[10];
//        int[] myVariable2 = {1, 2, 3, 4, 5, 6, 67, 7, 2, 3};
//        // initially all cells are 0
//        myVariable[5] = 50;
//
//        double[] myDoubleArray = new double[10];
//
//        System.out.println(myVariable[2]);
//        System.out.println(myVariable2[6]);
//        printArray(myVariable2);

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The AVG is : "+ getAVG(myIntegers));

    }

    public static double getAVG(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }

        return sum / array.length;

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }
        return values;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);

        }

    }
}
