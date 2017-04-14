package com.hozefa;

public class Main {

    public static void main(String[] args) {
       int newScore= caclculateScore("Hozefa" , 500);
        System.out.println("New Score is " + newScore);
        caclculateScore(75);
        double centimeters =calcfeetandInchestoCentimeter(6, 5);
        if (centimeters <0.0) {
            System.out.println("Invalid data");
            calcfeetandInchestoCentimeter(200);


        }


	// write your code here
    }

    public static int caclculateScore(String playername, int score){
        System.out.println("Player"  +   playername  +  "scored" + score + "points");
        return score*1000;

    }

    public static int caclculateScore( int score){
        System.out.println("unnamed player scored"  +  score + "points");
        return score*1000;

    }




    public static int caclculateScore( ){
        System.out.println("Nobody scored nothing");
        return 0;

    }



    public static double calcfeetandInchestoCentimeter(double feet , double inches) {

        if ((feet < 0) || (inches < 0) && (inches > 12)) {
            System.out.println("Invalid input data");
            return -1;

        }


        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "foot" + inches + "inches =" + centimeters + "cm");
        return centimeters;

    }


        public static double calcfeetandInchestoCentimeter( double inches) {
            if (inches > 0) {
                return -1;
            }

            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + "inches equal to" + feet + " feet and" + remainingInches + "inches");
            return calcfeetandInchestoCentimeter(feet, inches);


        }






}
