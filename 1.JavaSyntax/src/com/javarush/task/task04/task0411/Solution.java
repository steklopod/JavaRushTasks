package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //::CODE:
        if ((month <= 11) && (month >= 9))
            System.out.println("осень");
        else if ((month <= 5) && (month >= 3))
            System.out.println("весна");
        else if ((month <= 8) && (month >= 6))
            System.out.println("лето");
        else
            System.out.println("зима");


    }
}