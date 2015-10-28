package com.company.lab1.lab2;

/**
 * Created by User on 01.10.2015.
 */
public class Labaratorna {

    public static void main(String[] args) {
        int a = 7;
        int b = 12;

        int sumEven = 0;
        int sumOdd = 0;


        for (int i = a; i <= b; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                sumEven = sumEven + i;
                b--;
            } else {
                sumOdd = sumOdd + i;
            }
        }

        System.out.println("Сума парних ; " + sumEven);
        System.out.println("Сума непарних ; " + sumOdd );

    }


}

