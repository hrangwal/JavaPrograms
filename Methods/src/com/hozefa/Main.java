package com.hozefa;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was" + highscore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was" + highscore);


    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;

        } else return 0;










    }


    int highScoreposition = calculateHighScorepoint(1500);
    displayhighscoreposition("Hozefa" ,  highScoreposition);

     highScoreposition = calculateHighScorepoint(900);
    displayhighscoreposition("sumit" ,  highScoreposition);
    highScoreposition = calculateHighScorepoint(400);
    displayhighscoreposition("shantanu" ,  highScoreposition);
    highScoreposition = calculateHighScorepoint(50);
    displayhighscoreposition("kshitij" ,  highScoreposition);




    public static void displayhighscoreposition(String playername, int highScoreposition) {
        System.out.println("The score of the" + playername + " managed to get the position" + highScoreposition + "on the high score board");
    }


    public static int calculateHighScorepoint(int playerscore) {
        if (playerscore > 1000) {
            return 1;
        } else if (playerscore > 500 && playerscore < 1000) {
            return 2;

        } else if (playerscore > 100 && playerscore < 500) {
            return 3;
        } else {
            return 4;
        }


    }


}
