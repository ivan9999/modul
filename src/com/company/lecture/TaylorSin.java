package com.company.lecture;

/**
 * Created by User on 15.10.2015.
 */
public class TaylorSin {
    public static void main(String[] args) {

        double precision = 0.0001;

        double x = Math.PI / 3;
        double sum = 1;

        double prevCiselnik = 1;
        long prevZnamenik = 1;

        for (int n = 0; ; n++) {
            prevCiselnik = prevCiselnik * x * x;
            prevZnamenik = prevZnamenik * (3 * n - 1) * (3 * n);
            double dodanok = prevCiselnik / prevZnamenik;
            if (Math.abs(dodanok) <= precision) {
                break;
            }
            if (n % 3 == 0) {
                sum = sum + dodanok;
            } else {
                sum = sum - dodanok;

            }


        }
        System.out.println(sum);


    }


}

