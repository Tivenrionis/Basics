package com.tiven.questy.utilities;

import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        //bug... after INTEGER OR ANY OTHER NUMBER CALL NEXTLINE cause of \n separator
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int year = scanner.nextInt();
            scanner.nextLine(); // handle next line character ( enter key)
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2020 - year;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is : " + name);
                System.out.println("You are " + age + " years old");
            } else System.out.println("Invalid year of birth");
        } else System.out.println("Unable to parse year of birth");

        scanner.close();


    }

}
