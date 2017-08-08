package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(n.readLine());
        int b = Integer.parseInt(n.readLine());
        if(a > b) System.out.println(b);
        else System.out.println(a);

    }
}