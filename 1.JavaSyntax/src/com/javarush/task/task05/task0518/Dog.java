package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    //напишите тут ваш код
    String name = "Sharik";
    int height = 180;
    String color = "Red";

    public Dog (String name){
        this.name = name;
    }

    public Dog (String name, int height){
        this.name = name;
        this.height = height;
    }

    public Dog (String name, int height, String color){

        this.name = name;
        this.height = height;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
