package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(n.readLine());
        int b = Integer.parseInt(n.readLine());
        int c = Integer.parseInt(n.readLine());
        int d = Integer.parseInt(n.readLine());
        if (a>=b & a>=c & a>=d)
            System.out.println(a);
        else if(b>=c & b>=d)
            System.out.println(b);
        else if(c>=d)
            System.out.println(c);
        else
            System.out.println(d);


    }
}
