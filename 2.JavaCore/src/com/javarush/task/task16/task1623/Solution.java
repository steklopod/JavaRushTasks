package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

import static java.lang.Thread.currentThread;

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }


    public static class GenerateThread extends Thread {

        public GenerateThread() {
            super(String.valueOf(++countCreatedThreads));
            start();
        }

        @Override
        public String toString() {
            return getName() + " created";
        }


        public void run() {
            if (countCreatedThreads < Solution.count) {
                GenerateThread generateThread = new GenerateThread();
                System.out.println(generateThread);


            }
        }
    }
}

//
//    public void run() {
//        while (true) {
//            System.out.println(this);
//            if (--countDownIndex == 0) return;
//            //напишите тут ваш код
//            try {
//
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                System.out.println("Нить прервана");
//
//            }
//        }
//    }
