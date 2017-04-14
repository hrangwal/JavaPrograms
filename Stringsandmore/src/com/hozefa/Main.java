package com.hozefa;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //byte
        //short
        //int
        //long
        //double
        //char
        //boolean

        String my_string= "This is a string";
        System.out.println("The string printed is as follows:"+ my_string);
        my_string= my_string + "there is more.";
        System.out.println("my string is equal to"+ my_string);
        my_string= my_string +"\u00A9 2015";
        System.out.println("string is equal to"+ my_string);
        String numberstring= "250.55";
        numberstring= numberstring + "49.95";
        System.out.println("The result is:"+ numberstring);

        String laststring = "10";
        int myInt = 50;
        laststring = laststring + myInt;
        System.out.println("Last string is equal to"+ laststring);
        double doublenumber = 120.47;
        laststring= laststring + doublenumber;
        System.out.println(" Laststring value :"+ laststring);

    }
}
