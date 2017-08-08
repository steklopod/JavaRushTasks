package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = -900000000;
        int minimum = 900000000;

        int[] n = new int[20];

        for (int i = 0; i < 20; i++) {
            n[i] = Integer.parseInt(reader.readLine());
        }
        for (int x = 0; x < 20; x++) {
            if (minimum >= n[x]) {
                minimum = n[x];
            }
        }
        for (int i = 0; i < 20; i++) {
            if (n[i] > maximum) {
                maximum = n[i];
            }
        }
        System.out.println(maximum);
        System.out.println(minimum);
    }
}