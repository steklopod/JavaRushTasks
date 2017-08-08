package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Data data = new Data (14, 06, 2017);
        System.out.print(data.day + " " + data.mon + " " + data.ye);
    }
    public  static class Data {
        int day;
        int mon;
        int ye;
        public Data (int day, int mon, int ye){
            this.day = day;
            this.mon = mon;
            this.ye = ye;
        }
    }

}
