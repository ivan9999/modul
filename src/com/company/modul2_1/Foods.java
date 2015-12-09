package com.company.modul2_1;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by User on 08.12.2015.
 */
public class Foods {
    Map<String, Integer> saveFood = new TreeMap<>();

    String strava;
    Integer addCalorie;
    Map<String, Integer> novaStravaMap = new TreeMap<>();



    void setNovaStrava(String strava, Integer calorie) throws IOException {
        this.addCalorie = calorie;
        this.strava = strava;

        novaStravaMap.put(strava, addCalorie);

        PrintWriter witer = new PrintWriter(new FileWriter("C:/modul2_1/new/novaStrava.txt"));
        for (Map.Entry<String, Integer> entry : novaStravaMap.entrySet()) {
            witer.println(entry.getKey());
            witer.println(entry.getKey());
        }

        witer.close();
        saveFood.putAll(novaStravaMap);

    }

    void poshook() throws FileNotFoundException {

        String name = null;
        Integer kalorie = null;


        Scanner scanner = new Scanner(new File("C:/modul2_1/new/ful.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            name = scanner.nextLine();
            kalorie = scanner.nextInt();

        }
        saveFood.put(name, kalorie);

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


    }

    public void menu() {
    }
}
