package com.tiven.questy.primitiveTypes;

public class CharAndBoolean {

    public static void main(String[] args) {
        char myChar = 'D';
        //UNICODE
        char myUnicode = '\u0044';
        char myCopyrightChar = '\u00A9';

        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerIverTwentyOne = true;


        // STRING IS NOT A PRIMITIVE TYPE ... STRING IS IMMUTABLE
        String myString = " Something";

        System.out.println(myString + " \u00A9 2019");
        String numberString = " 250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String last= "10";
        int myint=50;
         last= myint + last;
        System.out.println(last);


    }
}
