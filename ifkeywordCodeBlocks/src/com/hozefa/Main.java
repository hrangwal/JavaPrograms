package com.hozefa;

public class Main {

    public static void main(String[] args) {
        boolean gameOver= true;
        int score= 800;
        int levelCompleted= 5;
        int bonus= 100;

//        if(score<5000 && score >1000) {
//            System.out.println("your score is 5000 but greater than 1000");
//        }else if(score <1000){
//            System.out.println("Your score is less than 1000");
//        }else {
//            System.out.println("Got here");
//        }
       if(gameOver){
            int finalscore =  score+ (levelCompleted * bonus);
            finalscore+=1000;
           System.out.println("Your final score was"+ finalscore);
    }
//        boolean newgameOver= true;
//        int newScore= 10000;
//        int newlevelcompleted= 8;
//        int newbonus= 200;
//
//        if (newgameOver){
//            int newfinalscore =  newScore + (newlevelcompleted * newbonus);
//            System.out.println("Your final score was"+ newfinalscore);
//        }

        score = 10000;
        levelCompleted = 5;
        bonus = 200;
        if (gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Your final score was" + finalscore);
}
    }


}
