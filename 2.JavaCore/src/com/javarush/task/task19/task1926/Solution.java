package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));

        while (fileReader.ready()) {
            String stringBuffer = fileReader.readLine();
            StringBuilder strBuild = new StringBuilder(stringBuffer);
            strBuild.reverse();
            System.out.println(strBuild);
        }
        reader.close();
        fileReader.close();
    }

}
