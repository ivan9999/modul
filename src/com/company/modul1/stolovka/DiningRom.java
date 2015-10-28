package com.company.modul1.stolovka;

/**
 * Created by User on 27.10.2015.
 */
public class DiningRom {

    public static void main(String[]args){


        Strava[] strava = new Strava[6];
        strava[0] = new Strava(20, 130,"Пельмені");
        strava[1] = new Strava(40, 120, "Піцца");
        strava[2] = new Strava(15, 140, "Олів'є");
        strava[3] = new Strava(50, 450, "Шашлик");
        strava[4] = new Strava(12, 90, "Салат");
        strava[5] = new Strava(10, 140, "Суп");


        for(int i = 0; i < strava.length; i++) {
            System.out.println(strava[i]);
        }



    }
}
