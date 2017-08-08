package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        ArrayList<String> list = new ArrayList<String>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        for (int i = 0; i < 5; i++) {
//            list.add(i, reader.readLine());
//        }
//        for (int i = 0; i<13; i++){
//
//            list.remove(n);
//            list.add(list.size() - 1);
//        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> str = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            str.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            str.add(0, str.get(4));
            str.remove(5);
        }
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}


