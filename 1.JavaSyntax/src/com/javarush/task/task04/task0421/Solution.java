package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();

        if (n1.length() == n2.length()) {
            if (n1.equals(n2)) {
                System.out.print("Имена идентичны");
            } else {
                System.out.print("Длины имен равны");
            }
        }
    }
}