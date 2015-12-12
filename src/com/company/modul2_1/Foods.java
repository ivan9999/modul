package com.company.modul2_1;

import com.sun.prism.impl.Disposer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Created by User on 08.12.2015.
 */
public class Foods {
    int sum = 0;
    Disposer.Record rek = new Disposer.Record() {
        @Override
        public void dispose() {

        }
    };
    Map<String, Integer> putAll = new LinkedHashMap<>();
    Map<String, Integer> mainMenu = new TreeMap<>();
    Map<String, Integer> searchFoods = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    void readFoods() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:/untitled3/modul2_1/strava.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String strava = scanner.nextLine();
            Integer cina = Integer.parseInt(scanner.nextLine());
            ReustaurantApp.put(strava, cina);
        }
    }

    void searchFood(String searchFood) {
        for (Map.Entry<String, Integer> entry : mainMenu.entrySet()) {
            if (entry.getKey().contains(searchFood)) ;
            searchFoods.put(entry.getKey(), entry.getValue());
            System.out.println("" + entry.getKey() + "  \t " + entry.getValue());
        }
        nextSearchFood();


    }

    void nextSearchFood() {
        if (searchFoods.size() == 0) {
            System.out.println(" Немає такої страви");

        } else {
            System.out.println("Оберіть щось інше ");
            String element = sc.nextLine();

        }
    }

    void readMainMenu() {
        for (Map.Entry<String, Integer> entry : mainMenu.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

    void bahatoStrav() throws IOException {
        System.out.println("Введіть страву ");
        String strava = sc.nextLine();
        bahatoStravbilshe(strava);
    }

    void bahatoStravbilshe(String strava) {
        searchFoods.clear();
        int sum1 = 0;
        for (Map.Entry<String, Integer> entry : mainMenu.entrySet()) {
            if (entry.getKey().contains(strava)) {
                searchFoods.put(entry.getKey(), entry.getValue());
                System.out.println("" + entry.getKey() + "  \t " + entry.getValue());
                sum1 = entry.getValue();
            }

        }
    }
}

