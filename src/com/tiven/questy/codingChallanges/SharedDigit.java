package com.tiven.questy.codingChallanges;

public class SharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {


        if ((numberOne >= 10 && numberOne <= 99) && (numberTwo >= 10 && numberTwo <= 99)) {

            int temp = numberTwo;

            while (numberOne > 0) {
                int lastDigit = numberOne % 10;

                while (numberTwo > 0) {
                    int lastDigit2 = numberTwo % 10;
                    if (lastDigit == lastDigit2) return true;
                    numberTwo = numberTwo / 10;


                }
                numberTwo = temp;

                numberOne = numberOne / 10;

            }


        }
        return false;

    }
}
