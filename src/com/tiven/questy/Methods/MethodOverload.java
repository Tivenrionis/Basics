package com.tiven.questy.Methods;

public class MethodOverload {

    public static void main(String[] args) {

        int newScore = calculateScore("TIM", 500);
        System.out.println("New score is : " + newScore);
        calculateScore(75);
        calculateScore();


    }

    public static int calculateScore(String name, int score) {
        System.out.println("'Player: " + name + " scored " + score + " points.");
        return score * 1000;
    }

    //Overloading -- > same name , different number of arguments
    // UNIQUE SIGNATURE
    // Good practice to overload methods ... easier to remember

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name , no player score ");
        return 0;
    }


}
