package com.company.modul1.evenAndOdd;

/**
 * Created by User on 22.10.2015.
 */
public class SumEvenAndOdd {

    public static void main(String[] args){

        int a = 4;
        int b = 16;

        int sumEven = 0;
        int sumOdd = 0;


        for (int i = a; i <= b; i++){
            System.out.println(i);
            if(i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }


        System.out.println("Сума парних:" + sumEven);
        System.out.println("Сума непарних" + sumOdd);
    }
}
