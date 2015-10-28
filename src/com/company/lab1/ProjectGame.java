package com.company.lab1;

import java.util.Scanner;

/**
 * Created by User on 24.09.2015.
 */
public class ProjectGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;

        System.out.print("Enter a: ");
        a = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter b: ");
        b = Double.parseDouble(scanner.nextLine());

        System.out.println(-b / a);

    }


}
