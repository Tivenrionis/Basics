package com.tiven.questy.codeBlocks;

public class ifElse {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 3000;
        int lvlCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score >2000) {
//            System.out.println(" Your score is  less than 5000 but more than 2k");
//        } else if (score < 2000) {
//            System.out.println("Score less than 2k");
//
//        } else {
//
//            System.out.println("Got here");
//        }
//        System.out.println((score == 5000) ? "It is 5000 " : "It is not 5000"); // Ternary operator
//

        if (gameOver == true) { // Block SCOPE
            int finalScore = score + (lvlCompleted * bonus); // Can access variables outside  cuz they're global
            System.out.println("Your final score was " + finalScore);

            //finalScore is deleted once the code block finished processing
        }
        if (gameOver == true) { // Block SCOPE
            score = 10000;
            lvlCompleted = 8;
            bonus = 200;
            int finalScore = score + (lvlCompleted * bonus); // Can access variables outside  cuz they're global
            System.out.println("Your second final score was " + finalScore);

            //finalScore is deleted once the code block finished processing
        }


        //System.out.println(finalScore); // Cant access finalScore from the inside block


    }
}
