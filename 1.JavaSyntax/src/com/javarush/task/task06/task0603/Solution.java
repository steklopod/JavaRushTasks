package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) throws Throwable {
        //напишите тут ваш код
        for (int f = 0; f < 50000; f++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
            cat.finalize();
            dog.finalize();
        }

    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}
