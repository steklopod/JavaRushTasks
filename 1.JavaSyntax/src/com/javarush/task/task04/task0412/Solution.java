package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int n = Integer.parseInt(number);

        if(n>0)
            System.out.println(n*2);
        else
            if(n<0)
                System.out.println(n+1);
        else
            if(n==0)
                System.out.println("0");



    }

}