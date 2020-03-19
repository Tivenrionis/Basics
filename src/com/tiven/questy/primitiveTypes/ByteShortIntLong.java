package com.tiven.questy.primitiveTypes;

public class ByteShortIntLong {

    public static void main(String[] args) {
        int myValue =1000;

        int myMinInteger = Integer.MIN_VALUE;
        int myMaxInteger = Integer.MAX_VALUE;

        System.out.println("Integer Min Value = " +myMinInteger);
        System.out.println("Integer Max Value = " + myMaxInteger);
        //Overflow
        System.out.println("Busted MAX value= " + (myMaxInteger+1));
        //Underflow
        System.out.println("Busted MIN value= " + (myMinInteger-1));

        int myMaxIntTest =2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte MAX = "+ myMaxByteValue);
        System.out.println("Byte MIN = "+ myMinByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short MAX = "+ myMaxShortValue);
        System.out.println("Short MIN = "+ myMinShortValue);
        
        long myLongValue = 100;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long MAX = "+ myMaxLongValue);
        System.out.println("Long MIN = "+ myMinLongValue);

        long bigLongLiteralValue=2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);


        //CASTING - Java is using int by default

        int myTotal = (myMinInteger/2);
        byte myNewBtleValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);

        //Challange
        byte b=120;
        short s = 30000;
        int i = 46328732;
        long l = 50000L + 10L *(b+s+i);
        System.out.println(l);

        //Overflow
        short sTotal= (short)(1000 + 10 *(b+s+i));
        System.out.println(sTotal);





    }

}
