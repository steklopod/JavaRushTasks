package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/


public class Solution {

    public static void main(String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputDate = br.readLine();

            SimpleDateFormat fr = new SimpleDateFormat("MM/dd/yyyy");
            SimpleDateFormat forma = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
            Date date = fr.parse(inputDate);
            System.out.println(forma.format(date).toUpperCase());
        } catch (Exception e) {
            System.out.println("Неверный формат даты. Введите согласно примеру: 08/18/2013");
        }
    }
}
