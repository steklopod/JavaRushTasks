package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код

    public Circle() {
    }

    public Circle(double x, double y, double radius) {


    }

    public Circle(double radius) {

        this.radius = radius;
    }


    public Circle(double y, double radius) {
        this.y = y;
        this.radius = radius;

    }

    public static void main(String[] args) {

    }
}