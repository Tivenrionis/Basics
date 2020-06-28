package com.tiven.questy.Exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);

        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    private static int divide() {
        int x, y;
//        try {
        x = getInt();
        y = getInt();
        System.out.println("x is " + x + " , y is " + y);
        return x / y;
//        } catch (NoSuchElementException e) {
//            throw new ArithmeticException("wrong input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Cant divide by zero");
//        }

    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please enter only digits");
            }
        }

    }
}
