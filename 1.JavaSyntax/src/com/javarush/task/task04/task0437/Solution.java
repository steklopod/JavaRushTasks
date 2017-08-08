package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int digit = 8;
        for (int i = 0; i < 10; i++) {
            System.out.print(digit);
            for (int j = 0; j < i; j++) {
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}
