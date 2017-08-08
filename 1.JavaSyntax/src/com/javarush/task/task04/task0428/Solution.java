package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(n.readLine());
        int b = Integer.parseInt(n.readLine());
        int c = Integer.parseInt(n.readLine());

        int d = 0;

        if (a > 0) {
            d = d + 1;
        }
        if (b > 0) {
            d = d + 1;
        }
        if (c > 0) {
            d = d + 1;
        }
        System.out.println(d);
    }

}
