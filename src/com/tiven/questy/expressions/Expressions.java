package com.tiven.questy.expressions;

public class Expressions {
    public static void main(String[] args) {

        int result = 2 + 1;

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 3;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        boolean isAlien = false;
        System.out.println(isAlien == false ? "Im not" : "I am");

        int topScore = 80;
        if (topScore >= 100) System.out.println("You got the high score");

        int secondScore = 95;
        if ((topScore > secondScore) && (topScore < 100)) System.out.println("Greater than second and less than 100");

        if ((topScore > 90) || (secondScore <= 90)) System.out.println("Either of both are true");


        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) System.out.println(" this is not supposed to happen");
        boolean wasCar = isCar ? true : false;
        if(wasCar) System.out.println("wasCar is true");

        //TEST
        //Operator Precedence CHEK THIS SHIT OUT
        double variable1=20.00;
        double secondVariable=80.00;
        double total=(variable1+secondVariable) * 100;
        int reminder = (int) total%40;
        boolean isModulus = reminder==0 ? true : false;
        System.out.println(isModulus);
        if(!isModulus) System.out.println("Got some remindner");


    }


}
