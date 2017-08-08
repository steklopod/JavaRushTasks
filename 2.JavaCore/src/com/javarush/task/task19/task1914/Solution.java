package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleOutputStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleOutputStream);

        String result = outputStream.toString();
        result = solutionExample(result);
        System.out.println(result);
    }

    public static String solutionExample(String result)
    {
        String modifikatorResult = " ";
        String[] wordArray = result.split(" ");
        int a =  Integer.parseInt(wordArray[0]);
        int b = Integer.parseInt(wordArray[2]);
        int c = 0;
        if(wordArray[1].equals("+"))
            c = a + b;
        else if(wordArray[1].equals("*"))
            c = a * b;
        else if(wordArray[1].equals("-"))
            c = a - b;

        return a + " " +wordArray[1] + " " + b + " " + wordArray[3] + " " + c;
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}