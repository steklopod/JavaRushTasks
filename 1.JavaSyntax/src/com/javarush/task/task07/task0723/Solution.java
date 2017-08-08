package com.javarush.task.task07.task0723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {

            }

        }

        System.out.println("Бум!");
    }
}