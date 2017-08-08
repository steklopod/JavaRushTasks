package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//        int summ = 0;
//        String summ = reader.readLine();
//
//        int n = ()
//
//        if(summ = "сумма")
//            System.out.println(summ);
//
//    }
//}
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            String s = reader.readLine();
            if (s.equals("сумма")) {
                break;
            }
            int n = Integer.parseInt(s);
            sum += n;
        }
        System.out.println(sum);
    }
}