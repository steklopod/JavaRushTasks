package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        //напишите тут ваш код
        Cat tomCat = new Cat("Tom", 2, 13);
        Dog sharikDog = new Dog("Sharik", 20, 5);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Cat {
        String name;
        int vista;
        int tail;


        public Cat(String name, int vista, int tail) {
            this.name = name;
            this.vista = vista;
            this.tail = tail;

        }
    }

    public static class Dog {
        String name;
        int vista;
        int tail;


        public Dog(String name, int vista, int tail) {
            this.name = name;
            this.vista = vista;
            this.tail = tail;

        }
    }
}
