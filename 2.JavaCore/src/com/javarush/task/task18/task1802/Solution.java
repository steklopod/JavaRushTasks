package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();


        FileInputStream input = new FileInputStream(fileName);
        int min = input.read();

        while (input.available() > 0) {
            int data = input.read();
            if (data < min)
                data = min;
        }
        input.close();
        System.out.println(min);
    }
}
