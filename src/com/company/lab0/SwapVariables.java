package com.company.lab0;

/**
 * Created by User on 28.10.2015.
 */
public class SwapVariables {


    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        b = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
