package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        int count = 0;
        while(fileReader.ready()){
            int data = fileReader.read();
            count++;
            if(count%2==0)fileWriter.write(data);
        }
        fileReader.close();
        fileWriter.close();

    }
}
