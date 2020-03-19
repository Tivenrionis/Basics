package com.tiven.questy.codingChallanges;

public class NumberToWords {

    public static void numberToWords(int number) {

        int num = reverse(number);
        if (num < 0) System.out.println("Invalid Value");
        if (num == 0) System.out.println("Zero");

        while (num != 0) {
            int tempnum = num % 10;

            switch (tempnum) {

                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;

                default:
                    break;
            }
            num = num / 10;
        }
        num=reverse(number);
        if (getDigitCount(number) != getDigitCount(num)) {
            for (int i = 0; i < getDigitCount(number) - getDigitCount(num); i++) {
                System.out.println("Zero");
            }
        }


    }

    public static int reverse(int number) {
        boolean negative = false;
        int reverse = 0;
        int temp = 0;

        if (number < 0) {
            negative = true;
            number = number * (-1);
        }

        while (number != 0) {
            temp = number % 10;
            reverse = (reverse * 10);
            reverse = reverse + temp;
            number = number / 10;

        }

        if (negative) return reverse * (-1);
        else return reverse;

    }

    public static int getDigitCount(int number) {

        if (number < 0) return -1;
        if (number == 0) return 1;
        int count = 0;
        while (number != 0) {

            number = number / 10;
            count++;
        }
        return count;
    }

}

