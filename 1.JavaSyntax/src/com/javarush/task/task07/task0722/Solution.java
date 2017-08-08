package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        int n = 1;
        for (int i = 0; i < n; i++) {
            String str = reader.readLine();
            if (str.equals("end")) break;
            else {
                list.add(str);
                n++;
            }
        }

        for (String x : list) System.out.println(x);
    }
}