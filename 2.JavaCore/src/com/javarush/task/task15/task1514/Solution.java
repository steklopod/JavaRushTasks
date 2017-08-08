package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
static
    {
        labels.put(1424.0, "ocdcsn222e");
        labels.put(21.0, "onsdcsdc22e");
        labels.put(122.0, "ondcsdcd2e");
        labels.put(112.0, "on2e");
        labels.put(12.2, "o33ne");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
