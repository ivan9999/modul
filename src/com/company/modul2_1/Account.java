package com.company.modul2_1;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by User on 08.12.2015.
 */
public class Account {
    Map<Integer, Integer> akaDataInteger = new HashMap<>();
    Map<String, String > akaDataString = new HashMap<>();
    ArrayList<Integer> akaDataInt = new ArrayList<>();
    ArrayList<String> akaDataStr = new ArrayList<>();


    String name;
    int age;



    void ak (String name, int age, int kalorie) throws IOException {
        this.name = name;
        this.age = age;
        akaDataInteger.put(age, age);
        akaDataString.put(name, name);

        OutputStream f1 = new FileOutputStream("C:/modul2_1/Aka/newAkaDataStr",true);
        OutputStreamWriter writer = new OutputStreamWriter(f1);
        BufferedWriter out = new BufferedWriter(writer);
        for(int i = 0; i < akaDataInt.size(); i++)
        {
            out.write(akaDataInt.get(i));
            out.flush();
        }
        OutputStream f = new FileOutputStream("C:/modul2_1/Aka/newAkaDataStr", true);
        OutputStreamWriter writer1 = new OutputStreamWriter(f);
        BufferedWriter out1 = new BufferedWriter(writer);
        for(int i = 0; i < akaDataStr.size(); i++)
        {
            out1.write(akaDataStr.get(i));
            out1.flush();
        }


    }
    void readFile() throws FileNotFoundException{
        Map<Integer, Integer> integerData = new HashMap<>();
        Scanner scanner = new Scanner(new File("C:/modul2_1/Aka/newAkaDataInteger.txt"));
        int sizeInteger = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sizeInteger; i++){
            Integer data = scanner.nextInt();
            Integer data1 = scanner.nextInt();
            integerData.put(data, data1);

        }
        Map<String, String> StringData = new HashMap<>();
        Scanner scanner1 = new Scanner(new File("C:/modul2_1/Aka/newAkaDataString.txt"));
        int sizeString = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sizeString; i++){
            String dataString = scanner.nextLine();
            String dataString1 = scanner.nextLine();
            StringData.put(dataString, dataString1);
        }

    }void cleanAccount(){
        akaDataInteger.clear();
        akaDataString.clear();
    }
}
