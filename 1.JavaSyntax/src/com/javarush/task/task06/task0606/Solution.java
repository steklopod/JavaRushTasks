package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader intCh = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(intCh.readLine());
        while (b > 0) {
            if((b%10)%2 == 0){
                even++;}
            else {odd++;
            }
            b = b/10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}