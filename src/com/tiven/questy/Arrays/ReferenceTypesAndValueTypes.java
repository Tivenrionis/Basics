package com.tiven.questy.Arrays;

import java.util.Arrays;

public class ReferenceTypesAndValueTypes {

    //String is reference type
    //Array is a reference type
    //Classes are of reference type
    public static void main(String[] args) {
        int value= 10;
        int another=value;

        System.out.println(value);
        System.out.println(another);

        another++;                          // VALUE TYPES

        System.out.println(value);
        System.out.println(another);

        int[] arrayInt = new int[5];
        int[] anotherarrayInt = arrayInt;   //reference type .. check "new" operator REPRESENT ADDRESS IN MEMORY

        System.out.println("ArrayInt is "+ Arrays.toString(arrayInt));
        System.out.println("Another is "+ Arrays.toString(anotherarrayInt)+"\n");

        anotherarrayInt[2] = 7;

        System.out.println("ArrayInt is "+ Arrays.toString(arrayInt));
        System.out.println("Another is "+ Arrays.toString(anotherarrayInt));

    }
}
