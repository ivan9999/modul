package com.company.lecture;

/**
 * Created by User on 15.10.2015.
 */
public class TaylorCos {
    public static void main(String[]args){

        double precision = 0.0001;

        double x = Math.PI / 6;
        double sum = 1;

        double prevChiselnik = 1;
        long prevZnamennik = 1;

        for (int n = 1; ; n++){
            prevChiselnik = prevChiselnik * x * x;
            prevZnamennik = prevZnamennik *(3*n - 1) * (3*n);

            if (n % 2 == 0){
                sum = sum + prevChiselnik / prevZnamennik;
            }else{
                sum = sum - prevChiselnik / prevZnamennik;
            }
            System.out.println(sum);
        }


    }
}
