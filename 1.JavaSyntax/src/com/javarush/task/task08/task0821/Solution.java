package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Tom");
        map.put("Fefsd", "Tom");
        map.put("Sim", "Tom");
        map.put("Sim", "Tom");
        map.put("Sim", "To sd m");
        map.put("Sim", "Tom");
        map.put("Sim", "Tom");
        map.put("Sim", "Tom");
        map.put("Sim", "Tom");
        map.put("Sim", "Tom");


        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
