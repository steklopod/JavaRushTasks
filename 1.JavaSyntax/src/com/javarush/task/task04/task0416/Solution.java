package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        double n = Double.parseDouble(s);

        int t = (int)(n % 5);

        if (t >= 0 && t <= 2)
            System.out.println("зелёный");
        else if (t == 3)
            System.out.println("желтый");
        else
            System.out.println("красный");
    }
}