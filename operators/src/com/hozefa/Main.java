package com.hozefa;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("1+2=" + result);
        int previousresult= result;
        result= previousresult-1;
        System.out.println("Result="+ result);
        System.out.println(previousresult+"-1="+ result );

        previousresult = result;
         result= result*10;

        System.out.println(previousresult + "*10=" + result);

        previousresult = result;
        result= result/5;
        System.out.println(previousresult + "/ 5 =" + result);

        previousresult = result;
        result= result % 3;
        System.out.println(previousresult + "% 3 =" + result);

        previousresult = result;
        result= result+1;
        System.out.println("Result is now:" + result);
        result++;
        System.out.println("Result is now:" + result);
        result--;
        System.out.println("Result is now:" + result);
        result+= 2;
        System.out.println("Result is now:" + result);
        result*=10;
        System.out.println("Result is now:" + result);
        result-=10;
        System.out.println("Result is now:" + result);
        result/=10;
        System.out.println("Result is now:" + result);
        boolean isalien= false;
        if (isalien ==true)
           System.out.println("It is not a alien");

        int topscore= 80;
        if(topscore <100)
        System.out.println("You got low ");

       int secondtopscore = 95;
       if((topscore > secondtopscore) && (topscore < 100))
          System.out.println("Greater than top score and less than 100");
       if((topscore>90) || (secondtopscore<=90) )
           System.out.println("one of these test is true");
       int newvalue=50;
        if(newvalue==50)
            System.out.println("the value is true");
        boolean isCare= false;
        if(isCare==true)
            System.out.println("The car is mine");

        double even1=20;
        double even2=80;
        double themul= (even1+even2)*25;
        System.out.println("The multiplication resulted in this value:"+ themul);
        double remainder= themul % 40;
        System.out.println("The remainder is:"+ remainder);
        if(remainder<=20)
            System.out.println("the total is way over the limit");


    }
}