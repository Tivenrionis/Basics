package com.tiven.questy.primitiveTypes;

public class FloatAndDouble {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        int myInt = 5/3;
        //Double is defoult
        float myFloat = 5f /3f;
        double myDouble = 5d/3d;
        System.out.println("MyIntValue = " + myInt);
        System.out.println("MyFloatValue = " +myFloat);
        System.out.println("MyDoubleValue = "+ myDouble);


        // Float and Double are not perfect... when precise calculation needed ... use Class BigDecimal
        double pound = 123.3d;
        double kilogram= pound*0.45359237d;
        System.out.println(kilogram);

    }
}
