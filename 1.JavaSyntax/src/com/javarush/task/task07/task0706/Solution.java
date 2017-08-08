package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] total = new int[15];
        int street_nech = 0, street_ch = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //ЗАПОЛНЯЕМ МАССИВ
        for (int i = 0; i < total.length; i++) {
            total[i] = Integer.parseInt(reader.readLine());
        }

        //СЧИТАЕМ НЕЧЁТНЫЕ И ЗАНОСИМ В ПЕРЕМЕННУЮ
        for (int i = 1; i <=13; i = i+2) {
            street_nech = street_nech +total[i];
        }

        //НЕЗАБЫВАЕМ О НУЛЕВОЙ ЯЧЕЙКЕ
        street_nech = street_nech + total[0];
        //СЧИТЫВАЕМ ЧЁТНЫЕ И ЗАНОСИМ В ПЕРЕМЕННУЮ
        for (int i = 0; i < 15; i = i+2) {
            street_ch = street_ch +total[i];
        }

        //СВЕРЯЕМ ЗНАЧЕНИЯ
        if (street_ch > street_nech) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}