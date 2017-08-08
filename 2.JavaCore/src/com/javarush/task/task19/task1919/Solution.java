package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String,Double> treeMap = new TreeMap<String,Double>();
        while (bufferedReader.ready())
        {
            String s = bufferedReader.readLine();
            String[] split;
            split = s.split(" ");
            String name = split[0];
            Double sallary = Double.parseDouble(split[1]);
            if (treeMap.containsKey(name))
            {
                Double k = treeMap.get(name);
                treeMap.put(name,k+sallary);
            }
            else treeMap.put(name,sallary);

        }
        bufferedReader.close();
        for (Map.Entry<String,Double> entry : treeMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}