package com.tiven.questy.codeBlocks;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 8; i >= 2; i--) {
            System.out.println("10K at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000d, i)));
        }
        int sum=0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                sum+=i;
                System.out.println(i);
                counter++;
            }

            if (counter == 5) break;
        }
        System.out.println(sum);
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }

}
