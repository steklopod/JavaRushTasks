package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    private static class Human {
        // напишите тут ваши переменные и конструкторы
        private int age;
        private int house;
        private int teeth;
        private String name;
        private String street;
        private String surname;

        public Human(int age, int house, int teeth, String name, String street, String surname) {
            this.age = age;
            this.house = house;
            this.teeth = teeth;
            this.name = name;
            this.street = street;
            this.surname = surname;
        }

        public Human(int age, int house, int teeth, String name) {
            this.age = age;
            this.house = house;
            this.teeth = teeth;
            this.name = name;
        }

        public Human(int age, int house, int teeth, String name, String street) {

            this.age = age;
            this.house = house;
            this.teeth = teeth;
            this.name = name;
            this.street = street;
        }

        public Human(int age, int house) {
            this.age = age;
            this.house = house;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human() {
        }

        public Human(int age, String surname) {

            this.age = age;
            this.surname = surname;
        }

        public Human(String name, String street) {
            this.name = name;
            this.street = street;
        }

        public Human(int age, int teeth, String surname) {
            this.age = age;
            this.teeth = teeth;
            this.surname = surname;
        }

        public Human(int house, int teeth, String name, String street, String surname) {
            this.house = house;
            this.teeth = teeth;
            this.name = name;
            this.street = street;
            this.surname = surname;
        }
    }
}
