package com.company.modul2_1;

import java.util.ArrayList;

/**
 * Created by User on 09.12.2015.
 */
public class ReustaurantApp {

    public static void main(String[] args) {

        ArrayList<String> strava = new ArrayList<>();

        strava.add("Cвинина з овощами");
        strava.add("Шашлик");
        strava.add("Піцца з мясом");
        strava.add("Картопля з соусом");
        strava.add("Курка з соусом");
        strava.add("Мясо з соусом тартар");
        strava.add("Пельмені");
        strava.add("Риба ");
        strava.add("Борщ з сметаною");

        ArrayList<String> cina = new ArrayList<>();

        cina.add("57");
        cina.add("55");
        cina.add("60");
        cina.add("50");
        cina.add("67");
        cina.add("62");
        cina.add("52");
        cina.add("46");
        cina.add("42");
        cina.add("34");

        for (int i = 0; i < strava.size(); i ++){
            System.out.println(strava.get(i));
            System.out.println(cina.get(i));

        }

    }

    }




