package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String param = br.readLine();

            if (param.equals("exit")) {
                br.close();
                break;
            }

            try {
                if ((param.contains("."))) {
                    print(Double.parseDouble(param));
                } else if ((Short.parseShort(param) > 0 && Short.parseShort(param) < 128)) {
                    print(Short.parseShort(param));
                } else if ((Integer.parseInt(param) <= 0 || Integer.parseInt(param) >= 128)) {
                    print(Integer.parseInt(param));
                }
            } catch (Exception e) {
                print((param));
            }


        }
    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
