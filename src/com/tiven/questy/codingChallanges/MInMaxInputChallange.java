package com.tiven.questy.codingChallanges;

import java.util.Scanner;

public class MInMaxInputChallange {

    public static void minMaxInput() {
        int min = 0;
        int max = 0;
        int temp;
        boolean flagFirst=true;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                temp = scanner.nextInt();
                if (flagFirst)
                {
                    flagFirst=false;
                    min=temp;
                    max=temp;

                }
                if (temp > max) {
                    max = temp;
                }
                if (temp<min){
                    min = temp;
                }

            } else {
                System.out.println("Minimum: " + min + " Maximum: " + max);
                break;

            }
        }
        scanner.close();


    }

}
