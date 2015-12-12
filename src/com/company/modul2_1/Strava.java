package com.company.modul2_1;

/**
 * Created by User on 08.12.2015.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;


public class Strava extends Foods {


    void novaStrava(String Strava, Integer cina) throws IOException {

        Map<String, Integer> novaStrava = new TreeMap<>();
        novaStrava.put(Strava,cina);

        PrintWriter writer = new PrintWriter(new FileWriter("C:/untitled3/modul2_1/strava.txt"));
        for (Map.Entry<String, Integer> entry : novaStrava.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());

        }

        writer.close();

    }

}
