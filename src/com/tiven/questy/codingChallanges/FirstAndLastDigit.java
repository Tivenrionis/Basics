package com.tiven.questy.codingChallanges;

public class FirstAndLastDigit {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        else if (number < 10) {
            return number * 2;

        }
        else {
            int lastDigit = number%10;
            int firstDigit = 0;
            int temp=number;
            while (temp != 0) {
                int last = temp % 10;
                //Expanding by 1 digit
                firstDigit = firstDigit * 10;
                firstDigit = firstDigit + last;
                temp = temp / 10;
            }
            firstDigit=firstDigit%10;

            return firstDigit+lastDigit;
            
            
            
        }
    }
}
