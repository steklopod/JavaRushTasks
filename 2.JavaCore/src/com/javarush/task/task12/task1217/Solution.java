package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

    //add interfaces here - добавь интерфейсы тут
    interface Fly {
        static int getValue() {
            return 3;
        }
    }

    interface Run {
        static void Fast(String a) {
        }

    }

    interface Swim {
        void drive();
    }
}

