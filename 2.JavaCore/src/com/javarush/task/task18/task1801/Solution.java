package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream input = new FileInputStream(fileName);

        int max = input.read();

        while (input.available() > 0) {
            int data = input.read();
            if (data > max)
                max = data;
        }
        input.close();
        System.out.println(max);
    }
}