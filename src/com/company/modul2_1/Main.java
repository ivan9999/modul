package com.company.modul2_1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by User on 08.12.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Foods foods = new Foods();
        Scanner sc = new Scanner(System.in);
        Account aka = new Account();
        ReustaurantApp rs = new ReustaurantApp();

        for (int i = 0; ; i++) {

            System.out.println("\t\t       Можливі дії");
            System.out.println("***************************************");
            System.out.println("Щоб переглянути список страв введіть <Меню>\nЩоб замовити страву введіть <замовити>");
            String variant = sc.nextLine();
            if (variant.equalsIgnoreCase("замовити")){
                System.out.println("Яку страву ви хочете замовити");
                String searchFood = sc.nextLine();
                foods.searchFood(searchFood);
                System.out.println("Дякую за замовлення");
                String end;

            }else {
                System.out.println("Ви не ввели страви, повторіть спробу ");
            }



        }
    }

}




