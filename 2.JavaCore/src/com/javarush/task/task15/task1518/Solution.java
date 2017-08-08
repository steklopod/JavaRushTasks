package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Vaska";

        System.out.println(cat.name);
    }

    public static class Cat {
        public String name;


    }
}
