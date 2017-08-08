package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        BufferedReader input = new BufferedReader(new FileReader(s1));
        BufferedWriter output = new BufferedWriter(new FileWriter(s2));
        while(input.ready()){
            String str = input.readLine();
            str = str.replaceAll("[^a-zA-Z ]", "");
            output.write(str);
        }
        reader.close();
        input.close();
        output.close();
    }
}