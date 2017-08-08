package com.javarush.task.task08.task0816;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Stalloывмne", new Date("JUNE 1 1980"));
        map.put("Stallывone", new Date("JUNE 1 1980"));
        map.put("Stalывlone", new Date("SEPTEMBER 1 1980"));
        map.put("Stallonвсe", new Date("JUNE 1 1980"));
        map.put("Stalloывne", new Date("JUNE 1 1980"));
        map.put("Stalывсlone", new Date("FEBRUARY 1 1980"));
        map.put("Stallывсone", new Date("JUNE 1 1980"));
        map.put("Stalloвысne", new Date("JUNE 1 1980"));
        map.put("Stвсывallone", new Date("JUNE 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        ArrayList <String> removelist = new ArrayList<>();
        for (Map.Entry<String, Date> pair: map.entrySet()){
            Date date = pair.getValue();
            int m = date.getMonth();
            if (m>4 && m<8) {
                removelist.add(pair.getKey());
            }
        }
        for (String key: removelist){
            map.remove(key);
        }
    }
    public static void main(String[] args) {
    }

    }