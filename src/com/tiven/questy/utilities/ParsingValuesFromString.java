package com.tiven.questy.utilities;

public class ParsingValuesFromString {

    //one of use case ... getting input from the user... console or interface... scanner
    public static void main(String[] args) {
        String numberAsString = "2018.27365d";
        System.out.println("numberAsString= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println(number);
        //Join String +1
        numberAsString += 1;
        //Increasing number +1
        number += 1;
        System.out.println(number);
        System.out.println(numberAsString);


    }
}
