package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(60, 0.80));
        System.out.println(convertEurToUsd(65, 0.70));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код

        double Usd = eur * course;
        return Usd;
    }
}
