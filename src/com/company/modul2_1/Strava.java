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


    void novaStrava(String Strava, Integer calor) throws IOException {

        Map<String, Integer> novaStrava = new TreeMap<>();
        novaStrava.put(Strava, calor);

        PrintWriter writer = new PrintWriter(new FileWriter("C:/modul2_1/new/novaStrava.txt"));
        for (Map.Entry<String, Integer> entry : novaStrava.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());

        }

        writer.close();

    }

}