package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        int count = 0;
        while (fileReader.ready()) {
            String[] wordArray = fileReader.readLine().split( "\\W");
            for (String strok : wordArray)
                if (strok.equals("world")) {count++;}
        }
        System.out.println(count);
        reader.close();
        fileReader.close();
    }
}