package com.company.modul2_1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by User on 08.12.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Dialogie dia = new Dialogie();
        Foods foods = new Foods();
        Scanner sc = new Scanner(System.in);
        Account aka = new Account();

        for (int i = 0; ; i++){

            System.out.println("\t\tМожливі дії");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Щоб відкрити меню страв додати страву введіть (страви)");
            System.out.println("Щоб переглянути список страв введіть (Меню)");
            String variant = sc.nextLine();
            if(variant.equalsIgnoreCase("додати")){

            }else if (variant.equalsIgnoreCase("меню")){
                foods.menu();
            }

        }

    }




    }

