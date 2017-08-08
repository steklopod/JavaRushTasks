package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int numCount = Integer.parseInt(reader.readLine());
        if (numCount > 0) {
            for (int i = 0; i < numCount; i++) {
                int nextNum = Integer.parseInt(reader.readLine());
                maximum = Math.max(maximum, nextNum);
            }
            System.out.println(maximum);
        }
    }
}