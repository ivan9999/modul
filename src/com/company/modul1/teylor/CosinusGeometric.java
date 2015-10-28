package com.company.modul1.teylor;

/**
 * Created by User on 24.10.2015.
 */
public class CosinusGeometric {

    public static void main(String[] args) {

        double precision = 0.0001;

        double x = Math.PI / 4;
        double sum = 1;

        double prevChiselnik = 1;
        double prevZnamennik = 2;

        for (int n = 1; ; n++) {

            prevChiselnik = prevChiselnik * x * x;
            prevZnamennik = prevZnamennik * (2 * n - 1) * (2 * n);
            double dodanok = prevChiselnik / prevZnamennik;
            if (Math.abs(dodanok) <= precision) {
                break;
            }

            if (n % 2 == 0) {
                sum = sum + dodanok;
            } else {
                sum = sum - dodanok;
            }
        }

        System.out.println(sum);
    }
}
