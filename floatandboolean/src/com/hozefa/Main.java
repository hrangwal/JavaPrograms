package com.hozefa;

public class Main {

    public static void main(String[] args) {
        int myintvalue=5/3;
        // widht of int is 32bits (4bytes)
        float myfloatvalue=5f/3f;
        // widhth of float is 32bits(4 bytes)
        double mydoublevalue=5d/3d;
        // widht of double is 64 bits(8 bytes)
        System.out.println("THE INT VALUE IS:"+ myintvalue);
        System.out.println("my double value is:"+ mydoublevalue);
        System.out.println("My float value is:"+ myfloatvalue);
	// write your code here
        double mypoundvalue= 200d;
        double mykilogramvalue= 0.45359273d*mypoundvalue;
        System.out.println("My weight in pounds:"+ mykilogramvalue);

    }
}
