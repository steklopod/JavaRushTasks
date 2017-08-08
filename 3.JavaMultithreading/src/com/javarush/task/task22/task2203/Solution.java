package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) throw new TooShortStringException();

        int count = 0;
        int firstSpace = string.indexOf("\t") + 1;

        char[] bukv = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            if (bukv[i] == '\t') {
                count++;
            }
        }
        if (count < 2) {
            throw new TooShortStringException();
        }


        return string.substring(firstSpace, string.indexOf("\t", firstSpace));
    }

    public static class TooShortStringException extends Exception {


    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
