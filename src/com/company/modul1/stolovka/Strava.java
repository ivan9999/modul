package com.company.modul1.stolovka;

/**
 * Created by User on 27.10.2015.
 */
public class Strava {
    int cina;
    int kalorii;
    String name;


    public Strava(int cina, int kalorii, String name) {
        this.cina = cina;
        this.kalorii = kalorii;

        this.name = name;

    }


    public String toString() {
        return String.format(
                " %9s страва\t, Ціна -: %5d,\t Калорійність %d",
                this.name, this.cina, this.kalorii
        );

    }


}
