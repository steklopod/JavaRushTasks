package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        ArrayList<String> list = new ArrayList<String>();
        while(reader.ready()){
            String[] wordArray = reader.readLine().split(" ");
            for(String strok : wordArray)
                if(strok.length()>6) list.add(strok);
        }
        String output = new String();
        for(int i=0; i<list.size()-1; i++)
            output += list.get(i) + ",";
                output += list.get(list.size() -1);
        writer.write(output);
        reader.close();
        writer.close();

    }

}
