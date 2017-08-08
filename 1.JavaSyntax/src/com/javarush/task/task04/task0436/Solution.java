package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(in.readLine());
        int x = Integer.parseInt(in.readLine());
        int z = 8;

        for (int a = 0; a < y; a++) {
            System.out.print(z);
            for (int b = 1; b < x; b++) {
                System.out.print(z);
            }
            System.out.println();
        }
    }


}