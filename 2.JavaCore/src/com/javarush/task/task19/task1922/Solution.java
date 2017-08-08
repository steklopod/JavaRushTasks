package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
//        1. Читаем построчно
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (fr.ready()) {
            int count = 0;
            String s = fr.readLine();
//                                                        2. сплитим по пробелу
            String[] wordsFromString = s.split(" ");
//                                                        3. проверяем на equal каждому из слов списка, увеличивая счётчик при совпадении
            for (String word : wordsFromString) {
                for (String sample : words) {
                    if (word.equals(sample)) count++;
                }
            }
//                                                        4. выводим, если насчиталось 2 слова счётчиком.
            if (count == 2) System.out.println(s);
        }
        fr.close();
    }
}
