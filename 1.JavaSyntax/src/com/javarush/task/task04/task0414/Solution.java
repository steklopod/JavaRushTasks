package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(n.readLine());
        int x;
        int kratnost4 = a%4;
        int kratnost100 = a%100;
        int kratnost400 = a%400;

        if ((kratnost4 == 0 && kratnost100 != 0) || kratnost400 == 0)
            x = 366;
        else
            x = 365;
        System.out.println("количество дней в году: " + x);
    }
}