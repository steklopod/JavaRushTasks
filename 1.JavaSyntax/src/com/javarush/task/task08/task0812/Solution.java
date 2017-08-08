package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(r.readLine()));
        }
        int counter = 1;
        int answer = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).equals(list.get(i))) {
                counter++;
                if (counter > answer) {
                    answer = counter;
                }
            } else {
                if (counter > answer) {
                    answer = counter;
                }
                counter = 1;
            }
        }
        System.out.println(answer);

    }
}