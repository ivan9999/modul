package com.company.modul2_1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by User on 08.12.2015.
 */
public class Dialogie {
    Account aka = new Account();
    Scanner sc = new Scanner(System.in);

    String stravaEat;
    String name;
    int age;


    void privitanj() {
        System.out.println("************|Програма замовлень|************");
        System.out.println("Щоб створити новий профіль введіть <Профіль>");
        System.out.println("Щоб використати старий профіль введіть <Старий прфіль>");
        String profil = sc.nextLine();

    }

    void register() throws IOException {
        System.out.println("Щоб замовити заказ треба ");
        System.out.println("1 Як ваше ім'я ?");
        String name = sc.next();
        System.out.println("2 Скільки вам років ?");
        String age = sc.next();

    }

    void pitanj(){
        System.out.println("Яку страву ви б хотіли замовити ?");
        System.out.println("Де ви проживаєте ?");
    }

     void vitanjProfilj(){
         System.out.println("************|Програма замовлень|************");
         System.out.println("Вітаємо вас в програмі замовлень");
         System.out.println();
     }





}
