package com.hozefa;

public class Main {

    public static void main(String[] args) {
        // integer has a widht of 32
        int myminval=-2_147_483_648;
        int mymaxval=2_147_483_647;
        int myvalue=(mymaxval/2);
        System.out.println("The current total:"+ myvalue);
        //byte has widhth of 8
        byte mybytevalue= -128;
        byte mynewbyte= (byte)(mybytevalue/2);
        System.out.println("The next total:"+ mynewbyte);
        //short has a widht of 16
        short myshortvalue=-32768;
        short newshortvalue=(short)(myshortvalue/2);
        // long has a widht of 64
        long mylongvalue = 100L;

        byte allbyte=100;
        short allshort= -20000;
        int allint= 100_000;
        long alllong= (50000 + (10*allbyte)+(allshort)+(allint));
        System.out.println("The longest number is:"+alllong);
        short shorttotal=(short)(1000+10*(allbyte+allint+alllong+allshort));
        System.out.println("The short value:"+ shorttotal);




	// write your code here
    }
}