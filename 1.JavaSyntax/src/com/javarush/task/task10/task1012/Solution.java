package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        for (int k = 0; k < alphabet.size() ; k++) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).length(); j++) {
                    if (list.get(i).charAt(j) == alphabet.get(k)){
                        count++;
                    }
                }
            }
            System.out.println(alphabet.get(k) + " " + count);
            count = 0;
        }
    }

}
