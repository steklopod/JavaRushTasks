package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int s = a + b + c;
        if (s < 0) {
            s = 0;
        }

        for (; s >= a || s >= b || s >= c; s--) {

            if (a == s) {
                System.out.print(a + " ");
            }
            if (b == s) {
                System.out.print(b + " ");
            }
            if (c == s) {
                System.out.print(c + " ");
            }
        }
    }
}