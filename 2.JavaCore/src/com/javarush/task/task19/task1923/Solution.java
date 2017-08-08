package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        ArrayList<String> list = new ArrayList<String>();
        while (reader.ready()) {
            String[] wordArray = reader.readLine().split(" ");
            for (String strok : wordArray)
                if (strok.matches(".*\\d.*")) list.add(strok);
        }
        String output = new String();
        for (int i = 0; i < list.size()-1; i++) {
            output += list.get(i) + " ";
            output += list.get(list.size()-1);
            writer.write(output);
        }
        reader.close();
        writer.close();

    }
}
