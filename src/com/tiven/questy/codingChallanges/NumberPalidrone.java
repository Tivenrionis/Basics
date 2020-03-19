package com.tiven.questy.codingChallanges;

public class NumberPalidrone {

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;

        if (number < 10) return true;

        while (temp != 0) {
            int lastDigit = temp % 10;
            //Expanding by 1 digit
            reverse = reverse * 10;
            // Addin last digit
            reverse = reverse + lastDigit;
            temp = temp / 10;
        }
        return reverse == number;

        //n%10 extract last digit
        //n=n/10 discard last digit


    }
}
