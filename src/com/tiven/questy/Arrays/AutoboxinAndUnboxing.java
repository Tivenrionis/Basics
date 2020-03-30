package com.tiven.questy.Arrays;

import java.util.ArrayList;

public class AutoboxinAndUnboxing {

    // autoboxing to wrap primitive type with class
    public static void main(String[] args) {
        String[] arr = new String[10];
        int[] intarr = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tiven");

        // ArrayList<int> intarray = new ArrayList<int>();
        ArrayList<Integer> intarray = new ArrayList<>();
        // intarray.add(intarr[0]);

        for (int i = 0; i < 10; i++) {
            intarray.add(Integer.valueOf(i));
        }

        for (int i = 0; i < intarr.length; i++) {
            //  intarray.add(Integer.valueOf(intarr[i]));
            intarray.add(intarr[i]);
        }
        for (int i = 0; i < intarr.length; i++) {
            //  intarray.add(Integer.valueOf(intarr[i]));
            System.out.println(i + " ---> " + intarray.get(i).intValue());
        }

        //AUTOBOXING
        Integer myValue = 56;  // Integer.valueOf(56); <-- at compile time

        //UNBOXING
        int myInt = myValue; // myValue.intValue(); <-- at compile time

    }
}
