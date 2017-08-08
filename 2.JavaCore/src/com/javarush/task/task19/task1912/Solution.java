package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);

        StringBuilder stringBuilder = new StringBuilder(result);
        String sPrint = stringBuilder.toString().replaceAll("te", "??");
        System.out.println(sPrint);
    }

    public static class TestString {
        public  void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
