package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String name = reader.readLine();
        String ages = reader.readLine();
        int age = Integer.parseInt(ages);
        if (age > 20) System.out.print("И 18-ти достаточно");
    }
}
