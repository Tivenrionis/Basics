package com.tiven.questy.codeBlocks;

public class Switch {

    public static void main(String[] args) {

        int value = 5;
        // good for testing one variable
        switch (value) {

            case 1:
                System.out.println("Value was 1");
                break; // Exits loop

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually it was a " + value);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;

        }
        char sign = 'D';
        switch (sign) {

            case 'A':
                System.out.println("It was " + sign);
                break;
            case 'B':
                System.out.println("It was " + sign);
                break;
            case 'C':
                System.out.println("It was " + sign);
                break;
            case 'D':
                System.out.println("It was " + sign);
                break;
            case 'E':
                System.out.println("It was " + sign);
                break;

            default:
                System.out.println("Char not found");
                break;


        }
    }

}
