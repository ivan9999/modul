package com.company.modul1.teylor;

/**
 * Created by User on 24.10.2015.
 */
public class SinusGeometric {

    public static void main(String[] args) {


        double precision = 0.0001;

        double x = -0.5;
        double sum = 1;

        double prevX = 1;

        while (true) {
            prevX = prevX * x;
            if (Math.abs(prevX) <= precision) {
                break;
            }
            sum = sum + prevX;

        }
        System.out.println(sum);
    }


}
