package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list3 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        ArrayList<Integer> listElse = new ArrayList();

        for (int i = 0; i < 20; i++) list.add(Integer.parseInt(reader.readLine()));

        for (Integer tmp : list) {
            if (tmp % 3 == 0) list3.add(tmp);
            if (tmp % 2 == 0) list2.add(tmp);
            if (tmp % 2 != 0 && tmp % 3 != 0) listElse.add(tmp);
        }

        printList(list3);
        printList(list2);
        printList(listElse);
    }

    public static void printList(List<Integer> list) {
        for (Integer temp : list) System.out.println(temp);
    }
}