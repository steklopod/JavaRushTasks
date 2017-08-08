package com.javarush.task.task05.task0507;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int sum = 0;
        int n = 0;
        while ((n = Integer.parseInt(reader.readLine())) != -1) {
            sum += n;
            count++;
        }
        System.out.println((double)sum/count);

    }
}

