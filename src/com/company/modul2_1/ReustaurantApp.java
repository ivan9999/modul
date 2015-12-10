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
        strava.add("Фруктовий омлет");

        ArrayList<String> cina = new ArrayList<>();

        cina.add("57, грн");
        cina.add("55, грн");
        cina.add("60, грн");
        cina.add("50, грн");
        cina.add("67, грн");
        cina.add("62, грн");
        cina.add("52, грн");
        cina.add("46, грн");
        cina.add("42, грн");
        cina.add("34, грн");

        for (int i = 0; i < strava.size(); i ++){
            System.out.println(strava.get(i));
            System.out.println(cina.get(i));

        }

    }

    public static void put(String strava, Integer cina) {
    }
}




