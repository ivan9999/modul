package com.company.modul2_1;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by User on 08.12.2015.
 */
public class Foods {
    Map<String, Integer> saveFood = new TreeMap<>();

    String strava;
    Map<String, Integer> novaStravaMap = new TreeMap<>();

    Integer cina;
    private Scanner sc;

    void readFoods() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:/src/strava.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String strava = scanner.nextLine();
            ReustaurantApp.put(strava,cina);
        }    }



    

    void poshook() throws FileNotFoundException {

        String strava = null;
        Integer cina = null;


        Scanner scanner = new Scanner(new File("C:/src/trava.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            strava = scanner.nextLine();
            cina = new Integer(scanner.nextLine());

            saveFood.put(strava,cina);
        }



        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


    }

    public void menu() {
    }
    void Stravu () throws EOFException{
        System.out.println("Ведіть страву");
        String strava = sc.nextLine();

    }


    public void searchFood(String searchFood) {
    }
}


