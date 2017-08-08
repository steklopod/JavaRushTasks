package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        BufferedReader readerBuff = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        while (readerBuff.ready()) {
            String[] wordArray = readerBuff.readLine().split(" ");
            for (String strok : wordArray)
                if(strok.matches("^\\d+$")) {
                strok +="";
                writer.write(strok + " ");
                }
                reader.close();
                readerBuff.close();
                writer.close();
        }
    }
}