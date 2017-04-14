package com.hozefa;

public class Main {

    public static void main(String[] args) {


        int highScoreposition = calculateHighScorepoint(1500);
        displayhighscoreposition("Hozefa", highScoreposition);

        highScoreposition = calculateHighScorepoint(900);
        displayhighscoreposition("sumit", highScoreposition);
        highScoreposition = calculateHighScorepoint(400);
        displayhighscoreposition("shantanu", highScoreposition);
        highScoreposition = calculateHighScorepoint(50);
        displayhighscoreposition("kshitij", highScoreposition);
        highScoreposition=calculateHighScorepoint(1000);
        displayhighscoreposition("uneek" , highScoreposition);
        {
        }
    }


    public static void displayhighscoreposition(String playername, int highScoreposition) {
        System.out.println("The score of the" + playername + " managed to get the position" + highScoreposition + "on the high score board");
    }


    public static int calculateHighScorepoint(int playerscore) {
        if (playerscore >= 1000) {
            return 1;
        } else if (playerscore >= 500 && playerscore < 1000) {
            return 2;

        } else if (playerscore >= 100 && playerscore < 500) {
            return 3;
        } else {
            return 4;
            // write your code here
        }
    }
}