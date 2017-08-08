package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(n.readLine());
        int b = Integer.parseInt(n.readLine());
        int c = Integer.parseInt(n.readLine());
        if(a + b > c && b + c > a && a + c > b) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

    }
}