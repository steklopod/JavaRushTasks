package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            /*wheels = new ArrayList<Wheel>();
            Wheel wheelEntry = null;
            String[] dbArray = loadWheelNamesFromDB();
            if (dbArray.length != 4) { throw new Exception(); };
            for (String entry: dbArray){
                if ( (wheelEntry = Wheel.valueOf(entry)) == null) { throw new Exception();}
                else {
                    wheels.add(wheelEntry);
                }
            }
        }
*/
        wheels = new ArrayList<Wheel>();
        Wheel wheeEntry = null;
//        String[] dbArray = loadWheelNamesFromDB();
        if(loadWheelNamesFromDB().length !=4){
            throw new Exception();
        }
        for(String s : loadWheelNamesFromDB()){
            if((wheeEntry = Wheel.valueOf(s)) == null){
                throw new Exception();
            }
//            else{wheels.add(s);}
        }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}