package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if ((a < b && b < c) || (a > b && b > c))
            System.out.println(b);
        else if ((a < c && c < b) || (a > c && c > b))
            System.out.println(c);
        else if ((b < a && a < c) ||(b > a && a > c))
            System.out.println(a);
        else if (a == b && b == c)
            System.out.println(a);
        else if (a == b)
            System.out.println(a);
        else if (a == c)
            System.out.println(a);
        else if (c == b)
            System.out.println(c);

    }


}
