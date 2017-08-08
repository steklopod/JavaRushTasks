package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String file1 = reader.readLine();
      String file2 = reader.readLine();
      BufferedReader inputStream = new BufferedReader(new FileReader(file1));
      BufferedWriter outputStream = new BufferedWriter(new FileWriter(file2));
      while(inputStream.ready()){
            String replaceDot = inputStream.readLine();
            replaceDot = replaceDot.replaceAll("[.]","!");
            outputStream.write(replaceDot);
        }
        reader.close();
      inputStream.close();
      outputStream.close();

    }
}