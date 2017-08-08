package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        int x1 = Integer.parseInt(x);
        int dlin = x.length();
        boolean n = (x1 >= 1 & x1 <=999);
        x1 %= 2;
        boolean m = (x1 == 0);
        if (dlin == 1 & m & n)
            System.out.println("четное однозначное число");
        else if (dlin == 2 & m & n)
            System.out.println("четное двузначное число");
        else if (dlin == 3 & m & n)
            System.out.println("четное трехзначное число");
        else if (dlin == 1 & !m & n)
            System.out.println("нечетное однозначное число");
        else if (dlin == 2 & !m & n)
            System.out.println("нечетное двузначное число");
        else if (dlin == 3 & !m & n)
            System.out.println("нечетное трехзначное число");

    }
}
