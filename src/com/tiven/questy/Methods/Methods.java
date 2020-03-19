package com.tiven.questy.Methods;

public class Methods {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        System.out.println("Your score is : " + calculateScore2(true, 10000, 8, 200));
        System.out.println("Your score is : " + calculateScore2(false, 800, 5, 100));

        displayHighScore("Michal", calculateHighScorePosition(1500));

        displayHighScore("Michal", calculateHighScorePosition(900));

        displayHighScore("Michal", calculateHighScorePosition(400));

        displayHighScore("Michal", calculateHighScorePosition(50));
        displayHighScore("Michal", calculateHighScorePosition(1000));


    }

    public static void calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (lvlCompleted * bonus);
            System.out.println("Your final score was " + finalScore);


        }

    }

    public static int calculateScore2(boolean gameOver, int score, int lvlCompleted, int bonus) {

        if (gameOver == true) return score + (lvlCompleted * bonus);
        else return -1;

    }

    public static void displayHighScore(String name, int highScorePosition) {

        System.out.println(name + " managed to get into position " + highScorePosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) return 1;
//        else if (score >= 500) return 2;
//        else if (score >= 100) return 3;
//        return 4;
        //other solution
        int position = 4;
        if (score >= 1000) position = 1;
        else if (score >= 500) position = 2;
        else if (score >= 100) position = 3;
        return position;
    }

}
