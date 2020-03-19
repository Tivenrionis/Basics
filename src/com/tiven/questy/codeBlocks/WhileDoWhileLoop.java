package com.tiven.questy.codeBlocks;

public class WhileDoWhileLoop {

    public static void main(String[] args) {

        int counter = 0;
        while (counter != 6) {
            System.out.println("Count value is : " + counter);
            counter++;
        }

        do {
            System.out.println("Counter value is " + counter);
            counter++;
        }while (counter==7);
    }
}