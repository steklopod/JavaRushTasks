package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(n.readLine());
        if (a==0) System.out.print("ноль");
        else {
            if (a < 0) System.out.print("отрицательное");
            if (a > 0) System.out.print("положительное");
            if (a % 2 == 0) System.out.print(" четное");
            if (a % 2 != 0) System.out.print(" нечетное");
            System.out.println(" число");
        }

    }
}
