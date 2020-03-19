package com.tiven.questy.codingChallanges;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        if ((bigCount * 5) + smallCount < goal) return false;
        if (bigCount == 0) {
            return smallCount >= goal;
        }
        int reminder = goal % 5;
        return (smallCount >= reminder);


    }

}
