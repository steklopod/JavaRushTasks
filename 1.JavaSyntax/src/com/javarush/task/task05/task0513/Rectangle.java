package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize(int left, int top,int width, int height)
    {
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=height;
    }

    public void initialize(int left, int top)
    {
        this.left=left;
        this.top=top;
        width=0;
        height=0;
    }

    public void initialize(int left, int top,int width)
    {
        this.left=left;
        this.top=top;
        this.width=width;
        height=width;
    }

    public void initialize(Rectangle Rec)
    {
        left=Rec.left;
        top=Rec.top;
        width=Rec.width;
        height=Rec.height;
    }
    public static void main(String[] args) {

    }
}
